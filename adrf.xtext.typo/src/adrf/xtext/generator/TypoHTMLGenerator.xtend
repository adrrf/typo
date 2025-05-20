package adrf.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import adrf.xtext.typoDSL.Document
import adrf.xtext.typoDSL.Blocks
import adrf.xtext.typoDSL.Section
import adrf.xtext.typoDSL.Subsection
import adrf.xtext.typoDSL.Paragraph
import adrf.xtext.typoDSL.InlineItem
import org.eclipse.emf.common.util.EList
import adrf.xtext.typoDSL.Normal
import adrf.xtext.typoDSL.Bold
import adrf.xtext.typoDSL.Italic
import adrf.xtext.typoDSL.Link
import adrf.xtext.typoDSL.Image
import adrf.xtext.typoDSL.CodeBlock
import adrf.xtext.typoDSL.Itemize

/**
 * Generates HTML code from your model files on save.
 */
class TypoHTMLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(
			resource.className + ".html",
			toHtml(resource.contents.head as Document)
		)	
	}
	
	def toHtml(Document document) '''
«getHead(document)»
«getBody(document)»
	'''
	
	def getHead(Document document) '''
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>«document.title»</title>
    <!-- Inter font from Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <!-- Syntax highlighting with Prism.js -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/themes/prism-tomorrow.min.css" rel="stylesheet" />
    <!-- HTML to PDF library -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>
    <style>
        :root {
            --background: #ffffff;
            --foreground: #09090b;
            --primary: #8b5cf6;
            --primary-hover: #7c3aed;
            --muted: #f4f4f5;
            --muted-foreground: #71717a;
            --border: #e4e4e7;
        }

        [data-theme="dark"] {
            --background: #09090b;
            --foreground: #ffffff;
            --primary: #a78bfa;
            --primary-hover: #8b5cf6;
            --muted: #27272a;
            --muted-foreground: #a1a1aa;
            --border: #27272a;
        }

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            transition: background-color 0.3s ease, color 0.3s ease;
        }

        body {
            font-family: 'Inter', sans-serif;
            line-height: 1.6;
            color: var(--foreground);
            background-color: var(--background);
        }

        .container {
            max-width: 768px;
            margin: 0 auto;
            padding: 2rem;
        }

        .theme-switch {
            position: fixed;
            top: 1rem;
            right: 1rem;
            background: var(--muted);
            border: 1px solid var(--border);
            padding: 0.5rem 1rem;
            border-radius: 0.5rem;
            cursor: pointer;
            color: var(--foreground);
            font-size: 0.875rem;
            display: flex;
            align-items: center;
            gap: 0.5rem;
        }

        .theme-switch:hover {
            background: var(--primary);
            color: white;
        }

        .download-pdf {
            position: fixed;
            top: 1rem;
            right: 8rem;
            background: var(--primary);
            color: white;
            border: none;
            padding: 0.5rem 1rem;
            border-radius: 0.5rem;
            cursor: pointer;
            font-size: 0.875rem;
            display: flex;
            align-items: center;
            gap: 0.5rem;
            font-family: 'Inter', sans-serif;
        }

        .download-pdf:hover {
            background: var(--primary-hover);
        }

        @media (max-width: 640px) {
            .download-pdf {
                top: 4rem;
                right: 1rem;
            }
        }

        .header {
            margin-bottom: 3rem;
        }

        .title {
            font-size: 2.5rem;
            font-weight: 700;
            margin-bottom: 1rem;
            line-height: 1.2;
        }

        .metadata {
            color: var(--muted-foreground);
            font-size: 0.875rem;
            margin-bottom: 1.5rem;
        }

        .tldr {
            background: var(--muted);
            padding: 1.5rem;
            border-radius: 0.5rem;
            margin-bottom: 2rem;
        }

        .tldr h2 {
            font-size: 1.25rem;
            margin-bottom: 0.5rem;
            font-weight: 600;
        }

        .section {
            margin-bottom: 2.5rem;
        }

        .section h2 {
            font-size: 1.875rem;
            font-weight: 700;
            margin-bottom: 1rem;
        }

        .subsection {
            margin-bottom: 2rem;
        }

        .subsection h3 {
            font-size: 1.5rem;
            font-weight: 600;
            margin-bottom: 1rem;
        }

        .paragraph {
            margin-bottom: 1.5rem;
        }

        .image-container {
            margin: 2rem 0;
        }

        .image-container img {
            max-width: 100%;
            border-radius: 0.5rem;
            border: 1px solid var(--border);
        }

        .image-caption {
            color: var(--muted-foreground);
            font-size: 0.875rem;
            text-align: center;
            margin-top: 0.5rem;
        }

        .code-block {
            margin: 1.5rem 0;
            background: var(--muted);
            border-radius: 0.5rem;
            overflow: hidden;
        }

        .itemize {
            list-style-type: none;
            margin: 1.5rem 0;
        }

        .itemize li {
            position: relative;
            padding-left: 1.5rem;
            margin-bottom: 0.75rem;
        }

        .itemize li::before {
            content: "•";
            color: var(--primary);
            position: absolute;
            left: 0;
            font-weight: bold;
        }
        
        .centered {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
    </style>
</head>
	'''
	
	def getBody(Document document) '''
<body>
    <button class="theme-switch" onclick="toggleTheme()">
        <span class="theme-icon">🌙</span>
    </button>

	    <button class="download-pdf" onclick="generatePDF()">
	        <span>📑</span>
	        <span>Download</span>
	    </button>

    <div class="container">
        <header class="header">
            <h1 class="title">«document.title»</h1>
            <div class="metadata">
                <span class="author">By «document.author»</span> •
                <span class="date">«document.datetime.replace('"', '')»</span>
            </div>
            «IF document.tldr !== null»
                <div class="tldr">
                    <h2>TL;DR</h2>
                    <p>«document.tldr.escapeHtml()»</p>
                </div>
            «ENDIF»
        </header>
        «renderBlocks(document)»
    </div>

    <!-- Prism.js for syntax highlighting -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/prism.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-javascript.min.js"></script>
    
    <script>
        function toggleTheme() {
            const body = document.body;
            const currentTheme = body.getAttribute('data-theme');
            const newTheme = currentTheme === 'dark' ? 'light' : 'dark';
            body.setAttribute('data-theme', newTheme);
            
            const themeIcon = document.querySelector('.theme-icon');
            themeIcon.textContent = newTheme === 'dark' ? '☀️' : '🌙';
        }

        // Set initial theme based on user preference
        if (window.matchMedia('(prefers-color-scheme: dark)').matches) {
            document.body.setAttribute('data-theme', 'dark');
            document.querySelector('.theme-icon').textContent = '☀️';
        }

        function generatePDF() {
            // Get the container element
            const element = document.querySelector('.container');
            
            // Configure the PDF options
            const opt = {
                margin: [10, 10],
                filename: 'blog-post.pdf',
                image: { type: 'jpeg', quality: 0.98 },
                html2canvas: { scale: 2 },
                jsPDF: { unit: 'mm', format: 'a4', orientation: 'portrait' }
            };

            // Generate the PDF
            html2pdf().set(opt).from(element).save();
        }
    </script>
</body>
</html>
	'''
	
	def renderBlocks(Document document) {
		var res = ""
		for (block : document.blocks) {
			res += renderBlock(block)
		}
		return res
	}
	
	def renderBlock(Blocks block) {
		var res = ""
		var className = block.eClass.name
		switch (className) {
			case "Section": {
				res += renderBlock(block as Section)
			}
			case "Subsection": {
				res += renderBlock(block as Subsection)
			}
			case "Paragraph": {
				res += renderBlock(block as Paragraph)
			}
			case "Image": {
				res += renderBlock(block as Image)
			}
			case "CodeBlock": {
				res += renderBlock(block as CodeBlock)
			}
			case "Itemize": {
				res += renderBlock(block as Itemize)
			}
			default: {
				System.err.println("Error rendering the block" + block)
			}
		}
		res += "\n"
		return res
	}
	
	def renderBlock(Section section) '''
<div class="section">
    <h2>«section.title.escapeHtml()»</h2>
    «FOR b : section.blocks»
    	«renderBlock(b)»
    «ENDFOR»
</div>
	'''

	def renderBlock(Subsection subsection) '''
<div class="subsection">
    <h3>«subsection.title.escapeHtml()»</h3>
    «FOR b : subsection.blocks»
        «renderBlock(b)»
    «ENDFOR»
</div>
	'''
	
	def renderBlock(Paragraph paragraph) '''
<p class="paragraph">
    «FOR item : paragraph.inlineitems»
        «renderInline(item)»
    «ENDFOR»
</p>
	'''
	def  renderBlock(Image image) '''
<div class="image-container centered">
    <img src="«image.url»" alt="«image.caption.escapeHtml()»" />
    <div class="image-caption">«image.caption.escapeHtml()»</div>
</div>
	'''
	
	def renderBlock(CodeBlock codeBlock) '''
<div class="code-block">
    <pre><code class="language-«codeBlock.language»">«codeBlock.text.escapeHtml()»</code></pre>
</div>
'''
	
	def renderBlock(Itemize itemize) '''
<ul class="itemize">
    «FOR item : itemize.items»
        <li>«FOR inline : item.inline»«renderInline(inline)»«ENDFOR»</li>
    «ENDFOR»
</ul>
'''

	def renderInline(InlineItem inline) {
		var res = ""
		var className = inline.eClass.name
		switch (className) {
			case "Normal": {
				var normal = inline as Normal
				res+=normal.text.escapeHtml()
			}
			case "Bold": {
				var bold = inline as Bold
				res+="<strong>" + bold.text.escapeHtml() + "</strong>"
			}
			case "Italic": {
				var italic = inline as Italic
				res+="<em>" + italic.text.escapeHtml() + "</em>"
			}
			case "Link": {
				var link = inline as Link
				res += '<a href="' + link.url + '" target="_blank" rel="noopener">' + link.text.escapeHtml() + '</a>'
			}
			default: {
				res += inline.text.escapeHtml()
			}
		}
		return res	
	}
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.' )) 
	}
	
	def escapeHtml(String s) {
        s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
    }
}

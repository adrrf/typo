package adrf.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import adrf.xtext.services.TypoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypoDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DATE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'doc'", "'{'", "'title:'", "'author:'", "'date:'", "'tldr:'", "'}'", "'+section'", "'+sub'", "'+p'", "'+img'", "'url:'", "'width:'", "'height:'", "'caption:'", "'+code'", "'language:'", "'text:'", "'+list'", "'-'", "'*'", "'~bold'", "'~italic'", "'~link'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTypoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTypoDSL.g"; }


    	private TypoDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(TypoDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDocument"
    // InternalTypoDSL.g:53:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalTypoDSL.g:54:1: ( ruleDocument EOF )
            // InternalTypoDSL.g:55:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalTypoDSL.g:62:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:66:2: ( ( ( rule__Document__Group__0 ) ) )
            // InternalTypoDSL.g:67:2: ( ( rule__Document__Group__0 ) )
            {
            // InternalTypoDSL.g:67:2: ( ( rule__Document__Group__0 ) )
            // InternalTypoDSL.g:68:3: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // InternalTypoDSL.g:69:3: ( rule__Document__Group__0 )
            // InternalTypoDSL.g:69:4: rule__Document__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleBlocks"
    // InternalTypoDSL.g:78:1: entryRuleBlocks : ruleBlocks EOF ;
    public final void entryRuleBlocks() throws RecognitionException {
        try {
            // InternalTypoDSL.g:79:1: ( ruleBlocks EOF )
            // InternalTypoDSL.g:80:1: ruleBlocks EOF
            {
             before(grammarAccess.getBlocksRule()); 
            pushFollow(FOLLOW_1);
            ruleBlocks();

            state._fsp--;

             after(grammarAccess.getBlocksRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlocks"


    // $ANTLR start "ruleBlocks"
    // InternalTypoDSL.g:87:1: ruleBlocks : ( ( rule__Blocks__Alternatives ) ) ;
    public final void ruleBlocks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:91:2: ( ( ( rule__Blocks__Alternatives ) ) )
            // InternalTypoDSL.g:92:2: ( ( rule__Blocks__Alternatives ) )
            {
            // InternalTypoDSL.g:92:2: ( ( rule__Blocks__Alternatives ) )
            // InternalTypoDSL.g:93:3: ( rule__Blocks__Alternatives )
            {
             before(grammarAccess.getBlocksAccess().getAlternatives()); 
            // InternalTypoDSL.g:94:3: ( rule__Blocks__Alternatives )
            // InternalTypoDSL.g:94:4: rule__Blocks__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Blocks__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlocksAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlocks"


    // $ANTLR start "entryRuleSection"
    // InternalTypoDSL.g:103:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalTypoDSL.g:104:1: ( ruleSection EOF )
            // InternalTypoDSL.g:105:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalTypoDSL.g:112:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:116:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalTypoDSL.g:117:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalTypoDSL.g:117:2: ( ( rule__Section__Group__0 ) )
            // InternalTypoDSL.g:118:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalTypoDSL.g:119:3: ( rule__Section__Group__0 )
            // InternalTypoDSL.g:119:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSubsection"
    // InternalTypoDSL.g:128:1: entryRuleSubsection : ruleSubsection EOF ;
    public final void entryRuleSubsection() throws RecognitionException {
        try {
            // InternalTypoDSL.g:129:1: ( ruleSubsection EOF )
            // InternalTypoDSL.g:130:1: ruleSubsection EOF
            {
             before(grammarAccess.getSubsectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubsection();

            state._fsp--;

             after(grammarAccess.getSubsectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubsection"


    // $ANTLR start "ruleSubsection"
    // InternalTypoDSL.g:137:1: ruleSubsection : ( ( rule__Subsection__Group__0 ) ) ;
    public final void ruleSubsection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:141:2: ( ( ( rule__Subsection__Group__0 ) ) )
            // InternalTypoDSL.g:142:2: ( ( rule__Subsection__Group__0 ) )
            {
            // InternalTypoDSL.g:142:2: ( ( rule__Subsection__Group__0 ) )
            // InternalTypoDSL.g:143:3: ( rule__Subsection__Group__0 )
            {
             before(grammarAccess.getSubsectionAccess().getGroup()); 
            // InternalTypoDSL.g:144:3: ( rule__Subsection__Group__0 )
            // InternalTypoDSL.g:144:4: rule__Subsection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subsection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsection"


    // $ANTLR start "entryRuleParagraph"
    // InternalTypoDSL.g:153:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalTypoDSL.g:154:1: ( ruleParagraph EOF )
            // InternalTypoDSL.g:155:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalTypoDSL.g:162:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:166:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalTypoDSL.g:167:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalTypoDSL.g:167:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalTypoDSL.g:168:3: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // InternalTypoDSL.g:169:3: ( rule__Paragraph__Group__0 )
            // InternalTypoDSL.g:169:4: rule__Paragraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleImage"
    // InternalTypoDSL.g:178:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalTypoDSL.g:179:1: ( ruleImage EOF )
            // InternalTypoDSL.g:180:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalTypoDSL.g:187:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:191:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalTypoDSL.g:192:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalTypoDSL.g:192:2: ( ( rule__Image__Group__0 ) )
            // InternalTypoDSL.g:193:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalTypoDSL.g:194:3: ( rule__Image__Group__0 )
            // InternalTypoDSL.g:194:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalTypoDSL.g:203:1: entryRuleCodeBlock : ruleCodeBlock EOF ;
    public final void entryRuleCodeBlock() throws RecognitionException {
        try {
            // InternalTypoDSL.g:204:1: ( ruleCodeBlock EOF )
            // InternalTypoDSL.g:205:1: ruleCodeBlock EOF
            {
             before(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeBlock();

            state._fsp--;

             after(grammarAccess.getCodeBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // InternalTypoDSL.g:212:1: ruleCodeBlock : ( ( rule__CodeBlock__Group__0 ) ) ;
    public final void ruleCodeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:216:2: ( ( ( rule__CodeBlock__Group__0 ) ) )
            // InternalTypoDSL.g:217:2: ( ( rule__CodeBlock__Group__0 ) )
            {
            // InternalTypoDSL.g:217:2: ( ( rule__CodeBlock__Group__0 ) )
            // InternalTypoDSL.g:218:3: ( rule__CodeBlock__Group__0 )
            {
             before(grammarAccess.getCodeBlockAccess().getGroup()); 
            // InternalTypoDSL.g:219:3: ( rule__CodeBlock__Group__0 )
            // InternalTypoDSL.g:219:4: rule__CodeBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleItemize"
    // InternalTypoDSL.g:228:1: entryRuleItemize : ruleItemize EOF ;
    public final void entryRuleItemize() throws RecognitionException {
        try {
            // InternalTypoDSL.g:229:1: ( ruleItemize EOF )
            // InternalTypoDSL.g:230:1: ruleItemize EOF
            {
             before(grammarAccess.getItemizeRule()); 
            pushFollow(FOLLOW_1);
            ruleItemize();

            state._fsp--;

             after(grammarAccess.getItemizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemize"


    // $ANTLR start "ruleItemize"
    // InternalTypoDSL.g:237:1: ruleItemize : ( ( rule__Itemize__Group__0 ) ) ;
    public final void ruleItemize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:241:2: ( ( ( rule__Itemize__Group__0 ) ) )
            // InternalTypoDSL.g:242:2: ( ( rule__Itemize__Group__0 ) )
            {
            // InternalTypoDSL.g:242:2: ( ( rule__Itemize__Group__0 ) )
            // InternalTypoDSL.g:243:3: ( rule__Itemize__Group__0 )
            {
             before(grammarAccess.getItemizeAccess().getGroup()); 
            // InternalTypoDSL.g:244:3: ( rule__Itemize__Group__0 )
            // InternalTypoDSL.g:244:4: rule__Itemize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Itemize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemize"


    // $ANTLR start "entryRuleListItem"
    // InternalTypoDSL.g:253:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalTypoDSL.g:254:1: ( ruleListItem EOF )
            // InternalTypoDSL.g:255:1: ruleListItem EOF
            {
             before(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getListItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalTypoDSL.g:262:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:266:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalTypoDSL.g:267:2: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalTypoDSL.g:267:2: ( ( rule__ListItem__Group__0 ) )
            // InternalTypoDSL.g:268:3: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalTypoDSL.g:269:3: ( rule__ListItem__Group__0 )
            // InternalTypoDSL.g:269:4: rule__ListItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleInlineItem"
    // InternalTypoDSL.g:278:1: entryRuleInlineItem : ruleInlineItem EOF ;
    public final void entryRuleInlineItem() throws RecognitionException {
        try {
            // InternalTypoDSL.g:279:1: ( ruleInlineItem EOF )
            // InternalTypoDSL.g:280:1: ruleInlineItem EOF
            {
             before(grammarAccess.getInlineItemRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineItem();

            state._fsp--;

             after(grammarAccess.getInlineItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInlineItem"


    // $ANTLR start "ruleInlineItem"
    // InternalTypoDSL.g:287:1: ruleInlineItem : ( ( rule__InlineItem__Alternatives ) ) ;
    public final void ruleInlineItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:291:2: ( ( ( rule__InlineItem__Alternatives ) ) )
            // InternalTypoDSL.g:292:2: ( ( rule__InlineItem__Alternatives ) )
            {
            // InternalTypoDSL.g:292:2: ( ( rule__InlineItem__Alternatives ) )
            // InternalTypoDSL.g:293:3: ( rule__InlineItem__Alternatives )
            {
             before(grammarAccess.getInlineItemAccess().getAlternatives()); 
            // InternalTypoDSL.g:294:3: ( rule__InlineItem__Alternatives )
            // InternalTypoDSL.g:294:4: rule__InlineItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InlineItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInlineItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineItem"


    // $ANTLR start "entryRuleNormal"
    // InternalTypoDSL.g:303:1: entryRuleNormal : ruleNormal EOF ;
    public final void entryRuleNormal() throws RecognitionException {
        try {
            // InternalTypoDSL.g:304:1: ( ruleNormal EOF )
            // InternalTypoDSL.g:305:1: ruleNormal EOF
            {
             before(grammarAccess.getNormalRule()); 
            pushFollow(FOLLOW_1);
            ruleNormal();

            state._fsp--;

             after(grammarAccess.getNormalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormal"


    // $ANTLR start "ruleNormal"
    // InternalTypoDSL.g:312:1: ruleNormal : ( ( rule__Normal__Group__0 ) ) ;
    public final void ruleNormal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:316:2: ( ( ( rule__Normal__Group__0 ) ) )
            // InternalTypoDSL.g:317:2: ( ( rule__Normal__Group__0 ) )
            {
            // InternalTypoDSL.g:317:2: ( ( rule__Normal__Group__0 ) )
            // InternalTypoDSL.g:318:3: ( rule__Normal__Group__0 )
            {
             before(grammarAccess.getNormalAccess().getGroup()); 
            // InternalTypoDSL.g:319:3: ( rule__Normal__Group__0 )
            // InternalTypoDSL.g:319:4: rule__Normal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Normal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormal"


    // $ANTLR start "entryRuleBold"
    // InternalTypoDSL.g:328:1: entryRuleBold : ruleBold EOF ;
    public final void entryRuleBold() throws RecognitionException {
        try {
            // InternalTypoDSL.g:329:1: ( ruleBold EOF )
            // InternalTypoDSL.g:330:1: ruleBold EOF
            {
             before(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_1);
            ruleBold();

            state._fsp--;

             after(grammarAccess.getBoldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // InternalTypoDSL.g:337:1: ruleBold : ( ( rule__Bold__Group__0 ) ) ;
    public final void ruleBold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:341:2: ( ( ( rule__Bold__Group__0 ) ) )
            // InternalTypoDSL.g:342:2: ( ( rule__Bold__Group__0 ) )
            {
            // InternalTypoDSL.g:342:2: ( ( rule__Bold__Group__0 ) )
            // InternalTypoDSL.g:343:3: ( rule__Bold__Group__0 )
            {
             before(grammarAccess.getBoldAccess().getGroup()); 
            // InternalTypoDSL.g:344:3: ( rule__Bold__Group__0 )
            // InternalTypoDSL.g:344:4: rule__Bold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBold"


    // $ANTLR start "entryRuleItalic"
    // InternalTypoDSL.g:353:1: entryRuleItalic : ruleItalic EOF ;
    public final void entryRuleItalic() throws RecognitionException {
        try {
            // InternalTypoDSL.g:354:1: ( ruleItalic EOF )
            // InternalTypoDSL.g:355:1: ruleItalic EOF
            {
             before(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_1);
            ruleItalic();

            state._fsp--;

             after(grammarAccess.getItalicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // InternalTypoDSL.g:362:1: ruleItalic : ( ( rule__Italic__Group__0 ) ) ;
    public final void ruleItalic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:366:2: ( ( ( rule__Italic__Group__0 ) ) )
            // InternalTypoDSL.g:367:2: ( ( rule__Italic__Group__0 ) )
            {
            // InternalTypoDSL.g:367:2: ( ( rule__Italic__Group__0 ) )
            // InternalTypoDSL.g:368:3: ( rule__Italic__Group__0 )
            {
             before(grammarAccess.getItalicAccess().getGroup()); 
            // InternalTypoDSL.g:369:3: ( rule__Italic__Group__0 )
            // InternalTypoDSL.g:369:4: rule__Italic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Italic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleLink"
    // InternalTypoDSL.g:378:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalTypoDSL.g:379:1: ( ruleLink EOF )
            // InternalTypoDSL.g:380:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalTypoDSL.g:387:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:391:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalTypoDSL.g:392:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalTypoDSL.g:392:2: ( ( rule__Link__Group__0 ) )
            // InternalTypoDSL.g:393:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalTypoDSL.g:394:3: ( rule__Link__Group__0 )
            // InternalTypoDSL.g:394:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "rule__Blocks__Alternatives"
    // InternalTypoDSL.g:402:1: rule__Blocks__Alternatives : ( ( ruleSection ) | ( ruleSubsection ) | ( ruleParagraph ) | ( ruleImage ) | ( ruleCodeBlock ) | ( ruleItemize ) );
    public final void rule__Blocks__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:406:1: ( ( ruleSection ) | ( ruleSubsection ) | ( ruleParagraph ) | ( ruleImage ) | ( ruleCodeBlock ) | ( ruleItemize ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 30:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTypoDSL.g:407:2: ( ruleSection )
                    {
                    // InternalTypoDSL.g:407:2: ( ruleSection )
                    // InternalTypoDSL.g:408:3: ruleSection
                    {
                     before(grammarAccess.getBlocksAccess().getSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSection();

                    state._fsp--;

                     after(grammarAccess.getBlocksAccess().getSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypoDSL.g:413:2: ( ruleSubsection )
                    {
                    // InternalTypoDSL.g:413:2: ( ruleSubsection )
                    // InternalTypoDSL.g:414:3: ruleSubsection
                    {
                     before(grammarAccess.getBlocksAccess().getSubsectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubsection();

                    state._fsp--;

                     after(grammarAccess.getBlocksAccess().getSubsectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypoDSL.g:419:2: ( ruleParagraph )
                    {
                    // InternalTypoDSL.g:419:2: ( ruleParagraph )
                    // InternalTypoDSL.g:420:3: ruleParagraph
                    {
                     before(grammarAccess.getBlocksAccess().getParagraphParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParagraph();

                    state._fsp--;

                     after(grammarAccess.getBlocksAccess().getParagraphParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTypoDSL.g:425:2: ( ruleImage )
                    {
                    // InternalTypoDSL.g:425:2: ( ruleImage )
                    // InternalTypoDSL.g:426:3: ruleImage
                    {
                     before(grammarAccess.getBlocksAccess().getImageParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getBlocksAccess().getImageParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTypoDSL.g:431:2: ( ruleCodeBlock )
                    {
                    // InternalTypoDSL.g:431:2: ( ruleCodeBlock )
                    // InternalTypoDSL.g:432:3: ruleCodeBlock
                    {
                     before(grammarAccess.getBlocksAccess().getCodeBlockParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCodeBlock();

                    state._fsp--;

                     after(grammarAccess.getBlocksAccess().getCodeBlockParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTypoDSL.g:437:2: ( ruleItemize )
                    {
                    // InternalTypoDSL.g:437:2: ( ruleItemize )
                    // InternalTypoDSL.g:438:3: ruleItemize
                    {
                     before(grammarAccess.getBlocksAccess().getItemizeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleItemize();

                    state._fsp--;

                     after(grammarAccess.getBlocksAccess().getItemizeParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blocks__Alternatives"


    // $ANTLR start "rule__InlineItem__Alternatives"
    // InternalTypoDSL.g:447:1: rule__InlineItem__Alternatives : ( ( ruleNormal ) | ( ruleBold ) | ( ruleItalic ) | ( ruleLink ) );
    public final void rule__InlineItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:451:1: ( ( ruleNormal ) | ( ruleBold ) | ( ruleItalic ) | ( ruleLink ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTypoDSL.g:452:2: ( ruleNormal )
                    {
                    // InternalTypoDSL.g:452:2: ( ruleNormal )
                    // InternalTypoDSL.g:453:3: ruleNormal
                    {
                     before(grammarAccess.getInlineItemAccess().getNormalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNormal();

                    state._fsp--;

                     after(grammarAccess.getInlineItemAccess().getNormalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTypoDSL.g:458:2: ( ruleBold )
                    {
                    // InternalTypoDSL.g:458:2: ( ruleBold )
                    // InternalTypoDSL.g:459:3: ruleBold
                    {
                     before(grammarAccess.getInlineItemAccess().getBoldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getInlineItemAccess().getBoldParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTypoDSL.g:464:2: ( ruleItalic )
                    {
                    // InternalTypoDSL.g:464:2: ( ruleItalic )
                    // InternalTypoDSL.g:465:3: ruleItalic
                    {
                     before(grammarAccess.getInlineItemAccess().getItalicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getInlineItemAccess().getItalicParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTypoDSL.g:470:2: ( ruleLink )
                    {
                    // InternalTypoDSL.g:470:2: ( ruleLink )
                    // InternalTypoDSL.g:471:3: ruleLink
                    {
                     before(grammarAccess.getInlineItemAccess().getLinkParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getInlineItemAccess().getLinkParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineItem__Alternatives"


    // $ANTLR start "rule__Document__Group__0"
    // InternalTypoDSL.g:480:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:484:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalTypoDSL.g:485:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // InternalTypoDSL.g:492:1: rule__Document__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:496:1: ( ( 'doc' ) )
            // InternalTypoDSL.g:497:1: ( 'doc' )
            {
            // InternalTypoDSL.g:497:1: ( 'doc' )
            // InternalTypoDSL.g:498:2: 'doc'
            {
             before(grammarAccess.getDocumentAccess().getDocKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getDocKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // InternalTypoDSL.g:507:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:511:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalTypoDSL.g:512:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // InternalTypoDSL.g:519:1: rule__Document__Group__1__Impl : ( '{' ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:523:1: ( ( '{' ) )
            // InternalTypoDSL.g:524:1: ( '{' )
            {
            // InternalTypoDSL.g:524:1: ( '{' )
            // InternalTypoDSL.g:525:2: '{'
            {
             before(grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // InternalTypoDSL.g:534:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:538:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // InternalTypoDSL.g:539:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // InternalTypoDSL.g:546:1: rule__Document__Group__2__Impl : ( 'title:' ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:550:1: ( ( 'title:' ) )
            // InternalTypoDSL.g:551:1: ( 'title:' )
            {
            // InternalTypoDSL.g:551:1: ( 'title:' )
            // InternalTypoDSL.g:552:2: 'title:'
            {
             before(grammarAccess.getDocumentAccess().getTitleKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getTitleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Document__Group__3"
    // InternalTypoDSL.g:561:1: rule__Document__Group__3 : rule__Document__Group__3__Impl rule__Document__Group__4 ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:565:1: ( rule__Document__Group__3__Impl rule__Document__Group__4 )
            // InternalTypoDSL.g:566:2: rule__Document__Group__3__Impl rule__Document__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Document__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__3"


    // $ANTLR start "rule__Document__Group__3__Impl"
    // InternalTypoDSL.g:573:1: rule__Document__Group__3__Impl : ( ( rule__Document__TitleAssignment_3 ) ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:577:1: ( ( ( rule__Document__TitleAssignment_3 ) ) )
            // InternalTypoDSL.g:578:1: ( ( rule__Document__TitleAssignment_3 ) )
            {
            // InternalTypoDSL.g:578:1: ( ( rule__Document__TitleAssignment_3 ) )
            // InternalTypoDSL.g:579:2: ( rule__Document__TitleAssignment_3 )
            {
             before(grammarAccess.getDocumentAccess().getTitleAssignment_3()); 
            // InternalTypoDSL.g:580:2: ( rule__Document__TitleAssignment_3 )
            // InternalTypoDSL.g:580:3: rule__Document__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Document__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__3__Impl"


    // $ANTLR start "rule__Document__Group__4"
    // InternalTypoDSL.g:588:1: rule__Document__Group__4 : rule__Document__Group__4__Impl rule__Document__Group__5 ;
    public final void rule__Document__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:592:1: ( rule__Document__Group__4__Impl rule__Document__Group__5 )
            // InternalTypoDSL.g:593:2: rule__Document__Group__4__Impl rule__Document__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Document__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__4"


    // $ANTLR start "rule__Document__Group__4__Impl"
    // InternalTypoDSL.g:600:1: rule__Document__Group__4__Impl : ( 'author:' ) ;
    public final void rule__Document__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:604:1: ( ( 'author:' ) )
            // InternalTypoDSL.g:605:1: ( 'author:' )
            {
            // InternalTypoDSL.g:605:1: ( 'author:' )
            // InternalTypoDSL.g:606:2: 'author:'
            {
             before(grammarAccess.getDocumentAccess().getAuthorKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getAuthorKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__4__Impl"


    // $ANTLR start "rule__Document__Group__5"
    // InternalTypoDSL.g:615:1: rule__Document__Group__5 : rule__Document__Group__5__Impl rule__Document__Group__6 ;
    public final void rule__Document__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:619:1: ( rule__Document__Group__5__Impl rule__Document__Group__6 )
            // InternalTypoDSL.g:620:2: rule__Document__Group__5__Impl rule__Document__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Document__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__5"


    // $ANTLR start "rule__Document__Group__5__Impl"
    // InternalTypoDSL.g:627:1: rule__Document__Group__5__Impl : ( ( rule__Document__AuthorAssignment_5 ) ) ;
    public final void rule__Document__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:631:1: ( ( ( rule__Document__AuthorAssignment_5 ) ) )
            // InternalTypoDSL.g:632:1: ( ( rule__Document__AuthorAssignment_5 ) )
            {
            // InternalTypoDSL.g:632:1: ( ( rule__Document__AuthorAssignment_5 ) )
            // InternalTypoDSL.g:633:2: ( rule__Document__AuthorAssignment_5 )
            {
             before(grammarAccess.getDocumentAccess().getAuthorAssignment_5()); 
            // InternalTypoDSL.g:634:2: ( rule__Document__AuthorAssignment_5 )
            // InternalTypoDSL.g:634:3: rule__Document__AuthorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Document__AuthorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getAuthorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__5__Impl"


    // $ANTLR start "rule__Document__Group__6"
    // InternalTypoDSL.g:642:1: rule__Document__Group__6 : rule__Document__Group__6__Impl rule__Document__Group__7 ;
    public final void rule__Document__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:646:1: ( rule__Document__Group__6__Impl rule__Document__Group__7 )
            // InternalTypoDSL.g:647:2: rule__Document__Group__6__Impl rule__Document__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Document__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__6"


    // $ANTLR start "rule__Document__Group__6__Impl"
    // InternalTypoDSL.g:654:1: rule__Document__Group__6__Impl : ( 'date:' ) ;
    public final void rule__Document__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:658:1: ( ( 'date:' ) )
            // InternalTypoDSL.g:659:1: ( 'date:' )
            {
            // InternalTypoDSL.g:659:1: ( 'date:' )
            // InternalTypoDSL.g:660:2: 'date:'
            {
             before(grammarAccess.getDocumentAccess().getDateKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getDateKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__6__Impl"


    // $ANTLR start "rule__Document__Group__7"
    // InternalTypoDSL.g:669:1: rule__Document__Group__7 : rule__Document__Group__7__Impl rule__Document__Group__8 ;
    public final void rule__Document__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:673:1: ( rule__Document__Group__7__Impl rule__Document__Group__8 )
            // InternalTypoDSL.g:674:2: rule__Document__Group__7__Impl rule__Document__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Document__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__7"


    // $ANTLR start "rule__Document__Group__7__Impl"
    // InternalTypoDSL.g:681:1: rule__Document__Group__7__Impl : ( ( rule__Document__DatetimeAssignment_7 ) ) ;
    public final void rule__Document__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:685:1: ( ( ( rule__Document__DatetimeAssignment_7 ) ) )
            // InternalTypoDSL.g:686:1: ( ( rule__Document__DatetimeAssignment_7 ) )
            {
            // InternalTypoDSL.g:686:1: ( ( rule__Document__DatetimeAssignment_7 ) )
            // InternalTypoDSL.g:687:2: ( rule__Document__DatetimeAssignment_7 )
            {
             before(grammarAccess.getDocumentAccess().getDatetimeAssignment_7()); 
            // InternalTypoDSL.g:688:2: ( rule__Document__DatetimeAssignment_7 )
            // InternalTypoDSL.g:688:3: rule__Document__DatetimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Document__DatetimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getDatetimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__7__Impl"


    // $ANTLR start "rule__Document__Group__8"
    // InternalTypoDSL.g:696:1: rule__Document__Group__8 : rule__Document__Group__8__Impl rule__Document__Group__9 ;
    public final void rule__Document__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:700:1: ( rule__Document__Group__8__Impl rule__Document__Group__9 )
            // InternalTypoDSL.g:701:2: rule__Document__Group__8__Impl rule__Document__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Document__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__8"


    // $ANTLR start "rule__Document__Group__8__Impl"
    // InternalTypoDSL.g:708:1: rule__Document__Group__8__Impl : ( 'tldr:' ) ;
    public final void rule__Document__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:712:1: ( ( 'tldr:' ) )
            // InternalTypoDSL.g:713:1: ( 'tldr:' )
            {
            // InternalTypoDSL.g:713:1: ( 'tldr:' )
            // InternalTypoDSL.g:714:2: 'tldr:'
            {
             before(grammarAccess.getDocumentAccess().getTldrKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getTldrKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__8__Impl"


    // $ANTLR start "rule__Document__Group__9"
    // InternalTypoDSL.g:723:1: rule__Document__Group__9 : rule__Document__Group__9__Impl rule__Document__Group__10 ;
    public final void rule__Document__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:727:1: ( rule__Document__Group__9__Impl rule__Document__Group__10 )
            // InternalTypoDSL.g:728:2: rule__Document__Group__9__Impl rule__Document__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Document__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__9"


    // $ANTLR start "rule__Document__Group__9__Impl"
    // InternalTypoDSL.g:735:1: rule__Document__Group__9__Impl : ( ( rule__Document__TldrAssignment_9 ) ) ;
    public final void rule__Document__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:739:1: ( ( ( rule__Document__TldrAssignment_9 ) ) )
            // InternalTypoDSL.g:740:1: ( ( rule__Document__TldrAssignment_9 ) )
            {
            // InternalTypoDSL.g:740:1: ( ( rule__Document__TldrAssignment_9 ) )
            // InternalTypoDSL.g:741:2: ( rule__Document__TldrAssignment_9 )
            {
             before(grammarAccess.getDocumentAccess().getTldrAssignment_9()); 
            // InternalTypoDSL.g:742:2: ( rule__Document__TldrAssignment_9 )
            // InternalTypoDSL.g:742:3: rule__Document__TldrAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Document__TldrAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getTldrAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__9__Impl"


    // $ANTLR start "rule__Document__Group__10"
    // InternalTypoDSL.g:750:1: rule__Document__Group__10 : rule__Document__Group__10__Impl rule__Document__Group__11 ;
    public final void rule__Document__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:754:1: ( rule__Document__Group__10__Impl rule__Document__Group__11 )
            // InternalTypoDSL.g:755:2: rule__Document__Group__10__Impl rule__Document__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Document__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__10"


    // $ANTLR start "rule__Document__Group__10__Impl"
    // InternalTypoDSL.g:762:1: rule__Document__Group__10__Impl : ( ( rule__Document__BlocksAssignment_10 )* ) ;
    public final void rule__Document__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:766:1: ( ( ( rule__Document__BlocksAssignment_10 )* ) )
            // InternalTypoDSL.g:767:1: ( ( rule__Document__BlocksAssignment_10 )* )
            {
            // InternalTypoDSL.g:767:1: ( ( rule__Document__BlocksAssignment_10 )* )
            // InternalTypoDSL.g:768:2: ( rule__Document__BlocksAssignment_10 )*
            {
             before(grammarAccess.getDocumentAccess().getBlocksAssignment_10()); 
            // InternalTypoDSL.g:769:2: ( rule__Document__BlocksAssignment_10 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=19 && LA3_0<=22)||LA3_0==27||LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTypoDSL.g:769:3: rule__Document__BlocksAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Document__BlocksAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getBlocksAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__10__Impl"


    // $ANTLR start "rule__Document__Group__11"
    // InternalTypoDSL.g:777:1: rule__Document__Group__11 : rule__Document__Group__11__Impl ;
    public final void rule__Document__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:781:1: ( rule__Document__Group__11__Impl )
            // InternalTypoDSL.g:782:2: rule__Document__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__11"


    // $ANTLR start "rule__Document__Group__11__Impl"
    // InternalTypoDSL.g:788:1: rule__Document__Group__11__Impl : ( '}' ) ;
    public final void rule__Document__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:792:1: ( ( '}' ) )
            // InternalTypoDSL.g:793:1: ( '}' )
            {
            // InternalTypoDSL.g:793:1: ( '}' )
            // InternalTypoDSL.g:794:2: '}'
            {
             before(grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__11__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalTypoDSL.g:804:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:808:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalTypoDSL.g:809:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalTypoDSL.g:816:1: rule__Section__Group__0__Impl : ( '+section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:820:1: ( ( '+section' ) )
            // InternalTypoDSL.g:821:1: ( '+section' )
            {
            // InternalTypoDSL.g:821:1: ( '+section' )
            // InternalTypoDSL.g:822:2: '+section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalTypoDSL.g:831:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:835:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalTypoDSL.g:836:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalTypoDSL.g:843:1: rule__Section__Group__1__Impl : ( ( rule__Section__TitleAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:847:1: ( ( ( rule__Section__TitleAssignment_1 ) ) )
            // InternalTypoDSL.g:848:1: ( ( rule__Section__TitleAssignment_1 ) )
            {
            // InternalTypoDSL.g:848:1: ( ( rule__Section__TitleAssignment_1 ) )
            // InternalTypoDSL.g:849:2: ( rule__Section__TitleAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_1()); 
            // InternalTypoDSL.g:850:2: ( rule__Section__TitleAssignment_1 )
            // InternalTypoDSL.g:850:3: rule__Section__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalTypoDSL.g:858:1: rule__Section__Group__2 : rule__Section__Group__2__Impl ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:862:1: ( rule__Section__Group__2__Impl )
            // InternalTypoDSL.g:863:2: rule__Section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalTypoDSL.g:869:1: rule__Section__Group__2__Impl : ( ( rule__Section__BlocksAssignment_2 )* ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:873:1: ( ( ( rule__Section__BlocksAssignment_2 )* ) )
            // InternalTypoDSL.g:874:1: ( ( rule__Section__BlocksAssignment_2 )* )
            {
            // InternalTypoDSL.g:874:1: ( ( rule__Section__BlocksAssignment_2 )* )
            // InternalTypoDSL.g:875:2: ( rule__Section__BlocksAssignment_2 )*
            {
             before(grammarAccess.getSectionAccess().getBlocksAssignment_2()); 
            // InternalTypoDSL.g:876:2: ( rule__Section__BlocksAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=1;
                    }
                    break;
                case 22:
                    {
                    alt4=1;
                    }
                    break;
                case 27:
                    {
                    alt4=1;
                    }
                    break;
                case 30:
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalTypoDSL.g:876:3: rule__Section__BlocksAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Section__BlocksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getBlocksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Subsection__Group__0"
    // InternalTypoDSL.g:885:1: rule__Subsection__Group__0 : rule__Subsection__Group__0__Impl rule__Subsection__Group__1 ;
    public final void rule__Subsection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:889:1: ( rule__Subsection__Group__0__Impl rule__Subsection__Group__1 )
            // InternalTypoDSL.g:890:2: rule__Subsection__Group__0__Impl rule__Subsection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Subsection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__Group__0"


    // $ANTLR start "rule__Subsection__Group__0__Impl"
    // InternalTypoDSL.g:897:1: rule__Subsection__Group__0__Impl : ( '+sub' ) ;
    public final void rule__Subsection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:901:1: ( ( '+sub' ) )
            // InternalTypoDSL.g:902:1: ( '+sub' )
            {
            // InternalTypoDSL.g:902:1: ( '+sub' )
            // InternalTypoDSL.g:903:2: '+sub'
            {
             before(grammarAccess.getSubsectionAccess().getSubKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubsectionAccess().getSubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__Group__0__Impl"


    // $ANTLR start "rule__Subsection__Group__1"
    // InternalTypoDSL.g:912:1: rule__Subsection__Group__1 : rule__Subsection__Group__1__Impl rule__Subsection__Group__2 ;
    public final void rule__Subsection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:916:1: ( rule__Subsection__Group__1__Impl rule__Subsection__Group__2 )
            // InternalTypoDSL.g:917:2: rule__Subsection__Group__1__Impl rule__Subsection__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Subsection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__Group__1"


    // $ANTLR start "rule__Subsection__Group__1__Impl"
    // InternalTypoDSL.g:924:1: rule__Subsection__Group__1__Impl : ( ( rule__Subsection__TitleAssignment_1 ) ) ;
    public final void rule__Subsection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:928:1: ( ( ( rule__Subsection__TitleAssignment_1 ) ) )
            // InternalTypoDSL.g:929:1: ( ( rule__Subsection__TitleAssignment_1 ) )
            {
            // InternalTypoDSL.g:929:1: ( ( rule__Subsection__TitleAssignment_1 ) )
            // InternalTypoDSL.g:930:2: ( rule__Subsection__TitleAssignment_1 )
            {
             before(grammarAccess.getSubsectionAccess().getTitleAssignment_1()); 
            // InternalTypoDSL.g:931:2: ( rule__Subsection__TitleAssignment_1 )
            // InternalTypoDSL.g:931:3: rule__Subsection__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subsection__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__Group__1__Impl"


    // $ANTLR start "rule__Subsection__Group__2"
    // InternalTypoDSL.g:939:1: rule__Subsection__Group__2 : rule__Subsection__Group__2__Impl ;
    public final void rule__Subsection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:943:1: ( rule__Subsection__Group__2__Impl )
            // InternalTypoDSL.g:944:2: rule__Subsection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subsection__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__Group__2"


    // $ANTLR start "rule__Subsection__Group__2__Impl"
    // InternalTypoDSL.g:950:1: rule__Subsection__Group__2__Impl : ( ( rule__Subsection__BlocksAssignment_2 )* ) ;
    public final void rule__Subsection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:954:1: ( ( ( rule__Subsection__BlocksAssignment_2 )* ) )
            // InternalTypoDSL.g:955:1: ( ( rule__Subsection__BlocksAssignment_2 )* )
            {
            // InternalTypoDSL.g:955:1: ( ( rule__Subsection__BlocksAssignment_2 )* )
            // InternalTypoDSL.g:956:2: ( rule__Subsection__BlocksAssignment_2 )*
            {
             before(grammarAccess.getSubsectionAccess().getBlocksAssignment_2()); 
            // InternalTypoDSL.g:957:2: ( rule__Subsection__BlocksAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt5=1;
                    }
                    break;
                case 20:
                    {
                    alt5=1;
                    }
                    break;
                case 21:
                    {
                    alt5=1;
                    }
                    break;
                case 22:
                    {
                    alt5=1;
                    }
                    break;
                case 27:
                    {
                    alt5=1;
                    }
                    break;
                case 30:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalTypoDSL.g:957:3: rule__Subsection__BlocksAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Subsection__BlocksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSubsectionAccess().getBlocksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__Group__2__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalTypoDSL.g:966:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:970:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalTypoDSL.g:971:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // InternalTypoDSL.g:978:1: rule__Paragraph__Group__0__Impl : ( '+p' ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:982:1: ( ( '+p' ) )
            // InternalTypoDSL.g:983:1: ( '+p' )
            {
            // InternalTypoDSL.g:983:1: ( '+p' )
            // InternalTypoDSL.g:984:2: '+p'
            {
             before(grammarAccess.getParagraphAccess().getPKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // InternalTypoDSL.g:993:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:997:1: ( rule__Paragraph__Group__1__Impl )
            // InternalTypoDSL.g:998:2: rule__Paragraph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // InternalTypoDSL.g:1004:1: rule__Paragraph__Group__1__Impl : ( ( ( rule__Paragraph__InlineitemsAssignment_1 ) ) ( ( rule__Paragraph__InlineitemsAssignment_1 )* ) ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1008:1: ( ( ( ( rule__Paragraph__InlineitemsAssignment_1 ) ) ( ( rule__Paragraph__InlineitemsAssignment_1 )* ) ) )
            // InternalTypoDSL.g:1009:1: ( ( ( rule__Paragraph__InlineitemsAssignment_1 ) ) ( ( rule__Paragraph__InlineitemsAssignment_1 )* ) )
            {
            // InternalTypoDSL.g:1009:1: ( ( ( rule__Paragraph__InlineitemsAssignment_1 ) ) ( ( rule__Paragraph__InlineitemsAssignment_1 )* ) )
            // InternalTypoDSL.g:1010:2: ( ( rule__Paragraph__InlineitemsAssignment_1 ) ) ( ( rule__Paragraph__InlineitemsAssignment_1 )* )
            {
            // InternalTypoDSL.g:1010:2: ( ( rule__Paragraph__InlineitemsAssignment_1 ) )
            // InternalTypoDSL.g:1011:3: ( rule__Paragraph__InlineitemsAssignment_1 )
            {
             before(grammarAccess.getParagraphAccess().getInlineitemsAssignment_1()); 
            // InternalTypoDSL.g:1012:3: ( rule__Paragraph__InlineitemsAssignment_1 )
            // InternalTypoDSL.g:1012:4: rule__Paragraph__InlineitemsAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__Paragraph__InlineitemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getInlineitemsAssignment_1()); 

            }

            // InternalTypoDSL.g:1015:2: ( ( rule__Paragraph__InlineitemsAssignment_1 )* )
            // InternalTypoDSL.g:1016:3: ( rule__Paragraph__InlineitemsAssignment_1 )*
            {
             before(grammarAccess.getParagraphAccess().getInlineitemsAssignment_1()); 
            // InternalTypoDSL.g:1017:3: ( rule__Paragraph__InlineitemsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=32 && LA6_0<=35)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTypoDSL.g:1017:4: rule__Paragraph__InlineitemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Paragraph__InlineitemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getParagraphAccess().getInlineitemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalTypoDSL.g:1027:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1031:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalTypoDSL.g:1032:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalTypoDSL.g:1039:1: rule__Image__Group__0__Impl : ( '+img' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1043:1: ( ( '+img' ) )
            // InternalTypoDSL.g:1044:1: ( '+img' )
            {
            // InternalTypoDSL.g:1044:1: ( '+img' )
            // InternalTypoDSL.g:1045:2: '+img'
            {
             before(grammarAccess.getImageAccess().getImgKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalTypoDSL.g:1054:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1058:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalTypoDSL.g:1059:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalTypoDSL.g:1066:1: rule__Image__Group__1__Impl : ( '{' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1070:1: ( ( '{' ) )
            // InternalTypoDSL.g:1071:1: ( '{' )
            {
            // InternalTypoDSL.g:1071:1: ( '{' )
            // InternalTypoDSL.g:1072:2: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalTypoDSL.g:1081:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1085:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalTypoDSL.g:1086:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalTypoDSL.g:1093:1: rule__Image__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1097:1: ( ( 'url:' ) )
            // InternalTypoDSL.g:1098:1: ( 'url:' )
            {
            // InternalTypoDSL.g:1098:1: ( 'url:' )
            // InternalTypoDSL.g:1099:2: 'url:'
            {
             before(grammarAccess.getImageAccess().getUrlKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalTypoDSL.g:1108:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1112:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalTypoDSL.g:1113:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalTypoDSL.g:1120:1: rule__Image__Group__3__Impl : ( ( rule__Image__UrlAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1124:1: ( ( ( rule__Image__UrlAssignment_3 ) ) )
            // InternalTypoDSL.g:1125:1: ( ( rule__Image__UrlAssignment_3 ) )
            {
            // InternalTypoDSL.g:1125:1: ( ( rule__Image__UrlAssignment_3 ) )
            // InternalTypoDSL.g:1126:2: ( rule__Image__UrlAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_3()); 
            // InternalTypoDSL.g:1127:2: ( rule__Image__UrlAssignment_3 )
            // InternalTypoDSL.g:1127:3: rule__Image__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Image__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // InternalTypoDSL.g:1135:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1139:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalTypoDSL.g:1140:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // InternalTypoDSL.g:1147:1: rule__Image__Group__4__Impl : ( 'width:' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1151:1: ( ( 'width:' ) )
            // InternalTypoDSL.g:1152:1: ( 'width:' )
            {
            // InternalTypoDSL.g:1152:1: ( 'width:' )
            // InternalTypoDSL.g:1153:2: 'width:'
            {
             before(grammarAccess.getImageAccess().getWidthKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getWidthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__5"
    // InternalTypoDSL.g:1162:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1166:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // InternalTypoDSL.g:1167:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5"


    // $ANTLR start "rule__Image__Group__5__Impl"
    // InternalTypoDSL.g:1174:1: rule__Image__Group__5__Impl : ( ( rule__Image__WidthAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1178:1: ( ( ( rule__Image__WidthAssignment_5 ) ) )
            // InternalTypoDSL.g:1179:1: ( ( rule__Image__WidthAssignment_5 ) )
            {
            // InternalTypoDSL.g:1179:1: ( ( rule__Image__WidthAssignment_5 ) )
            // InternalTypoDSL.g:1180:2: ( rule__Image__WidthAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getWidthAssignment_5()); 
            // InternalTypoDSL.g:1181:2: ( rule__Image__WidthAssignment_5 )
            // InternalTypoDSL.g:1181:3: rule__Image__WidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Image__WidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5__Impl"


    // $ANTLR start "rule__Image__Group__6"
    // InternalTypoDSL.g:1189:1: rule__Image__Group__6 : rule__Image__Group__6__Impl rule__Image__Group__7 ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1193:1: ( rule__Image__Group__6__Impl rule__Image__Group__7 )
            // InternalTypoDSL.g:1194:2: rule__Image__Group__6__Impl rule__Image__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Image__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6"


    // $ANTLR start "rule__Image__Group__6__Impl"
    // InternalTypoDSL.g:1201:1: rule__Image__Group__6__Impl : ( 'height:' ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1205:1: ( ( 'height:' ) )
            // InternalTypoDSL.g:1206:1: ( 'height:' )
            {
            // InternalTypoDSL.g:1206:1: ( 'height:' )
            // InternalTypoDSL.g:1207:2: 'height:'
            {
             before(grammarAccess.getImageAccess().getHeightKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6__Impl"


    // $ANTLR start "rule__Image__Group__7"
    // InternalTypoDSL.g:1216:1: rule__Image__Group__7 : rule__Image__Group__7__Impl rule__Image__Group__8 ;
    public final void rule__Image__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1220:1: ( rule__Image__Group__7__Impl rule__Image__Group__8 )
            // InternalTypoDSL.g:1221:2: rule__Image__Group__7__Impl rule__Image__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Image__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__7"


    // $ANTLR start "rule__Image__Group__7__Impl"
    // InternalTypoDSL.g:1228:1: rule__Image__Group__7__Impl : ( ( rule__Image__HeightAssignment_7 ) ) ;
    public final void rule__Image__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1232:1: ( ( ( rule__Image__HeightAssignment_7 ) ) )
            // InternalTypoDSL.g:1233:1: ( ( rule__Image__HeightAssignment_7 ) )
            {
            // InternalTypoDSL.g:1233:1: ( ( rule__Image__HeightAssignment_7 ) )
            // InternalTypoDSL.g:1234:2: ( rule__Image__HeightAssignment_7 )
            {
             before(grammarAccess.getImageAccess().getHeightAssignment_7()); 
            // InternalTypoDSL.g:1235:2: ( rule__Image__HeightAssignment_7 )
            // InternalTypoDSL.g:1235:3: rule__Image__HeightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Image__HeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getHeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__7__Impl"


    // $ANTLR start "rule__Image__Group__8"
    // InternalTypoDSL.g:1243:1: rule__Image__Group__8 : rule__Image__Group__8__Impl rule__Image__Group__9 ;
    public final void rule__Image__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1247:1: ( rule__Image__Group__8__Impl rule__Image__Group__9 )
            // InternalTypoDSL.g:1248:2: rule__Image__Group__8__Impl rule__Image__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Image__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__8"


    // $ANTLR start "rule__Image__Group__8__Impl"
    // InternalTypoDSL.g:1255:1: rule__Image__Group__8__Impl : ( ( rule__Image__Group_8__0 )? ) ;
    public final void rule__Image__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1259:1: ( ( ( rule__Image__Group_8__0 )? ) )
            // InternalTypoDSL.g:1260:1: ( ( rule__Image__Group_8__0 )? )
            {
            // InternalTypoDSL.g:1260:1: ( ( rule__Image__Group_8__0 )? )
            // InternalTypoDSL.g:1261:2: ( rule__Image__Group_8__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_8()); 
            // InternalTypoDSL.g:1262:2: ( rule__Image__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTypoDSL.g:1262:3: rule__Image__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__8__Impl"


    // $ANTLR start "rule__Image__Group__9"
    // InternalTypoDSL.g:1270:1: rule__Image__Group__9 : rule__Image__Group__9__Impl ;
    public final void rule__Image__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1274:1: ( rule__Image__Group__9__Impl )
            // InternalTypoDSL.g:1275:2: rule__Image__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__9"


    // $ANTLR start "rule__Image__Group__9__Impl"
    // InternalTypoDSL.g:1281:1: rule__Image__Group__9__Impl : ( '}' ) ;
    public final void rule__Image__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1285:1: ( ( '}' ) )
            // InternalTypoDSL.g:1286:1: ( '}' )
            {
            // InternalTypoDSL.g:1286:1: ( '}' )
            // InternalTypoDSL.g:1287:2: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__9__Impl"


    // $ANTLR start "rule__Image__Group_8__0"
    // InternalTypoDSL.g:1297:1: rule__Image__Group_8__0 : rule__Image__Group_8__0__Impl rule__Image__Group_8__1 ;
    public final void rule__Image__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1301:1: ( rule__Image__Group_8__0__Impl rule__Image__Group_8__1 )
            // InternalTypoDSL.g:1302:2: rule__Image__Group_8__0__Impl rule__Image__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_8__0"


    // $ANTLR start "rule__Image__Group_8__0__Impl"
    // InternalTypoDSL.g:1309:1: rule__Image__Group_8__0__Impl : ( 'caption:' ) ;
    public final void rule__Image__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1313:1: ( ( 'caption:' ) )
            // InternalTypoDSL.g:1314:1: ( 'caption:' )
            {
            // InternalTypoDSL.g:1314:1: ( 'caption:' )
            // InternalTypoDSL.g:1315:2: 'caption:'
            {
             before(grammarAccess.getImageAccess().getCaptionKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getCaptionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_8__0__Impl"


    // $ANTLR start "rule__Image__Group_8__1"
    // InternalTypoDSL.g:1324:1: rule__Image__Group_8__1 : rule__Image__Group_8__1__Impl ;
    public final void rule__Image__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1328:1: ( rule__Image__Group_8__1__Impl )
            // InternalTypoDSL.g:1329:2: rule__Image__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_8__1"


    // $ANTLR start "rule__Image__Group_8__1__Impl"
    // InternalTypoDSL.g:1335:1: rule__Image__Group_8__1__Impl : ( ( rule__Image__CaptionAssignment_8_1 ) ) ;
    public final void rule__Image__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1339:1: ( ( ( rule__Image__CaptionAssignment_8_1 ) ) )
            // InternalTypoDSL.g:1340:1: ( ( rule__Image__CaptionAssignment_8_1 ) )
            {
            // InternalTypoDSL.g:1340:1: ( ( rule__Image__CaptionAssignment_8_1 ) )
            // InternalTypoDSL.g:1341:2: ( rule__Image__CaptionAssignment_8_1 )
            {
             before(grammarAccess.getImageAccess().getCaptionAssignment_8_1()); 
            // InternalTypoDSL.g:1342:2: ( rule__Image__CaptionAssignment_8_1 )
            // InternalTypoDSL.g:1342:3: rule__Image__CaptionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__CaptionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getCaptionAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_8__1__Impl"


    // $ANTLR start "rule__CodeBlock__Group__0"
    // InternalTypoDSL.g:1351:1: rule__CodeBlock__Group__0 : rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 ;
    public final void rule__CodeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1355:1: ( rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1 )
            // InternalTypoDSL.g:1356:2: rule__CodeBlock__Group__0__Impl rule__CodeBlock__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CodeBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__0"


    // $ANTLR start "rule__CodeBlock__Group__0__Impl"
    // InternalTypoDSL.g:1363:1: rule__CodeBlock__Group__0__Impl : ( '+code' ) ;
    public final void rule__CodeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1367:1: ( ( '+code' ) )
            // InternalTypoDSL.g:1368:1: ( '+code' )
            {
            // InternalTypoDSL.g:1368:1: ( '+code' )
            // InternalTypoDSL.g:1369:2: '+code'
            {
             before(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getCodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__0__Impl"


    // $ANTLR start "rule__CodeBlock__Group__1"
    // InternalTypoDSL.g:1378:1: rule__CodeBlock__Group__1 : rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 ;
    public final void rule__CodeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1382:1: ( rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2 )
            // InternalTypoDSL.g:1383:2: rule__CodeBlock__Group__1__Impl rule__CodeBlock__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CodeBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__1"


    // $ANTLR start "rule__CodeBlock__Group__1__Impl"
    // InternalTypoDSL.g:1390:1: rule__CodeBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__CodeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1394:1: ( ( '{' ) )
            // InternalTypoDSL.g:1395:1: ( '{' )
            {
            // InternalTypoDSL.g:1395:1: ( '{' )
            // InternalTypoDSL.g:1396:2: '{'
            {
             before(grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__1__Impl"


    // $ANTLR start "rule__CodeBlock__Group__2"
    // InternalTypoDSL.g:1405:1: rule__CodeBlock__Group__2 : rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 ;
    public final void rule__CodeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1409:1: ( rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3 )
            // InternalTypoDSL.g:1410:2: rule__CodeBlock__Group__2__Impl rule__CodeBlock__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CodeBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__2"


    // $ANTLR start "rule__CodeBlock__Group__2__Impl"
    // InternalTypoDSL.g:1417:1: rule__CodeBlock__Group__2__Impl : ( 'language:' ) ;
    public final void rule__CodeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1421:1: ( ( 'language:' ) )
            // InternalTypoDSL.g:1422:1: ( 'language:' )
            {
            // InternalTypoDSL.g:1422:1: ( 'language:' )
            // InternalTypoDSL.g:1423:2: 'language:'
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getLanguageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__2__Impl"


    // $ANTLR start "rule__CodeBlock__Group__3"
    // InternalTypoDSL.g:1432:1: rule__CodeBlock__Group__3 : rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4 ;
    public final void rule__CodeBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1436:1: ( rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4 )
            // InternalTypoDSL.g:1437:2: rule__CodeBlock__Group__3__Impl rule__CodeBlock__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__CodeBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__3"


    // $ANTLR start "rule__CodeBlock__Group__3__Impl"
    // InternalTypoDSL.g:1444:1: rule__CodeBlock__Group__3__Impl : ( ( rule__CodeBlock__LanguageAssignment_3 ) ) ;
    public final void rule__CodeBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1448:1: ( ( ( rule__CodeBlock__LanguageAssignment_3 ) ) )
            // InternalTypoDSL.g:1449:1: ( ( rule__CodeBlock__LanguageAssignment_3 ) )
            {
            // InternalTypoDSL.g:1449:1: ( ( rule__CodeBlock__LanguageAssignment_3 ) )
            // InternalTypoDSL.g:1450:2: ( rule__CodeBlock__LanguageAssignment_3 )
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageAssignment_3()); 
            // InternalTypoDSL.g:1451:2: ( rule__CodeBlock__LanguageAssignment_3 )
            // InternalTypoDSL.g:1451:3: rule__CodeBlock__LanguageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CodeBlock__LanguageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getLanguageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__3__Impl"


    // $ANTLR start "rule__CodeBlock__Group__4"
    // InternalTypoDSL.g:1459:1: rule__CodeBlock__Group__4 : rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5 ;
    public final void rule__CodeBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1463:1: ( rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5 )
            // InternalTypoDSL.g:1464:2: rule__CodeBlock__Group__4__Impl rule__CodeBlock__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__CodeBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__4"


    // $ANTLR start "rule__CodeBlock__Group__4__Impl"
    // InternalTypoDSL.g:1471:1: rule__CodeBlock__Group__4__Impl : ( 'text:' ) ;
    public final void rule__CodeBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1475:1: ( ( 'text:' ) )
            // InternalTypoDSL.g:1476:1: ( 'text:' )
            {
            // InternalTypoDSL.g:1476:1: ( 'text:' )
            // InternalTypoDSL.g:1477:2: 'text:'
            {
             before(grammarAccess.getCodeBlockAccess().getTextKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getTextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__4__Impl"


    // $ANTLR start "rule__CodeBlock__Group__5"
    // InternalTypoDSL.g:1486:1: rule__CodeBlock__Group__5 : rule__CodeBlock__Group__5__Impl rule__CodeBlock__Group__6 ;
    public final void rule__CodeBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1490:1: ( rule__CodeBlock__Group__5__Impl rule__CodeBlock__Group__6 )
            // InternalTypoDSL.g:1491:2: rule__CodeBlock__Group__5__Impl rule__CodeBlock__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__CodeBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__5"


    // $ANTLR start "rule__CodeBlock__Group__5__Impl"
    // InternalTypoDSL.g:1498:1: rule__CodeBlock__Group__5__Impl : ( ( rule__CodeBlock__TextAssignment_5 ) ) ;
    public final void rule__CodeBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1502:1: ( ( ( rule__CodeBlock__TextAssignment_5 ) ) )
            // InternalTypoDSL.g:1503:1: ( ( rule__CodeBlock__TextAssignment_5 ) )
            {
            // InternalTypoDSL.g:1503:1: ( ( rule__CodeBlock__TextAssignment_5 ) )
            // InternalTypoDSL.g:1504:2: ( rule__CodeBlock__TextAssignment_5 )
            {
             before(grammarAccess.getCodeBlockAccess().getTextAssignment_5()); 
            // InternalTypoDSL.g:1505:2: ( rule__CodeBlock__TextAssignment_5 )
            // InternalTypoDSL.g:1505:3: rule__CodeBlock__TextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CodeBlock__TextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCodeBlockAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__5__Impl"


    // $ANTLR start "rule__CodeBlock__Group__6"
    // InternalTypoDSL.g:1513:1: rule__CodeBlock__Group__6 : rule__CodeBlock__Group__6__Impl ;
    public final void rule__CodeBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1517:1: ( rule__CodeBlock__Group__6__Impl )
            // InternalTypoDSL.g:1518:2: rule__CodeBlock__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeBlock__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__6"


    // $ANTLR start "rule__CodeBlock__Group__6__Impl"
    // InternalTypoDSL.g:1524:1: rule__CodeBlock__Group__6__Impl : ( '}' ) ;
    public final void rule__CodeBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1528:1: ( ( '}' ) )
            // InternalTypoDSL.g:1529:1: ( '}' )
            {
            // InternalTypoDSL.g:1529:1: ( '}' )
            // InternalTypoDSL.g:1530:2: '}'
            {
             before(grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__Group__6__Impl"


    // $ANTLR start "rule__Itemize__Group__0"
    // InternalTypoDSL.g:1540:1: rule__Itemize__Group__0 : rule__Itemize__Group__0__Impl rule__Itemize__Group__1 ;
    public final void rule__Itemize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1544:1: ( rule__Itemize__Group__0__Impl rule__Itemize__Group__1 )
            // InternalTypoDSL.g:1545:2: rule__Itemize__Group__0__Impl rule__Itemize__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Itemize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itemize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itemize__Group__0"


    // $ANTLR start "rule__Itemize__Group__0__Impl"
    // InternalTypoDSL.g:1552:1: rule__Itemize__Group__0__Impl : ( '+list' ) ;
    public final void rule__Itemize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1556:1: ( ( '+list' ) )
            // InternalTypoDSL.g:1557:1: ( '+list' )
            {
            // InternalTypoDSL.g:1557:1: ( '+list' )
            // InternalTypoDSL.g:1558:2: '+list'
            {
             before(grammarAccess.getItemizeAccess().getListKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemizeAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itemize__Group__0__Impl"


    // $ANTLR start "rule__Itemize__Group__1"
    // InternalTypoDSL.g:1567:1: rule__Itemize__Group__1 : rule__Itemize__Group__1__Impl ;
    public final void rule__Itemize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1571:1: ( rule__Itemize__Group__1__Impl )
            // InternalTypoDSL.g:1572:2: rule__Itemize__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Itemize__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itemize__Group__1"


    // $ANTLR start "rule__Itemize__Group__1__Impl"
    // InternalTypoDSL.g:1578:1: rule__Itemize__Group__1__Impl : ( ( ( rule__Itemize__ItemsAssignment_1 ) ) ( ( rule__Itemize__ItemsAssignment_1 )* ) ) ;
    public final void rule__Itemize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1582:1: ( ( ( ( rule__Itemize__ItemsAssignment_1 ) ) ( ( rule__Itemize__ItemsAssignment_1 )* ) ) )
            // InternalTypoDSL.g:1583:1: ( ( ( rule__Itemize__ItemsAssignment_1 ) ) ( ( rule__Itemize__ItemsAssignment_1 )* ) )
            {
            // InternalTypoDSL.g:1583:1: ( ( ( rule__Itemize__ItemsAssignment_1 ) ) ( ( rule__Itemize__ItemsAssignment_1 )* ) )
            // InternalTypoDSL.g:1584:2: ( ( rule__Itemize__ItemsAssignment_1 ) ) ( ( rule__Itemize__ItemsAssignment_1 )* )
            {
            // InternalTypoDSL.g:1584:2: ( ( rule__Itemize__ItemsAssignment_1 ) )
            // InternalTypoDSL.g:1585:3: ( rule__Itemize__ItemsAssignment_1 )
            {
             before(grammarAccess.getItemizeAccess().getItemsAssignment_1()); 
            // InternalTypoDSL.g:1586:3: ( rule__Itemize__ItemsAssignment_1 )
            // InternalTypoDSL.g:1586:4: rule__Itemize__ItemsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__Itemize__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemizeAccess().getItemsAssignment_1()); 

            }

            // InternalTypoDSL.g:1589:2: ( ( rule__Itemize__ItemsAssignment_1 )* )
            // InternalTypoDSL.g:1590:3: ( rule__Itemize__ItemsAssignment_1 )*
            {
             before(grammarAccess.getItemizeAccess().getItemsAssignment_1()); 
            // InternalTypoDSL.g:1591:3: ( rule__Itemize__ItemsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTypoDSL.g:1591:4: rule__Itemize__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Itemize__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getItemizeAccess().getItemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itemize__Group__1__Impl"


    // $ANTLR start "rule__ListItem__Group__0"
    // InternalTypoDSL.g:1601:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1605:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalTypoDSL.g:1606:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__0"


    // $ANTLR start "rule__ListItem__Group__0__Impl"
    // InternalTypoDSL.g:1613:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1617:1: ( ( '-' ) )
            // InternalTypoDSL.g:1618:1: ( '-' )
            {
            // InternalTypoDSL.g:1618:1: ( '-' )
            // InternalTypoDSL.g:1619:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__0__Impl"


    // $ANTLR start "rule__ListItem__Group__1"
    // InternalTypoDSL.g:1628:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1632:1: ( rule__ListItem__Group__1__Impl )
            // InternalTypoDSL.g:1633:2: rule__ListItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__1"


    // $ANTLR start "rule__ListItem__Group__1__Impl"
    // InternalTypoDSL.g:1639:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__InlineAssignment_1 ) ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1643:1: ( ( ( rule__ListItem__InlineAssignment_1 ) ) )
            // InternalTypoDSL.g:1644:1: ( ( rule__ListItem__InlineAssignment_1 ) )
            {
            // InternalTypoDSL.g:1644:1: ( ( rule__ListItem__InlineAssignment_1 ) )
            // InternalTypoDSL.g:1645:2: ( rule__ListItem__InlineAssignment_1 )
            {
             before(grammarAccess.getListItemAccess().getInlineAssignment_1()); 
            // InternalTypoDSL.g:1646:2: ( rule__ListItem__InlineAssignment_1 )
            // InternalTypoDSL.g:1646:3: rule__ListItem__InlineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__InlineAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getInlineAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__1__Impl"


    // $ANTLR start "rule__Normal__Group__0"
    // InternalTypoDSL.g:1655:1: rule__Normal__Group__0 : rule__Normal__Group__0__Impl rule__Normal__Group__1 ;
    public final void rule__Normal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1659:1: ( rule__Normal__Group__0__Impl rule__Normal__Group__1 )
            // InternalTypoDSL.g:1660:2: rule__Normal__Group__0__Impl rule__Normal__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Normal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Normal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal__Group__0"


    // $ANTLR start "rule__Normal__Group__0__Impl"
    // InternalTypoDSL.g:1667:1: rule__Normal__Group__0__Impl : ( '*' ) ;
    public final void rule__Normal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1671:1: ( ( '*' ) )
            // InternalTypoDSL.g:1672:1: ( '*' )
            {
            // InternalTypoDSL.g:1672:1: ( '*' )
            // InternalTypoDSL.g:1673:2: '*'
            {
             before(grammarAccess.getNormalAccess().getAsteriskKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNormalAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal__Group__0__Impl"


    // $ANTLR start "rule__Normal__Group__1"
    // InternalTypoDSL.g:1682:1: rule__Normal__Group__1 : rule__Normal__Group__1__Impl ;
    public final void rule__Normal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1686:1: ( rule__Normal__Group__1__Impl )
            // InternalTypoDSL.g:1687:2: rule__Normal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Normal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal__Group__1"


    // $ANTLR start "rule__Normal__Group__1__Impl"
    // InternalTypoDSL.g:1693:1: rule__Normal__Group__1__Impl : ( ( rule__Normal__TextAssignment_1 ) ) ;
    public final void rule__Normal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1697:1: ( ( ( rule__Normal__TextAssignment_1 ) ) )
            // InternalTypoDSL.g:1698:1: ( ( rule__Normal__TextAssignment_1 ) )
            {
            // InternalTypoDSL.g:1698:1: ( ( rule__Normal__TextAssignment_1 ) )
            // InternalTypoDSL.g:1699:2: ( rule__Normal__TextAssignment_1 )
            {
             before(grammarAccess.getNormalAccess().getTextAssignment_1()); 
            // InternalTypoDSL.g:1700:2: ( rule__Normal__TextAssignment_1 )
            // InternalTypoDSL.g:1700:3: rule__Normal__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Normal__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNormalAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal__Group__1__Impl"


    // $ANTLR start "rule__Bold__Group__0"
    // InternalTypoDSL.g:1709:1: rule__Bold__Group__0 : rule__Bold__Group__0__Impl rule__Bold__Group__1 ;
    public final void rule__Bold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1713:1: ( rule__Bold__Group__0__Impl rule__Bold__Group__1 )
            // InternalTypoDSL.g:1714:2: rule__Bold__Group__0__Impl rule__Bold__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__0"


    // $ANTLR start "rule__Bold__Group__0__Impl"
    // InternalTypoDSL.g:1721:1: rule__Bold__Group__0__Impl : ( '~bold' ) ;
    public final void rule__Bold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1725:1: ( ( '~bold' ) )
            // InternalTypoDSL.g:1726:1: ( '~bold' )
            {
            // InternalTypoDSL.g:1726:1: ( '~bold' )
            // InternalTypoDSL.g:1727:2: '~bold'
            {
             before(grammarAccess.getBoldAccess().getBoldKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBoldAccess().getBoldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__0__Impl"


    // $ANTLR start "rule__Bold__Group__1"
    // InternalTypoDSL.g:1736:1: rule__Bold__Group__1 : rule__Bold__Group__1__Impl ;
    public final void rule__Bold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1740:1: ( rule__Bold__Group__1__Impl )
            // InternalTypoDSL.g:1741:2: rule__Bold__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bold__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__1"


    // $ANTLR start "rule__Bold__Group__1__Impl"
    // InternalTypoDSL.g:1747:1: rule__Bold__Group__1__Impl : ( ( rule__Bold__TextAssignment_1 ) ) ;
    public final void rule__Bold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1751:1: ( ( ( rule__Bold__TextAssignment_1 ) ) )
            // InternalTypoDSL.g:1752:1: ( ( rule__Bold__TextAssignment_1 ) )
            {
            // InternalTypoDSL.g:1752:1: ( ( rule__Bold__TextAssignment_1 ) )
            // InternalTypoDSL.g:1753:2: ( rule__Bold__TextAssignment_1 )
            {
             before(grammarAccess.getBoldAccess().getTextAssignment_1()); 
            // InternalTypoDSL.g:1754:2: ( rule__Bold__TextAssignment_1 )
            // InternalTypoDSL.g:1754:3: rule__Bold__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bold__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__1__Impl"


    // $ANTLR start "rule__Italic__Group__0"
    // InternalTypoDSL.g:1763:1: rule__Italic__Group__0 : rule__Italic__Group__0__Impl rule__Italic__Group__1 ;
    public final void rule__Italic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1767:1: ( rule__Italic__Group__0__Impl rule__Italic__Group__1 )
            // InternalTypoDSL.g:1768:2: rule__Italic__Group__0__Impl rule__Italic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Italic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Italic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__0"


    // $ANTLR start "rule__Italic__Group__0__Impl"
    // InternalTypoDSL.g:1775:1: rule__Italic__Group__0__Impl : ( '~italic' ) ;
    public final void rule__Italic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1779:1: ( ( '~italic' ) )
            // InternalTypoDSL.g:1780:1: ( '~italic' )
            {
            // InternalTypoDSL.g:1780:1: ( '~italic' )
            // InternalTypoDSL.g:1781:2: '~italic'
            {
             before(grammarAccess.getItalicAccess().getItalicKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getItalicAccess().getItalicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__0__Impl"


    // $ANTLR start "rule__Italic__Group__1"
    // InternalTypoDSL.g:1790:1: rule__Italic__Group__1 : rule__Italic__Group__1__Impl ;
    public final void rule__Italic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1794:1: ( rule__Italic__Group__1__Impl )
            // InternalTypoDSL.g:1795:2: rule__Italic__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Italic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__1"


    // $ANTLR start "rule__Italic__Group__1__Impl"
    // InternalTypoDSL.g:1801:1: rule__Italic__Group__1__Impl : ( ( rule__Italic__TextAssignment_1 ) ) ;
    public final void rule__Italic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1805:1: ( ( ( rule__Italic__TextAssignment_1 ) ) )
            // InternalTypoDSL.g:1806:1: ( ( rule__Italic__TextAssignment_1 ) )
            {
            // InternalTypoDSL.g:1806:1: ( ( rule__Italic__TextAssignment_1 ) )
            // InternalTypoDSL.g:1807:2: ( rule__Italic__TextAssignment_1 )
            {
             before(grammarAccess.getItalicAccess().getTextAssignment_1()); 
            // InternalTypoDSL.g:1808:2: ( rule__Italic__TextAssignment_1 )
            // InternalTypoDSL.g:1808:3: rule__Italic__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Italic__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalTypoDSL.g:1817:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1821:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalTypoDSL.g:1822:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalTypoDSL.g:1829:1: rule__Link__Group__0__Impl : ( '~link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1833:1: ( ( '~link' ) )
            // InternalTypoDSL.g:1834:1: ( '~link' )
            {
            // InternalTypoDSL.g:1834:1: ( '~link' )
            // InternalTypoDSL.g:1835:2: '~link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalTypoDSL.g:1844:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1848:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalTypoDSL.g:1849:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalTypoDSL.g:1856:1: rule__Link__Group__1__Impl : ( '{' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1860:1: ( ( '{' ) )
            // InternalTypoDSL.g:1861:1: ( '{' )
            {
            // InternalTypoDSL.g:1861:1: ( '{' )
            // InternalTypoDSL.g:1862:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalTypoDSL.g:1871:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1875:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalTypoDSL.g:1876:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalTypoDSL.g:1883:1: rule__Link__Group__2__Impl : ( 'url:' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1887:1: ( ( 'url:' ) )
            // InternalTypoDSL.g:1888:1: ( 'url:' )
            {
            // InternalTypoDSL.g:1888:1: ( 'url:' )
            // InternalTypoDSL.g:1889:2: 'url:'
            {
             before(grammarAccess.getLinkAccess().getUrlKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalTypoDSL.g:1898:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1902:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalTypoDSL.g:1903:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalTypoDSL.g:1910:1: rule__Link__Group__3__Impl : ( ( rule__Link__UrlAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1914:1: ( ( ( rule__Link__UrlAssignment_3 ) ) )
            // InternalTypoDSL.g:1915:1: ( ( rule__Link__UrlAssignment_3 ) )
            {
            // InternalTypoDSL.g:1915:1: ( ( rule__Link__UrlAssignment_3 ) )
            // InternalTypoDSL.g:1916:2: ( rule__Link__UrlAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_3()); 
            // InternalTypoDSL.g:1917:2: ( rule__Link__UrlAssignment_3 )
            // InternalTypoDSL.g:1917:3: rule__Link__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalTypoDSL.g:1925:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1929:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalTypoDSL.g:1930:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalTypoDSL.g:1937:1: rule__Link__Group__4__Impl : ( 'text:' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1941:1: ( ( 'text:' ) )
            // InternalTypoDSL.g:1942:1: ( 'text:' )
            {
            // InternalTypoDSL.g:1942:1: ( 'text:' )
            // InternalTypoDSL.g:1943:2: 'text:'
            {
             before(grammarAccess.getLinkAccess().getTextKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getTextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalTypoDSL.g:1952:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1956:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalTypoDSL.g:1957:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalTypoDSL.g:1964:1: rule__Link__Group__5__Impl : ( ( rule__Link__TextAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1968:1: ( ( ( rule__Link__TextAssignment_5 ) ) )
            // InternalTypoDSL.g:1969:1: ( ( rule__Link__TextAssignment_5 ) )
            {
            // InternalTypoDSL.g:1969:1: ( ( rule__Link__TextAssignment_5 ) )
            // InternalTypoDSL.g:1970:2: ( rule__Link__TextAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getTextAssignment_5()); 
            // InternalTypoDSL.g:1971:2: ( rule__Link__TextAssignment_5 )
            // InternalTypoDSL.g:1971:3: rule__Link__TextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__TextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalTypoDSL.g:1979:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1983:1: ( rule__Link__Group__6__Impl )
            // InternalTypoDSL.g:1984:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalTypoDSL.g:1990:1: rule__Link__Group__6__Impl : ( '}' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:1994:1: ( ( '}' ) )
            // InternalTypoDSL.g:1995:1: ( '}' )
            {
            // InternalTypoDSL.g:1995:1: ( '}' )
            // InternalTypoDSL.g:1996:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Document__TitleAssignment_3"
    // InternalTypoDSL.g:2006:1: rule__Document__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Document__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2010:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2011:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2011:2: ( RULE_STRING )
            // InternalTypoDSL.g:2012:3: RULE_STRING
            {
             before(grammarAccess.getDocumentAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getTitleSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__TitleAssignment_3"


    // $ANTLR start "rule__Document__AuthorAssignment_5"
    // InternalTypoDSL.g:2021:1: rule__Document__AuthorAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Document__AuthorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2025:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2026:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2026:2: ( RULE_STRING )
            // InternalTypoDSL.g:2027:3: RULE_STRING
            {
             before(grammarAccess.getDocumentAccess().getAuthorSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getAuthorSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__AuthorAssignment_5"


    // $ANTLR start "rule__Document__DatetimeAssignment_7"
    // InternalTypoDSL.g:2036:1: rule__Document__DatetimeAssignment_7 : ( RULE_DATE ) ;
    public final void rule__Document__DatetimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2040:1: ( ( RULE_DATE ) )
            // InternalTypoDSL.g:2041:2: ( RULE_DATE )
            {
            // InternalTypoDSL.g:2041:2: ( RULE_DATE )
            // InternalTypoDSL.g:2042:3: RULE_DATE
            {
             before(grammarAccess.getDocumentAccess().getDatetimeDATETerminalRuleCall_7_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getDatetimeDATETerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__DatetimeAssignment_7"


    // $ANTLR start "rule__Document__TldrAssignment_9"
    // InternalTypoDSL.g:2051:1: rule__Document__TldrAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Document__TldrAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2055:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2056:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2056:2: ( RULE_STRING )
            // InternalTypoDSL.g:2057:3: RULE_STRING
            {
             before(grammarAccess.getDocumentAccess().getTldrSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getTldrSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__TldrAssignment_9"


    // $ANTLR start "rule__Document__BlocksAssignment_10"
    // InternalTypoDSL.g:2066:1: rule__Document__BlocksAssignment_10 : ( ruleBlocks ) ;
    public final void rule__Document__BlocksAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2070:1: ( ( ruleBlocks ) )
            // InternalTypoDSL.g:2071:2: ( ruleBlocks )
            {
            // InternalTypoDSL.g:2071:2: ( ruleBlocks )
            // InternalTypoDSL.g:2072:3: ruleBlocks
            {
             before(grammarAccess.getDocumentAccess().getBlocksBlocksParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBlocks();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getBlocksBlocksParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__BlocksAssignment_10"


    // $ANTLR start "rule__Section__TitleAssignment_1"
    // InternalTypoDSL.g:2081:1: rule__Section__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Section__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2085:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2086:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2086:2: ( RULE_STRING )
            // InternalTypoDSL.g:2087:3: RULE_STRING
            {
             before(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TitleAssignment_1"


    // $ANTLR start "rule__Section__BlocksAssignment_2"
    // InternalTypoDSL.g:2096:1: rule__Section__BlocksAssignment_2 : ( ruleBlocks ) ;
    public final void rule__Section__BlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2100:1: ( ( ruleBlocks ) )
            // InternalTypoDSL.g:2101:2: ( ruleBlocks )
            {
            // InternalTypoDSL.g:2101:2: ( ruleBlocks )
            // InternalTypoDSL.g:2102:3: ruleBlocks
            {
             before(grammarAccess.getSectionAccess().getBlocksBlocksParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBlocks();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getBlocksBlocksParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__BlocksAssignment_2"


    // $ANTLR start "rule__Subsection__TitleAssignment_1"
    // InternalTypoDSL.g:2111:1: rule__Subsection__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Subsection__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2115:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2116:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2116:2: ( RULE_STRING )
            // InternalTypoDSL.g:2117:3: RULE_STRING
            {
             before(grammarAccess.getSubsectionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubsectionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__TitleAssignment_1"


    // $ANTLR start "rule__Subsection__BlocksAssignment_2"
    // InternalTypoDSL.g:2126:1: rule__Subsection__BlocksAssignment_2 : ( ruleBlocks ) ;
    public final void rule__Subsection__BlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2130:1: ( ( ruleBlocks ) )
            // InternalTypoDSL.g:2131:2: ( ruleBlocks )
            {
            // InternalTypoDSL.g:2131:2: ( ruleBlocks )
            // InternalTypoDSL.g:2132:3: ruleBlocks
            {
             before(grammarAccess.getSubsectionAccess().getBlocksBlocksParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBlocks();

            state._fsp--;

             after(grammarAccess.getSubsectionAccess().getBlocksBlocksParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsection__BlocksAssignment_2"


    // $ANTLR start "rule__Paragraph__InlineitemsAssignment_1"
    // InternalTypoDSL.g:2141:1: rule__Paragraph__InlineitemsAssignment_1 : ( ruleInlineItem ) ;
    public final void rule__Paragraph__InlineitemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2145:1: ( ( ruleInlineItem ) )
            // InternalTypoDSL.g:2146:2: ( ruleInlineItem )
            {
            // InternalTypoDSL.g:2146:2: ( ruleInlineItem )
            // InternalTypoDSL.g:2147:3: ruleInlineItem
            {
             before(grammarAccess.getParagraphAccess().getInlineitemsInlineItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInlineItem();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getInlineitemsInlineItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__InlineitemsAssignment_1"


    // $ANTLR start "rule__Image__UrlAssignment_3"
    // InternalTypoDSL.g:2156:1: rule__Image__UrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2160:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2161:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2161:2: ( RULE_STRING )
            // InternalTypoDSL.g:2162:3: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__UrlAssignment_3"


    // $ANTLR start "rule__Image__WidthAssignment_5"
    // InternalTypoDSL.g:2171:1: rule__Image__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Image__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2175:1: ( ( RULE_INT ) )
            // InternalTypoDSL.g:2176:2: ( RULE_INT )
            {
            // InternalTypoDSL.g:2176:2: ( RULE_INT )
            // InternalTypoDSL.g:2177:3: RULE_INT
            {
             before(grammarAccess.getImageAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__WidthAssignment_5"


    // $ANTLR start "rule__Image__HeightAssignment_7"
    // InternalTypoDSL.g:2186:1: rule__Image__HeightAssignment_7 : ( RULE_INT ) ;
    public final void rule__Image__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2190:1: ( ( RULE_INT ) )
            // InternalTypoDSL.g:2191:2: ( RULE_INT )
            {
            // InternalTypoDSL.g:2191:2: ( RULE_INT )
            // InternalTypoDSL.g:2192:3: RULE_INT
            {
             before(grammarAccess.getImageAccess().getHeightINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getHeightINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__HeightAssignment_7"


    // $ANTLR start "rule__Image__CaptionAssignment_8_1"
    // InternalTypoDSL.g:2201:1: rule__Image__CaptionAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Image__CaptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2205:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2206:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2206:2: ( RULE_STRING )
            // InternalTypoDSL.g:2207:3: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getCaptionSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getCaptionSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__CaptionAssignment_8_1"


    // $ANTLR start "rule__CodeBlock__LanguageAssignment_3"
    // InternalTypoDSL.g:2216:1: rule__CodeBlock__LanguageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CodeBlock__LanguageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2220:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2221:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2221:2: ( RULE_STRING )
            // InternalTypoDSL.g:2222:3: RULE_STRING
            {
             before(grammarAccess.getCodeBlockAccess().getLanguageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getLanguageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__LanguageAssignment_3"


    // $ANTLR start "rule__CodeBlock__TextAssignment_5"
    // InternalTypoDSL.g:2231:1: rule__CodeBlock__TextAssignment_5 : ( RULE_STRING ) ;
    public final void rule__CodeBlock__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2235:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2236:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2236:2: ( RULE_STRING )
            // InternalTypoDSL.g:2237:3: RULE_STRING
            {
             before(grammarAccess.getCodeBlockAccess().getTextSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCodeBlockAccess().getTextSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeBlock__TextAssignment_5"


    // $ANTLR start "rule__Itemize__ItemsAssignment_1"
    // InternalTypoDSL.g:2246:1: rule__Itemize__ItemsAssignment_1 : ( ruleListItem ) ;
    public final void rule__Itemize__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2250:1: ( ( ruleListItem ) )
            // InternalTypoDSL.g:2251:2: ( ruleListItem )
            {
            // InternalTypoDSL.g:2251:2: ( ruleListItem )
            // InternalTypoDSL.g:2252:3: ruleListItem
            {
             before(grammarAccess.getItemizeAccess().getItemsListItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getItemizeAccess().getItemsListItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itemize__ItemsAssignment_1"


    // $ANTLR start "rule__ListItem__InlineAssignment_1"
    // InternalTypoDSL.g:2261:1: rule__ListItem__InlineAssignment_1 : ( ruleInlineItem ) ;
    public final void rule__ListItem__InlineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2265:1: ( ( ruleInlineItem ) )
            // InternalTypoDSL.g:2266:2: ( ruleInlineItem )
            {
            // InternalTypoDSL.g:2266:2: ( ruleInlineItem )
            // InternalTypoDSL.g:2267:3: ruleInlineItem
            {
             before(grammarAccess.getListItemAccess().getInlineInlineItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInlineItem();

            state._fsp--;

             after(grammarAccess.getListItemAccess().getInlineInlineItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__InlineAssignment_1"


    // $ANTLR start "rule__Normal__TextAssignment_1"
    // InternalTypoDSL.g:2276:1: rule__Normal__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Normal__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2280:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2281:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2281:2: ( RULE_STRING )
            // InternalTypoDSL.g:2282:3: RULE_STRING
            {
             before(grammarAccess.getNormalAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNormalAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal__TextAssignment_1"


    // $ANTLR start "rule__Bold__TextAssignment_1"
    // InternalTypoDSL.g:2291:1: rule__Bold__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Bold__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2295:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2296:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2296:2: ( RULE_STRING )
            // InternalTypoDSL.g:2297:3: RULE_STRING
            {
             before(grammarAccess.getBoldAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBoldAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__TextAssignment_1"


    // $ANTLR start "rule__Italic__TextAssignment_1"
    // InternalTypoDSL.g:2306:1: rule__Italic__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Italic__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2310:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2311:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2311:2: ( RULE_STRING )
            // InternalTypoDSL.g:2312:3: RULE_STRING
            {
             before(grammarAccess.getItalicAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getItalicAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__TextAssignment_1"


    // $ANTLR start "rule__Link__UrlAssignment_3"
    // InternalTypoDSL.g:2321:1: rule__Link__UrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Link__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2325:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2326:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2326:2: ( RULE_STRING )
            // InternalTypoDSL.g:2327:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__UrlAssignment_3"


    // $ANTLR start "rule__Link__TextAssignment_5"
    // InternalTypoDSL.g:2336:1: rule__Link__TextAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Link__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTypoDSL.g:2340:1: ( ( RULE_STRING ) )
            // InternalTypoDSL.g:2341:2: ( RULE_STRING )
            {
            // InternalTypoDSL.g:2341:2: ( RULE_STRING )
            // InternalTypoDSL.g:2342:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getTextSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getTextSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__TextAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000487C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000048780002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000048780000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000002L});

}
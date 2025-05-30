/**
 * generated by Xtext 2.30.0
 */
package adrf.xtext.typoDSL.util;

import adrf.xtext.typoDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see adrf.xtext.typoDSL.TypoDSLPackage
 * @generated
 */
public class TypoDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TypoDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypoDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TypoDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypoDSLSwitch<Adapter> modelSwitch =
    new TypoDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseBlocks(Blocks object)
      {
        return createBlocksAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseSubsection(Subsection object)
      {
        return createSubsectionAdapter();
      }
      @Override
      public Adapter caseParagraph(Paragraph object)
      {
        return createParagraphAdapter();
      }
      @Override
      public Adapter caseImage(Image object)
      {
        return createImageAdapter();
      }
      @Override
      public Adapter caseCodeBlock(CodeBlock object)
      {
        return createCodeBlockAdapter();
      }
      @Override
      public Adapter caseItemize(Itemize object)
      {
        return createItemizeAdapter();
      }
      @Override
      public Adapter caseListItem(ListItem object)
      {
        return createListItemAdapter();
      }
      @Override
      public Adapter caseInlineItem(InlineItem object)
      {
        return createInlineItemAdapter();
      }
      @Override
      public Adapter caseNormal(Normal object)
      {
        return createNormalAdapter();
      }
      @Override
      public Adapter caseBold(Bold object)
      {
        return createBoldAdapter();
      }
      @Override
      public Adapter caseItalic(Italic object)
      {
        return createItalicAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Blocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Blocks
   * @generated
   */
  public Adapter createBlocksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Subsection <em>Subsection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Subsection
   * @generated
   */
  public Adapter createSubsectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Paragraph
   * @generated
   */
  public Adapter createParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Image
   * @generated
   */
  public Adapter createImageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.CodeBlock <em>Code Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.CodeBlock
   * @generated
   */
  public Adapter createCodeBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Itemize <em>Itemize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Itemize
   * @generated
   */
  public Adapter createItemizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.ListItem
   * @generated
   */
  public Adapter createListItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.InlineItem <em>Inline Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.InlineItem
   * @generated
   */
  public Adapter createInlineItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Normal <em>Normal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Normal
   * @generated
   */
  public Adapter createNormalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Bold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Bold
   * @generated
   */
  public Adapter createBoldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Italic <em>Italic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Italic
   * @generated
   */
  public Adapter createItalicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link adrf.xtext.typoDSL.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see adrf.xtext.typoDSL.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TypoDSLAdapterFactory

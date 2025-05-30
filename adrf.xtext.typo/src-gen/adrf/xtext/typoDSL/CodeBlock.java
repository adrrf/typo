/**
 * generated by Xtext 2.30.0
 */
package adrf.xtext.typoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adrf.xtext.typoDSL.CodeBlock#getLanguage <em>Language</em>}</li>
 *   <li>{@link adrf.xtext.typoDSL.CodeBlock#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see adrf.xtext.typoDSL.TypoDSLPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends Blocks
{
  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see adrf.xtext.typoDSL.TypoDSLPackage#getCodeBlock_Language()
   * @model
   * @generated
   */
  String getLanguage();

  /**
   * Sets the value of the '{@link adrf.xtext.typoDSL.CodeBlock#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see adrf.xtext.typoDSL.TypoDSLPackage#getCodeBlock_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link adrf.xtext.typoDSL.CodeBlock#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // CodeBlock

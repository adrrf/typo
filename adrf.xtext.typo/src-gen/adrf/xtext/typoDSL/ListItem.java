/**
 * generated by Xtext 2.30.0
 */
package adrf.xtext.typoDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adrf.xtext.typoDSL.ListItem#getInline <em>Inline</em>}</li>
 * </ul>
 *
 * @see adrf.xtext.typoDSL.TypoDSLPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Inline</b></em>' containment reference list.
   * The list contents are of type {@link adrf.xtext.typoDSL.InlineItem}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline</em>' containment reference list.
   * @see adrf.xtext.typoDSL.TypoDSLPackage#getListItem_Inline()
   * @model containment="true"
   * @generated
   */
  EList<InlineItem> getInline();

} // ListItem

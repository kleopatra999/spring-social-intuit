//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Financial Transaction information that pertains to the entire VendorCredit.
 * 
 * <p>Java class for VendorCreditHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorCreditHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderPurchase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PayingPartyReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}APAccountReferenceGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorCreditHeader", propOrder = {
    "payerId",
    "payerName",
    "apAccountId",
    "apAccountName"
})
public class VendorCreditHeader
    extends HeaderPurchase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PayerId")
    protected IdType payerId;
    @XmlElement(name = "PayerName")
    protected String payerName;
    @XmlElement(name = "APAccountId")
    protected IdType apAccountId;
    @XmlElement(name = "APAccountName")
    protected String apAccountName;

    /**
     * Gets the value of the payerId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getPayerId() {
        return payerId;
    }

    /**
     * Sets the value of the payerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setPayerId(IdType value) {
        this.payerId = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerName(String value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the apAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getAPAccountId() {
        return apAccountId;
    }

    /**
     * Sets the value of the apAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setAPAccountId(IdType value) {
        this.apAccountId = value;
    }

    /**
     * Gets the value of the apAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPAccountName() {
        return apAccountName;
    }

    /**
     * Sets the value of the apAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPAccountName(String value) {
        this.apAccountName = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VendorCreditHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final VendorCreditHeader that = ((VendorCreditHeader) object);
        {
            IdType lhsPayerId;
            lhsPayerId = this.getPayerId();
            IdType rhsPayerId;
            rhsPayerId = that.getPayerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payerId", lhsPayerId), LocatorUtils.property(thatLocator, "payerId", rhsPayerId), lhsPayerId, rhsPayerId)) {
                return false;
            }
        }
        {
            String lhsPayerName;
            lhsPayerName = this.getPayerName();
            String rhsPayerName;
            rhsPayerName = that.getPayerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payerName", lhsPayerName), LocatorUtils.property(thatLocator, "payerName", rhsPayerName), lhsPayerName, rhsPayerName)) {
                return false;
            }
        }
        {
            IdType lhsAPAccountId;
            lhsAPAccountId = this.getAPAccountId();
            IdType rhsAPAccountId;
            rhsAPAccountId = that.getAPAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apAccountId", lhsAPAccountId), LocatorUtils.property(thatLocator, "apAccountId", rhsAPAccountId), lhsAPAccountId, rhsAPAccountId)) {
                return false;
            }
        }
        {
            String lhsAPAccountName;
            lhsAPAccountName = this.getAPAccountName();
            String rhsAPAccountName;
            rhsAPAccountName = that.getAPAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apAccountName", lhsAPAccountName), LocatorUtils.property(thatLocator, "apAccountName", rhsAPAccountName), lhsAPAccountName, rhsAPAccountName)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            IdType thePayerId;
            thePayerId = this.getPayerId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payerId", thePayerId), currentHashCode, thePayerId);
        }
        {
            String thePayerName;
            thePayerName = this.getPayerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payerName", thePayerName), currentHashCode, thePayerName);
        }
        {
            IdType theAPAccountId;
            theAPAccountId = this.getAPAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apAccountId", theAPAccountId), currentHashCode, theAPAccountId);
        }
        {
            String theAPAccountName;
            theAPAccountName = this.getAPAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apAccountName", theAPAccountName), currentHashCode, theAPAccountName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
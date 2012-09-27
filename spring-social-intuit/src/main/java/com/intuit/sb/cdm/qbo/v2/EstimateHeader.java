//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Information that pertains to the entire Estimate
 * 
 * <p>Java class for EstimateHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimateHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderSales">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTermReferenceGroup" minOccurs="0"/>
 *         &lt;element name="BillAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="ShipAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="BillEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}QboDiscountGroup" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AcceptedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateHeader", propOrder = {
    "salesTermId",
    "salesTermName",
    "billAddr",
    "shipAddr",
    "billEmail",
    "discountAmt",
    "discountRate",
    "discountAccountId",
    "discountAccountName",
    "discountTaxable",
    "expirationDate",
    "acceptedBy",
    "acceptedDate"
})
public class EstimateHeader
    extends HeaderSales
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SalesTermId")
    protected IdType salesTermId;
    @XmlElement(name = "SalesTermName")
    protected String salesTermName;
    @XmlElement(name = "BillAddr")
    protected PhysicalAddress billAddr;
    @XmlElement(name = "ShipAddr")
    protected PhysicalAddress shipAddr;
    @XmlElement(name = "BillEmail")
    protected String billEmail;
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    @XmlElement(name = "DiscountRate")
    protected BigDecimal discountRate;
    @XmlElement(name = "DiscountAccountId")
    protected IdType discountAccountId;
    @XmlElement(name = "DiscountAccountName")
    protected String discountAccountName;
    @XmlElement(name = "DiscountTaxable")
    protected Boolean discountTaxable;
    @XmlElement(name = "ExpirationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar expirationDate;
    @XmlElement(name = "AcceptedBy")
    protected String acceptedBy;
    @XmlElement(name = "AcceptedDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar acceptedDate;

    /**
     * Gets the value of the salesTermId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesTermId() {
        return salesTermId;
    }

    /**
     * Sets the value of the salesTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesTermId(IdType value) {
        this.salesTermId = value;
    }

    /**
     * Gets the value of the salesTermName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTermName() {
        return salesTermName;
    }

    /**
     * Sets the value of the salesTermName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTermName(String value) {
        this.salesTermName = value;
    }

    /**
     * Gets the value of the billAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getBillAddr() {
        return billAddr;
    }

    /**
     * Sets the value of the billAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setBillAddr(PhysicalAddress value) {
        this.billAddr = value;
    }

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setShipAddr(PhysicalAddress value) {
        this.shipAddr = value;
    }

    /**
     * Gets the value of the billEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillEmail() {
        return billEmail;
    }

    /**
     * Sets the value of the billEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillEmail(String value) {
        this.billEmail = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRate(BigDecimal value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the discountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getDiscountAccountId() {
        return discountAccountId;
    }

    /**
     * Sets the value of the discountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setDiscountAccountId(IdType value) {
        this.discountAccountId = value;
    }

    /**
     * Gets the value of the discountAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAccountName() {
        return discountAccountName;
    }

    /**
     * Sets the value of the discountAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAccountName(String value) {
        this.discountAccountName = value;
    }

    /**
     * Gets the value of the discountTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountTaxable() {
        return discountTaxable;
    }

    /**
     * Sets the value of the discountTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountTaxable(Boolean value) {
        this.discountTaxable = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the acceptedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedBy() {
        return acceptedBy;
    }

    /**
     * Sets the value of the acceptedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedBy(String value) {
        this.acceptedBy = value;
    }

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedDate(Calendar value) {
        this.acceptedDate = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EstimateHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EstimateHeader that = ((EstimateHeader) object);
        {
            IdType lhsSalesTermId;
            lhsSalesTermId = this.getSalesTermId();
            IdType rhsSalesTermId;
            rhsSalesTermId = that.getSalesTermId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTermId", lhsSalesTermId), LocatorUtils.property(thatLocator, "salesTermId", rhsSalesTermId), lhsSalesTermId, rhsSalesTermId)) {
                return false;
            }
        }
        {
            String lhsSalesTermName;
            lhsSalesTermName = this.getSalesTermName();
            String rhsSalesTermName;
            rhsSalesTermName = that.getSalesTermName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTermName", lhsSalesTermName), LocatorUtils.property(thatLocator, "salesTermName", rhsSalesTermName), lhsSalesTermName, rhsSalesTermName)) {
                return false;
            }
        }
        {
            PhysicalAddress lhsBillAddr;
            lhsBillAddr = this.getBillAddr();
            PhysicalAddress rhsBillAddr;
            rhsBillAddr = that.getBillAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billAddr", lhsBillAddr), LocatorUtils.property(thatLocator, "billAddr", rhsBillAddr), lhsBillAddr, rhsBillAddr)) {
                return false;
            }
        }
        {
            PhysicalAddress lhsShipAddr;
            lhsShipAddr = this.getShipAddr();
            PhysicalAddress rhsShipAddr;
            rhsShipAddr = that.getShipAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipAddr", lhsShipAddr), LocatorUtils.property(thatLocator, "shipAddr", rhsShipAddr), lhsShipAddr, rhsShipAddr)) {
                return false;
            }
        }
        {
            String lhsBillEmail;
            lhsBillEmail = this.getBillEmail();
            String rhsBillEmail;
            rhsBillEmail = that.getBillEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billEmail", lhsBillEmail), LocatorUtils.property(thatLocator, "billEmail", rhsBillEmail), lhsBillEmail, rhsBillEmail)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountAmt;
            lhsDiscountAmt = this.getDiscountAmt();
            BigDecimal rhsDiscountAmt;
            rhsDiscountAmt = that.getDiscountAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAmt", lhsDiscountAmt), LocatorUtils.property(thatLocator, "discountAmt", rhsDiscountAmt), lhsDiscountAmt, rhsDiscountAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountRate;
            lhsDiscountRate = this.getDiscountRate();
            BigDecimal rhsDiscountRate;
            rhsDiscountRate = that.getDiscountRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountRate", lhsDiscountRate), LocatorUtils.property(thatLocator, "discountRate", rhsDiscountRate), lhsDiscountRate, rhsDiscountRate)) {
                return false;
            }
        }
        {
            IdType lhsDiscountAccountId;
            lhsDiscountAccountId = this.getDiscountAccountId();
            IdType rhsDiscountAccountId;
            rhsDiscountAccountId = that.getDiscountAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountId", lhsDiscountAccountId), LocatorUtils.property(thatLocator, "discountAccountId", rhsDiscountAccountId), lhsDiscountAccountId, rhsDiscountAccountId)) {
                return false;
            }
        }
        {
            String lhsDiscountAccountName;
            lhsDiscountAccountName = this.getDiscountAccountName();
            String rhsDiscountAccountName;
            rhsDiscountAccountName = that.getDiscountAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountName", lhsDiscountAccountName), LocatorUtils.property(thatLocator, "discountAccountName", rhsDiscountAccountName), lhsDiscountAccountName, rhsDiscountAccountName)) {
                return false;
            }
        }
        {
            Boolean lhsDiscountTaxable;
            lhsDiscountTaxable = this.isDiscountTaxable();
            Boolean rhsDiscountTaxable;
            rhsDiscountTaxable = that.isDiscountTaxable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountTaxable", lhsDiscountTaxable), LocatorUtils.property(thatLocator, "discountTaxable", rhsDiscountTaxable), lhsDiscountTaxable, rhsDiscountTaxable)) {
                return false;
            }
        }
        {
            Calendar lhsExpirationDate;
            lhsExpirationDate = this.getExpirationDate();
            Calendar rhsExpirationDate;
            rhsExpirationDate = that.getExpirationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expirationDate", lhsExpirationDate), LocatorUtils.property(thatLocator, "expirationDate", rhsExpirationDate), lhsExpirationDate, rhsExpirationDate)) {
                return false;
            }
        }
        {
            String lhsAcceptedBy;
            lhsAcceptedBy = this.getAcceptedBy();
            String rhsAcceptedBy;
            rhsAcceptedBy = that.getAcceptedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedBy", lhsAcceptedBy), LocatorUtils.property(thatLocator, "acceptedBy", rhsAcceptedBy), lhsAcceptedBy, rhsAcceptedBy)) {
                return false;
            }
        }
        {
            Calendar lhsAcceptedDate;
            lhsAcceptedDate = this.getAcceptedDate();
            Calendar rhsAcceptedDate;
            rhsAcceptedDate = that.getAcceptedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedDate", lhsAcceptedDate), LocatorUtils.property(thatLocator, "acceptedDate", rhsAcceptedDate), lhsAcceptedDate, rhsAcceptedDate)) {
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
            IdType theSalesTermId;
            theSalesTermId = this.getSalesTermId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTermId", theSalesTermId), currentHashCode, theSalesTermId);
        }
        {
            String theSalesTermName;
            theSalesTermName = this.getSalesTermName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTermName", theSalesTermName), currentHashCode, theSalesTermName);
        }
        {
            PhysicalAddress theBillAddr;
            theBillAddr = this.getBillAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billAddr", theBillAddr), currentHashCode, theBillAddr);
        }
        {
            PhysicalAddress theShipAddr;
            theShipAddr = this.getShipAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipAddr", theShipAddr), currentHashCode, theShipAddr);
        }
        {
            String theBillEmail;
            theBillEmail = this.getBillEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billEmail", theBillEmail), currentHashCode, theBillEmail);
        }
        {
            BigDecimal theDiscountAmt;
            theDiscountAmt = this.getDiscountAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAmt", theDiscountAmt), currentHashCode, theDiscountAmt);
        }
        {
            BigDecimal theDiscountRate;
            theDiscountRate = this.getDiscountRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountRate", theDiscountRate), currentHashCode, theDiscountRate);
        }
        {
            IdType theDiscountAccountId;
            theDiscountAccountId = this.getDiscountAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountId", theDiscountAccountId), currentHashCode, theDiscountAccountId);
        }
        {
            String theDiscountAccountName;
            theDiscountAccountName = this.getDiscountAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountName", theDiscountAccountName), currentHashCode, theDiscountAccountName);
        }
        {
            Boolean theDiscountTaxable;
            theDiscountTaxable = this.isDiscountTaxable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountTaxable", theDiscountTaxable), currentHashCode, theDiscountTaxable);
        }
        {
            Calendar theExpirationDate;
            theExpirationDate = this.getExpirationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expirationDate", theExpirationDate), currentHashCode, theExpirationDate);
        }
        {
            String theAcceptedBy;
            theAcceptedBy = this.getAcceptedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptedBy", theAcceptedBy), currentHashCode, theAcceptedBy);
        }
        {
            Calendar theAcceptedDate;
            theAcceptedDate = this.getAcceptedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptedDate", theAcceptedDate), currentHashCode, theAcceptedDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
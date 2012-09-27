//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
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
 * Defines the metadata of the instance of data
 * 
 * <p>Java class for ModificationMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificationMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationMetaData", propOrder = {
    "createdBy",
    "createdById",
    "createTime",
    "lastModifiedBy",
    "lastModifiedById",
    "lastUpdatedTime"
})
public class ModificationMetaData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreatedById")
    protected String createdById;
    @XmlElement(name = "CreateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createTime;
    @XmlElement(name = "LastModifiedBy")
    protected String lastModifiedBy;
    @XmlElement(name = "LastModifiedById")
    protected String lastModifiedById;
    @XmlElement(name = "LastUpdatedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUpdatedTime;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedById(String value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(Calendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedById(String value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Sets the value of the lastUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedTime(Calendar value) {
        this.lastUpdatedTime = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ModificationMetaData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ModificationMetaData that = ((ModificationMetaData) object);
        {
            String lhsCreatedBy;
            lhsCreatedBy = this.getCreatedBy();
            String rhsCreatedBy;
            rhsCreatedBy = that.getCreatedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdBy", lhsCreatedBy), LocatorUtils.property(thatLocator, "createdBy", rhsCreatedBy), lhsCreatedBy, rhsCreatedBy)) {
                return false;
            }
        }
        {
            String lhsCreatedById;
            lhsCreatedById = this.getCreatedById();
            String rhsCreatedById;
            rhsCreatedById = that.getCreatedById();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdById", lhsCreatedById), LocatorUtils.property(thatLocator, "createdById", rhsCreatedById), lhsCreatedById, rhsCreatedById)) {
                return false;
            }
        }
        {
            Calendar lhsCreateTime;
            lhsCreateTime = this.getCreateTime();
            Calendar rhsCreateTime;
            rhsCreateTime = that.getCreateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createTime", lhsCreateTime), LocatorUtils.property(thatLocator, "createTime", rhsCreateTime), lhsCreateTime, rhsCreateTime)) {
                return false;
            }
        }
        {
            String lhsLastModifiedBy;
            lhsLastModifiedBy = this.getLastModifiedBy();
            String rhsLastModifiedBy;
            rhsLastModifiedBy = that.getLastModifiedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModifiedBy", lhsLastModifiedBy), LocatorUtils.property(thatLocator, "lastModifiedBy", rhsLastModifiedBy), lhsLastModifiedBy, rhsLastModifiedBy)) {
                return false;
            }
        }
        {
            String lhsLastModifiedById;
            lhsLastModifiedById = this.getLastModifiedById();
            String rhsLastModifiedById;
            rhsLastModifiedById = that.getLastModifiedById();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModifiedById", lhsLastModifiedById), LocatorUtils.property(thatLocator, "lastModifiedById", rhsLastModifiedById), lhsLastModifiedById, rhsLastModifiedById)) {
                return false;
            }
        }
        {
            Calendar lhsLastUpdatedTime;
            lhsLastUpdatedTime = this.getLastUpdatedTime();
            Calendar rhsLastUpdatedTime;
            rhsLastUpdatedTime = that.getLastUpdatedTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdatedTime", lhsLastUpdatedTime), LocatorUtils.property(thatLocator, "lastUpdatedTime", rhsLastUpdatedTime), lhsLastUpdatedTime, rhsLastUpdatedTime)) {
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
        int currentHashCode = 1;
        {
            String theCreatedBy;
            theCreatedBy = this.getCreatedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdBy", theCreatedBy), currentHashCode, theCreatedBy);
        }
        {
            String theCreatedById;
            theCreatedById = this.getCreatedById();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdById", theCreatedById), currentHashCode, theCreatedById);
        }
        {
            Calendar theCreateTime;
            theCreateTime = this.getCreateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createTime", theCreateTime), currentHashCode, theCreateTime);
        }
        {
            String theLastModifiedBy;
            theLastModifiedBy = this.getLastModifiedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastModifiedBy", theLastModifiedBy), currentHashCode, theLastModifiedBy);
        }
        {
            String theLastModifiedById;
            theLastModifiedById = this.getLastModifiedById();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastModifiedById", theLastModifiedById), currentHashCode, theLastModifiedById);
        }
        {
            Calendar theLastUpdatedTime;
            theLastUpdatedTime = this.getLastUpdatedTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdatedTime", theLastUpdatedTime), currentHashCode, theLastUpdatedTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
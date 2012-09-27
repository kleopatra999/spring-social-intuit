//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.math.BigInteger;
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
 * Holds credit-card transaction response information from a merchant account service, but not any credit card or payment request information - see CreditChargeInfo
 * 
 * <p>Java class for CreditChargeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditChargeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantAcctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardSecurityCodeMatch" type="{http://www.intuit.com/sb/cdm/v2}CCSecurityCodeMatchEnum" minOccurs="0"/>
 *         &lt;element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvsStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvsZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReconBatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentGroupingCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TxnAuthorizationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TxnAuthorizationStamp" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClientTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditChargeResponse", propOrder = {
    "ccTransId",
    "status",
    "resultCode",
    "resultMsg",
    "merchantAcctNum",
    "cardSecurityCodeMatch",
    "authCode",
    "avsStreet",
    "avsZip",
    "securityCode",
    "reconBatchId",
    "paymentGroupingCode",
    "txnAuthorizationTime",
    "txnAuthorizationStamp",
    "clientTransID"
})
public class CreditChargeResponse
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CCTransId")
    protected String ccTransId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ResultCode")
    protected BigInteger resultCode;
    @XmlElement(name = "ResultMsg")
    protected String resultMsg;
    @XmlElement(name = "MerchantAcctNum")
    protected String merchantAcctNum;
    @XmlElement(name = "CardSecurityCodeMatch")
    protected CCSecurityCodeMatchEnum cardSecurityCodeMatch;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "AvsStreet")
    protected String avsStreet;
    @XmlElement(name = "AvsZip")
    protected String avsZip;
    @XmlElement(name = "SecurityCode")
    protected String securityCode;
    @XmlElement(name = "ReconBatchId")
    protected String reconBatchId;
    @XmlElement(name = "PaymentGroupingCode")
    protected BigInteger paymentGroupingCode;
    @XmlElement(name = "TxnAuthorizationTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar txnAuthorizationTime;
    @XmlElement(name = "TxnAuthorizationStamp")
    protected BigInteger txnAuthorizationStamp;
    @XmlElement(name = "ClientTransID")
    protected String clientTransID;

    /**
     * Gets the value of the ccTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCTransId() {
        return ccTransId;
    }

    /**
     * Sets the value of the ccTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCTransId(String value) {
        this.ccTransId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCode(BigInteger value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMsg(String value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the merchantAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAcctNum() {
        return merchantAcctNum;
    }

    /**
     * Sets the value of the merchantAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAcctNum(String value) {
        this.merchantAcctNum = value;
    }

    /**
     * Gets the value of the cardSecurityCodeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link CCSecurityCodeMatchEnum }
     *     
     */
    public CCSecurityCodeMatchEnum getCardSecurityCodeMatch() {
        return cardSecurityCodeMatch;
    }

    /**
     * Sets the value of the cardSecurityCodeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCSecurityCodeMatchEnum }
     *     
     */
    public void setCardSecurityCodeMatch(CCSecurityCodeMatchEnum value) {
        this.cardSecurityCodeMatch = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the avsStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsStreet() {
        return avsStreet;
    }

    /**
     * Sets the value of the avsStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsStreet(String value) {
        this.avsStreet = value;
    }

    /**
     * Gets the value of the avsZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsZip() {
        return avsZip;
    }

    /**
     * Sets the value of the avsZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsZip(String value) {
        this.avsZip = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the reconBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconBatchId() {
        return reconBatchId;
    }

    /**
     * Sets the value of the reconBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconBatchId(String value) {
        this.reconBatchId = value;
    }

    /**
     * Gets the value of the paymentGroupingCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentGroupingCode() {
        return paymentGroupingCode;
    }

    /**
     * Sets the value of the paymentGroupingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentGroupingCode(BigInteger value) {
        this.paymentGroupingCode = value;
    }

    /**
     * Gets the value of the txnAuthorizationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTxnAuthorizationTime() {
        return txnAuthorizationTime;
    }

    /**
     * Sets the value of the txnAuthorizationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnAuthorizationTime(Calendar value) {
        this.txnAuthorizationTime = value;
    }

    /**
     * Gets the value of the txnAuthorizationStamp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxnAuthorizationStamp() {
        return txnAuthorizationStamp;
    }

    /**
     * Sets the value of the txnAuthorizationStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxnAuthorizationStamp(BigInteger value) {
        this.txnAuthorizationStamp = value;
    }

    /**
     * Gets the value of the clientTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransID() {
        return clientTransID;
    }

    /**
     * Sets the value of the clientTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransID(String value) {
        this.clientTransID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreditChargeResponse)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditChargeResponse that = ((CreditChargeResponse) object);
        {
            String lhsCCTransId;
            lhsCCTransId = this.getCCTransId();
            String rhsCCTransId;
            rhsCCTransId = that.getCCTransId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccTransId", lhsCCTransId), LocatorUtils.property(thatLocator, "ccTransId", rhsCCTransId), lhsCCTransId, rhsCCTransId)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            BigInteger lhsResultCode;
            lhsResultCode = this.getResultCode();
            BigInteger rhsResultCode;
            rhsResultCode = that.getResultCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultCode", lhsResultCode), LocatorUtils.property(thatLocator, "resultCode", rhsResultCode), lhsResultCode, rhsResultCode)) {
                return false;
            }
        }
        {
            String lhsResultMsg;
            lhsResultMsg = this.getResultMsg();
            String rhsResultMsg;
            rhsResultMsg = that.getResultMsg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultMsg", lhsResultMsg), LocatorUtils.property(thatLocator, "resultMsg", rhsResultMsg), lhsResultMsg, rhsResultMsg)) {
                return false;
            }
        }
        {
            String lhsMerchantAcctNum;
            lhsMerchantAcctNum = this.getMerchantAcctNum();
            String rhsMerchantAcctNum;
            rhsMerchantAcctNum = that.getMerchantAcctNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "merchantAcctNum", lhsMerchantAcctNum), LocatorUtils.property(thatLocator, "merchantAcctNum", rhsMerchantAcctNum), lhsMerchantAcctNum, rhsMerchantAcctNum)) {
                return false;
            }
        }
        {
            CCSecurityCodeMatchEnum lhsCardSecurityCodeMatch;
            lhsCardSecurityCodeMatch = this.getCardSecurityCodeMatch();
            CCSecurityCodeMatchEnum rhsCardSecurityCodeMatch;
            rhsCardSecurityCodeMatch = that.getCardSecurityCodeMatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardSecurityCodeMatch", lhsCardSecurityCodeMatch), LocatorUtils.property(thatLocator, "cardSecurityCodeMatch", rhsCardSecurityCodeMatch), lhsCardSecurityCodeMatch, rhsCardSecurityCodeMatch)) {
                return false;
            }
        }
        {
            String lhsAuthCode;
            lhsAuthCode = this.getAuthCode();
            String rhsAuthCode;
            rhsAuthCode = that.getAuthCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authCode", lhsAuthCode), LocatorUtils.property(thatLocator, "authCode", rhsAuthCode), lhsAuthCode, rhsAuthCode)) {
                return false;
            }
        }
        {
            String lhsAvsStreet;
            lhsAvsStreet = this.getAvsStreet();
            String rhsAvsStreet;
            rhsAvsStreet = that.getAvsStreet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avsStreet", lhsAvsStreet), LocatorUtils.property(thatLocator, "avsStreet", rhsAvsStreet), lhsAvsStreet, rhsAvsStreet)) {
                return false;
            }
        }
        {
            String lhsAvsZip;
            lhsAvsZip = this.getAvsZip();
            String rhsAvsZip;
            rhsAvsZip = that.getAvsZip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avsZip", lhsAvsZip), LocatorUtils.property(thatLocator, "avsZip", rhsAvsZip), lhsAvsZip, rhsAvsZip)) {
                return false;
            }
        }
        {
            String lhsSecurityCode;
            lhsSecurityCode = this.getSecurityCode();
            String rhsSecurityCode;
            rhsSecurityCode = that.getSecurityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityCode", lhsSecurityCode), LocatorUtils.property(thatLocator, "securityCode", rhsSecurityCode), lhsSecurityCode, rhsSecurityCode)) {
                return false;
            }
        }
        {
            String lhsReconBatchId;
            lhsReconBatchId = this.getReconBatchId();
            String rhsReconBatchId;
            rhsReconBatchId = that.getReconBatchId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reconBatchId", lhsReconBatchId), LocatorUtils.property(thatLocator, "reconBatchId", rhsReconBatchId), lhsReconBatchId, rhsReconBatchId)) {
                return false;
            }
        }
        {
            BigInteger lhsPaymentGroupingCode;
            lhsPaymentGroupingCode = this.getPaymentGroupingCode();
            BigInteger rhsPaymentGroupingCode;
            rhsPaymentGroupingCode = that.getPaymentGroupingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentGroupingCode", lhsPaymentGroupingCode), LocatorUtils.property(thatLocator, "paymentGroupingCode", rhsPaymentGroupingCode), lhsPaymentGroupingCode, rhsPaymentGroupingCode)) {
                return false;
            }
        }
        {
            Calendar lhsTxnAuthorizationTime;
            lhsTxnAuthorizationTime = this.getTxnAuthorizationTime();
            Calendar rhsTxnAuthorizationTime;
            rhsTxnAuthorizationTime = that.getTxnAuthorizationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnAuthorizationTime", lhsTxnAuthorizationTime), LocatorUtils.property(thatLocator, "txnAuthorizationTime", rhsTxnAuthorizationTime), lhsTxnAuthorizationTime, rhsTxnAuthorizationTime)) {
                return false;
            }
        }
        {
            BigInteger lhsTxnAuthorizationStamp;
            lhsTxnAuthorizationStamp = this.getTxnAuthorizationStamp();
            BigInteger rhsTxnAuthorizationStamp;
            rhsTxnAuthorizationStamp = that.getTxnAuthorizationStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnAuthorizationStamp", lhsTxnAuthorizationStamp), LocatorUtils.property(thatLocator, "txnAuthorizationStamp", rhsTxnAuthorizationStamp), lhsTxnAuthorizationStamp, rhsTxnAuthorizationStamp)) {
                return false;
            }
        }
        {
            String lhsClientTransID;
            lhsClientTransID = this.getClientTransID();
            String rhsClientTransID;
            rhsClientTransID = that.getClientTransID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientTransID", lhsClientTransID), LocatorUtils.property(thatLocator, "clientTransID", rhsClientTransID), lhsClientTransID, rhsClientTransID)) {
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
            String theCCTransId;
            theCCTransId = this.getCCTransId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccTransId", theCCTransId), currentHashCode, theCCTransId);
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            BigInteger theResultCode;
            theResultCode = this.getResultCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultCode", theResultCode), currentHashCode, theResultCode);
        }
        {
            String theResultMsg;
            theResultMsg = this.getResultMsg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resultMsg", theResultMsg), currentHashCode, theResultMsg);
        }
        {
            String theMerchantAcctNum;
            theMerchantAcctNum = this.getMerchantAcctNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "merchantAcctNum", theMerchantAcctNum), currentHashCode, theMerchantAcctNum);
        }
        {
            CCSecurityCodeMatchEnum theCardSecurityCodeMatch;
            theCardSecurityCodeMatch = this.getCardSecurityCodeMatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardSecurityCodeMatch", theCardSecurityCodeMatch), currentHashCode, theCardSecurityCodeMatch);
        }
        {
            String theAuthCode;
            theAuthCode = this.getAuthCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authCode", theAuthCode), currentHashCode, theAuthCode);
        }
        {
            String theAvsStreet;
            theAvsStreet = this.getAvsStreet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avsStreet", theAvsStreet), currentHashCode, theAvsStreet);
        }
        {
            String theAvsZip;
            theAvsZip = this.getAvsZip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avsZip", theAvsZip), currentHashCode, theAvsZip);
        }
        {
            String theSecurityCode;
            theSecurityCode = this.getSecurityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityCode", theSecurityCode), currentHashCode, theSecurityCode);
        }
        {
            String theReconBatchId;
            theReconBatchId = this.getReconBatchId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reconBatchId", theReconBatchId), currentHashCode, theReconBatchId);
        }
        {
            BigInteger thePaymentGroupingCode;
            thePaymentGroupingCode = this.getPaymentGroupingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentGroupingCode", thePaymentGroupingCode), currentHashCode, thePaymentGroupingCode);
        }
        {
            Calendar theTxnAuthorizationTime;
            theTxnAuthorizationTime = this.getTxnAuthorizationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnAuthorizationTime", theTxnAuthorizationTime), currentHashCode, theTxnAuthorizationTime);
        }
        {
            BigInteger theTxnAuthorizationStamp;
            theTxnAuthorizationStamp = this.getTxnAuthorizationStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnAuthorizationStamp", theTxnAuthorizationStamp), currentHashCode, theTxnAuthorizationStamp);
        }
        {
            String theClientTransID;
            theClientTransID = this.getClientTransID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientTransID", theClientTransID), currentHashCode, theClientTransID);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
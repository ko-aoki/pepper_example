package jp.co.ysk.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 * 
 */
@Entity
@Table(name = "TRN_RECEPTION")
public class TrnReception {

    /**  */
    @Id
    @Column(name = "TRN_RECEPTION_ID")
    Integer trnReceptionId;

    /**  */
    @Column(name = "DISPAY_ID")
    Integer dispayId;

    /**  */
    @Column(name = "WINDOW_ID")
    String windowId;

    /**  */
    @Column(name = "PREVIOUS_WINDOW_ID")
    String previousWindowId;

    /**  */
    @Column(name = "STATUS_CD")
    String statusCd;

    /**  */
    @Column(name = "IS_ACTIVE")
    String isActive;

    /**  */
    @Version
    @Column(name = "VERSION_NO")
    Integer versionNo;

    /**  */
    @Column(name = "INSERT_DATE")
    LocalDateTime insertDate;

    /**  */
    @Column(name = "UPDATE_DATE")
    LocalDateTime updateDate;

    /**  */
    @Column(name = "INSERT_USER_ID")
    String insertUserId;

    /**  */
    @Column(name = "UPDATE_USER_ID")
    String updateUserId;

    /** 
     * Returns the trnReceptionId.
     * 
     * @return the trnReceptionId
     */
    public Integer getTrnReceptionId() {
        return trnReceptionId;
    }

    /** 
     * Sets the trnReceptionId.
     * 
     * @param trnReceptionId the trnReceptionId
     */
    public void setTrnReceptionId(Integer trnReceptionId) {
        this.trnReceptionId = trnReceptionId;
    }

    /** 
     * Returns the dispayId.
     * 
     * @return the dispayId
     */
    public Integer getDispayId() {
        return dispayId;
    }

    /** 
     * Sets the dispayId.
     * 
     * @param dispayId the dispayId
     */
    public void setDispayId(Integer dispayId) {
        this.dispayId = dispayId;
    }

    /** 
     * Returns the windowId.
     * 
     * @return the windowId
     */
    public String getWindowId() {
        return windowId;
    }

    /** 
     * Sets the windowId.
     * 
     * @param windowId the windowId
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /** 
     * Returns the previousWindowId.
     * 
     * @return the previousWindowId
     */
    public String getPreviousWindowId() {
        return previousWindowId;
    }

    /** 
     * Sets the previousWindowId.
     * 
     * @param previousWindowId the previousWindowId
     */
    public void setPreviousWindowId(String previousWindowId) {
        this.previousWindowId = previousWindowId;
    }

    /** 
     * Returns the statusCd.
     * 
     * @return the statusCd
     */
    public String getStatusCd() {
        return statusCd;
    }

    /** 
     * Sets the statusCd.
     * 
     * @param statusCd the statusCd
     */
    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    /** 
     * Returns the isActive.
     * 
     * @return the isActive
     */
    public String getIsActive() {
        return isActive;
    }

    /** 
     * Sets the isActive.
     * 
     * @param isActive the isActive
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    /** 
     * Returns the versionNo.
     * 
     * @return the versionNo
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /** 
     * Sets the versionNo.
     * 
     * @param versionNo the versionNo
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    /** 
     * Returns the insertDate.
     * 
     * @return the insertDate
     */
    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    /** 
     * Sets the insertDate.
     * 
     * @param insertDate the insertDate
     */
    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    /** 
     * Returns the updateDate.
     * 
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /** 
     * Sets the updateDate.
     * 
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /** 
     * Returns the insertUserId.
     * 
     * @return the insertUserId
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /** 
     * Sets the insertUserId.
     * 
     * @param insertUserId the insertUserId
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId;
    }

    /** 
     * Returns the updateUserId.
     * 
     * @return the updateUserId
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /** 
     * Sets the updateUserId.
     * 
     * @param updateUserId the updateUserId
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}
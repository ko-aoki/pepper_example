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
@Table(name = "MST_WINDOW")
public class MstWindow {

    /**  */
    @Id
    @Column(name = "WINDOW_ID")
    String windowId;

    /**  */
    @Column(name = "WINDO_NM")
    String windoNm;

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
     * Returns the windoNm.
     * 
     * @return the windoNm
     */
    public String getWindoNm() {
        return windoNm;
    }

    /** 
     * Sets the windoNm.
     * 
     * @param windoNm the windoNm
     */
    public void setWindoNm(String windoNm) {
        this.windoNm = windoNm;
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
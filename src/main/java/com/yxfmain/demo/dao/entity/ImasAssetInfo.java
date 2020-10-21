package com.yxfmain.demo.dao.entity;

import java.util.Date;

public class ImasAssetInfo {
    private Integer id;

    private Date createTime;

    private Date foundTime;

    private Date updateTime;

    private String assetName;

    private String ip;

    private Long ipValue;

    private String vendor;

    private String product;

    private String category;

    private String type;

    private Integer importance;

    private Integer isAbnormal;

    private Integer isZombie;

    private Integer isIllegal;

    private String os;

    private String mac;

    private String version;

    private String osVersion;

    private Integer openPortCount;

    private Integer vulCount;

    private Integer alarmThreatAttackerCount;

    private Integer alarmThreatVictimCount;

    private Integer alarmAbnormalSrcCount;

    private Integer alarmAbnormalDstCount;

    private Integer alarmCount;

    private Integer useStatus;

    private String remark;

    private String describe;

    private Integer groupId;

    private Integer source;

    private Double longitude;

    private Double latitude;

    private Integer isNetworkEquipment;

    private Integer isControlEquipment;

    private Double riskScore;

    private Integer riskLevel;

    private Integer principalId;

    private Integer assetValue;

    private String assetSn;

    private String assetVersion;

    private Date activeTime;

    private String position;

    private Integer isIcs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Long getIpValue() {
        return ipValue;
    }

    public void setIpValue(Long ipValue) {
        this.ipValue = ipValue;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Integer getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(Integer isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    public Integer getIsZombie() {
        return isZombie;
    }

    public void setIsZombie(Integer isZombie) {
        this.isZombie = isZombie;
    }

    public Integer getIsIllegal() {
        return isIllegal;
    }

    public void setIsIllegal(Integer isIllegal) {
        this.isIllegal = isIllegal;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    public Integer getOpenPortCount() {
        return openPortCount;
    }

    public void setOpenPortCount(Integer openPortCount) {
        this.openPortCount = openPortCount;
    }

    public Integer getVulCount() {
        return vulCount;
    }

    public void setVulCount(Integer vulCount) {
        this.vulCount = vulCount;
    }

    public Integer getAlarmThreatAttackerCount() {
        return alarmThreatAttackerCount;
    }

    public void setAlarmThreatAttackerCount(Integer alarmThreatAttackerCount) {
        this.alarmThreatAttackerCount = alarmThreatAttackerCount;
    }

    public Integer getAlarmThreatVictimCount() {
        return alarmThreatVictimCount;
    }

    public void setAlarmThreatVictimCount(Integer alarmThreatVictimCount) {
        this.alarmThreatVictimCount = alarmThreatVictimCount;
    }

    public Integer getAlarmAbnormalSrcCount() {
        return alarmAbnormalSrcCount;
    }

    public void setAlarmAbnormalSrcCount(Integer alarmAbnormalSrcCount) {
        this.alarmAbnormalSrcCount = alarmAbnormalSrcCount;
    }

    public Integer getAlarmAbnormalDstCount() {
        return alarmAbnormalDstCount;
    }

    public void setAlarmAbnormalDstCount(Integer alarmAbnormalDstCount) {
        this.alarmAbnormalDstCount = alarmAbnormalDstCount;
    }

    public Integer getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getIsNetworkEquipment() {
        return isNetworkEquipment;
    }

    public void setIsNetworkEquipment(Integer isNetworkEquipment) {
        this.isNetworkEquipment = isNetworkEquipment;
    }

    public Integer getIsControlEquipment() {
        return isControlEquipment;
    }

    public void setIsControlEquipment(Integer isControlEquipment) {
        this.isControlEquipment = isControlEquipment;
    }

    public Double getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Double riskScore) {
        this.riskScore = riskScore;
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(Integer assetValue) {
        this.assetValue = assetValue;
    }

    public String getAssetSn() {
        return assetSn;
    }

    public void setAssetSn(String assetSn) {
        this.assetSn = assetSn == null ? null : assetSn.trim();
    }

    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion == null ? null : assetVersion.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getIsIcs() {
        return isIcs;
    }

    public void setIsIcs(Integer isIcs) {
        this.isIcs = isIcs;
    }
}
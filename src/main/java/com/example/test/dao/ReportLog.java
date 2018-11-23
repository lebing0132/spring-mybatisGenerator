package com.example.test.dao;

import java.util.Date;

public class ReportLog {
    private String id;

    private String orgId;

    private Short type;

    private Integer platformCount;

    private Integer udpCount;

    private Integer totalCount;

    private Integer onlineCount;

    private Integer offlineCount;

    private Integer alarmCount;

    private Date dateTime;

    private Integer lightOnCount;

    private Integer lightOffCount;

    public ReportLog(String id, String orgId, Short type, Integer platformCount, Integer udpCount, Integer totalCount, Integer onlineCount, Integer offlineCount, Integer alarmCount, Date dateTime, Integer lightOnCount, Integer lightOffCount) {
        this.id = id;
        this.orgId = orgId;
        this.type = type;
        this.platformCount = platformCount;
        this.udpCount = udpCount;
        this.totalCount = totalCount;
        this.onlineCount = onlineCount;
        this.offlineCount = offlineCount;
        this.alarmCount = alarmCount;
        this.dateTime = dateTime;
        this.lightOnCount = lightOnCount;
        this.lightOffCount = lightOffCount;
    }

    public ReportLog() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getPlatformCount() {
        return platformCount;
    }

    public void setPlatformCount(Integer platformCount) {
        this.platformCount = platformCount;
    }

    public Integer getUdpCount() {
        return udpCount;
    }

    public void setUdpCount(Integer udpCount) {
        this.udpCount = udpCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public Integer getOfflineCount() {
        return offlineCount;
    }

    public void setOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
    }

    public Integer getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getLightOnCount() {
        return lightOnCount;
    }

    public void setLightOnCount(Integer lightOnCount) {
        this.lightOnCount = lightOnCount;
    }

    public Integer getLightOffCount() {
        return lightOffCount;
    }

    public void setLightOffCount(Integer lightOffCount) {
        this.lightOffCount = lightOffCount;
    }
}
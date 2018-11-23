package com.example.test.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPlatformCountIsNull() {
            addCriterion("PLATFORM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCountIsNotNull() {
            addCriterion("PLATFORM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCountEqualTo(Integer value) {
            addCriterion("PLATFORM_COUNT =", value, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountNotEqualTo(Integer value) {
            addCriterion("PLATFORM_COUNT <>", value, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountGreaterThan(Integer value) {
            addCriterion("PLATFORM_COUNT >", value, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLATFORM_COUNT >=", value, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountLessThan(Integer value) {
            addCriterion("PLATFORM_COUNT <", value, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountLessThanOrEqualTo(Integer value) {
            addCriterion("PLATFORM_COUNT <=", value, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountIn(List<Integer> values) {
            addCriterion("PLATFORM_COUNT in", values, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountNotIn(List<Integer> values) {
            addCriterion("PLATFORM_COUNT not in", values, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountBetween(Integer value1, Integer value2) {
            addCriterion("PLATFORM_COUNT between", value1, value2, "platformCount");
            return (Criteria) this;
        }

        public Criteria andPlatformCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PLATFORM_COUNT not between", value1, value2, "platformCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountIsNull() {
            addCriterion("UDP_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUdpCountIsNotNull() {
            addCriterion("UDP_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUdpCountEqualTo(Integer value) {
            addCriterion("UDP_COUNT =", value, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountNotEqualTo(Integer value) {
            addCriterion("UDP_COUNT <>", value, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountGreaterThan(Integer value) {
            addCriterion("UDP_COUNT >", value, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("UDP_COUNT >=", value, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountLessThan(Integer value) {
            addCriterion("UDP_COUNT <", value, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountLessThanOrEqualTo(Integer value) {
            addCriterion("UDP_COUNT <=", value, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountIn(List<Integer> values) {
            addCriterion("UDP_COUNT in", values, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountNotIn(List<Integer> values) {
            addCriterion("UDP_COUNT not in", values, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountBetween(Integer value1, Integer value2) {
            addCriterion("UDP_COUNT between", value1, value2, "udpCount");
            return (Criteria) this;
        }

        public Criteria andUdpCountNotBetween(Integer value1, Integer value2) {
            addCriterion("UDP_COUNT not between", value1, value2, "udpCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("TOTAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("TOTAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("TOTAL_COUNT >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("TOTAL_COUNT <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_COUNT <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("TOTAL_COUNT in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("TOTAL_COUNT not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_COUNT between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_COUNT not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountIsNull() {
            addCriterion("ONLINE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOnlineCountIsNotNull() {
            addCriterion("ONLINE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineCountEqualTo(Integer value) {
            addCriterion("ONLINE_COUNT =", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountNotEqualTo(Integer value) {
            addCriterion("ONLINE_COUNT <>", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountGreaterThan(Integer value) {
            addCriterion("ONLINE_COUNT >", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_COUNT >=", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountLessThan(Integer value) {
            addCriterion("ONLINE_COUNT <", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountLessThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_COUNT <=", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountIn(List<Integer> values) {
            addCriterion("ONLINE_COUNT in", values, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountNotIn(List<Integer> values) {
            addCriterion("ONLINE_COUNT not in", values, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_COUNT between", value1, value2, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_COUNT not between", value1, value2, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountIsNull() {
            addCriterion("OFFLINE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOfflineCountIsNotNull() {
            addCriterion("OFFLINE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineCountEqualTo(Integer value) {
            addCriterion("OFFLINE_COUNT =", value, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountNotEqualTo(Integer value) {
            addCriterion("OFFLINE_COUNT <>", value, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountGreaterThan(Integer value) {
            addCriterion("OFFLINE_COUNT >", value, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_COUNT >=", value, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountLessThan(Integer value) {
            addCriterion("OFFLINE_COUNT <", value, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountLessThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_COUNT <=", value, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountIn(List<Integer> values) {
            addCriterion("OFFLINE_COUNT in", values, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountNotIn(List<Integer> values) {
            addCriterion("OFFLINE_COUNT not in", values, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_COUNT between", value1, value2, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_COUNT not between", value1, value2, "offlineCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountIsNull() {
            addCriterion("ALARM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAlarmCountIsNotNull() {
            addCriterion("ALARM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmCountEqualTo(Integer value) {
            addCriterion("ALARM_COUNT =", value, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountNotEqualTo(Integer value) {
            addCriterion("ALARM_COUNT <>", value, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountGreaterThan(Integer value) {
            addCriterion("ALARM_COUNT >", value, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALARM_COUNT >=", value, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountLessThan(Integer value) {
            addCriterion("ALARM_COUNT <", value, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountLessThanOrEqualTo(Integer value) {
            addCriterion("ALARM_COUNT <=", value, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountIn(List<Integer> values) {
            addCriterion("ALARM_COUNT in", values, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountNotIn(List<Integer> values) {
            addCriterion("ALARM_COUNT not in", values, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountBetween(Integer value1, Integer value2) {
            addCriterion("ALARM_COUNT between", value1, value2, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andAlarmCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ALARM_COUNT not between", value1, value2, "alarmCount");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("DATE_TIME =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("DATE_TIME <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("DATE_TIME >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_TIME >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("DATE_TIME <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATE_TIME <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("DATE_TIME in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("DATE_TIME not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("DATE_TIME between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATE_TIME not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andLightOnCountIsNull() {
            addCriterion("LIGHT_ON_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLightOnCountIsNotNull() {
            addCriterion("LIGHT_ON_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLightOnCountEqualTo(Integer value) {
            addCriterion("LIGHT_ON_COUNT =", value, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountNotEqualTo(Integer value) {
            addCriterion("LIGHT_ON_COUNT <>", value, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountGreaterThan(Integer value) {
            addCriterion("LIGHT_ON_COUNT >", value, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIGHT_ON_COUNT >=", value, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountLessThan(Integer value) {
            addCriterion("LIGHT_ON_COUNT <", value, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountLessThanOrEqualTo(Integer value) {
            addCriterion("LIGHT_ON_COUNT <=", value, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountIn(List<Integer> values) {
            addCriterion("LIGHT_ON_COUNT in", values, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountNotIn(List<Integer> values) {
            addCriterion("LIGHT_ON_COUNT not in", values, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountBetween(Integer value1, Integer value2) {
            addCriterion("LIGHT_ON_COUNT between", value1, value2, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOnCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LIGHT_ON_COUNT not between", value1, value2, "lightOnCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountIsNull() {
            addCriterion("LIGHT_OFF_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLightOffCountIsNotNull() {
            addCriterion("LIGHT_OFF_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLightOffCountEqualTo(Integer value) {
            addCriterion("LIGHT_OFF_COUNT =", value, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountNotEqualTo(Integer value) {
            addCriterion("LIGHT_OFF_COUNT <>", value, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountGreaterThan(Integer value) {
            addCriterion("LIGHT_OFF_COUNT >", value, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIGHT_OFF_COUNT >=", value, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountLessThan(Integer value) {
            addCriterion("LIGHT_OFF_COUNT <", value, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountLessThanOrEqualTo(Integer value) {
            addCriterion("LIGHT_OFF_COUNT <=", value, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountIn(List<Integer> values) {
            addCriterion("LIGHT_OFF_COUNT in", values, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountNotIn(List<Integer> values) {
            addCriterion("LIGHT_OFF_COUNT not in", values, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountBetween(Integer value1, Integer value2) {
            addCriterion("LIGHT_OFF_COUNT between", value1, value2, "lightOffCount");
            return (Criteria) this;
        }

        public Criteria andLightOffCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LIGHT_OFF_COUNT not between", value1, value2, "lightOffCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
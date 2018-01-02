package com.frontend.web.bo;

import java.util.ArrayList;
import java.util.List;

public class TdViewVirtualArchCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TdViewVirtualArchCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andVirtualArchIdIsNull() {
            addCriterion("virtual_arch_id is null");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdIsNotNull() {
            addCriterion("virtual_arch_id is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdEqualTo(Long value) {
            addCriterion("virtual_arch_id =", value, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdNotEqualTo(Long value) {
            addCriterion("virtual_arch_id <>", value, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdGreaterThan(Long value) {
            addCriterion("virtual_arch_id >", value, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("virtual_arch_id >=", value, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdLessThan(Long value) {
            addCriterion("virtual_arch_id <", value, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdLessThanOrEqualTo(Long value) {
            addCriterion("virtual_arch_id <=", value, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdIn(List<Long> values) {
            addCriterion("virtual_arch_id in", values, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdNotIn(List<Long> values) {
            addCriterion("virtual_arch_id not in", values, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdBetween(Long value1, Long value2) {
            addCriterion("virtual_arch_id between", value1, value2, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchIdNotBetween(Long value1, Long value2) {
            addCriterion("virtual_arch_id not between", value1, value2, "virtualArchId");
            return (Criteria) this;
        }

        public Criteria andArchCodeIsNull() {
            addCriterion("arch_code is null");
            return (Criteria) this;
        }

        public Criteria andArchCodeIsNotNull() {
            addCriterion("arch_code is not null");
            return (Criteria) this;
        }

        public Criteria andArchCodeEqualTo(String value) {
            addCriterion("arch_code =", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeNotEqualTo(String value) {
            addCriterion("arch_code <>", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeGreaterThan(String value) {
            addCriterion("arch_code >", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("arch_code >=", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeLessThan(String value) {
            addCriterion("arch_code <", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeLessThanOrEqualTo(String value) {
            addCriterion("arch_code <=", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeLike(String value) {
            addCriterion("arch_code like", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeNotLike(String value) {
            addCriterion("arch_code not like", value, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeIn(List<String> values) {
            addCriterion("arch_code in", values, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeNotIn(List<String> values) {
            addCriterion("arch_code not in", values, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeBetween(String value1, String value2) {
            addCriterion("arch_code between", value1, value2, "archCode");
            return (Criteria) this;
        }

        public Criteria andArchCodeNotBetween(String value1, String value2) {
            addCriterion("arch_code not between", value1, value2, "archCode");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Long value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Long value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Long value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Long value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Long value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Long> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Long> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Long value1, Long value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Long value1, Long value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeIsNull() {
            addCriterion("virtual_arch_code is null");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeIsNotNull() {
            addCriterion("virtual_arch_code is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeEqualTo(String value) {
            addCriterion("virtual_arch_code =", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeNotEqualTo(String value) {
            addCriterion("virtual_arch_code <>", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeGreaterThan(String value) {
            addCriterion("virtual_arch_code >", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("virtual_arch_code >=", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeLessThan(String value) {
            addCriterion("virtual_arch_code <", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeLessThanOrEqualTo(String value) {
            addCriterion("virtual_arch_code <=", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeLike(String value) {
            addCriterion("virtual_arch_code like", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeNotLike(String value) {
            addCriterion("virtual_arch_code not like", value, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeIn(List<String> values) {
            addCriterion("virtual_arch_code in", values, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeNotIn(List<String> values) {
            addCriterion("virtual_arch_code not in", values, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeBetween(String value1, String value2) {
            addCriterion("virtual_arch_code between", value1, value2, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchCodeNotBetween(String value1, String value2) {
            addCriterion("virtual_arch_code not between", value1, value2, "virtualArchCode");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameIsNull() {
            addCriterion("virtual_arch_name is null");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameIsNotNull() {
            addCriterion("virtual_arch_name is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameEqualTo(String value) {
            addCriterion("virtual_arch_name =", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameNotEqualTo(String value) {
            addCriterion("virtual_arch_name <>", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameGreaterThan(String value) {
            addCriterion("virtual_arch_name >", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameGreaterThanOrEqualTo(String value) {
            addCriterion("virtual_arch_name >=", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameLessThan(String value) {
            addCriterion("virtual_arch_name <", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameLessThanOrEqualTo(String value) {
            addCriterion("virtual_arch_name <=", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameLike(String value) {
            addCriterion("virtual_arch_name like", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameNotLike(String value) {
            addCriterion("virtual_arch_name not like", value, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameIn(List<String> values) {
            addCriterion("virtual_arch_name in", values, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameNotIn(List<String> values) {
            addCriterion("virtual_arch_name not in", values, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameBetween(String value1, String value2) {
            addCriterion("virtual_arch_name between", value1, value2, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andVirtualArchNameNotBetween(String value1, String value2) {
            addCriterion("virtual_arch_name not between", value1, value2, "virtualArchName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueIsNull() {
            addCriterion("staytime_value is null");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueIsNotNull() {
            addCriterion("staytime_value is not null");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueEqualTo(Long value) {
            addCriterion("staytime_value =", value, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueNotEqualTo(Long value) {
            addCriterion("staytime_value <>", value, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueGreaterThan(Long value) {
            addCriterion("staytime_value >", value, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueGreaterThanOrEqualTo(Long value) {
            addCriterion("staytime_value >=", value, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueLessThan(Long value) {
            addCriterion("staytime_value <", value, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueLessThanOrEqualTo(Long value) {
            addCriterion("staytime_value <=", value, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueIn(List<Long> values) {
            addCriterion("staytime_value in", values, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueNotIn(List<Long> values) {
            addCriterion("staytime_value not in", values, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueBetween(Long value1, Long value2) {
            addCriterion("staytime_value between", value1, value2, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeValueNotBetween(Long value1, Long value2) {
            addCriterion("staytime_value not between", value1, value2, "staytimeValue");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitIsNull() {
            addCriterion("staytime_unit is null");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitIsNotNull() {
            addCriterion("staytime_unit is not null");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitEqualTo(String value) {
            addCriterion("staytime_unit =", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitNotEqualTo(String value) {
            addCriterion("staytime_unit <>", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitGreaterThan(String value) {
            addCriterion("staytime_unit >", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("staytime_unit >=", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitLessThan(String value) {
            addCriterion("staytime_unit <", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitLessThanOrEqualTo(String value) {
            addCriterion("staytime_unit <=", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitLike(String value) {
            addCriterion("staytime_unit like", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitNotLike(String value) {
            addCriterion("staytime_unit not like", value, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitIn(List<String> values) {
            addCriterion("staytime_unit in", values, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitNotIn(List<String> values) {
            addCriterion("staytime_unit not in", values, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitBetween(String value1, String value2) {
            addCriterion("staytime_unit between", value1, value2, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andStaytimeUnitNotBetween(String value1, String value2) {
            addCriterion("staytime_unit not between", value1, value2, "staytimeUnit");
            return (Criteria) this;
        }

        public Criteria andPageCodeIsNull() {
            addCriterion("page_code is null");
            return (Criteria) this;
        }

        public Criteria andPageCodeIsNotNull() {
            addCriterion("page_code is not null");
            return (Criteria) this;
        }

        public Criteria andPageCodeEqualTo(String value) {
            addCriterion("page_code =", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeNotEqualTo(String value) {
            addCriterion("page_code <>", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeGreaterThan(String value) {
            addCriterion("page_code >", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("page_code >=", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeLessThan(String value) {
            addCriterion("page_code <", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeLessThanOrEqualTo(String value) {
            addCriterion("page_code <=", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeLike(String value) {
            addCriterion("page_code like", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeNotLike(String value) {
            addCriterion("page_code not like", value, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeIn(List<String> values) {
            addCriterion("page_code in", values, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeNotIn(List<String> values) {
            addCriterion("page_code not in", values, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeBetween(String value1, String value2) {
            addCriterion("page_code between", value1, value2, "pageCode");
            return (Criteria) this;
        }

        public Criteria andPageCodeNotBetween(String value1, String value2) {
            addCriterion("page_code not between", value1, value2, "pageCode");
            return (Criteria) this;
        }

        public Criteria andDefaultTagIsNull() {
            addCriterion("default_tag is null");
            return (Criteria) this;
        }

        public Criteria andDefaultTagIsNotNull() {
            addCriterion("default_tag is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultTagEqualTo(String value) {
            addCriterion("default_tag =", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagNotEqualTo(String value) {
            addCriterion("default_tag <>", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagGreaterThan(String value) {
            addCriterion("default_tag >", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagGreaterThanOrEqualTo(String value) {
            addCriterion("default_tag >=", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagLessThan(String value) {
            addCriterion("default_tag <", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagLessThanOrEqualTo(String value) {
            addCriterion("default_tag <=", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagLike(String value) {
            addCriterion("default_tag like", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagNotLike(String value) {
            addCriterion("default_tag not like", value, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagIn(List<String> values) {
            addCriterion("default_tag in", values, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagNotIn(List<String> values) {
            addCriterion("default_tag not in", values, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagBetween(String value1, String value2) {
            addCriterion("default_tag between", value1, value2, "defaultTag");
            return (Criteria) this;
        }

        public Criteria andDefaultTagNotBetween(String value1, String value2) {
            addCriterion("default_tag not between", value1, value2, "defaultTag");
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
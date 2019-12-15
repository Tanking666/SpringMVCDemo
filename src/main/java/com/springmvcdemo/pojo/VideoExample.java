package com.springmvcdemo.pojo;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
	protected String orderByClause;

	protected String limmitClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public VideoExample() {
		oredCriteria = new ArrayList<>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getLimmitClause() {
		return limmitClause;
	}

	public void setLimmitClause(String limmitClause) {
		this.limmitClause = limmitClause;
	}

	public void setLimmitClause(int start, int end) {
		this.limmitClause = " " + start + "," + end;
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
			criteria = new ArrayList<>();
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
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andPNameIsNull() {
			addCriterion("p_name is null");
			return (Criteria) this;
		}

		public Criteria andPNameIsNotNull() {
			addCriterion("p_name is not null");
			return (Criteria) this;
		}

		public Criteria andPNameEqualTo(String value) {
			addCriterion("p_name =", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotEqualTo(String value) {
			addCriterion("p_name <>", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameGreaterThan(String value) {
			addCriterion("p_name >", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameGreaterThanOrEqualTo(String value) {
			addCriterion("p_name >=", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameLessThan(String value) {
			addCriterion("p_name <", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameLessThanOrEqualTo(String value) {
			addCriterion("p_name <=", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameLike(String value) {
			addCriterion("p_name like", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotLike(String value) {
			addCriterion("p_name not like", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameIn(List<String> values) {
			addCriterion("p_name in", values, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotIn(List<String> values) {
			addCriterion("p_name not in", values, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameBetween(String value1, String value2) {
			addCriterion("p_name between", value1, value2, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotBetween(String value1, String value2) {
			addCriterion("p_name not between", value1, value2, "pName");
			return (Criteria) this;
		}

		public Criteria andSizeIsNull() {
			addCriterion("size is null");
			return (Criteria) this;
		}

		public Criteria andSizeIsNotNull() {
			addCriterion("size is not null");
			return (Criteria) this;
		}

		public Criteria andSizeEqualTo(Long value) {
			addCriterion("size =", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeNotEqualTo(Long value) {
			addCriterion("size <>", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeGreaterThan(Long value) {
			addCriterion("size >", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeGreaterThanOrEqualTo(Long value) {
			addCriterion("size >=", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeLessThan(Long value) {
			addCriterion("size <", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeLessThanOrEqualTo(Long value) {
			addCriterion("size <=", value, "size");
			return (Criteria) this;
		}

		public Criteria andSizeIn(List<Long> values) {
			addCriterion("size in", values, "size");
			return (Criteria) this;
		}

		public Criteria andSizeNotIn(List<Long> values) {
			addCriterion("size not in", values, "size");
			return (Criteria) this;
		}

		public Criteria andSizeBetween(Long value1, Long value2) {
			addCriterion("size between", value1, value2, "size");
			return (Criteria) this;
		}

		public Criteria andSizeNotBetween(Long value1, Long value2) {
			addCriterion("size not between", value1, value2, "size");
			return (Criteria) this;
		}

		public Criteria andRate20IsNull() {
			addCriterion("rate20 is null");
			return (Criteria) this;
		}

		public Criteria andRate20IsNotNull() {
			addCriterion("rate20 is not null");
			return (Criteria) this;
		}

		public Criteria andRate20EqualTo(Float value) {
			addCriterion("rate20 =", value, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20NotEqualTo(Float value) {
			addCriterion("rate20 <>", value, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20GreaterThan(Float value) {
			addCriterion("rate20 >", value, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20GreaterThanOrEqualTo(Float value) {
			addCriterion("rate20 >=", value, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20LessThan(Float value) {
			addCriterion("rate20 <", value, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20LessThanOrEqualTo(Float value) {
			addCriterion("rate20 <=", value, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20In(List<Float> values) {
			addCriterion("rate20 in", values, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20NotIn(List<Float> values) {
			addCriterion("rate20 not in", values, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20Between(Float value1, Float value2) {
			addCriterion("rate20 between", value1, value2, "rate20");
			return (Criteria) this;
		}

		public Criteria andRate20NotBetween(Float value1, Float value2) {
			addCriterion("rate20 not between", value1, value2, "rate20");
			return (Criteria) this;
		}

		public Criteria andPathIsNull() {
			addCriterion("path is null");
			return (Criteria) this;
		}

		public Criteria andPathIsNotNull() {
			addCriterion("path is not null");
			return (Criteria) this;
		}

		public Criteria andPathEqualTo(String value) {
			addCriterion("path =", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotEqualTo(String value) {
			addCriterion("path <>", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathGreaterThan(String value) {
			addCriterion("path >", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathGreaterThanOrEqualTo(String value) {
			addCriterion("path >=", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathLessThan(String value) {
			addCriterion("path <", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathLessThanOrEqualTo(String value) {
			addCriterion("path <=", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathLike(String value) {
			addCriterion("path like", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotLike(String value) {
			addCriterion("path not like", value, "path");
			return (Criteria) this;
		}

		public Criteria andPathIn(List<String> values) {
			addCriterion("path in", values, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotIn(List<String> values) {
			addCriterion("path not in", values, "path");
			return (Criteria) this;
		}

		public Criteria andPathBetween(String value1, String value2) {
			addCriterion("path between", value1, value2, "path");
			return (Criteria) this;
		}

		public Criteria andPathNotBetween(String value1, String value2) {
			addCriterion("path not between", value1, value2, "path");
			return (Criteria) this;
		}

		public Criteria andFileTypeIsNull() {
			addCriterion("file_type is null");
			return (Criteria) this;
		}

		public Criteria andFileTypeIsNotNull() {
			addCriterion("file_type is not null");
			return (Criteria) this;
		}

		public Criteria andFileTypeEqualTo(String value) {
			addCriterion("file_type =", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeNotEqualTo(String value) {
			addCriterion("file_type <>", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeGreaterThan(String value) {
			addCriterion("file_type >", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
			addCriterion("file_type >=", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeLessThan(String value) {
			addCriterion("file_type <", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeLessThanOrEqualTo(String value) {
			addCriterion("file_type <=", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeLike(String value) {
			addCriterion("file_type like", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeNotLike(String value) {
			addCriterion("file_type not like", value, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeIn(List<String> values) {
			addCriterion("file_type in", values, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeNotIn(List<String> values) {
			addCriterion("file_type not in", values, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeBetween(String value1, String value2) {
			addCriterion("file_type between", value1, value2, "fileType");
			return (Criteria) this;
		}

		public Criteria andFileTypeNotBetween(String value1, String value2) {
			addCriterion("file_type not between", value1, value2, "fileType");
			return (Criteria) this;
		}

		public Criteria andLenIsNull() {
			addCriterion("len is null");
			return (Criteria) this;
		}

		public Criteria andLenIsNotNull() {
			addCriterion("len is not null");
			return (Criteria) this;
		}

		public Criteria andLenEqualTo(Integer value) {
			addCriterion("len =", value, "len");
			return (Criteria) this;
		}

		public Criteria andLenNotEqualTo(Integer value) {
			addCriterion("len <>", value, "len");
			return (Criteria) this;
		}

		public Criteria andLenGreaterThan(Integer value) {
			addCriterion("len >", value, "len");
			return (Criteria) this;
		}

		public Criteria andLenGreaterThanOrEqualTo(Integer value) {
			addCriterion("len >=", value, "len");
			return (Criteria) this;
		}

		public Criteria andLenLessThan(Integer value) {
			addCriterion("len <", value, "len");
			return (Criteria) this;
		}

		public Criteria andLenLessThanOrEqualTo(Integer value) {
			addCriterion("len <=", value, "len");
			return (Criteria) this;
		}

		public Criteria andLenIn(List<Integer> values) {
			addCriterion("len in", values, "len");
			return (Criteria) this;
		}

		public Criteria andLenNotIn(List<Integer> values) {
			addCriterion("len not in", values, "len");
			return (Criteria) this;
		}

		public Criteria andLenBetween(Integer value1, Integer value2) {
			addCriterion("len between", value1, value2, "len");
			return (Criteria) this;
		}

		public Criteria andLenNotBetween(Integer value1, Integer value2) {
			addCriterion("len not between", value1, value2, "len");
			return (Criteria) this;
		}

		public Criteria andHIsNull() {
			addCriterion("h is null");
			return (Criteria) this;
		}

		public Criteria andHIsNotNull() {
			addCriterion("h is not null");
			return (Criteria) this;
		}

		public Criteria andHEqualTo(Integer value) {
			addCriterion("h =", value, "h");
			return (Criteria) this;
		}

		public Criteria andHNotEqualTo(Integer value) {
			addCriterion("h <>", value, "h");
			return (Criteria) this;
		}

		public Criteria andHGreaterThan(Integer value) {
			addCriterion("h >", value, "h");
			return (Criteria) this;
		}

		public Criteria andHGreaterThanOrEqualTo(Integer value) {
			addCriterion("h >=", value, "h");
			return (Criteria) this;
		}

		public Criteria andHLessThan(Integer value) {
			addCriterion("h <", value, "h");
			return (Criteria) this;
		}

		public Criteria andHLessThanOrEqualTo(Integer value) {
			addCriterion("h <=", value, "h");
			return (Criteria) this;
		}

		public Criteria andHIn(List<Integer> values) {
			addCriterion("h in", values, "h");
			return (Criteria) this;
		}

		public Criteria andHNotIn(List<Integer> values) {
			addCriterion("h not in", values, "h");
			return (Criteria) this;
		}

		public Criteria andHBetween(Integer value1, Integer value2) {
			addCriterion("h between", value1, value2, "h");
			return (Criteria) this;
		}

		public Criteria andHNotBetween(Integer value1, Integer value2) {
			addCriterion("h not between", value1, value2, "h");
			return (Criteria) this;
		}

		public Criteria andWIsNull() {
			addCriterion("w is null");
			return (Criteria) this;
		}

		public Criteria andWIsNotNull() {
			addCriterion("w is not null");
			return (Criteria) this;
		}

		public Criteria andWEqualTo(Integer value) {
			addCriterion("w =", value, "w");
			return (Criteria) this;
		}

		public Criteria andWNotEqualTo(Integer value) {
			addCriterion("w <>", value, "w");
			return (Criteria) this;
		}

		public Criteria andWGreaterThan(Integer value) {
			addCriterion("w >", value, "w");
			return (Criteria) this;
		}

		public Criteria andWGreaterThanOrEqualTo(Integer value) {
			addCriterion("w >=", value, "w");
			return (Criteria) this;
		}

		public Criteria andWLessThan(Integer value) {
			addCriterion("w <", value, "w");
			return (Criteria) this;
		}

		public Criteria andWLessThanOrEqualTo(Integer value) {
			addCriterion("w <=", value, "w");
			return (Criteria) this;
		}

		public Criteria andWIn(List<Integer> values) {
			addCriterion("w in", values, "w");
			return (Criteria) this;
		}

		public Criteria andWNotIn(List<Integer> values) {
			addCriterion("w not in", values, "w");
			return (Criteria) this;
		}

		public Criteria andWBetween(Integer value1, Integer value2) {
			addCriterion("w between", value1, value2, "w");
			return (Criteria) this;
		}

		public Criteria andWNotBetween(Integer value1, Integer value2) {
			addCriterion("w not between", value1, value2, "w");
			return (Criteria) this;
		}

		public Criteria andFpsIsNull() {
			addCriterion("fps is null");
			return (Criteria) this;
		}

		public Criteria andFpsIsNotNull() {
			addCriterion("fps is not null");
			return (Criteria) this;
		}

		public Criteria andFpsEqualTo(Float value) {
			addCriterion("fps =", value, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsNotEqualTo(Float value) {
			addCriterion("fps <>", value, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsGreaterThan(Float value) {
			addCriterion("fps >", value, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsGreaterThanOrEqualTo(Float value) {
			addCriterion("fps >=", value, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsLessThan(Float value) {
			addCriterion("fps <", value, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsLessThanOrEqualTo(Float value) {
			addCriterion("fps <=", value, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsIn(List<Float> values) {
			addCriterion("fps in", values, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsNotIn(List<Float> values) {
			addCriterion("fps not in", values, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsBetween(Float value1, Float value2) {
			addCriterion("fps between", value1, value2, "fps");
			return (Criteria) this;
		}

		public Criteria andFpsNotBetween(Float value1, Float value2) {
			addCriterion("fps not between", value1, value2, "fps");
			return (Criteria) this;
		}

		public Criteria andFileNameIsNull() {
			addCriterion("file_name is null");
			return (Criteria) this;
		}

		public Criteria andFileNameIsNotNull() {
			addCriterion("file_name is not null");
			return (Criteria) this;
		}

		public Criteria andFileNameEqualTo(String value) {
			addCriterion("file_name =", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameNotEqualTo(String value) {
			addCriterion("file_name <>", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameGreaterThan(String value) {
			addCriterion("file_name >", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameGreaterThanOrEqualTo(String value) {
			addCriterion("file_name >=", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameLessThan(String value) {
			addCriterion("file_name <", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameLessThanOrEqualTo(String value) {
			addCriterion("file_name <=", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameLike(String value) {
			addCriterion("file_name like", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameNotLike(String value) {
			addCriterion("file_name not like", value, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameIn(List<String> values) {
			addCriterion("file_name in", values, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameNotIn(List<String> values) {
			addCriterion("file_name not in", values, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameBetween(String value1, String value2) {
			addCriterion("file_name between", value1, value2, "fileName");
			return (Criteria) this;
		}

		public Criteria andFileNameNotBetween(String value1, String value2) {
			addCriterion("file_name not between", value1, value2, "fileName");
			return (Criteria) this;
		}

		public Criteria andTargetNameIsNull() {
			addCriterion("target_name is null");
			return (Criteria) this;
		}

		public Criteria andTargetNameIsNotNull() {
			addCriterion("target_name is not null");
			return (Criteria) this;
		}

		public Criteria andTargetNameEqualTo(String value) {
			addCriterion("target_name =", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameNotEqualTo(String value) {
			addCriterion("target_name <>", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameGreaterThan(String value) {
			addCriterion("target_name >", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameGreaterThanOrEqualTo(String value) {
			addCriterion("target_name >=", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameLessThan(String value) {
			addCriterion("target_name <", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameLessThanOrEqualTo(String value) {
			addCriterion("target_name <=", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameLike(String value) {
			addCriterion("target_name like", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameNotLike(String value) {
			addCriterion("target_name not like", value, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameIn(List<String> values) {
			addCriterion("target_name in", values, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameNotIn(List<String> values) {
			addCriterion("target_name not in", values, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameBetween(String value1, String value2) {
			addCriterion("target_name between", value1, value2, "targetName");
			return (Criteria) this;
		}

		public Criteria andTargetNameNotBetween(String value1, String value2) {
			addCriterion("target_name not between", value1, value2, "targetName");
			return (Criteria) this;
		}

		public Criteria andSubGroupIsNull() {
			addCriterion("sub_group is null");
			return (Criteria) this;
		}

		public Criteria andSubGroupIsNotNull() {
			addCriterion("sub_group is not null");
			return (Criteria) this;
		}

		public Criteria andSubGroupEqualTo(String value) {
			addCriterion("sub_group =", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupNotEqualTo(String value) {
			addCriterion("sub_group <>", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupGreaterThan(String value) {
			addCriterion("sub_group >", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupGreaterThanOrEqualTo(String value) {
			addCriterion("sub_group >=", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupLessThan(String value) {
			addCriterion("sub_group <", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupLessThanOrEqualTo(String value) {
			addCriterion("sub_group <=", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupLike(String value) {
			addCriterion("sub_group like", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupNotLike(String value) {
			addCriterion("sub_group not like", value, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupIn(List<String> values) {
			addCriterion("sub_group in", values, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupNotIn(List<String> values) {
			addCriterion("sub_group not in", values, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupBetween(String value1, String value2) {
			addCriterion("sub_group between", value1, value2, "subGroup");
			return (Criteria) this;
		}

		public Criteria andSubGroupNotBetween(String value1, String value2) {
			addCriterion("sub_group not between", value1, value2, "subGroup");
			return (Criteria) this;
		}

		public Criteria andMd5IsNull() {
			addCriterion("md5 is null");
			return (Criteria) this;
		}

		public Criteria andMd5IsNotNull() {
			addCriterion("md5 is not null");
			return (Criteria) this;
		}

		public Criteria andMd5EqualTo(String value) {
			addCriterion("md5 =", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotEqualTo(String value) {
			addCriterion("md5 <>", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5GreaterThan(String value) {
			addCriterion("md5 >", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5GreaterThanOrEqualTo(String value) {
			addCriterion("md5 >=", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5LessThan(String value) {
			addCriterion("md5 <", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5LessThanOrEqualTo(String value) {
			addCriterion("md5 <=", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5Like(String value) {
			addCriterion("md5 like", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotLike(String value) {
			addCriterion("md5 not like", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5In(List<String> values) {
			addCriterion("md5 in", values, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotIn(List<String> values) {
			addCriterion("md5 not in", values, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5Between(String value1, String value2) {
			addCriterion("md5 between", value1, value2, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotBetween(String value1, String value2) {
			addCriterion("md5 not between", value1, value2, "md5");
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
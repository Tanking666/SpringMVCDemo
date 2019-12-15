package com.springmvcdemo.pojo;

public class Video {
	private String id;

	private String name;

	private String pName;

	private Long size;

	private Float rate20;

	private String path;

	private String fileType;

	private Integer len;

	private Integer h;

	private Integer w;

	private Float fps;

	private String fileName;

	private String targetName;

	private String subGroup;

	private String md5;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName == null ? null : pName.trim();
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Float getRate20() {
		return rate20;
	}

	public void setRate20(Float rate20) {
		this.rate20 = rate20;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path == null ? null : path.trim();
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType == null ? null : fileType.trim();
	}

	public Integer getLen() {
		return len;
	}

	public void setLen(Integer len) {
		this.len = len;
	}

	public Integer getH() {
		return h;
	}

	public void setH(Integer h) {
		this.h = h;
	}

	public Integer getW() {
		return w;
	}

	public void setW(Integer w) {
		this.w = w;
	}

	public Float getFps() {
		return fps;
	}

	public void setFps(Float fps) {
		this.fps = fps;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName == null ? null : fileName.trim();
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName == null ? null : targetName.trim();
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup == null ? null : subGroup.trim();
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5 == null ? null : md5.trim();
	}
}
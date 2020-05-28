
package com.wip.model;

import java.io.Serializable;

/**
 * 项目表(友链，分类，标签)
 */
public class MetaDomain implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 项目主键
     */
    private Integer mid;
    /**
     * 名称
     */
    private String name;

    /**
     * 项目缩略名(比如是友链的话slug就是友链的URL)
     */
    private String slug;

    /**
     * 项目类型
     */
    private String type;

    /**
     * 对应的文章类型（废弃）
     */
    private String contentType;

    /**
     * 选项描述（友链---图片LOGO连接）
     */
    private String description;

    /**
     * 项目排序(友链需要)
     */
    private Integer sort;

    private Integer parent;//(废弃)

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }
}

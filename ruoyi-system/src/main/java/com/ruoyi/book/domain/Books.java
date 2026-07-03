package com.ruoyi.book.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 图书信息对象 books
 * 
 * @author cjy
 * @date 2026-07-03
 */
public class Books extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 图书ID */
    private Long bookId;

    /** ISBN编号 */
    @Excel(name = "ISBN编号")
    private String isbn;

    /** 图书名称 */
    @Excel(name = "图书名称")
    private String bookName;

    /** 作者 */
    @Excel(name = "作者")
    private String author;

    /** 出版社ID */
    @Excel(name = "出版社ID")
    private Long publisherId;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long categoryId;

    /** 出版日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出版日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishDate;

    /** 图书价格 */
    @Excel(name = "图书价格")
    private BigDecimal price;

    /** 图书总数量 */
    @Excel(name = "图书总数量")
    private Long totalNum;

    /** 剩余可借数量 */
    @Excel(name = "剩余可借数量")
    private Long remainNum;

    /** 馆藏位置 */
    @Excel(name = "馆藏位置")
    private String location;

    public void setBookId(Long bookId) 
    {
        this.bookId = bookId;
    }

    public Long getBookId() 
    {
        return bookId;
    }

    public void setIsbn(String isbn) 
    {
        this.isbn = isbn;
    }

    public String getIsbn() 
    {
        return isbn;
    }

    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public String getBookName() 
    {
        return bookName;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setPublisherId(Long publisherId) 
    {
        this.publisherId = publisherId;
    }

    public Long getPublisherId() 
    {
        return publisherId;
    }

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setPublishDate(Date publishDate) 
    {
        this.publishDate = publishDate;
    }

    public Date getPublishDate() 
    {
        return publishDate;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    public void setTotalNum(Long totalNum) 
    {
        this.totalNum = totalNum;
    }

    public Long getTotalNum() 
    {
        return totalNum;
    }

    public void setRemainNum(Long remainNum) 
    {
        this.remainNum = remainNum;
    }

    public Long getRemainNum() 
    {
        return remainNum;
    }

    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bookId", getBookId())
            .append("isbn", getIsbn())
            .append("bookName", getBookName())
            .append("author", getAuthor())
            .append("publisherId", getPublisherId())
            .append("categoryId", getCategoryId())
            .append("publishDate", getPublishDate())
            .append("price", getPrice())
            .append("totalNum", getTotalNum())
            .append("remainNum", getRemainNum())
            .append("location", getLocation())
            .toString();
    }
}

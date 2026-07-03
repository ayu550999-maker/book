package com.ruoyi.book.service;

import java.util.List;
import com.ruoyi.book.domain.Books;

/**
 * 图书信息Service接口
 * 
 * @author cjy
 * @date 2026-07-03
 */
public interface IBooksService 
{
    /**
     * 查询图书信息
     * 
     * @param bookId 图书信息主键
     * @return 图书信息
     */
    public Books selectBooksByBookId(Long bookId);

    /**
     * 查询图书信息列表
     * 
     * @param books 图书信息
     * @return 图书信息集合
     */
    public List<Books> selectBooksList(Books books);

    /**
     * 新增图书信息
     * 
     * @param books 图书信息
     * @return 结果
     */
    public int insertBooks(Books books);

    /**
     * 修改图书信息
     * 
     * @param books 图书信息
     * @return 结果
     */
    public int updateBooks(Books books);

    /**
     * 批量删除图书信息
     * 
     * @param bookIds 需要删除的图书信息主键集合
     * @return 结果
     */
    public int deleteBooksByBookIds(Long[] bookIds);

    /**
     * 删除图书信息信息
     * 
     * @param bookId 图书信息主键
     * @return 结果
     */
    public int deleteBooksByBookId(Long bookId);
}

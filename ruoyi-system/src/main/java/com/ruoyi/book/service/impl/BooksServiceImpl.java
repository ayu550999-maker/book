package com.ruoyi.book.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.book.mapper.BooksMapper;
import com.ruoyi.book.domain.Books;
import com.ruoyi.book.service.IBooksService;

/**
 * 图书信息Service业务层处理
 * 
 * @author cjy
 * @date 2026-07-03
 */
@Service
public class BooksServiceImpl implements IBooksService 
{
    @Autowired
    private BooksMapper booksMapper;

    /**
     * 查询图书信息
     * 
     * @param bookId 图书信息主键
     * @return 图书信息
     */
    @Override
    public Books selectBooksByBookId(Long bookId)
    {
        return booksMapper.selectBooksByBookId(bookId);
    }

    /**
     * 查询图书信息列表
     * 
     * @param books 图书信息
     * @return 图书信息
     */
    @Override
    public List<Books> selectBooksList(Books books)
    {
        return booksMapper.selectBooksList(books);
    }

    /**
     * 新增图书信息
     * 
     * @param books 图书信息
     * @return 结果
     */
    @Override
    public int insertBooks(Books books)
    {
        return booksMapper.insertBooks(books);
    }

    /**
     * 修改图书信息
     * 
     * @param books 图书信息
     * @return 结果
     */
    @Override
    public int updateBooks(Books books)
    {
        return booksMapper.updateBooks(books);
    }

    /**
     * 批量删除图书信息
     * 
     * @param bookIds 需要删除的图书信息主键
     * @return 结果
     */
    @Override
    public int deleteBooksByBookIds(Long[] bookIds)
    {
        return booksMapper.deleteBooksByBookIds(bookIds);
    }

    /**
     * 删除图书信息信息
     * 
     * @param bookId 图书信息主键
     * @return 结果
     */
    @Override
    public int deleteBooksByBookId(Long bookId)
    {
        return booksMapper.deleteBooksByBookId(bookId);
    }
}

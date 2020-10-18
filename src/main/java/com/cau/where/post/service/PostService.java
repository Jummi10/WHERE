package com.cau.where.post.service;

import com.cau.where.post.dao.PostDao;
import com.cau.where.post.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostDao postDao;

    public PostVO getPost(int id) {
        return postDao.getPost(id);
    }
}

package com.cau.where.post.dao;

import com.cau.where.post.vo.PostVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PostDao {

    @Autowired
    @Qualifier("sqlSessionTemplate")
    protected SqlSession sqlSession;

    public PostVO getPost(int id) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);

        // statement : post.xml의 namespace.example(select문)에
        // controller에서 받아온 id를 넣어준 param(map)을 넣어준다.
        return this.sqlSession.selectOne("post.example", param);
    }
}

package com.cau.where.post.controller;

import com.cau.where.post.service.PostService;
import com.cau.where.post.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class PostController {

    @Autowired
    private PostService postService;

    // localhost:8080/test/test
    @RequestMapping(value = "/test")
    public PostVO test() {
        return new PostVO(1, "kkkk", "jjjj");
    }

    // localhost:8080/test/example/1
    @RequestMapping(value = "/example/{id}")
    public PostVO getPost(@PathVariable(name = "id", required = true) int id) {
        return postService.getPost(id);
    }
}

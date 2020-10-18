package com.cau.where.post.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostVO {
    private int id;
    private String statusMsg;
    private String testName;
    // db 속성들
}

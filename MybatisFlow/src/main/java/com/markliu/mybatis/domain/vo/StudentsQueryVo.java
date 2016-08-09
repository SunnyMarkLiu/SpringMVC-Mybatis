package com.markliu.mybatis.domain.vo;

import com.markliu.mybatis.domain.po.custom.StudentsCustom;

/**
 * Students 复杂查询的包装类，封装其他查询条件
 * Author: markliu
 * Time  : 16-8-9 下午3:36
 */
public class StudentsQueryVo {

    private StudentsCustom studentsCustom;

    public StudentsCustom getStudentsCustom() {
        return studentsCustom;
    }

    public void setStudentsCustom(StudentsCustom studentsCustom) {
        this.studentsCustom = studentsCustom;
    }
}

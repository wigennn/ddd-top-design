package org.example.model.aggregate;

import org.example.domain.model.valueobject.DemoVO;
import org.example.model.entity.DemoEntity;

import java.util.Date;

/**
 * 聚合根
 * @author wangweiqing
 * @version 2022/7/22
 */
public class DemoAGG {

    private Long f1;
    private String f2;
    private Date f3;

    /**
     * 实体
     */
    private DemoEntity entity;
    /**
     * 值对象
     */
    private DemoVO valueObj;

}

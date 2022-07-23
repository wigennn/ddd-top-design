package org.example.adapter;

/**
 * @author wangweiqing
 * @version 2022/7/22
 */
public interface Adapter<S, T> {

    /**
     * 领域对象 转 基础设施对象
     */
    T toTarget(S s);

    /**
     * 基础设施对象 转 领域对象
     */
    S toSource(T t);
}

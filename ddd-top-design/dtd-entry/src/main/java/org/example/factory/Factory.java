package org.example.factory;

/**
 * 创建领域对象工厂
 * 入口转领域对象
 * 领域对象转出口
 *
 * @author wangweiqing
 * @version 2022/7/22
 */
public interface Factory<ENTRY, DOMAIN, EXIT> {

    DOMAIN toDomain(ENTRY entry);

    EXIT toExit(DOMAIN domain);
}

package com.springcloud.dao;

import com.springcloud.entity.Class2;
import java.util.List;

public interface Class2Mapper {
    int deleteByPrimaryKey(Integer class2Id);

    int insert(Class2 record);

    Class2 selectByPrimaryKey(Integer class2Id);

    List<Class2> selectAll();

    int updateByPrimaryKey(Class2 record);
    
    /**
                * ��ѯCLASS2����ָ��CLASS_1_ID�Ķ��������Ϣ
     * 
     * @param Class1Id   һ�������
     * @return  �ɹ�����java,util.List���͵�ʵ�������򷵻�null
     */
    public abstract List<Class2> selectByClass1Id(Integer Class1Id);
}
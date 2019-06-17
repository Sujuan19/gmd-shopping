package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS1表对应的实体类，用于保存表中一行二级类别信息
 * 
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 {
	/**
	 * 一级类别编号
	 */
    private Integer class1Id;

    /**
	 * 一级类别名称
	 */
    private String class1Name;

    /**
	 * 序号
	 */
    private Integer class1Num;

    private String remark;

   
}
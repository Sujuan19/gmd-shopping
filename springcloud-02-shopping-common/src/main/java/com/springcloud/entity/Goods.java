package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * ��Ʒ���
	 */
    private Integer goodsId;
    
    /**
	 * ��Ʒ����
	 */
    private String goodsName;
    
    /**
	 * ��Ʒ�۸�
	 */
    private Double goodsPrices;
    
    /**
	 * ��Ʒ�ۿۼ�
	 */
    private Double goodsDiscount;
    
    /**
	 * ��Ʒ״̬��0Ϊ�ϼ�   1Ϊ�¼�
	 */
    private Integer goodsStatus;
    
    /**
	 * ��Ʒ����
	 */
    private Integer goodsCount;

    /**
	 * �Ƿ���Ʒ  0Ϊ��Ʒ  1Ϊ����Ʒ
	 */
    private Integer goodsIsNew;
    
    /**
	 * �Ƿ�����  0Ϊ����  1Ϊ������
	 */
    private Integer goodsIsHot;

    /**
	 * ��Ʒ�ȼ�  0Ϊ1��   1Ϊ2��  2Ϊ3��   3Ϊ4��  4Ϊ5��
	 */
    private Integer goodsLevel;

    /**
	 * ��Ʒ���
	 */
    private String goodsBrief;

    /**
	 * ��Ʒ����
	 */
    private String goodsDetails;

    /**
	 * ��ƷͼƬ
	 */
    private String goodsPhoto;

    /**
	 * ���2���
	 */
    private Integer class2Id;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
    private Double goodsPriceMin;

    /**
    * ��ѯ��������Ʒ�۸�����
    */
    private Double goodsPriceMax;
    
    /**
     * ��Ʒ���ۣ����ڱ���ͳ�Ʒ���Ľ��
     */
    private Integer class1Id;
    
    /**
     * ��ѯ������һ�������
     */
    private Integer goodsSum;
}
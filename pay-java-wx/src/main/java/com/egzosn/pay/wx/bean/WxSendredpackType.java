package com.egzosn.pay.wx.bean;

import com.egzosn.pay.common.bean.TransferType;

/**
 * @description: 红包交易类型
 * @author: faymanwang
 * @time: 2020/5/14 20:11
 */
public enum WxSendredpackType  implements TransferType {
    /**
     * 现金红包-发放红包接口
     */
    SENDREDPACK("mmpaymkttransfers/sendredpack"),
    /**
     * 现金红包-发放裂变红包
     */
    SENDGROUPREDPACK("mmpaymkttransfers/sendgroupredpack"),
    /**
     * 现金红包-查询红包记录
     */
    GETHBINFO ("mmpaymkttransfers/gethbinfo"),
    /**
     * 小程序
     */
    SENDMINIPROGRAMHB ("mmpaymkttransfers/sendminiprogramhb")

    ;

    WxSendredpackType(String method) {
        this.method = method;
    }
    private String method;

    @Override
    public String getType() {
        return this.name();
    }
    @Override
    public String getMethod() {
        return this.method;
    }
}

package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeContactFeatureCenterBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenterBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenterBase) obj;
    }

    public java.lang.String[] getContactByUsername(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.javaObjToJniOptional(this.stub.getContactByUsername(str));
    }
}

package com.tencent.wechat.aff.cara;

/* loaded from: classes12.dex */
public class CaraAndroidSoBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraAndroidSoBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraAndroidSoBase) obj;
    }

    public java.lang.String getSoPath() {
        return com.tencent.wechat.zidl2.ZidlUtil.stringJavaToJniOptional(this.stub.getSoPath());
    }
}

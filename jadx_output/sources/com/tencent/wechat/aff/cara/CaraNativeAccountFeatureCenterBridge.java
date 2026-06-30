package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeAccountFeatureCenterBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeAccountFeatureCenterBase) obj;
    }

    public byte[] discoverTab() {
        return this.stub.discoverTab().toByteArray();
    }

    public int gender() {
        return this.stub.gender().getNumber();
    }

    public boolean isRegisteredInChina() {
        return this.stub.isRegisteredInChina();
    }

    public int momentPrivacy() {
        return this.stub.momentPrivacy().getNumber();
    }
}

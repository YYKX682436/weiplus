package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeLiveFeatureCenterBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenterBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeLiveFeatureCenterBase) obj;
    }

    public int currentNetworkQuality() {
        return this.stub.currentNetworkQuality().getNumber();
    }
}

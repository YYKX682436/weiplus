package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeFinderFeatureCenterBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenterBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeFinderFeatureCenterBase) obj;
    }

    public int authIconType() {
        return this.stub.authIconType().getNumber();
    }

    public int fansCount() {
        return this.stub.fansCount();
    }

    public boolean hasFinderAccount() {
        return this.stub.hasFinderAccount();
    }

    public boolean isRealName() {
        return this.stub.isRealName();
    }

    public int postFeedCount() {
        return this.stub.postFeedCount();
    }

    public boolean wxPayAuthorization() {
        return this.stub.wxPayAuthorization();
    }
}

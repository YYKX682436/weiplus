package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeLiveCellProphetContextBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase stub;

    public CaraNativeLiveCellProphetContextBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeLiveCellProphetContextBase) obj;
    }

    public boolean isHomePageLoaded() {
        return this.stub.isHomePageLoaded();
    }

    public boolean isInHomePage() {
        return this.stub.isInHomePage();
    }

    public float predictProbThreshold() {
        return this.stub.predictProbThreshold();
    }
}

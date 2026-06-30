package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeLiveReddotProphetContextBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContextBase stub;

    public CaraNativeLiveReddotProphetContextBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeLiveReddotProphetContextBase) obj;
    }

    public java.lang.String anchor() {
        return this.stub.anchor();
    }

    public int enterAction() {
        return this.stub.enterAction();
    }

    public boolean isHomePageLoaded() {
        return this.stub.isHomePageLoaded();
    }

    public boolean isReddotScoreValid() {
        return this.stub.isReddotScoreValid();
    }

    public float predictProbThreshold() {
        return this.stub.predictProbThreshold();
    }

    public int preloadControlFlag() {
        return this.stub.preloadControlFlag();
    }

    public float reddotScore() {
        return this.stub.reddotScore();
    }
}

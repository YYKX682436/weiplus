package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeJoinLiveQualityProphetContextBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContextBase stub;

    public CaraNativeJoinLiveQualityProphetContextBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeJoinLiveQualityProphetContextBase) obj;
    }

    public java.lang.String liveID() {
        return this.stub.liveID();
    }

    public int networkQuality() {
        return this.stub.networkQuality().getNumber();
    }

    public int scene() {
        return this.stub.scene();
    }

    public int videoQuality() {
        return this.stub.videoQuality().getNumber();
    }
}

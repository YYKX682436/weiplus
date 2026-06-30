package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeConsumeSessionBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeConsumeSessionBase stub;

    public CaraNativeConsumeSessionBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeConsumeSessionBase) obj;
    }

    public float stayTimeInterval() {
        return this.stub.stayTimeInterval();
    }

    public java.lang.String username() {
        return this.stub.username();
    }
}

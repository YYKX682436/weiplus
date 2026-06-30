package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraUserContextBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraUserContextBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraUserContextBase) obj;
    }

    public void pop() {
        this.stub.pop();
    }

    public void push() {
        this.stub.push();
    }
}

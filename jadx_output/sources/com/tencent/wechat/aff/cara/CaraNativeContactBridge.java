package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeContactBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeContactBase stub;

    public CaraNativeContactBridge(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeContactBase) obj;
    }

    public java.lang.String getDisplayName() {
        return this.stub.getDisplayName();
    }

    public boolean isGroup() {
        return this.stub.isGroup();
    }

    public boolean isMinimized() {
        return this.stub.isMinimized();
    }

    public boolean isMute() {
        return this.stub.isMute();
    }

    public boolean isOpenIM() {
        return this.stub.isOpenIM();
    }

    public boolean isPrivate() {
        return this.stub.isPrivate();
    }

    public boolean isSessionStickyOnTop() {
        return this.stub.isSessionStickyOnTop();
    }

    public java.lang.String username() {
        return this.stub.username();
    }
}

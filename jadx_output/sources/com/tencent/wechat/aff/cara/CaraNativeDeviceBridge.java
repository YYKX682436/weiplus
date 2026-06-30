package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public class CaraNativeDeviceBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeDeviceBase stub;

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeDeviceBase) obj;
    }

    public float battery() {
        return this.stub.battery();
    }

    public int brand() {
        return this.stub.brand().getNumber();
    }

    public boolean isCharging() {
        return this.stub.isCharging();
    }

    public boolean isReachable() {
        return this.stub.isReachable();
    }

    public int networkType() {
        return this.stub.networkType().getNumber();
    }

    public byte[] screenSize() {
        return this.stub.screenSize().toByteArray();
    }
}

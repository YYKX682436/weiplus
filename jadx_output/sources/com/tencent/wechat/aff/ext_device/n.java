package com.tencent.wechat.aff.ext_device;

/* loaded from: classes6.dex */
public enum n implements com.tencent.mm.protobuf.h {
    ExtDeviceSync_Unknow(-1),
    ExtDeviceSync_Idle(0),
    ExtDeviceSync_Syncing(1),
    ExtDeviceSync_Success(2),
    ExtDeviceSync_Failed(3),
    ExtDeviceSync_OverTime(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f216710d;

    n(int i17) {
        this.f216710d = i17;
    }

    public static com.tencent.wechat.aff.ext_device.n a(int i17) {
        if (i17 == -1) {
            return ExtDeviceSync_Unknow;
        }
        if (i17 == 0) {
            return ExtDeviceSync_Idle;
        }
        if (i17 == 1) {
            return ExtDeviceSync_Syncing;
        }
        if (i17 == 2) {
            return ExtDeviceSync_Success;
        }
        if (i17 == 3) {
            return ExtDeviceSync_Failed;
        }
        if (i17 != 4) {
            return null;
        }
        return ExtDeviceSync_OverTime;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216710d;
    }
}

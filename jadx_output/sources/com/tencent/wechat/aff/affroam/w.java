package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public enum w implements com.tencent.mm.protobuf.h {
    AFFROAM_DEVICE_TYPE_UNKNOWN(0),
    AFFROAM_DEVICE_TYPE_NAS(1),
    AFFROAM_DEVICE_TYPE_ICLOUD(2),
    AFFROAM_DEVICE_TYPE_WINDOWS(3),
    AFFROAM_DEVICE_TYPE_MAC(4),
    AFFROAM_DEVICE_TYPE_PORTABLE_DISK(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f216005d;

    w(int i17) {
        this.f216005d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216005d;
    }
}

package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes5.dex */
public enum c implements com.tencent.mm.protobuf.h {
    kStreamChannelModeDual(0),
    kStreamChannelModeQuic(1),
    kStreamChannelModeWSS(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f217253d;

    c(int i17) {
        this.f217253d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217253d;
    }
}

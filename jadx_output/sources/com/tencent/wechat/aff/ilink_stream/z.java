package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes5.dex */
public enum z implements com.tencent.mm.protobuf.h {
    kTransferStrategyDefaultMode(0),
    kTransferStrategySpeedMode(1),
    kTransferStrategyTrafficMode(2),
    kTransferStrategyFullSpeedMode(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f217353d;

    z(int i17) {
        this.f217353d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217353d;
    }
}

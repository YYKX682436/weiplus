package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes6.dex */
public enum y implements com.tencent.mm.protobuf.h {
    kTransferModeUnknown(0),
    kTransferModeWSS(1),
    kTransferModeQuic(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f217347d;

    y(int i17) {
        this.f217347d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217347d;
    }
}

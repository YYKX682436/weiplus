package com.tencent.wechat.aff.otel;

/* loaded from: classes6.dex */
public enum g implements com.tencent.mm.protobuf.h {
    kStatusUnset(0),
    kStatusOk(1),
    kStatusError(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f217442d;

    g(int i17) {
        this.f217442d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217442d;
    }
}

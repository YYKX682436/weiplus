package com.tencent.wechat.aff.otel;

/* loaded from: classes6.dex */
public enum e implements com.tencent.mm.protobuf.h {
    kSpanKindClient(0),
    kSpanKindServer(1),
    kSpanKindProducer(2),
    kSpanKindConsumer(3),
    kSpanKindInternal(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f217433d;

    e(int i17) {
        this.f217433d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217433d;
    }
}

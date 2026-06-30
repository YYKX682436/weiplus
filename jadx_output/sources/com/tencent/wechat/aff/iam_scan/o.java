package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes8.dex */
public enum o implements com.tencent.mm.protobuf.h {
    GOODS_STATUS_NOT_HANDLED(1),
    GOODS_STATUS_PROCESSING(2),
    GOODS_STATUS_SUCCESS(3),
    GOODS_STATUS_FAILED(4),
    GOODS_STATUS_INIT_FAILED(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f217113d;

    o(int i17) {
        this.f217113d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217113d;
    }
}

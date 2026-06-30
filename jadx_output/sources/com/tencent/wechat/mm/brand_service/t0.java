package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public enum t0 implements com.tencent.mm.protobuf.h {
    TAB_TYPE_NONE(0),
    TAB_TYPE_FOLLOW(1),
    TAB_TYPE_RECOMMEND(2),
    TAB_TYPE_MACHINE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f219191d;

    t0(int i17) {
        this.f219191d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f219191d;
    }
}

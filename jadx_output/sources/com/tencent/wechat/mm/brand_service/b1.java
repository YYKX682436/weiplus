package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public enum b1 implements com.tencent.mm.protobuf.h {
    FinderShowType_DEFAULT(0),
    FinderShowType_FINDER_NORMAL(1),
    FinderShowType_FINDER_RECOMMEND_HORIZON(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f218856d;

    b1(int i17) {
        this.f218856d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f218856d;
    }
}

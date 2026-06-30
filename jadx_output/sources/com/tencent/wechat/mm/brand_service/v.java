package com.tencent.wechat.mm.brand_service;

/* loaded from: classes6.dex */
public enum v implements com.tencent.mm.protobuf.h {
    BizShowReddotType_ShowUnReadNum(1),
    BizShowReddotType_ShowUnReadAsRedDot(2),
    BizShowReddotType_NotShowRedDot(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f219202d;

    v(int i17) {
        this.f219202d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f219202d;
    }
}

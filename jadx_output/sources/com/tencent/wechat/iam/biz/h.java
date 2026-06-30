package com.tencent.wechat.iam.biz;

/* loaded from: classes6.dex */
public enum h implements com.tencent.mm.protobuf.h {
    CURRENT_INTERACTIVE_IDENTITY_WX(0),
    CURRENT_INTERACTIVE_IDENTITY_BRAND(1),
    CURRENT_INTERACTIVE_IDENTITY_PHOTO(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f217748d;

    h(int i17) {
        this.f217748d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217748d;
    }
}

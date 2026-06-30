package com.tencent.wechat.mm.biz;

/* loaded from: classes6.dex */
public enum b5 implements com.tencent.mm.protobuf.h {
    PUBLISH_BIZ_TYPE_DEFAULT(0),
    PUBLISH_BIZ_TYPE_SUBSCRIBE(1),
    PUBLISH_BIZ_TYPE_PHOTO(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f217927d;

    b5(int i17) {
        this.f217927d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217927d;
    }
}

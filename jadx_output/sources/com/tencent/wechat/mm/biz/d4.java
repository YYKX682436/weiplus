package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public enum d4 implements com.tencent.mm.protobuf.h {
    TAB_TYPE_NONE(0),
    TAB_TYPE_FOLLOW(1),
    TAB_TYPE_RECOMMEND(2),
    TAB_TYPE_MACHINE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f217979d;

    d4(int i17) {
        this.f217979d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217979d;
    }
}

package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public enum w2 implements com.tencent.mm.protobuf.h {
    BOX_TAB_TYPE_NONE(0),
    BOX_TAB_TYPE_FOLLOW(1),
    BOX_TAB_TYPE_RECOMMEND(2),
    BOX_TAB_TYPE_MACHINE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f219928d;

    w2(int i17) {
        this.f219928d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f219928d;
    }
}

package com.tencent.wechat.mm.finder_box;

/* loaded from: classes6.dex */
public enum s0 implements com.tencent.mm.protobuf.h {
    BoxModeHide(0),
    BoxModeLiveEnd(1),
    BoxModeLiving(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f219796d;

    s0(int i17) {
        this.f219796d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f219796d;
    }
}

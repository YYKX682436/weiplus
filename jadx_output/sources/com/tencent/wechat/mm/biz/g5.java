package com.tencent.wechat.mm.biz;

/* loaded from: classes6.dex */
public enum g5 implements com.tencent.mm.protobuf.h {
    kDefault(0),
    kOpen(1),
    kClose(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f218092d;

    g5(int i17) {
        this.f218092d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f218092d;
    }
}

package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public enum b0 implements com.tencent.mm.protobuf.h {
    Common(0),
    Audio(1),
    Visual(2),
    Matrix(3),
    Wxconf(4),
    Systemauth(5),
    Notification(6),
    App(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f177327d;

    b0(int i17) {
        this.f177327d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177327d;
    }
}

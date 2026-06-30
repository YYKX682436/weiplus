package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public enum p2 implements com.tencent.mm.protobuf.h {
    TYPE_TEXT(0),
    TYPE_WEBPAGE(1),
    TYPE_IMAGE(2),
    TYPE_FINDER(3),
    TYPE_TODO(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f216426d;

    p2(int i17) {
        this.f216426d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216426d;
    }
}

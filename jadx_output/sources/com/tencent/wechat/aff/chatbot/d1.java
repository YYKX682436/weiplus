package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public enum d1 implements com.tencent.mm.protobuf.h {
    MSG_TYPE_INVALID(0),
    MSG_TYPE_DATA(1),
    MSG_TYPE_START(2),
    MSG_TYPE_EOF(3),
    MSG_TYPE_ERROR(99);


    /* renamed from: d, reason: collision with root package name */
    public final int f216151d;

    d1(int i17) {
        this.f216151d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216151d;
    }
}

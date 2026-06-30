package com.tencent.wechat.aff.chatbot;

/* loaded from: classes6.dex */
public enum a3 implements com.tencent.mm.protobuf.h {
    FINISH_REASON_UNSPECIFIED(0),
    FINISH_REASON_COMPLETED(1),
    FINISH_REASON_INTERRUPTED(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f216080d;

    a3(int i17) {
        this.f216080d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216080d;
    }
}

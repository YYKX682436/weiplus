package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public enum c0 implements com.tencent.mm.protobuf.h {
    UNKnown(0),
    Audio(1),
    Multi(2),
    MultiChatBot(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f216107d;

    c0(int i17) {
        this.f216107d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216107d;
    }
}

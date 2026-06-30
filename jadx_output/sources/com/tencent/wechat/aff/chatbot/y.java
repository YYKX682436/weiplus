package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public enum y implements com.tencent.mm.protobuf.h {
    ChatBotPrologueMsgType_UNSPECIFIED(0),
    ChatBotPrologueMsgType_ALERT(1),
    ChatBotPrologueMsgType_FRIEND_CHAT(2),
    ChatBotPrologueMsgType_CHAT_HISTORY_THINK(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f216553d;

    y(int i17) {
        this.f216553d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216553d;
    }
}

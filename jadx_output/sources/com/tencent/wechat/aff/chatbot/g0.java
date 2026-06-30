package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public enum g0 implements com.tencent.mm.protobuf.h {
    ChatbotBizType_Unknown(0),
    ChatbotBizType_AIAssist(1),
    ChatbotBizType_AISocial(2),
    ChatbotBizType_AIWeapp(3),
    ChatbotBizType_AIPodcast(4),
    ChatbotBizType_MPChat(5),
    ChatbotBizType_AIBlueMicro(6),
    ChatbotBizType_AIVoIPDemo(7),
    ChatbotBizType_ESCStore(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f216231d;

    g0(int i17) {
        this.f216231d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216231d;
    }
}

package com.tencent.wechat.aff.chatbot;

/* loaded from: classes6.dex */
public enum n0 implements com.tencent.mm.protobuf.h {
    ChatbotRoomScene_None(0),
    ChatbotRoomScene_Asst(1),
    ChatbotRoomScene_Hardware(2),
    ChatbotRoomScene_WeApp(4),
    ChatbotRoomScene_BlueMicroSpeaker(8),
    ChatbotRoomScene_ALL(15);


    /* renamed from: d, reason: collision with root package name */
    public final int f216395d;

    n0(int i17) {
        this.f216395d = i17;
    }

    public static com.tencent.wechat.aff.chatbot.n0 a(int i17) {
        if (i17 == 0) {
            return ChatbotRoomScene_None;
        }
        if (i17 == 1) {
            return ChatbotRoomScene_Asst;
        }
        if (i17 == 2) {
            return ChatbotRoomScene_Hardware;
        }
        if (i17 == 4) {
            return ChatbotRoomScene_WeApp;
        }
        if (i17 == 8) {
            return ChatbotRoomScene_BlueMicroSpeaker;
        }
        if (i17 != 15) {
            return null;
        }
        return ChatbotRoomScene_ALL;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216395d;
    }
}

package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public enum j1 implements com.tencent.mm.protobuf.h {
    Type_Unknown(0),
    Type_CreateNote(1),
    Type_Msg(2),
    Type_TEXT_OUTPUT(3),
    Type_WeAppNotifyClientMsg(5),
    Type_SpeakingAIInfo(6),
    Type_QuestionInfo(7),
    Type_Meta(8),
    Type_SocialHistoryUpdateNotify(9),
    TYPE_RECOMM_CONTENT(13),
    TYPE_VADResp(14),
    TYPE_PrologueMsgWrap(15),
    TYPE_BLUE_MICROPHONE(16),
    TYPE_TTS_EXTRA_INFO(17),
    TYPE_Asst_Card(18),
    TYPE_ERROR(21);


    /* renamed from: d, reason: collision with root package name */
    public final int f216308d;

    j1(int i17) {
        this.f216308d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216308d;
    }
}

package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public enum e implements com.tencent.mm.protobuf.h {
    Type_Unknown(0),
    Type_Text(1),
    Type_URL(2),
    Type_Finder(3),
    Type_Remind(4),
    Type_WeApp(5),
    TYPE_FAV_STAR(8),
    TYPE_EMOJI_LIST(9),
    TYPE_CLEAR(10),
    TYPE_BIZ_LIST(12),
    Type_StreamText(100);


    /* renamed from: d, reason: collision with root package name */
    public final int f216170d;

    e(int i17) {
        this.f216170d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216170d;
    }
}

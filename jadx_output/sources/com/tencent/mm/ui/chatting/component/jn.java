package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public abstract class jn {
    public static final void a(com.tencent.mm.storage.f9 msg, java.lang.String talker, java.lang.String langCode, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(langCode, "langCode");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(msg.getMsgId()));
        hashMap.put("chat_username", talker);
        hashMap.put("current_language_code", langCode);
        hashMap.put("clk_language_popup_btn", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("same_language_popup", "view_clk", hashMap, 35268);
    }
}

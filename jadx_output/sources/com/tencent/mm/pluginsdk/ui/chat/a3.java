package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190174d;

    public a3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190174d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = pn4.c2.f357063d;
        jz5.g gVar = pn4.c2.f357066g;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue();
        java.lang.String langCode = o4Var != null ? o4Var.u("translate_language", pn4.c2.f357064e) : null;
        b31.l lVar = b31.l.f17613a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190174d;
        java.lang.String userName = chatFooter.f189969d;
        java.lang.String sessionId = chatFooter.f190032n6;
        boolean z17 = chatFooter.f189957a5;
        int i18 = !z17 ? 1 : 0;
        java.lang.String currentLang = z17 ? langCode : "";
        java.lang.String targetLang = z17 ? "" : langCode;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(currentLang, "currentLang");
        kotlin.jvm.internal.o.g(targetLang, "targetLang");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "stt_translate_btn");
        hashMap.put("current_language_code", currentLang);
        hashMap.put("chat_username", userName);
        hashMap.put("stt_translate_sessionid", sessionId);
        hashMap.put("after_clk_status", java.lang.Integer.valueOf(i18));
        hashMap.put("target_language_code", targetLang);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35268);
        chatFooter.C1();
        if (chatFooter.f189957a5) {
            chatFooter.T1(false, false);
            chatFooter.f189961b4.setText("");
            chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), chatFooter.f190004i6));
        } else {
            chatFooter.f190020l6 = chatFooter.f190009j6;
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            android.app.Activity g17 = y4Var != null ? y4Var.a().g() : chatFooter.getActivity();
            android.content.Context context = chatFooter.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue();
            chatFooter.f190009j6 = o4Var2 != null ? o4Var2.u("translate_language_name", pn4.c2.f357065f) : null;
            chatFooter.f190014k6 = langCode;
            kotlin.jvm.internal.o.g(langCode, "langCode");
            chatFooter.T1(langCode.equals("zh_CN") || langCode.equals("zh_TW") || langCode.equals("zh_HK") || langCode.equals("en"), true);
            java.lang.String obj = chatFooter.f189961b4.getText().toString();
            chatFooter.f190004i6 = obj;
            chatFooter.f189992g6 = obj;
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d(chatFooter, g17, langCode);
        }
        chatFooter.f189957a5 = !chatFooter.f189957a5;
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$57", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190186d;

    public b3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190186d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b31.l lVar = b31.l.f17613a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190186d;
        java.lang.String userName = chatFooter.f189969d;
        java.lang.String sessionId = chatFooter.f190032n6;
        java.lang.String currentLang = chatFooter.f190014k6;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(currentLang, "currentLang");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "stt_change_language_btn");
        hashMap.put("current_language_code", currentLang);
        hashMap.put("chat_username", userName);
        hashMap.put("stt_translate_sessionid", sessionId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35268);
        chatFooter.C1();
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        final android.app.Activity g17 = y4Var != null ? y4Var.a().g() : chatFooter.getActivity();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_key_language_name", chatFooter.f190009j6);
        intent.putExtra("intent_key_first_item_name", "");
        pf5.j0.a(intent, com.tencent.mm.plugin.transvoice.ui.v.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.b(com.tencent.mm.plugin.transvoice.ui.SelectLanguageHalfScreenDialogFragment.class);
        cVar.f20922a.f20924a = g17;
        cVar.c(true);
        cVar.f(false);
        cVar.a(com.tencent.mm.ui.container.MMCommonActivity.class.getName());
        cVar.i(new com.tencent.mm.ui.zc() { // from class: com.tencent.mm.pluginsdk.ui.chat.b3$$a
            @Override // com.tencent.mm.ui.zc
            public final void a(int i17, android.content.Intent intent2) {
                com.tencent.mm.pluginsdk.ui.chat.b3 b3Var = com.tencent.mm.pluginsdk.ui.chat.b3.this;
                b3Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onActivityResult resultCode:%s, data:%s", java.lang.Integer.valueOf(i17), intent2);
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = b3Var.f190186d;
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c(chatFooter2);
                if (i17 != -1 || intent2 == null) {
                    return;
                }
                java.lang.String stringExtra = intent2.getStringExtra("intent_key_language_name");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    return;
                }
                java.lang.String targetLang = intent2.getStringExtra("intent_key_language_code");
                b31.l lVar2 = b31.l.f17613a;
                java.lang.String userName2 = chatFooter2.f189969d;
                java.lang.String sessionId2 = chatFooter2.f190032n6;
                java.lang.String currentLang2 = chatFooter2.f190014k6;
                kotlin.jvm.internal.o.g(userName2, "userName");
                kotlin.jvm.internal.o.g(sessionId2, "sessionId");
                kotlin.jvm.internal.o.g(currentLang2, "currentLang");
                kotlin.jvm.internal.o.g(targetLang, "targetLang");
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("current_language_code", currentLang2);
                hashMap2.put("target_language_code", targetLang);
                hashMap2.put("chat_username", userName2);
                hashMap2.put("stt_translate_sessionid", sessionId2);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_clk_lang", hashMap2, 35268);
                chatFooter2.f190009j6 = stringExtra;
                chatFooter2.f190014k6 = targetLang;
                int i18 = pn4.c2.f357063d;
                jz5.g gVar = pn4.c2.f357066g;
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue();
                if (o4Var != null) {
                    o4Var.D("translate_language", targetLang);
                }
                java.lang.String langName = chatFooter2.f190009j6;
                kotlin.jvm.internal.o.g(langName, "langName");
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue();
                if (o4Var2 != null) {
                    o4Var2.D("translate_language_name", langName);
                }
                chatFooter2.T1(targetLang.equals("zh_CN") || targetLang.equals("zh_TW") || targetLang.equals("zh_HK") || targetLang.equals("en"), true);
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d(chatFooter2, g17, targetLang);
            }
        });
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

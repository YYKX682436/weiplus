package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190461d;

    public l3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190461d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$65", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190461d;
        boolean z17 = chatFooter.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE;
        com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
        if (z17) {
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            u35.d.b(y4Var != null ? y4Var.c() : chatFooter.f189969d, 1, chatFooter.P5);
            if (chatFooter.f190090x0 != null) {
                chatFooter.X4 = false;
                eVar.b(7);
                com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
                k5Var.p(k5Var.a(), chatFooter.M5, chatFooter.getQuoteMsgInfo());
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter.p(chatFooter);
            }
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$65", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (chatFooter.T3) {
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = chatFooter.f189955a3;
            u35.d.b(y4Var2 != null ? y4Var2.c() : chatFooter.f189969d, 2, chatFooter.P5);
        }
        if (chatFooter.E4.getVisibility() == 0 && 8 == chatFooter.D4.getVisibility()) {
            java.lang.String obj = chatFooter.f189961b4.getText().toString();
            if (chatFooter.f190090x0 != null && !com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                chatFooter.X4 = false;
                eVar.f175392p = chatFooter.f190082v6;
                eVar.f175396t = obj.length();
                b31.l lVar = b31.l.f17613a;
                java.lang.String userName = chatFooter.f189969d;
                java.lang.String sessionId = chatFooter.f190032n6;
                int length = obj.length();
                java.lang.String targetLang = chatFooter.f189957a5 ? chatFooter.f190014k6 : "";
                kotlin.jvm.internal.o.g(userName, "userName");
                kotlin.jvm.internal.o.g(sessionId, "sessionId");
                kotlin.jvm.internal.o.g(targetLang, "targetLang");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("target_language_code", targetLang);
                hashMap.put("text_cnt", java.lang.Integer.valueOf(length));
                hashMap.put("chat_username", userName);
                hashMap.put("stt_translate_sessionid", sessionId);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_send_trans_result_succ", hashMap, 35268);
                if (1 == eVar.f175399w) {
                    eVar.b(8);
                } else {
                    eVar.b(5);
                }
                i45.j jVar = i45.j.f288415a;
                boolean a17 = jVar.a(jVar.g());
                xg3.h0 h0Var = chatFooter.V2;
                if (a17) {
                    chatFooter.U2 = chatFooter.f189955a3.c();
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(h0Var, null);
                } else {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(h0Var);
                }
                if (chatFooter.C0(obj)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "newVoice2txtSendTxtBtn click ifInterceptQuoteMsg");
                } else {
                    chatFooter.f190090x0.d(obj);
                }
                chatFooter.f190090x0.o();
                java.util.List list = chatFooter.f190058r6;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "cgiReport size = %s", java.lang.Integer.valueOf(arrayList2.size()));
                    com.tencent.mm.storage.c z07 = com.tencent.mm.model.newabtest.z.Ai().z0("100235");
                    int P = z07.isValid() ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) z07.t0().get("MMVoipVadOn"), 0) : 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "cgiReport: abTestFlag = [%s]", java.lang.Integer.valueOf(P));
                    java.lang.String valueOf = java.lang.String.valueOf(P);
                    b31.d dVar = chatFooter.f190052q6;
                    dVar.getClass();
                    gm0.j1.e().j(new b31.c(dVar, new java.util.ArrayList(list), obj, valueOf, 10));
                    arrayList2.clear();
                }
                if (com.tencent.mm.ui.w9.c(chatFooter.getContext()) && (inputMethodManager = chatFooter.U1) != null && (mMEditText = chatFooter.f189961b4) != null) {
                    inputMethodManager.hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$65", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

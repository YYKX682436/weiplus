package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190444d;

    public k3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190444d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190444d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onClick sendVoiceBtn, newVoice2txtMode:%s", chatFooter.f189968c6);
        if (chatFooter.f189968c6 != com.tencent.mm.pluginsdk.ui.chat.b5.MODE_VOICE) {
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            java.lang.String chatUsername = y4Var != null ? y4Var.c() : chatFooter.f189969d;
            int i17 = chatFooter.P5;
            kotlin.jvm.internal.o.g(chatUsername, "chatUsername");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "voice_send_original_btn");
            hashMap.put("chat_username", chatUsername);
            hashMap.put("voice_page_status", 2);
            hashMap.put("voice_stop_sence", java.lang.Integer.valueOf(i17));
            hashMap.put("voice_sessionid", u35.d.f424435a);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35963);
            if (chatFooter.f190090x0 != null) {
                chatFooter.X4 = false;
                chatFooter.N3.b(7);
                com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
                k5Var.p(k5Var.a(), chatFooter.M5, chatFooter.getQuoteMsgInfo());
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter.p(chatFooter);
            }
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = chatFooter.f189955a3;
        java.lang.String chatUsername2 = y4Var2 != null ? y4Var2.c() : chatFooter.f189969d;
        int i18 = chatFooter.P5;
        kotlin.jvm.internal.o.g(chatUsername2, "chatUsername");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("view_id", "voice_convert_text_btn");
        hashMap2.put("chat_username", chatUsername2);
        hashMap2.put("voice_page_status", 1);
        hashMap2.put("voice_stop_sence", java.lang.Integer.valueOf(i18));
        hashMap2.put("voice_sessionid", u35.d.f424435a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap2, 35963);
        chatFooter.f189974d6 = chatFooter.f189968c6;
        chatFooter.f189968c6 = com.tencent.mm.pluginsdk.ui.chat.b5.MODE_TRANS;
        boolean z17 = chatFooter.f190026m6;
        chatFooter.I1();
        chatFooter.f189984f4.setVisibility(8);
        chatFooter.f189972d4.setVisibility(8);
        chatFooter.P1();
        if (z17) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e(chatFooter);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f(chatFooter);
        } else {
            com.tencent.mm.plugin.transvoice.model.c cVar = chatFooter.f190038o6;
            cVar.getClass();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            cVar.f175374m = false;
            chatFooter.f190038o6.b();
            z21.j0 j0Var = chatFooter.f190038o6.f175369e;
            if (j0Var != null) {
                j0Var.f469640w = true;
            }
            chatFooter.f189961b4.setText("");
            android.view.View view2 = chatFooter.V4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.f189961b4.setCursorVisible(false);
        }
        chatFooter.E4.setText(chatFooter.getContext().getResources().getString(com.tencent.mm.R.string.nk8));
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$64", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

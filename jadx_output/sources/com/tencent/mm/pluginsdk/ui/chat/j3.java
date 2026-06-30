package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190430d;

    public j3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190430d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$63", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190430d;
        if (chatFooter.T3) {
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            java.lang.String chatUsername = y4Var != null ? y4Var.c() : chatFooter.f189969d;
            int i17 = chatFooter.P5;
            kotlin.jvm.internal.o.g(chatUsername, "chatUsername");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "voice_cancel_btn");
            hashMap.put("chat_username", chatUsername);
            hashMap.put("voice_stop_sence", java.lang.Integer.valueOf(i17));
            hashMap.put("voice_page_status", 1);
            hashMap.put("voice_sessionid", u35.d.f424435a);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35963);
        }
        chatFooter.X4 = false;
        chatFooter.N3.b(6);
        chatFooter.f190090x0.o();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$63", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

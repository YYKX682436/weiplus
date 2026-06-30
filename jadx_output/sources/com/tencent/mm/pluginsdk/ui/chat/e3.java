package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190295d;

    public e3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190295d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b31.l lVar = b31.l.f17613a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190295d;
        java.lang.String userName = chatFooter.f189969d;
        java.lang.String sessionId = chatFooter.f190032n6;
        boolean z17 = chatFooter.Y4;
        int i17 = !z17 ? 1 : 0;
        int i18 = z17 ? 2 : 1;
        java.lang.String currentLang = chatFooter.f190014k6;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(currentLang, "currentLang");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "stt_read_aloud_btn");
        hashMap.put("current_language_code", currentLang);
        hashMap.put("chat_username", userName);
        hashMap.put("stt_translate_sessionid", sessionId);
        hashMap.put("after_clk_status", java.lang.Integer.valueOf(i17));
        hashMap.put("current_btn_type", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35268);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c(chatFooter);
        if (chatFooter.Y4) {
            chatFooter.C1();
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        chatFooter.Y4 = true;
        java.lang.String obj = chatFooter.f189961b4.getText().toString();
        java.lang.Long valueOf = java.lang.Long.valueOf((obj + chatFooter.f190014k6).hashCode() & io.flutter.embedding.android.KeyboardMap.kValueMask);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "startTextToSpeech  id:%s，transLanguageCode: %s ", valueOf, chatFooter.f190014k6);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(pg5.d.a(chatFooter.getContext(), obj));
        spannableStringBuilder.setSpan(chatFooter.f189962b5, 0, spannableStringBuilder.length(), 33);
        chatFooter.f189961b4.setText(spannableStringBuilder);
        gm0.j1.b().c();
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new pn4.l()).a(pn4.p.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        if (true ^ com.tencent.mm.vfs.w6.j(((pn4.p) a17).N6() + "/stream/" + valueOf.longValue())) {
            android.view.View view2 = chatFooter.f190030n4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            chatFooter.f190024m4.setVisibility(8);
        }
        r45.iy3 iy3Var = r45.iy3.CHINESE;
        if ("en".equals(chatFooter.f190014k6)) {
            iy3Var = r45.iy3.ENGLISH;
        }
        r45.iy3 iy3Var2 = iy3Var;
        java.lang.String string = chatFooter.getResources().getString(com.tencent.mm.R.string.pcf);
        gm0.j1.b().c();
        androidx.lifecycle.c1 a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new pn4.l()).a(pn4.p.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ((pn4.p) a18).O6(obj, valueOf.longValue(), new com.tencent.mm.pluginsdk.ui.chat.d3(this, obj, string), false, r45.jy3.Translate, iy3Var2);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

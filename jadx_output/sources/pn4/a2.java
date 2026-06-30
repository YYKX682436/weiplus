package pn4;

/* loaded from: classes5.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.t1 f357043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(pn4.t1 t1Var, int i17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f357043d = t1Var;
        this.f357044e = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.chat.t3 t3Var = (com.tencent.mm.pluginsdk.ui.chat.t3) this.f357043d;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = t3Var.f190663b;
        android.view.View view = chatFooter.V4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$72", "onTranslateSuccess", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$72", "onTranslateSuccess", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter.E4.setEnabled(true);
        chatFooter.C4.setEnabled(true);
        java.lang.String str = this.f357044e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            android.content.Context context = t3Var.f190662a;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.f490391to);
            e4Var.c();
            chatFooter.T1(false, !com.tencent.mm.sdk.platformtools.t8.K0(chatFooter.f190020l6));
            chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), chatFooter.f189992g6));
        } else {
            ((java.util.HashMap) chatFooter.f189980e6).put(2, str);
            chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), str));
            b31.l lVar = b31.l.f17613a;
            java.lang.String userName = chatFooter.f189969d;
            java.lang.String sessionId = chatFooter.f190032n6;
            int length = str.length();
            java.lang.String targetLang = chatFooter.f190014k6;
            kotlin.jvm.internal.o.g(userName, "userName");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(targetLang, "targetLang");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("target_language_code", targetLang);
            hashMap.put("text_cnt", java.lang.Integer.valueOf(length));
            hashMap.put("chat_username", userName);
            hashMap.put("stt_translate_sessionid", sessionId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_trans_succ_disp", hashMap, 35268);
        }
        return jz5.f0.f302826a;
    }
}

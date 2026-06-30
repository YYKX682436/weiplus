package q50;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q50.i f360145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f360146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360147f;

    public g(q50.i iVar, androidx.activity.ComponentActivity componentActivity, java.lang.String str) {
        this.f360145d = iVar;
        this.f360146e = componentActivity;
        this.f360147f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f360145d.getClass();
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_Readonly", true).putExtra("Chat_BackBtnStyle", 0).putExtra("kHalfScreenClearTop", false);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        java.lang.String str = this.f360147f;
        if (com.tencent.mm.storage.z3.p4(str)) {
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
            openIMKefuStartConversationRequest.f72274f = 0;
            openIMKefuStartConversationRequest.f72287v = false;
            putExtra.putExtra("key_start_conversation_request", openIMKefuStartConversationRequest);
        }
        putExtra.putExtra("KHalfScreenUIC", ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(4));
        ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).wi(this.f360146e, str, putExtra);
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.o(str, 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_chat_three_dotdot", "view_clk", kz5.c1.k(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b), new jz5.l("forw_confirm_screen_from", java.lang.Integer.valueOf(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209297d)), new jz5.l("click_username", str)), 32337);
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package lf5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f318523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f318524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f318525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.g0 f318526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f318527h;

    public c(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.g0 g0Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        this.f318523d = f9Var;
        this.f318524e = msgQuoteItem;
        this.f318525f = dVar;
        this.f318526g = g0Var;
        this.f318527h = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.storage.f9 f9Var = this.f318523d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemQuoteHelper", "sourceTV click msgId:%s", java.lang.Long.valueOf(msgId));
            com.tencent.mm.ui.chatting.viewitems.dc.d(this.f318525f, this.f318526g, this.f318527h, view, msgId, Q0, this.f318524e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemQuoteHelper", "sourceTV click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package lf5;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f318519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f318520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f318521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f318522g;

    public b(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        this.f318519d = f9Var;
        this.f318520e = dVar;
        this.f318521f = a0Var;
        this.f318522g = msgQuoteItem;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            long msgId = this.f318519d.getMsgId();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemQuoteHelper", "sourceTV long click msgId:%s", java.lang.Long.valueOf(msgId));
            ((com.tencent.mm.ui.chatting.component.bj) ((sb5.o1) this.f318520e.f460708c.a(sb5.o1.class))).n0(view, new lf5.a(this.f318520e, this.f318521f, this.f318519d, msgId, this.f318522g));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemQuoteHelper", e17, "sourceTV long click Exception", new java.lang.Object[0]);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

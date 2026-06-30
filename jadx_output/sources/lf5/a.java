package lf5;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f318514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f318515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f318516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f318517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f318518h;

    public a(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.storage.f9 f9Var, long j17, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        this.f318514d = dVar;
        this.f318515e = a0Var;
        this.f318516f = f9Var;
        this.f318517g = j17;
        this.f318518h = msgQuoteItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$1$onLongClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f318514d;
        com.tencent.mm.ui.chatting.viewitems.a0 a0Var = this.f318515e;
        com.tencent.mm.storage.f9 f9Var = this.f318516f;
        a0Var.getClass();
        com.tencent.mm.ui.chatting.viewitems.dc.e(dVar, a0Var, f9Var, null, this.f318517g, this.f318516f.Q0(), this.f318518h, ty.q0.f422749d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$1$onLongClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

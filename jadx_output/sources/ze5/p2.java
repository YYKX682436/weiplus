package ze5;

/* loaded from: classes9.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f472140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.s2 f472143g;

    public p2(ot0.q qVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ze5.s2 s2Var) {
        this.f472140d = qVar;
        this.f472141e = dVar;
        this.f472142f = f9Var;
        this.f472143g = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.storage.f9 f9Var = this.f472142f;
        ot0.q qVar = this.f472140d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            com.tencent.mm.ui.chatting.viewitems.o9.c(qVar, view, this.f472141e, f9Var, new com.tencent.mm.ui.chatting.viewitems.qq(this.f472143g));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemAppMsgGameShareMvvm", th6, "handleClick error", new java.lang.Object[0]);
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(qVar, java.lang.Long.valueOf(f9Var.I0()), 2);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

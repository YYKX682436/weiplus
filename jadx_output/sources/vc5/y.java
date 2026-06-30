package vc5;

/* loaded from: classes10.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView f435353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.l0 f435354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f435355f;

    public y(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView msgHistoryGalleryToolBarView, ad5.l0 l0Var, yz5.l lVar) {
        this.f435353d = msgHistoryGalleryToolBarView;
        this.f435354e = l0Var;
        this.f435355f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object m521constructorimpl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryToolBarView$setOperations$2$buttonView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView msgHistoryGalleryToolBarView = this.f435353d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.content.Context context = msgHistoryGalleryToolBarView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ad5.l0 l0Var = this.f435354e;
            yz5.l lVar = this.f435355f;
            l0Var.d(context, lVar != null ? (ad5.t0) lVar.invoke(l0Var) : null);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHistoryGalleryToolBarView", m524exceptionOrNullimpl, "showActionBottomSheet operate failed", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryToolBarView$setOperations$2$buttonView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

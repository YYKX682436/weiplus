package vc5;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView f435321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.groups.g f435322f;

    public h(android.view.View view, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView, com.tencent.mm.ui.chatting.history.groups.g gVar) {
        this.f435320d = view;
        this.f435321e = msgHistoryGalleryActionBarView;
        this.f435322f = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f435320d.removeOnAttachStateChangeListener(this);
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = this.f435321e;
        em.u1 u1Var = msgHistoryGalleryActionBarView.f201711f;
        if (u1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView a17 = u1Var.a();
        java.lang.String string = msgHistoryGalleryActionBarView.getContext().getResources().getString(this.f435322f.b());
        kotlin.jvm.internal.o.f(string, "getString(...)");
        a17.setTypeFilterDesc(string);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}

package vc5;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.d2 f435339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f435340e;

    public q(em.d2 d2Var, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView) {
        this.f435339d = d2Var;
        this.f435340e = msgHistoryGallerySearchBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView$initSearchBar$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        em.d2 d2Var = this.f435339d;
        android.text.Editable text = d2Var.d().getText();
        if (text != null) {
            text.clear();
        }
        d2Var.d().clearFocus();
        int i17 = com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.f201731n;
        this.f435340e.b();
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.e(this.f435340e, false, false, false, 4, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView$initSearchBar$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

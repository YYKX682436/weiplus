package vc5;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.d2 f435337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f435338e;

    public p(em.d2 d2Var, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView) {
        this.f435337d = d2Var;
        this.f435338e = msgHistoryGallerySearchBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView$initSearchBar$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.text.Editable text = this.f435337d.d().getText();
        if (text != null) {
            text.clear();
        }
        int i17 = com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.f201731n;
        this.f435338e.c();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGallerySearchBarView$initSearchBar$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

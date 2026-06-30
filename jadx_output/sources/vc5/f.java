package vc5;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView f435317d;

    public f(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView) {
        this.f435317d = msgHistoryGalleryActionBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$initializeTypeFilterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f435317d.f201721s;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$initializeTypeFilterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

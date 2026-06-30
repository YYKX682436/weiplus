package vc5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView f435315d;

    public d(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView) {
        this.f435315d = msgHistoryGalleryActionBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$initializeTypeFilterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f435315d.setSelecting(true);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$initializeTypeFilterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

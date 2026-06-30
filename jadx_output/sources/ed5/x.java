package ed5;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView f251403d;

    public x(com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView msgHistoryGalleryTypeFilterView) {
        this.f251403d = msgHistoryGalleryTypeFilterView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView msgHistoryGalleryTypeFilterView = this.f251403d;
        if (msgHistoryGalleryTypeFilterView.f201822i) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        msgHistoryGalleryTypeFilterView.f201822i = true;
        msgHistoryGalleryTypeFilterView.setExpanded(true ^ msgHistoryGalleryTypeFilterView.isExpanded);
        ed5.y onFilterClickListener = msgHistoryGalleryTypeFilterView.getOnFilterClickListener();
        if (onFilterClickListener != null) {
            boolean z17 = msgHistoryGalleryTypeFilterView.isExpanded;
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = ((vc5.c) onFilterClickListener).f435314a;
            if (z17) {
                com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.b(msgHistoryGalleryActionBarView).f252986r = new vc5.b(msgHistoryGalleryActionBarView);
                com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.b(msgHistoryGalleryActionBarView).show();
            } else {
                com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.b(msgHistoryGalleryActionBarView).dismiss();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

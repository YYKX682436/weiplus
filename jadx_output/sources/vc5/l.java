package vc5;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView f435332e;

    public l(java.lang.String str, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView msgHistoryGalleryFilterBarView) {
        this.f435331d = str;
        this.f435332e = msgHistoryGalleryFilterBarView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildSuggestChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("suggest word clicked: ");
        java.lang.String str = this.f435331d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryFilterBarView", sb6.toString());
        yz5.l onSuggestWordClickListener = this.f435332e.getOnSuggestWordClickListener();
        if (onSuggestWordClickListener != null) {
            onSuggestWordClickListener.invoke(str);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildSuggestChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

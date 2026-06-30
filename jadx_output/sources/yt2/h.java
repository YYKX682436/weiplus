package yt2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465306d;

    public h(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView) {
        this.f465306d = finderLiveShoppingSubsidyOverlayView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465306d;
        if (finderLiveShoppingSubsidyOverlayView.D) {
            com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", "subsidy overlay clicked at hold stage");
            yz5.a aVar = finderLiveShoppingSubsidyOverlayView.E;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

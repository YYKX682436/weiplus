package yt2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465315d;

    public n(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView) {
        this.f465315d = finderLiveShoppingSubsidyOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", "exit total finished (1100ms), onAllFinish");
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465315d;
        finderLiveShoppingSubsidyOverlayView.setVisibility(8);
        yz5.a aVar = finderLiveShoppingSubsidyOverlayView.C;
        if (aVar != null) {
            aVar.invoke();
        }
        finderLiveShoppingSubsidyOverlayView.C = null;
    }
}

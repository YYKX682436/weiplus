package yt2;

/* loaded from: classes3.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465313d;

    public l(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView) {
        this.f465313d = finderLiveShoppingSubsidyOverlayView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView.F;
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465313d;
        finderLiveShoppingSubsidyOverlayView.getClass();
        com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", "enter anim finished, start hold 2000ms");
        finderLiveShoppingSubsidyOverlayView.D = true;
        finderLiveShoppingSubsidyOverlayView.setClickable(true);
        yt2.k kVar = new yt2.k(finderLiveShoppingSubsidyOverlayView);
        finderLiveShoppingSubsidyOverlayView.f126359t = kVar;
        finderLiveShoppingSubsidyOverlayView.postDelayed(kVar, 2000L);
    }
}

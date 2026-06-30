package yt2;

/* loaded from: classes3.dex */
public final class o extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465316d;

    public o(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView) {
        this.f465316d = finderLiveShoppingSubsidyOverlayView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", "exit shrink finished (500ms), onShrinkFinish");
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465316d;
        android.view.View view = finderLiveShoppingSubsidyOverlayView.f126349g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView$startExitAnimation$13", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView$startExitAnimation$13", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = finderLiveShoppingSubsidyOverlayView.B;
        if (aVar != null) {
            aVar.invoke();
        }
        finderLiveShoppingSubsidyOverlayView.B = null;
        finderLiveShoppingSubsidyOverlayView.postDelayed(new yt2.n(finderLiveShoppingSubsidyOverlayView), 600L);
    }
}

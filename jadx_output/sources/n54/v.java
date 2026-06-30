package n54;

/* loaded from: classes14.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout f335158d;

    public v(com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout) {
        this.f335158d = scrollableFrameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$2");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout = this.f335158d;
        n54.t uiEventListener = scrollableFrameLayout.getUiEventListener();
        if (uiEventListener != null) {
            uiEventListener.b(scrollableFrameLayout.getTranslationY());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout$doAnimation$1$2");
    }
}

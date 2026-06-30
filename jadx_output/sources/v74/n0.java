package v74;

/* loaded from: classes4.dex */
public final class n0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.s0 f433872d;

    public n0(v74.s0 s0Var) {
        this.f433872d = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$hideThemePagView$1$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMThemePagView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f433872d.f433896f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMThemePagView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        if (mMPAGView != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            mMPAGView.setAlpha(((java.lang.Float) animatedValue).floatValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$hideThemePagView$1$1$1");
    }
}

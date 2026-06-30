package v74;

/* loaded from: classes4.dex */
public final class b1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView f433769d;

    public b1(com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView) {
        this.f433769d = overScrollRecyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView$smoothScrollBack$animator$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = this.f433769d;
        overScrollRecyclerView.setTranslationX(floatValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnOverScrollActionListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        v74.a1 a1Var = overScrollRecyclerView.f163249h2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnOverScrollActionListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        if (a1Var != null) {
            ((v74.b0) a1Var).a(-floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView$smoothScrollBack$animator$1$1");
    }
}

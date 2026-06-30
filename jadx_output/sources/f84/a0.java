package f84;

/* loaded from: classes3.dex */
public final class a0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView f260171d;

    public a0(com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView overScrollDoubleSideRecyclerView) {
        this.f260171d = overScrollDoubleSideRecyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView$smoothScrollBack$animator$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView overScrollDoubleSideRecyclerView = this.f260171d;
        overScrollDoubleSideRecyclerView.setTranslationX(floatValue);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnOverScrollActionListener$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView");
        overScrollDoubleSideRecyclerView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnOverScrollActionListener$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.OverScrollDoubleSideRecyclerView$smoothScrollBack$animator$1$1");
    }
}

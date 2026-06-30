package t74;

/* loaded from: classes4.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f416182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416183f;

    public l(android.view.View view, float f17, t74.w1 w1Var) {
        this.f416181d = view;
        this.f416182e = f17;
        this.f416183f = w1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$o2$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$o2$1$1");
        } else {
            this.f416181d.setTranslationX((f17.floatValue() / 90) * this.f416182e * t74.w1.M(this.f416183f));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$o2$1$1");
        }
    }
}

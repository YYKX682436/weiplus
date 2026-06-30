package t74;

/* loaded from: classes4.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f416239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416240f;

    public s(android.view.View view, float f17, t74.w1 w1Var) {
        this.f416238d = view;
        this.f416239e = f17;
        this.f416240f = w1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$o3$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$o3$1$1");
        } else {
            this.f416238d.setTranslationX((f17.floatValue() / 90) * this.f416239e * 2 * t74.w1.M(this.f416240f));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardTurnedAnim$o3$1$1");
        }
    }
}

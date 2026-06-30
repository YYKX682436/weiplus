package z54;

/* loaded from: classes4.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z54.j f470281d;

    public h(z54.j jVar) {
        this.f470281d = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$1");
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$1");
            return;
        }
        float floatValue = f17.floatValue();
        z54.j jVar = this.f470281d;
        if (z54.j.e(jVar) != null) {
            z54.j.e(jVar).b(floatValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenValueAnimation$1");
    }
}

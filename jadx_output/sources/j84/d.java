package j84;

/* loaded from: classes4.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.f f298176d;

    public d(j84.f fVar) {
        this.f298176d = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$1");
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        j84.f fVar = this.f298176d;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExpandRadius", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        fVar.f298185f = floatValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExpandRadius", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnExpandAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        yz5.l lVar = fVar.f298189j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnExpandAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        if (lVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpandRadius", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
            float f18 = fVar.f298185f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandRadius", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
            lVar.invoke(java.lang.Float.valueOf(f18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$1");
    }
}

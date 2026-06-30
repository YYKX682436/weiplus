package j84;

/* loaded from: classes4.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.f f298172d;

    public b(j84.f fVar) {
        this.f298172d = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$hideClickCircle$1$1");
        kotlin.jvm.internal.o.g(animator, "animator");
        j84.f fVar = this.f298172d;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPeekCircle", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        j84.a aVar = fVar.f298188i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPeekCircle", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        if (aVar != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
            float floatValue = f17 != null ? f17.floatValue() : 0.0f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScale", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            aVar.f298170d = floatValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScale", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnPeekAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        yz5.l lVar = fVar.f298191l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnPeekAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        if (lVar != null) {
            java.lang.Object animatedValue2 = animator.getAnimatedValue();
            java.lang.Float f18 = animatedValue2 instanceof java.lang.Float ? (java.lang.Float) animatedValue2 : null;
            lVar.invoke(java.lang.Float.valueOf(f18 != null ? f18.floatValue() : 0.0f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$hideClickCircle$1$1");
    }
}

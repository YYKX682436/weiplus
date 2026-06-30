package j84;

/* loaded from: classes4.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j84.f f298178d;

    public e(j84.f fVar) {
        this.f298178d = fVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        j84.f fVar = this.f298178d;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExpanding", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        fVar.f298184e = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExpanding", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        j84.f fVar = this.f298178d;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExpanding", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        fVar.f298184e = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExpanding", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnExpandAnimationComplete", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        yz5.a aVar = fVar.f298190k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnExpandAnimationComplete", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$startExpandAnimation$1$2");
    }
}

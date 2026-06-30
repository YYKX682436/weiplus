package e94;

/* loaded from: classes4.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView f250377d;

    public g(com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView) {
        this.f250377d = flyingFlipAnimView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$startAnim$1$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onFlyingEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView = this.f250377d;
        flyingFlipAnimView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlyingEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        try {
            e94.c cVar = flyingFlipAnimView.E;
            if (cVar != null) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e) cVar).d();
            }
            flyingFlipAnimView.f163893s = flyingFlipAnimView.c();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("FlyingFlipAnimView", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlyingEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onFlyingEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$startAnim$1$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$startAnim$1$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onFlyingStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView = this.f250377d;
        flyingFlipAnimView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlyingStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        try {
            e94.c cVar = flyingFlipAnimView.E;
            if (cVar != null) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e) cVar).c();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("FlyingFlipAnimView", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlyingStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onFlyingStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$startAnim$1$1$1");
    }
}

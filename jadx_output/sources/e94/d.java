package e94;

/* loaded from: classes4.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView f250373d;

    public d(com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView) {
        this.f250373d = flyingFlipAnimView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$doEggCardFlipAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView = this.f250373d;
        try {
            int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnCardAnimListener$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            e94.c cVar = flyingFlipAnimView.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnCardAnimListener$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            if (cVar != null) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e) cVar).a();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("FlyingFlipAnimView", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$doEggCardFlipAnim$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$doEggCardFlipAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView flyingFlipAnimView = this.f250373d;
        try {
            int i17 = com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnCardAnimListener$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            e94.c cVar = flyingFlipAnimView.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnCardAnimListener$p", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            if (cVar != null) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e) cVar).b();
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("FlyingFlipAnimView", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$doEggCardFlipAnim$1$1");
    }
}

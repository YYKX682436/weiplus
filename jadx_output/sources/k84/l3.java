package k84;

/* loaded from: classes3.dex */
public final class l3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f305106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305107e;

    public l3(kotlinx.coroutines.q qVar, k84.d4 d4Var) {
        this.f305106d = qVar;
        this.f305107e = d4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
        try {
            kotlinx.coroutines.q qVar = this.f305106d;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f305107e.j(), e17, "anim end error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$invokeSuspend$lambda$5$$inlined$addListener$default$1");
    }
}

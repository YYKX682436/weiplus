package p44;

/* loaded from: classes4.dex */
public final class o extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f351810e;

    public o(kotlin.jvm.internal.h0 h0Var) {
        this.f351810e = h0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startNonePickedAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        if (!this.f39706d) {
            ((android.animation.Animator) this.f351810e.f310123d).start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startNonePickedAnim$2");
    }
}

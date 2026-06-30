package p44;

/* loaded from: classes4.dex */
public final class p extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f351831e;

    public p(kotlin.jvm.internal.h0 h0Var) {
        this.f351831e = h0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startUnPickedCardGoneToVisibleAnim$3$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        p44.c0 c0Var = (p44.c0) this.f351831e.f310123d;
        android.view.View j17 = c0Var != null ? c0Var.j() : null;
        if (j17 != null) {
            j17.setEnabled(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startUnPickedCardGoneToVisibleAnim$3$1");
    }
}

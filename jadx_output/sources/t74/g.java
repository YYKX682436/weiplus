package t74;

/* loaded from: classes4.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f416136f = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f416137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416138e;

    public g(t74.w1 w1Var) {
        this.f416138e = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f416137d = true;
        com.tencent.mars.xlog.Log.i(this.f416138e.j(), "expandAnimSet is cancel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        t74.w1 w1Var = this.f416138e;
        kotlinx.coroutines.y0 h17 = w1Var.h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(t74.w1.P(w1Var)), null, new t74.f(this, w1Var, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1");
    }
}

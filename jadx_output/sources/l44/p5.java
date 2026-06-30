package l44;

/* loaded from: classes4.dex */
public class p5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l44.s5 f316301d;

    public p5(l44.s5 s5Var) {
        this.f316301d = s5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$1");
        super.onAnimationStart(animator);
        l44.s5 s5Var = this.f316301d;
        s5Var.f316351f = true;
        if (l44.s5.a(s5Var) != null) {
            l44.s5.a(s5Var).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$1");
    }
}

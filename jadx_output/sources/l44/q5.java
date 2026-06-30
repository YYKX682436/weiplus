package l44;

/* loaded from: classes4.dex */
public class q5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l44.s5 f316318d;

    public q5(l44.s5 s5Var) {
        this.f316318d = s5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$2");
        super.onAnimationEnd(animator);
        l44.s5 s5Var = this.f316318d;
        s5Var.f316351f = false;
        if (l44.s5.a(s5Var) != null) {
            l44.s5.a(s5Var).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$2");
    }
}

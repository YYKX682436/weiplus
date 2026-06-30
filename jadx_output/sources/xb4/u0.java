package xb4;

/* loaded from: classes4.dex */
public class u0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f452990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xb4.v0 f452991e;

    public u0(xb4.v0 v0Var, u74.d dVar) {
        this.f452991e = v0Var;
        this.f452990d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
        this.f452991e.b();
        xb4.x xVar = this.f452991e.f453001b;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        this.f452990d.T.f425134d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
        xb4.x xVar = this.f452991e.f453001b;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdSimpleTwistClickAnimationNew$2");
    }
}

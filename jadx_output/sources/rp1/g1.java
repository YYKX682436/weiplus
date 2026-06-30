package rp1;

/* loaded from: classes14.dex */
public class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398403d;

    public g1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView) {
        this.f398403d = floatBallView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398403d;
        floatBallView.G1 = false;
        floatBallView.s0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398403d;
        floatBallView.G1 = false;
        floatBallView.s0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f398403d.G1 = true;
    }
}

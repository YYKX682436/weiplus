package rp1;

/* loaded from: classes14.dex */
public class x1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398556d;

    public x1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView) {
        this.f398556d = floatMenuView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.ball.view.FloatMenuView.a(this.f398556d, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f398556d.f93581i;
        if (floatBackgroundView != null) {
            floatBackgroundView.setVisibility(0);
        }
    }
}

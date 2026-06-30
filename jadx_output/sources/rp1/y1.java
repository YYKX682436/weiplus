package rp1;

/* loaded from: classes14.dex */
public class y1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f398559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398560e;

    public y1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView, boolean z17) {
        this.f398560e = floatMenuView;
        this.f398559d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView;
        boolean z17 = this.f398559d;
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f398560e;
        if (z17 && (floatBackgroundView = floatMenuView.f93581i) != null) {
            floatBackgroundView.setVisibility(8);
        }
        com.tencent.mm.plugin.ball.view.FloatMenuView.a(floatMenuView, false);
        floatMenuView.G = null;
    }
}

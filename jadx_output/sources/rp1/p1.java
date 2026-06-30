package rp1;

/* loaded from: classes14.dex */
public class p1 extends mp1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398512a;

    public p1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView) {
        this.f398512a = floatMenuView;
    }

    public void a() {
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f398512a;
        if (floatMenuView.f93579g.getItemCount() != 0 || (floatBackgroundView = floatMenuView.f93581i) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBackgroundView", "animateHideBackgroundView");
        if (floatBackgroundView.f93441f) {
            return;
        }
        floatBackgroundView.f93441f = true;
        android.view.ViewPropertyAnimator animate = floatBackgroundView.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200L)) == null) {
            return;
        }
        duration.withEndAction(new rp1.a0(floatBackgroundView));
    }
}

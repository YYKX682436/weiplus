package rp1;

/* loaded from: classes13.dex */
public final class r implements rp1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallView f398517a;

    public r(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView) {
        this.f398517a = contentFloatBallView;
    }

    @Override // rp1.p0
    public void a(boolean z17) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView;
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView2;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f398517a;
        if (!((contentFloatBallView.f93419d & 32) != 0)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallViewV2", "onIdleStateChange isIdle: " + z17 + " background and ignore");
            contentFloatBallView.S = z17;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onIdleStateChange isIdle: " + z17 + ", last: " + contentFloatBallView.S);
        if (z17 && !contentFloatBallView.S) {
            collapseView2 = contentFloatBallView.getCollapseView();
            if (collapseView2 != null) {
                float alpha2 = collapseView2.getAlpha();
                qp1.g0.a(collapseView2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(alpha2));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(collapseView2, arrayList.toArray(), "com/tencent/mm/plugin/ball/util/FloatBallViewUtils", "animateAlpha", "(Landroid/view/View;FFJ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                collapseView2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(collapseView2, "com/tencent/mm/plugin/ball/util/FloatBallViewUtils", "animateAlpha", "(Landroid/view/View;FFJ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.ViewPropertyAnimator animate = collapseView2.animate();
                if (animate != null && (alpha = animate.alpha(0.4f)) != null && (duration = alpha.setDuration(100L)) != null && (interpolator = duration.setInterpolator(new android.view.animation.LinearInterpolator())) != null) {
                    interpolator.start();
                }
            }
        } else if (z17) {
            collapseView = contentFloatBallView.getCollapseView();
            qp1.g0.a(collapseView);
            contentFloatBallView.Q(0.4f);
        }
        contentFloatBallView.S = z17;
    }
}

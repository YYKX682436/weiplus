package rp1;

/* loaded from: classes14.dex */
public class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f398449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f398450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f398451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398452g;

    public k1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, android.graphics.Point point, android.graphics.Point point2) {
        this.f398452g = floatBallView;
        this.f398449d = ballInfo;
        this.f398450e = point;
        this.f398451f = point2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f398449d;
        int i17 = ballInfo.H;
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398452g;
        if (i17 == 512) {
            com.tencent.mm.plugin.ball.view.FloatBallView.d(floatBallView, 1024);
            android.graphics.Point point = floatBallView.P1;
            point.x = 0;
            point.y = 0;
            floatBallView.O1 = floatBallView.L1.P.f338792b;
            ballInfo.f93051i = new android.graphics.Point(floatBallView.O1);
        } else if (i17 == 8) {
            com.tencent.mm.plugin.ball.view.FloatBallView.d(floatBallView, 16);
            android.graphics.Point point2 = floatBallView.P1;
            android.graphics.Point point3 = this.f398450e;
            int i18 = point3.x;
            android.graphics.Point point4 = this.f398451f;
            point2.x = java.lang.Math.max(0, i18 - point4.x);
            point2.y = java.lang.Math.max(0, point3.y - point4.y);
            floatBallView.O1 = floatBallView.L1.P.f338792b;
            ballInfo.f93051i = new android.graphics.Point(floatBallView.O1);
        }
        android.graphics.Point point5 = floatBallView.O1;
    }
}

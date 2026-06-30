package rp1;

/* loaded from: classes14.dex */
public class j1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f398433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f398434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout.LayoutParams f398437h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398438i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f398439m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398440n;

    public j1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, boolean z17, boolean z18, int i17, int i18, android.widget.LinearLayout.LayoutParams layoutParams, boolean z19, boolean z27) {
        this.f398440n = floatBallView;
        this.f398433d = z17;
        this.f398434e = z18;
        this.f398435f = i17;
        this.f398436g = i18;
        this.f398437h = layoutParams;
        this.f398438i = z19;
        this.f398439m = z27;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398440n;
        floatBallView.Z1 = true;
        boolean z17 = floatBallView.Y1;
        boolean z18 = this.f398433d;
        if (z17) {
            floatBallView.X1 = z18 ? floatBallView.W1 : 1.0f;
            if (z18) {
                floatBallView.setVisibility(8);
            } else {
                com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = floatBallView.L;
                if (floatBallCollapseView != null) {
                    floatBallCollapseView.b();
                }
            }
        }
        floatBallView.F0(this.f398434e, z18, this.f398435f, this.f398436g);
        int i17 = floatBallView.f93563x1 ? 8388611 : 8388613;
        android.widget.LinearLayout.LayoutParams layoutParams = this.f398437h;
        layoutParams.gravity = i17;
        floatBallView.f93556t.setLayoutParams(layoutParams);
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) floatBallView.getLayoutParams();
        this.f398440n.f0(layoutParams2.x, layoutParams2.y, true, false, this.f398438i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f398440n.f93559v.getVisibility();
        if (this.f398433d) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398440n;
            floatBallView.D0(floatBallView.f93563x1);
        }
        if (this.f398439m && !this.f398433d && this.f398440n.W() && this.f398440n.getVisibility() != 0) {
            super/*android.view.View*/.setAlpha(1.0f);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: rp1.j1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.view.View*/.setVisibility(0);
                }
            });
        }
        if (this.f398439m) {
            this.f398440n.Z1 = true;
        }
    }
}

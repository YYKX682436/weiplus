package xt2;

/* loaded from: classes3.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f456613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f456614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f456616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f456617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f456618i;

    public a3(boolean z17, boolean z18, xt2.e3 e3Var, r45.y23 y23Var, boolean z19, cm2.m0 m0Var) {
        this.f456613d = z17;
        this.f456614e = z18;
        this.f456615f = e3Var;
        this.f456616g = y23Var;
        this.f456617h = z19;
        this.f456618i = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        boolean z17 = this.f456614e;
        xt2.e3 e3Var = this.f456615f;
        boolean z18 = this.f456613d;
        if (z18 || z17) {
            com.tencent.mars.xlog.Log.i(e3Var.f456706h, "showShoppingBubble: deferred updatePriceView, deferPlay=" + z18 + ", playingNow=" + z17 + ", productId=" + this.f456616g.getLong(0));
            return;
        }
        if (!this.f456617h) {
            e3Var.m(this.f456618i);
            return;
        }
        float S = pm0.v.S(-10);
        android.view.ViewPropertyAnimator animate = e3Var.f456719w.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null || (translationY = alpha.translationY(S)) == null || (duration = translationY.setDuration(300L)) == null) {
            return;
        }
        duration.withEndAction(new xt2.z2(this.f456615f, this.f456618i, S, 300L));
    }
}

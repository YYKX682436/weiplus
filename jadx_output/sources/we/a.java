package we;

/* loaded from: classes7.dex */
public abstract class a extends com.tencent.mm.plugin.appbrand.page.i3 {
    public long K;
    public com.tencent.mm.plugin.appbrand.report.model.s L;

    public a(android.content.Context context, ze.n nVar) {
        super(context, nVar);
        this.K = 0L;
        if (!nVar.q2()) {
            Y(oi1.n.f345608e, new oi1.a());
        }
        Y(oi1.n.f345607d, new oi1.b());
        getReporter();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void B() {
        super.B();
        if (getPageCount() > 0) {
            getReporter().j((com.tencent.luggage.sdk.jsapi.component.b) getCurrentPage().getCurrentPageView());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void D() {
        super.D();
        if (getActualPageStackSize() > 0) {
            getReporter().b((com.tencent.luggage.sdk.jsapi.component.b) getCurrentPage().getCurrentPageView());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public com.tencent.mm.plugin.appbrand.page.a5 E(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        com.tencent.mm.plugin.appbrand.page.a5 E = super.E(w2Var, w2Var2);
        com.tencent.luggage.sdk.jsapi.component.b bVar = w2Var != null ? (com.tencent.luggage.sdk.jsapi.component.b) w2Var.getCurrentPageView() : null;
        com.tencent.luggage.sdk.jsapi.component.b bVar2 = (com.tencent.luggage.sdk.jsapi.component.b) w2Var2.getCurrentPageView();
        getReporter().f(0L);
        getReporter().e(bVar2, bVar, com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK);
        return E;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public void F(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        super.F(w2Var, w2Var2, wdVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.K;
        getReporter().m(currentTimeMillis, wdVar);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandPageContainerLU", "onNavigateEnd received, appId:%s, time: %d", getAppId(), java.lang.Long.valueOf(currentTimeMillis));
        getReporter().e((com.tencent.luggage.sdk.jsapi.component.b) w2Var2.getCurrentPageView(), w2Var == null ? null : (com.tencent.luggage.sdk.jsapi.component.b) w2Var.getCurrentPageView(), wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public com.tencent.mm.plugin.appbrand.page.a5 G(com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, com.tencent.mm.plugin.appbrand.page.wd wdVar, java.lang.String str, boolean z17) {
        this.K = java.lang.System.currentTimeMillis();
        return super.G(w2Var, w2Var2, wdVar, str, z17);
    }

    public com.tencent.mm.plugin.appbrand.report.model.s getReporter() {
        if (this.L == null) {
            this.L = new com.tencent.mm.plugin.appbrand.report.model.g(getRuntime(), this);
        }
        return this.L;
    }

    @Override // android.view.View
    public final boolean post(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this) || getRuntime() == null || !getRuntime().a2()) {
            return super.post(runnable);
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
        return true;
    }

    @Override // android.view.View
    public final boolean postDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this) || getRuntime() == null || !getRuntime().a2()) {
            return super.postDelayed(runnable, j17);
        }
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
        return true;
    }

    @Override // android.view.View
    public final void postOnAnimation(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this) || getRuntime() == null || !getRuntime().a2()) {
            super.postOnAnimation(runnable);
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(runnable, android.animation.ValueAnimator.getFrameDelay());
        }
    }

    @Override // android.view.View
    public final void postOnAnimationDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this) || getRuntime() == null || !getRuntime().a2()) {
            super.postOnAnimationDelayed(runnable, j17);
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(runnable, android.animation.ValueAnimator.getFrameDelay() + j17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.i3
    public ze.n getRuntime() {
        return (ze.n) super.getRuntime();
    }
}

package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class id0 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f112961e;

    public id0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, boolean z17) {
        this.f112960d = nd0Var;
        this.f112961e = z17;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] onAnimationCancel");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f112960d;
        nd0Var.f113625z.setVisibility(4);
        nd0Var.A.setVisibility(4);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] onAnimationEnd");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f112960d.G1(this.f112961e, "#5", bool, bool);
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}

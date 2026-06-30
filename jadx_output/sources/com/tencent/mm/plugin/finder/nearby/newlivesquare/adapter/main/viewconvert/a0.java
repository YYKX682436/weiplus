package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class a0 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x f121560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121561f;

    public a0(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var) {
        this.f121559d = s0Var;
        this.f121560e = xVar;
        this.f121561f = m0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        in5.s0 s0Var = this.f121559d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.tencent.mars.xlog.Log.i("BigBannerListConvert", "#lifeCallback-onActivityDestroyed autoPlayManager=" + this.f121560e.f122016f);
            this.f121561f.o(s0Var);
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Context context = this.f121559d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStopped autoPlayManager=");
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar = this.f121560e;
            sb6.append(xVar.f122016f);
            com.tencent.mars.xlog.Log.i("BigBannerListConvert", sb6.toString());
            gp2.l0 l0Var = xVar.f122016f;
            if (l0Var != null) {
                l0Var.m();
            }
            gp2.l0 l0Var2 = xVar.f122016f;
            if (l0Var2 != null) {
                c50.m0.c(l0Var2, null, 1, null);
            }
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Context context = this.f121559d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStarted autoPlayManager=");
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar = this.f121560e;
            sb6.append(xVar.f122016f);
            com.tencent.mars.xlog.Log.i("BigBannerListConvert", sb6.toString());
            gp2.l0 l0Var = xVar.f122016f;
            if (l0Var == null || l0Var.f274260s) {
                return;
            }
            l0Var.g();
        }
    }
}

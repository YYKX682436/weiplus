package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class h5 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 f121715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121716f;

    public h5(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var) {
        this.f121714d = s0Var;
        this.f121715e = a5Var;
        this.f121716f = t5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        in5.s0 s0Var = this.f121714d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "#lifeCallback-onActivityDestroyed autoPlayManager=" + this.f121715e.f121576d);
            this.f121716f.p(s0Var);
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Context context = this.f121714d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStopped autoPlayManager=");
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var = this.f121715e;
            sb6.append(a5Var.f121576d);
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
            gp2.l0 l0Var = a5Var.f121576d;
            if (l0Var != null) {
                l0Var.m();
            }
            gp2.l0 l0Var2 = a5Var.f121576d;
            if (l0Var2 != null) {
                c50.m0.c(l0Var2, null, 1, null);
            }
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Context context = this.f121714d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStarted autoPlayManager=");
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var = this.f121715e;
            sb6.append(a5Var.f121576d);
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
            gp2.l0 l0Var = a5Var.f121576d;
            if (l0Var == null || l0Var.f274260s) {
                return;
            }
            l0Var.g();
        }
    }
}

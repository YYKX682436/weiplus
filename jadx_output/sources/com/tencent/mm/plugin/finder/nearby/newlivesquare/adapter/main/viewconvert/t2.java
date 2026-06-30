package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class t2 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2 f121947e;

    public t2(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2 y2Var) {
        this.f121946d = s0Var;
        this.f121947e = y2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        in5.s0 s0Var = this.f121946d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "#lifeCallback-onActivityDestroyed");
            this.f121947e.q(s0Var);
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Context context = this.f121946d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "#lifeCallback-onActivityResumed");
        }
    }
}

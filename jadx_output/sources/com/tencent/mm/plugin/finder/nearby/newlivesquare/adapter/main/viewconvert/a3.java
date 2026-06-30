package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class a3 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b3 f121570e;

    public a3(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b3 b3Var) {
        this.f121569d = s0Var;
        this.f121570e = b3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        in5.s0 s0Var = this.f121569d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.tencent.mars.xlog.Log.i("LivingTitleConvert", "#lifeCallback-onActivityDestroyed");
            this.f121570e.n(s0Var);
        }
    }
}

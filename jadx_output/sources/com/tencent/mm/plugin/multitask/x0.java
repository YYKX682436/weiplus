package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class x0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.i1 f150615d;

    public x0(com.tencent.mm.plugin.multitask.i1 i1Var) {
        this.f150615d = i1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i(this.f150615d.f150445d, "onActivityCreated : %s", activity.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
        com.tencent.mm.plugin.multitask.i1 i1Var = this.f150615d;
        if (z17) {
            zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activity);
            boolean z18 = false;
            if (Ai != null && ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).O6()) {
                z18 = true;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i(i1Var.f150445d, "onActivityResumed activity:{" + activity + "} canShowFloatBall true");
                ((com.tencent.mm.plugin.multitask.p1) i95.n0.c(com.tencent.mm.plugin.multitask.p1.class)).Ni().a();
                com.tencent.mm.plugin.multitask.m0.b(((com.tencent.mm.plugin.multitask.p1) i95.n0.c(com.tencent.mm.plugin.multitask.p1.class)).Ni(), null, null, 3, null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(i1Var.f150445d, "onActivityResumed activity:{" + activity + "} canShowFloatBall false");
        com.tencent.mm.plugin.multitask.m0.d(((com.tencent.mm.plugin.multitask.p1) i95.n0.c(com.tencent.mm.plugin.multitask.p1.class)).Ni(), null, null, 3, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}

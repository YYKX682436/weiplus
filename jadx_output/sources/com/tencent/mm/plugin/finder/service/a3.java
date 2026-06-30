package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class a3 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f126000d;

    public a3(com.tencent.mm.plugin.finder.service.l3 l3Var) {
        this.f126000d = l3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            return;
        }
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126000d;
        if (l3Var.Di(activity)) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onActivityCreated: non finder activity = ".concat(activity.getClass().getSimpleName()));
            l3Var.f126137w.add(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126000d;
        l3Var.f126136v.remove(activity);
        if (l3Var.f126137w.remove(activity)) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onActivityDestroyed: non finder activity same task activity = ".concat(activity.getClass().getSimpleName()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f126000d.f126135u = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f126000d.f126135u = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            return;
        }
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126000d;
        if (l3Var.Di(activity)) {
            java.util.Set set = l3Var.f126136v;
            if (set.contains(activity)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onNonFinderActivityForeground: activity = ".concat(activity.getClass().getSimpleName()));
            set.add(activity);
            l3Var.f126130p = 0L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            return;
        }
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126000d;
        if (l3Var.Di(activity)) {
            java.util.Set set = l3Var.f126136v;
            set.remove(activity);
            com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onNonFinderActivityBackground: activity = ".concat(activity.getClass().getSimpleName()));
            if (set.size() == 0 && l3Var.f126132r.size() == 0) {
                com.tencent.mars.xlog.Log.i("FinderMultiTaskService", "onNonFinderActivityBackground: record finder background timestamp");
                l3Var.f126130p = java.lang.System.currentTimeMillis();
            }
        }
    }
}

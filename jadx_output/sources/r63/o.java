package r63;

/* loaded from: classes14.dex */
public final class o implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r63.p f393053d;

    public o(r63.p pVar) {
        this.f393053d = pVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        r63.l lVar = r63.l.f393022a;
        java.lang.String name = activity.getClass().getName();
        if ((kotlin.jvm.internal.o.b("com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity", name) || kotlin.jvm.internal.o.b("WXShortcutEntryActivity", name)) && com.tencent.mm.sdk.platformtools.c2.g(activity.getIntent(), "type", 0) == 5) {
            r63.l.f393039r = java.lang.Boolean.TRUE;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "enter from finder Shortcut");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.f393053d.getClass();
        if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI", simpleName) || kotlin.jvm.internal.o.b("FinderMultiTaskUI", simpleName)) {
            r63.l lVar = r63.l.f393022a;
            int hashCode = activity.hashCode();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onContentFloatBallActivityPause " + simpleName + ", " + hashCode);
            r63.l.f393036o.remove(java.lang.Integer.valueOf(hashCode));
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) ((jz5.n) r63.l.f393040s).getValue();
        boolean isInteractive = powerManager != null ? powerManager.isInteractive() : true;
        java.lang.String simpleName2 = activity.getClass().getSimpleName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityPause ");
        sb6.append(!isInteractive);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", sb6.toString());
        if (r63.n.f393042a.p()) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LATEST_ENTER_METHOD").getString(simpleName2, "");
            r63.l.f393029h = string != null ? string : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "set sdk enter method " + r63.l.f393029h);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.f393053d.getClass();
        if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI", simpleName) || kotlin.jvm.internal.o.b("FinderMultiTaskUI", simpleName)) {
            r63.l lVar = r63.l.f393022a;
            int hashCode = activity.hashCode();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onContentFloatBallActivityResume " + simpleName + ", " + hashCode);
            r63.l.f393036o.put(java.lang.Integer.valueOf(hashCode), r63.l.f393035n);
        }
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

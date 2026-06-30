package ef0;

/* loaded from: classes11.dex */
public final class g3 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.h3 f252216d;

    public g3(ef0.h3 h3Var) {
        this.f252216d = h3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean b17 = kotlin.jvm.internal.o.b(activity.getClass(), com.tencent.mm.plugin.ting.TingFlutterActivity.class);
        ef0.h3 h3Var = this.f252216d;
        if (b17) {
            activity.toString();
            h3Var.Bi((com.tencent.mm.plugin.ting.TingFlutterActivity) activity);
            return;
        }
        if (h3Var.Ai()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFlutterActivityManagerService", "onActivityCreated activity: " + activity + ", taskId: " + activity.getTaskId() + ", currentTingTaskId: " + h3Var.f252226f + ", activityListAboveTing.size: " + h3Var.f252227g.size());
            java.lang.Integer num = h3Var.f252226f;
            int taskId = activity.getTaskId();
            if (num != null && num.intValue() == taskId) {
                h3Var.f252227g.add(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        ef0.h3 h3Var = this.f252216d;
        if (!kotlin.jvm.internal.o.b(activity, h3Var.f252225e)) {
            h3Var.f252227g.remove(activity);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFlutterActivityManagerService", "onActivityDestroyed TingFlutterActivity destroy: " + activity);
        h3Var.Bi(null);
        h3Var.f252227g.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
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

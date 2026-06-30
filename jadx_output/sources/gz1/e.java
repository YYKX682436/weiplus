package gz1;

/* loaded from: classes13.dex */
public abstract class e implements rk5.a {
    @Override // rk5.a
    public void D5(java.lang.Object caller, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(caller, "caller");
    }

    @Override // rk5.a
    public void H(android.app.Activity caller) {
        kotlin.jvm.internal.o.g(caller, "caller");
    }

    public abstract void a(android.app.Activity activity);

    @Override // rk5.a
    public void cc(android.app.Activity caller) {
        kotlin.jvm.internal.o.g(caller, "caller");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        gz1.b bVar;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz1.d.f277718h;
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(activity.hashCode())) || (bVar = (gz1.b) gz1.d.f277717g.get(concurrentHashMap.get(java.lang.Integer.valueOf(activity.hashCode())))) == null) {
            return;
        }
        bVar.f277710i = false;
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) bVar.f277702a.get();
        if (fragment != null) {
            gz1.d.f277714d.p(fragment, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        a(activity);
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

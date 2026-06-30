package ls5;

/* loaded from: classes3.dex */
public final class a implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f321115d = new java.util.LinkedList();

    public final void a(android.app.Activity activity, java.lang.String str) {
        synchronized (this.f321115d) {
            try {
                java.lang.String b17 = b(activity, str);
                if (this.f321115d.size() >= 10) {
                    this.f321115d.remove(0);
                    this.f321115d.add(b17);
                } else {
                    this.f321115d.add(b17);
                }
            } catch (java.lang.IndexOutOfBoundsException unused) {
            }
        }
    }

    public final java.lang.String b(android.app.Activity activity, java.lang.String str) {
        return activity.getClass().getSimpleName() + '_' + str;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        a(activity, "Create");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        a(activity, "Destroy");
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

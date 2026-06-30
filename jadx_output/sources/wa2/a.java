package wa2;

/* loaded from: classes3.dex */
public final class a implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f444101d;

    public a(yz5.q callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f444101d = callback;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f444101d.invoke(activity, bundle, java.lang.Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f444101d.invoke(activity, null, java.lang.Boolean.FALSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity p07, android.os.Bundle p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}

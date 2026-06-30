package sf5;

/* loaded from: classes15.dex */
public final class c implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final android.app.Activity activity, final android.os.Bundle bundle) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
        if (z17) {
            sf5.e.f407631c.c(activity, bundle);
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = z17 ? (androidx.appcompat.app.AppCompatActivity) activity : null;
        if (appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.ui.component.support.ActivityLifecycleInjector$registerActivityLifecycleCallbacks$1$onActivityCreated$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
            public final void onPostCreate() {
                sf5.e.f407631c.a(activity, bundle);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onPreDestroy() {
                sf5.e.f407631c.d(activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
            sf5.e.f407631c.b(activity);
        }
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

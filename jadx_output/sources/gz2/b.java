package gz2;

/* loaded from: classes8.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String shortClassName = activity.getComponentName().getShortClassName();
        kotlin.jvm.internal.o.f(shortClassName, "getShortClassName(...)");
        if (r26.i0.n(shortClassName, "FinderHomeAffinityUI", false)) {
            gz2.c.f277731d = "finder";
            gz2.c.f277728a.c("finder");
            return;
        }
        java.lang.String shortClassName2 = activity.getComponentName().getShortClassName();
        kotlin.jvm.internal.o.f(shortClassName2, "getShortClassName(...)");
        if (r26.i0.n(shortClassName2, "FinderLiveSquareNewEntranceUI", false)) {
            gz2.c.f277731d = "live";
            gz2.c.f277728a.c("live");
            return;
        }
        java.lang.String shortClassName3 = activity.getComponentName().getShortClassName();
        kotlin.jvm.internal.o.f(shortClassName3, "getShortClassName(...)");
        if (r26.i0.n(shortClassName3, "SnsTimeLineUI", false)) {
            gz2.c.f277731d = "sns";
            gz2.c.f277728a.c("sns");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String shortClassName = activity.getComponentName().getShortClassName();
        kotlin.jvm.internal.o.f(shortClassName, "getShortClassName(...)");
        if (r26.i0.n(shortClassName, "FinderHomeAffinityUI", false)) {
            gz2.c.f277728a.d("finder");
            gz2.c.f277731d = "";
            return;
        }
        java.lang.String shortClassName2 = activity.getComponentName().getShortClassName();
        kotlin.jvm.internal.o.f(shortClassName2, "getShortClassName(...)");
        if (r26.i0.n(shortClassName2, "FinderLiveSquareNewEntranceUI", false)) {
            gz2.c.f277728a.d("live");
            gz2.c.f277731d = "";
            return;
        }
        java.lang.String shortClassName3 = activity.getComponentName().getShortClassName();
        kotlin.jvm.internal.o.f(shortClassName3, "getShortClassName(...)");
        if (r26.i0.n(shortClassName3, "SnsTimeLineUI", false)) {
            gz2.c.f277728a.d("sns");
            gz2.c.f277731d = "";
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

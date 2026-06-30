package nr5;

/* loaded from: classes13.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        or5.b.a("%s.onCreate", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((nr5.a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        or5.b.a("%s.onDestroy", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((nr5.a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        or5.b.a("%s.onPause", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((nr5.a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        or5.b.a("%s.onResume", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((nr5.a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        or5.b.a("%s.onSaveInstanceState", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((nr5.a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        or5.b.a("%s.onStart", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((nr5.a) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        or5.b.a("%s.onStop", activity);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).iterator();
        while (it.hasNext()) {
            ((gs5.e) ((nr5.a) it.next())).getClass();
            ((lr5.c) lr5.e.f320769b).execute(gs5.f.f275169b);
        }
    }
}

package gt2;

/* loaded from: classes10.dex */
public final class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt2.d f275377d;

    public b(gt2.d dVar) {
        this.f275377d = dVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String name = activity.getClass().getName();
        gt2.d dVar = this.f275377d;
        if (dVar.a(activity) > 0) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f275380a;
            gt2.a aVar = (gt2.a) concurrentHashMap.get(name);
            if (aVar != null) {
                aVar.f275375c = c01.id.c();
                dVar.b(name, aVar, "onDestroy");
            }
            kotlin.jvm.internal.m0.c(concurrentHashMap).remove(name);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String name = activity.getClass().getName();
        gt2.d dVar = this.f275377d;
        if (dVar.f275380a.contains(name)) {
            return;
        }
        if (dVar.a(activity) > 0) {
            long c17 = c01.id.c();
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).c(zy2.ra.class))).V6();
            int a17 = dVar.a(activity);
            dVar.f275380a.put(name, new gt2.a(a17, c17, 0L, V6, 4, null));
            com.tencent.mars.xlog.Log.i("FinderProcessOutReporter", "onActivityResumed activity:" + name + " processId:" + a17 + " inTime:" + c17);
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
        java.lang.String name = activity.getClass().getName();
        if (activity.isFinishing()) {
            gt2.d dVar = this.f275377d;
            if (dVar.a(activity) > 0) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f275380a;
                gt2.a aVar = (gt2.a) concurrentHashMap.get(name);
                if (aVar != null) {
                    aVar.f275375c = c01.id.c();
                    dVar.b(name, aVar, "onStop");
                }
                kotlin.jvm.internal.m0.c(concurrentHashMap).remove(name);
            }
        }
    }
}

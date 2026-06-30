package ez1;

/* loaded from: classes13.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ez1.f f257839d = new ez1.f();

    @Override // java.lang.Runnable
    public final void run() {
        if (!com.tencent.mm.sdk.platformtools.x2.n() || ez1.g.f257843o.size() != 0 || ez1.g.f257845q || ez1.g.f257846r) {
            return;
        }
        ez1.g gVar = ez1.g.f257840i;
        android.app.Activity activity = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(invoke);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.util.ArrayMap<*, *>");
            android.util.ArrayMap arrayMap = (android.util.ArrayMap) obj;
            if (!arrayMap.isEmpty()) {
                kotlin.jvm.internal.o.f(arrayMap.values(), "<get-values>(...)");
                if (!r4.isEmpty()) {
                    java.util.Collection values = arrayMap.values();
                    kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                    java.util.Iterator it = kz5.n0.x0(values).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        java.lang.reflect.Field declaredField2 = next.getClass().getDeclaredField(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                        declaredField2.setAccessible(true);
                        java.lang.Object obj2 = declaredField2.get(next);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type android.app.Activity");
                        android.app.Activity activity2 = (android.app.Activity) obj2;
                        if (!gVar.X(activity2)) {
                            activity = activity2;
                            break;
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (activity != null) {
            com.tencent.mars.xlog.Log.i("Amoeba.AppEventMonitor", "[startMonitor] mainProcess already start activity : ".concat(activity.getClass().getSimpleName()));
            ez1.g.f257840i.onActivityStarted(activity);
        }
    }
}

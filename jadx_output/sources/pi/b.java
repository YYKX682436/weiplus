package pi;

/* loaded from: classes12.dex */
public class b implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    public static final pi.b f354494e = new pi.b();

    /* renamed from: d, reason: collision with root package name */
    public pi.a f354495d = null;

    public static android.app.Activity a() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.Object invoke = cls.getMethod("currentActivityThread", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (java.lang.Object obj : ((java.util.Map) declaredField.get(invoke)).values()) {
                java.lang.Class<?> cls2 = obj.getClass();
                java.lang.reflect.Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    java.lang.reflect.Field declaredField3 = cls2.getDeclaredField(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    declaredField3.setAccessible(true);
                    return (android.app.Activity) declaredField3.get(obj);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public static pi.a b(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return new pi.a(-1, "null");
        }
        try {
            java.lang.String[] split = str.split(" : ");
            return new pi.a(java.lang.Integer.parseInt(split[0]), split[1]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("matrix.ActivityRecorder", th6, "", new java.lang.Object[0]);
            return new pi.a(-1, "");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f354495d = new pi.a(activity.hashCode(), activity.getLocalClassName());
        com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().updateCurrActivity(this.f354495d.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.f354495d = new pi.a(activity.hashCode(), activity.getLocalClassName());
        com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().updateCurrActivity(this.f354495d.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}

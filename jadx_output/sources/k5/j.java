package k5;

/* loaded from: classes12.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f304133a = a5.a0.e("ProcessUtils");

    public static boolean a(android.content.Context context, a5.d dVar) {
        java.lang.String str;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            str = android.app.Application.getProcessName();
        } else {
            try {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread", false, k5.j.class.getClassLoader()).getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                java.lang.Object invoke = declaredMethod.invoke(null, new java.lang.Object[0]);
                if (invoke instanceof java.lang.String) {
                    str = (java.lang.String) invoke;
                }
            } catch (java.lang.Throwable th6) {
                a5.a0.c().a(f304133a, "Unable to check ActivityThread for processName", th6);
            }
            int myPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        dVar.getClass();
        return !android.text.TextUtils.isEmpty(null) ? android.text.TextUtils.equals(str, null) : android.text.TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}

package uv5;

/* loaded from: classes13.dex */
public abstract class a extends com.tencent.tinker.loader.shareutil.ShareTinkerInternals {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f431469a;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2 = f431469a;
        if (str2 != null) {
            return str2;
        }
        try {
            str = context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.tinker.lib.service.TinkerPatchService.class), 0).processName;
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        f431469a = str;
        return str;
    }

    public static void b(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        java.lang.String a17 = a(context);
        if (a17 == null || (runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(a17)) {
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }
}

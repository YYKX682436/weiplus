package ko3;

/* loaded from: classes5.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f309973a;

    static {
        long nanoTime = java.lang.System.nanoTime();
        try {
            try {
                f309973a = false;
                java.lang.reflect.Field declaredField = android.app.ActivityManager.RecentTaskInfo.class.getDeclaredField("instanceId");
                declaredField.setAccessible(true);
                java.util.List<android.app.ActivityManager.RecentTaskInfo> recentTasks = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRecentTasks(1, 2);
                if (recentTasks != null && recentTasks.size() != 0) {
                    if (declaredField.getInt(recentTasks.get(0)) > 0) {
                        f309973a = true;
                    }
                }
                f309973a = false;
            } finally {
                com.tencent.mars.xlog.Log.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", java.lang.Boolean.valueOf(f309973a), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
            }
        } catch (java.lang.Throwable unused) {
            f309973a = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", false, java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
        }
    }
}

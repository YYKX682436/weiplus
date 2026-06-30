package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r1 f192966a = new com.tencent.mm.sdk.platformtools.q1();

    public static boolean a(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }
}

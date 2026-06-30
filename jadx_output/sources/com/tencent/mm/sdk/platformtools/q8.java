package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class q8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f192944a;

    public q8(android.content.Context context) {
        this.f192944a = context;
    }

    public java.lang.String toString() {
        android.content.Context context = this.f192944a;
        if (context == null) {
            return null;
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        java.lang.String packageName = context.getPackageName();
        if (activityManager == null || com.tencent.mm.sdk.platformtools.t8.K0(packageName)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            for (android.app.ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(100)) {
                if (runningTaskInfo.baseActivity.getClassName().startsWith(packageName) || runningTaskInfo.topActivity.getClassName().startsWith(packageName)) {
                    sb6.append(java.lang.String.format("{id:%d num:%d/%d top:%s base:%s}", java.lang.Integer.valueOf(runningTaskInfo.id), java.lang.Integer.valueOf(runningTaskInfo.numRunning), java.lang.Integer.valueOf(runningTaskInfo.numActivities), runningTaskInfo.topActivity.getShortClassName(), runningTaskInfo.baseActivity.getShortClassName()));
                }
            }
            return sb6.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Util", e17, "", new java.lang.Object[0]);
            return "";
        }
    }
}

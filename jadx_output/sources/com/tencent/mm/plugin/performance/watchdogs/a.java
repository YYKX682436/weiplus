package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.a f153000e = new com.tencent.mm.plugin.performance.watchdogs.a();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f153001f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f153002g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.ActivityManager f153003d = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);

    @Override // java.lang.Runnable
    public void run() {
        android.os.Debug.MemoryInfo[] memoryInfoArr;
        android.app.ActivityManager activityManager = this.f153003d;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < runningAppProcesses.size(); i17++) {
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i17);
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
            if (android.os.Process.myUid() == runningAppProcessInfo.uid && !android.text.TextUtils.isEmpty(runningAppProcessInfo.processName) && runningAppProcessInfo.processName.startsWith("com.tencent.mm")) {
                ob0.s3 s3Var = new ob0.s3();
                s3Var.f343944a = runningAppProcesses.get(i17).pid;
                s3Var.f343945b = runningAppProcesses.get(i17).processName;
                arrayList.add(s3Var);
            } else {
                com.tencent.mars.xlog.Log.e("AppbrandMemoryMonitor", "info with uid [%s] & process name [%s] is not current app [%s][%s]", java.lang.Integer.valueOf(runningAppProcesses.get(i17).uid), runningAppProcesses.get(i17).processName, java.lang.Integer.valueOf(android.os.Process.myUid()), "com.tencent.mm");
            }
        }
        int size = arrayList.size();
        ob0.s3[] s3VarArr = new ob0.s3[size];
        arrayList.toArray(s3VarArr);
        try {
            int[] iArr = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr[i18] = s3VarArr[i18].f343944a;
            }
            memoryInfoArr = activityManager.getProcessMemoryInfo(iArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AppbrandMemoryMonitor", e17, "", new java.lang.Object[0]);
            memoryInfoArr = null;
        }
        if (memoryInfoArr != null) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                iz5.a.a(size, memoryInfoArr.length);
            }
            int i19 = 0;
            for (int i27 = 0; i27 < java.lang.Math.min(memoryInfoArr.length, size); i27++) {
                android.os.Debug.MemoryInfo memoryInfo = memoryInfoArr[i27];
                if (memoryInfo != null) {
                    memoryInfo.getTotalPss();
                    s3VarArr[i27].f343968y = memoryInfoArr[i27].getTotalPss();
                    i19 += s3VarArr[i27].f343968y;
                }
            }
            if (i19 > f153002g) {
                f153001f = true;
            } else {
                f153001f = false;
            }
        } else {
            com.tencent.mars.xlog.Log.e("AppbrandMemoryMonitor", "pidMemInfoArray2 == null");
        }
        ((ku5.t0) ku5.t0.f312615d).l(this, 300000L, "AppbrandMemoryMonitor");
    }
}

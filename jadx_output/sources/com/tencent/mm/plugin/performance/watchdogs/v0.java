package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.v0 f153140g = new com.tencent.mm.plugin.performance.watchdogs.v0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f153141d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f153142e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.ActivityManager f153143f = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);

    public final java.util.List a() {
        android.os.Debug.MemoryInfo memoryInfo;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.ActivityManager activityManager = this.f153143f;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (runningAppProcesses != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                int myUid = android.os.Process.myUid();
                int i17 = runningAppProcessInfo.uid;
                if (myUid != i17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ProcessWatchDog", "info with uid [%s] & process name [%s] is not current app [%s]", java.lang.Integer.valueOf(i17), runningAppProcessInfo.processName, java.lang.Integer.valueOf(android.os.Process.myUid()));
                } else {
                    android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{runningAppProcessInfo.pid});
                    com.tencent.mm.plugin.performance.watchdogs.u0 u0Var = new com.tencent.mm.plugin.performance.watchdogs.u0(runningAppProcessInfo.processName, runningAppProcessInfo.pid);
                    if (processMemoryInfo != null && processMemoryInfo.length == 1 && (memoryInfo = processMemoryInfo[0]) != null) {
                        u0Var.f153138c = memoryInfo.getTotalPss();
                    }
                    arrayList.add(u0Var);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessWatchDog", "dumpProcess cost: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) a();
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(new com.tencent.mars.smc.IDKey(1474, 0, 1));
            if (size <= 127) {
                arrayList2.add(new com.tencent.mars.smc.IDKey(1474, size, 1));
            }
            jx3.f.INSTANCE.b(arrayList2, false);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_process_watchdog_count_threshold_v2, 12);
            java.util.Iterator it = arrayList.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((com.tencent.mm.plugin.performance.watchdogs.u0) it.next()).f153138c;
            }
            java.lang.String replace = java.util.Arrays.toString(arrayList.toArray()).replace(",", ";");
            if (size >= Ni && size > this.f153142e) {
                this.f153142e = size;
                jx3.f.INSTANCE.d(20846, java.lang.Integer.valueOf(size), replace, java.lang.Long.valueOf(j17));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessWatchDog", "DumpProcesses: %s || pssSum : %s", replace, java.lang.Long.valueOf(j17));
        }
        ((ku5.t0) ku5.t0.f312615d).k(this, this.f153141d ? 300000L : 1800000L);
    }
}

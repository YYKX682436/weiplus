package yd;

/* loaded from: classes7.dex */
public enum c0 {
    INST;


    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f460932e = {"summary.native-heap", "summary.graphics"};

    public static yd.b0 a(android.os.Debug.MemoryInfo memoryInfo) {
        yd.b0 b0Var = new yd.b0();
        if (memoryInfo == null) {
            return b0Var;
        }
        b0Var.f460918a = memoryInfo.getTotalPss() / 1024;
        b0Var.f460919b = memoryInfo.nativePss / 1024;
        b0Var.f460920c = memoryInfo.dalvikPss / 1024;
        b0Var.f460921d = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.graphics"), 0) / 1024;
        b0Var.f460922e = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.system"), 0) / 1024;
        b0Var.f460923f = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.total-swap"), 0) / 1024;
        b0Var.f460924g = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.java-heap"), 0) / 1024;
        b0Var.f460925h = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.private-other"), 0) / 1024;
        b0Var.f460926i = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.code"), 0) / 1024;
        b0Var.f460927j = com.tencent.mm.sdk.platformtools.t8.D1(memoryInfo.getMemoryStat("summary.stack"), 0) / 1024;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
        java.util.Map<java.lang.String, java.lang.String> memoryStats = memoryInfo.getMemoryStats();
        for (java.lang.String str : memoryStats.keySet()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && yo.a.b(f460932e, str)) {
                sb6.append(str);
                sb6.append(":");
                java.lang.String str2 = memoryStats.get(str);
                java.util.Objects.requireNonNull(str2);
                sb6.append(com.tencent.mm.sdk.platformtools.t8.D1(str2, 0) / 1024);
                sb6.append("m ");
                sb6.append(java.lang.System.getProperty("line.separator"));
            }
        }
        b0Var.f460928k = sb6.toString();
        return b0Var;
    }

    public yd.b0 h() {
        android.os.Debug.MemoryInfo[] processMemoryInfo;
        int myPid = android.os.Process.myPid();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return a((activityManager == null || (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{myPid})) == null || processMemoryInfo.length <= 0) ? null : processMemoryInfo[0]);
    }
}

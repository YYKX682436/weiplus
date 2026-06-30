package com.tencent.mm.plugin.finder.report;

/* loaded from: classes3.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.n1 f125204d;

    public o1(com.tencent.mm.plugin.finder.report.n1 n1Var) {
        this.f125204d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.report.m1 m1Var = new com.tencent.mm.plugin.finder.report.m1();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) systemService).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if (processMemoryInfo != null && processMemoryInfo.length == 1) {
            android.os.Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
            m1Var.f125122a = memoryInfo.getTotalPss();
            m1Var.f125123b = memoryInfo.dalvikPss;
            m1Var.f125124c = memoryInfo.nativePss;
        }
        com.tencent.mm.plugin.finder.report.n1 n1Var = this.f125204d;
        if (n1Var != null) {
            com.tencent.mm.plugin.finder.live.view.e0 e0Var = (com.tencent.mm.plugin.finder.live.view.e0) n1Var;
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.d0(m1Var, e0Var.f116261a, e0Var.f116262b));
        }
    }
}

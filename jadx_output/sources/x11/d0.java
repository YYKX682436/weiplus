package x11;

/* loaded from: classes12.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        try {
            return java.lang.Runtime.getRuntime().availableProcessors();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "getCpuCoreNum err", new java.lang.Object[0]);
            return -1;
        }
    }

    public final long b() {
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "getMemorySize err", new java.lang.Object[0]);
            return -1L;
        }
    }

    public final void c(java.lang.String str, long j17) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "reportClickAuth() called sessionId:" + str);
            int a17 = a();
            long b17 = b();
            com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct newInitPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct();
            newInitPerformanceStruct.f59687d = newInitPerformanceStruct.b("reversion", com.tencent.mm.sdk.platformtools.z.f193109e, true);
            newInitPerformanceStruct.f59700q = newInitPerformanceStruct.b("sessionid", str, true);
            newInitPerformanceStruct.f59701r = a17;
            newInitPerformanceStruct.f59702s = b17;
            x11.e0[] e0VarArr = x11.e0.f451357d;
            newInitPerformanceStruct.f59699p = 4;
            x11.b0.f451350a.a(newInitPerformanceStruct, java.lang.Long.valueOf(j17));
            newInitPerformanceStruct.k();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
    }
}

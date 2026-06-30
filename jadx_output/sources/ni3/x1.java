package ni3;

/* loaded from: classes12.dex */
public class x1 implements java.lang.Runnable {
    public x1(ni3.g2 g2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "queryStatsForPackage");
            android.app.usage.StorageStats queryStatsForPackage = ((android.app.usage.StorageStatsManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.app.usage.StorageStatsManager.class)).queryStatsForPackage(android.os.storage.StorageManager.UUID_DEFAULT, com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), android.os.Process.myUserHandle());
            com.tencent.mm.sdk.platformtools.o4.L().B("SystemGetAppBytes", queryStatsForPackage.getAppBytes());
            com.tencent.mm.sdk.platformtools.o4.L().B("SystemGetDataBytes", queryStatsForPackage.getDataBytes());
            com.tencent.mm.sdk.platformtools.o4.L().B("SystemGetCacheBytes", queryStatsForPackage.getCacheBytes());
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "ss.getAppBytes() = " + queryStatsForPackage.getAppBytes() + ", ss.getDataBytes() = " + queryStatsForPackage.getDataBytes() + ", ss.getCacheBytes() = " + queryStatsForPackage.getCacheBytes());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", e17, "Cannot get storage stats from system.", new java.lang.Object[0]);
        }
    }
}

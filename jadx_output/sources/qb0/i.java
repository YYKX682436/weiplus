package qb0;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {
    public i(qb0.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.PluginPerformance", "onLowMemory -> dump memory");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPerformance", "[onLowMemory] %s", com.tencent.mm.plugin.performance.watchdogs.b0.B.g());
    }
}

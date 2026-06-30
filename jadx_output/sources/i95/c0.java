package i95;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ServiceManager", "[!] Watchdog task for delayed ASYNC preload FeatureServices triggered.");
        if (i95.n0.g()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ServiceManager", "[!] Watchdog task for delayed ASYNC preload FeatureServices actually post notify task.");
            android.os.Handler handler = i95.n0.f289829m;
            java.lang.Runnable runnable = i95.n0.f289832p;
            handler.removeCallbacks(runnable);
            handler.postAtFrontOfQueue(runnable);
            i95.n0.f289817a.unregisterActivityLifecycleCallbacks(i95.n0.f289834r);
            handler.removeCallbacks(i95.n0.f289833q);
        }
    }
}

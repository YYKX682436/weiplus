package i95;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] Notify task for delayed ASYNC preload FeatureServices triggered.");
        if (i95.n0.g()) {
            try {
                android.os.Handler handler = i95.n0.f289829m;
                handler.removeCallbacks(i95.n0.f289833q);
                com.tencent.mars.xlog.Log.i("MicroMsg.ServiceManager", "[+] Notify ASYNC preload FeatureServices was actually executed.");
                i95.n0.e(true, false);
                handler.removeCallbacks(i95.n0.f289832p);
            } catch (java.lang.Throwable th6) {
                i95.n0.f289829m.removeCallbacks(i95.n0.f289832p);
                throw th6;
            }
        }
    }
}

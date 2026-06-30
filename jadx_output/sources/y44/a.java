package y44;

/* loaded from: classes4.dex */
public final class a implements y44.d, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final y44.a f459356d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f459357e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher f459358f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.os.Handler f459359g;

    static {
        y44.a aVar = new y44.a();
        f459356d = aVar;
        f459357e = new java.util.LinkedHashMap();
        f459358f = new com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher(aVar);
        f459359g = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final synchronized void a(java.lang.String pkg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
        kotlin.jvm.internal.o.g(pkg, "pkg");
        try {
            java.util.Map map = f459357e;
            map.remove(pkg);
            if (map.isEmpty()) {
                f459359g.removeCallbacks(this);
                f459358f.d();
                com.tencent.mars.xlog.Log.i("SnsAd.ApkWatcherManager", "the pkg map is empty, unregister watcher!!");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAd.ApkWatcherManager", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.LinkedHashMap) f459357e).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            y44.c cVar = (y44.c) entry.getValue();
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartTime", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartTime", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            long j17 = cVar.f459361b;
            y44.c cVar2 = (y44.c) entry.getValue();
            cVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDelayDuration", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDelayDuration", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
            if (j17 + cVar2.f459362c <= currentTimeMillis) {
                it.remove();
            }
        }
        if (f459357e.isEmpty()) {
            f459358f.d();
            com.tencent.mars.xlog.Log.i("SnsAd.ApkWatcherManager", "the pkg map is empty, unregister watcher in timer !!");
        } else {
            f459359g.postDelayed(this, 60000L);
            com.tencent.mars.xlog.Log.i("SnsAd.ApkWatcherManager", "the pkg map is not empty, make new time delay!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
    }
}

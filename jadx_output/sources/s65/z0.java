package s65;

/* loaded from: classes11.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.UpdaterService f403569d;

    public z0(com.tencent.mm.sandbox.updater.UpdaterService updaterService) {
        this.f403569d = updaterService;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.sandbox.updater.UpdaterService updaterService = this.f403569d;
        if (((java.util.HashMap) updaterService.f192333i).size() > 0) {
            java.util.Iterator it = ((java.util.HashMap) updaterService.f192333i).values().iterator();
            while (it.hasNext()) {
                if (((s65.w) it.next()).d()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.UpdaterService", "checkAndTryStopSelf2, dont stop, some download mgr still busy");
                    return;
                }
            }
        }
        com.tencent.mm.sandbox.monitor.j jVar = com.tencent.mm.sandbox.monitor.k.f192292a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "isCrashWorking process:" + bm5.f1.a());
        if (com.tencent.mm.sdk.platformtools.x2.q()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "isCrashWorking :" + com.tencent.mm.sandbox.monitor.k.f192295d);
            z17 = com.tencent.mm.sandbox.monitor.k.f192295d;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("TBSDownloadMgr", "is still busy");
        } else {
            updaterService.stopSelf();
        }
    }
}

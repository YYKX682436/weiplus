package da4;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f227781d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ da4.h f227782e;

    public g(da4.h hVar, da4.e eVar) {
        this.f227782e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
        try {
            da4.h hVar = this.f227782e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            hVar.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            if (da4.h.a(this.f227782e)) {
                com.tencent.mm.sdk.platformtools.u3.i(this, 300000L);
                com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "there are some watcher info, the timer is going on");
            } else {
                da4.h.b(this.f227782e);
                this.f227781d = false;
                com.tencent.mars.xlog.Log.i("ApkInstalledWatcherManager", "the timer is end!");
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("ApkInstalledWatcherManager", "there is something wrong in timer run function");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$WatcherTimer");
    }
}

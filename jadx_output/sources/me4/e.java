package me4;

/* loaded from: classes12.dex */
public class e extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public int f325946d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f325947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.waid.WaidProvider f325948f;

    public e(com.tencent.mm.plugin.sns.waid.WaidProvider waidProvider) {
        this.f325948f = waidProvider;
        this.f325947e = 12000;
        java.lang.String str = com.tencent.mm.plugin.sns.waid.WaidProvider.f171733i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        int i17 = waidProvider.f171737f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpiredDuration", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        int i18 = 12000 - (i17 * 4000);
        i18 = i18 < 2000 ? 2000 : i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpiredDuration", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        this.f325947e = i18;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        com.tencent.mm.plugin.sns.waid.WaidProvider waidProvider = this.f325948f;
        java.lang.String str = com.tencent.mm.plugin.sns.waid.WaidProvider.f171733i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        java.lang.Object obj = waidProvider.f171738g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        synchronized (obj) {
            try {
                com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "break Wait, waitTime=" + this.f325946d);
                com.tencent.mm.plugin.sns.waid.WaidProvider waidProvider2 = this.f325948f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                waidProvider2.f171739h = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                com.tencent.mm.plugin.sns.waid.WaidProvider waidProvider3 = this.f325948f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                java.lang.Object obj2 = waidProvider3.f171738g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                obj2.notifyAll();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("breakWait", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
        com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "CheckThread run, thread.hash=" + hashCode());
        while (!me4.c.j()) {
            try {
                java.lang.Thread.sleep(200L);
                this.f325946d += 200;
            } catch (java.lang.Exception unused) {
            }
            int i17 = this.f325946d;
            int i18 = this.f325947e;
            if (i17 >= i18) {
                com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "wait expired, expiredDuration=" + i18);
                a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "init done");
        a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.waid.WaidProvider$InitStatusCheckThread");
    }
}

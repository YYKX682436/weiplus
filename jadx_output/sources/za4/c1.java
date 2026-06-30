package za4;

/* loaded from: classes4.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471073d;

    public c1(java.lang.String str) {
        this.f471073d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$3");
        java.lang.String str = this.f471073d;
        if (za4.z0.u(str) || a84.o0.a(str, dm.n.COL_ADXML)) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForMsg");
            za4.o0.g().o(str, dm.n.COL_ADXML, null, 5);
        } else {
            com.tencent.mars.xlog.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForMsg, invalid canvas");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$3");
    }
}

package za4;

/* loaded from: classes4.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471067e;

    public b1(java.lang.String str, java.lang.String str2) {
        this.f471066d = str;
        this.f471067e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$2");
        java.lang.String str = this.f471066d;
        boolean u17 = za4.z0.u(str);
        java.lang.String str2 = this.f471067e;
        if (u17 || a84.o0.a(str, dm.n.COL_ADXML)) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForSnsObject, snsId=" + str2);
            za4.o0.g().o(str, dm.n.COL_ADXML, null, 4);
        } else {
            com.tencent.mars.xlog.Log.w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForSnsObject, invalid canvas, snsId=" + str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$2");
    }
}

package za4;

/* loaded from: classes4.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g5 f471060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f471062f;

    public a1(r45.g5 g5Var, java.lang.String str, boolean z17) {
        this.f471060d = g5Var;
        this.f471061e = str;
        this.f471062f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        q34.b bVar;
        boolean z17 = this.f471062f;
        r45.g5 g5Var = this.f471060d;
        java.lang.String str2 = this.f471061e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$1");
        try {
            str = ca4.z0.t0(g5Var.f374885d.f374076d.Id);
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        try {
            bVar = new com.tencent.mm.plugin.sns.storage.ADInfo(x51.j1.g(g5Var.f374886e)).getAdPreloadConfig();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesPreDownloadResHelper", "parse adInfo exp=" + th6.toString());
            bVar = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preDownloadAdLandingPages, preloadConfig=");
        sb6.append(bVar == null ? "null" : bVar.toString());
        com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", sb6.toString());
        try {
            if (new com.tencent.mm.plugin.sns.storage.ADXml(str2).isLandingPagesAd() && za4.z0.u(str2)) {
                int i17 = z17 ? 6 : 0;
                com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages, scene=" + i17 + ", snsId=" + str);
                za4.o0.g().o(str2, dm.n.COL_ADXML, bVar, i17);
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages, exp=" + th7.toString() + ", snsId=" + str);
        }
        try {
            java.lang.String gestureCanvasInfo = com.tencent.mm.plugin.sns.storage.ADXml.getGestureCanvasInfo(str2);
            if (za4.z0.u(gestureCanvasInfo)) {
                int i18 = z17 ? 7 : 1;
                com.tencent.mars.xlog.Log.i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages for gestureAdXml, scene=" + i18 + ", snsId=" + str);
                za4.o0.g().o(gestureCanvasInfo, dm.n.COL_ADXML, bVar, i18);
            }
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPages for gestureAdXml, exp=" + th8.toString() + ", snsId=" + str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$1");
    }
}

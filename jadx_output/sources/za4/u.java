package za4;

/* loaded from: classes4.dex */
public class u extends za4.o {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f471196f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f471197g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f471198h;

    /* renamed from: i, reason: collision with root package name */
    public final int f471199i;

    /* renamed from: j, reason: collision with root package name */
    public final za4.t f471200j;

    public u(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, za4.t tVar) {
        com.tencent.mm.vfs.w6.u(str2);
        this.f471158a = str;
        this.f471196f = str2;
        this.f471197g = str3;
        this.f471198h = str2 + str3;
        this.f471199i = i17;
        this.f471200j = tVar;
    }

    public static /* synthetic */ za4.t a(za4.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        za4.t tVar = uVar.f471200j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        return tVar;
    }

    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        try {
            java.lang.String str2 = "0";
            int i17 = 0;
            if (com.tencent.mm.vfs.w6.j(str)) {
                str2 = "1";
                if (com.tencent.mm.vfs.w6.h(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, succ");
                    i17 = 1;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, failed");
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, file not exists");
            }
            java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            ca4.e0.a("sight_del_err_file", str2, this.f471199i, i17, "cdn|" + formatedNetType);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        try {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().downloadLandingPagesCDNFile(this.f471196f, this.f471197g, this.f471158a, this.f471199i, new za4.r(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "doInBackground exp, netType=" + com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a) + ", exp=" + e17.toString() + ", url=" + this.f471158a);
            b(this.f471198h);
            com.tencent.mm.sdk.platformtools.u3.h(new za4.s(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        return null;
    }
}

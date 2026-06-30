package za4;

/* loaded from: classes4.dex */
public class r implements fe0.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.u f471186a;

    public r(za4.u uVar) {
        this.f471186a = uVar;
    }

    @Override // fe0.o3
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadError, netType=");
        sb6.append(formatedNetType);
        sb6.append(", url=");
        za4.u uVar = this.f471186a;
        sb6.append(uVar.f471158a);
        com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        uVar.b(uVar.f471198h);
        if (za4.u.a(uVar) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new za4.p(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
    }

    @Override // fe0.o3
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
        if (za4.u.a(this.f471186a) != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new za4.q(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
    }
}

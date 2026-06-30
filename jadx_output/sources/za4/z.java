package za4;

/* loaded from: classes4.dex */
public class z implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f471231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f471233c;

    public z(za4.e0 e0Var, java.lang.String str, int i17) {
        this.f471231a = e0Var;
        this.f471232b = str;
        this.f471233c = i17;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        java.lang.String str = this.f471232b;
        com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageDownloadFileHelper", " download error for small file %s", str);
        com.tencent.mm.sdk.platformtools.u3.h(new za4.x(this));
        if (this.f471233c == 41) {
            n74.t.b(1, 0, 0, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        com.tencent.mm.sdk.platformtools.u3.h(new za4.w(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        java.lang.String str2 = this.f471232b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for small file %s", str2);
        com.tencent.mm.sdk.platformtools.u3.h(new za4.y(this, str));
        if (this.f471233c == 41) {
            n74.t.b(0, 0, 0, str2);
            m44.d.d("AdLandingPageDownloadFileHelper_HTTP", str2, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
    }
}

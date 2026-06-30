package jb4;

/* loaded from: classes4.dex */
public class q implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f298835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f298836c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb4.v f298838e;

    public q(jb4.v vVar, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f298838e = vVar;
        this.f298834a = str;
        this.f298835b = i17;
        this.f298836c = i18;
        this.f298837d = str2;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        com.tencent.mars.xlog.Log.e("SphereImageView.SphereImageLoader", "onDownloadError");
        com.tencent.mm.sdk.platformtools.u3.h(new jb4.p(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereImageLoader", "onStartDownload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereImageLoader", "loadImage onDownloaded, path=" + str);
        new jb4.r(this.f298838e, this.f298834a, this.f298835b, this.f298836c, this.f298837d).execute(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1");
    }
}

package za4;

/* loaded from: classes4.dex */
public class c0 implements za4.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za4.e0 f471069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f471071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471072d;

    public c0(za4.e0 e0Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f471069a = e0Var;
        this.f471070b = str;
        this.f471071c = i17;
        this.f471072d = str2;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        java.lang.String str = this.f471070b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", " download error for cdn file %s", str);
        this.f471069a.a();
        if (this.f471071c == 0) {
            n74.t.b(1, 1, 1, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
    }
}

package l44;

/* loaded from: classes4.dex */
public final class k3 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f316219b;

    public k3(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f316218a = str;
        this.f316219b = qVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        l44.p3.f316299a.c();
        com.tencent.mars.xlog.Log.e("AdQrClickHelper", "res " + this.f316218a + "  failed!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        kotlin.jvm.internal.o.g(path, "path");
        ((kotlinx.coroutines.r) this.f316219b).resumeWith(kotlin.Result.m521constructorimpl(path));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }
}

package n44;

/* loaded from: classes4.dex */
public final class r0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n44.u0 f335041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335042b;

    public r0(n44.u0 u0Var, java.lang.String str) {
        this.f335041a = u0Var;
        this.f335042b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$initThumbResource$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$initThumbResource$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$initThumbResource$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$initThumbResource$1");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$initThumbResource$1");
        kotlin.jvm.internal.o.g(path, "path");
        n44.u0 u0Var = this.f335041a;
        u0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        r45.jj4 e17 = u0Var.f335062e.e();
        u0Var.d(e17 != null ? e17.f377860i : null, this.f335042b, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$initThumbResource$1");
    }
}

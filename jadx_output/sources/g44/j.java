package g44;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g44.k f268830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g44.k kVar) {
        super(0);
        this.f268830d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$2");
        g44.k kVar = this.f268830d;
        ca4.d e17 = kVar.e();
        if (e17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            long j17 = kVar.f297705w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            e17.a((int) (currentTimeMillis - j17));
        }
        l44.z.n(kVar.e());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$2");
        return f0Var;
    }
}

package g44;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g44.k f268829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g44.k kVar) {
        super(0);
        this.f268829d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        android.widget.ScrollView u17 = this.f268829d.u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(u17.getScrollY() == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper$showDownloadHalfScreen$1");
        return valueOf;
    }
}

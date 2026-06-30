package g44;

/* loaded from: classes4.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g44.g f268819d;

    public f(g44.g gVar) {
        this.f268819d = gVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper$showBottomSheet$3");
        g44.g gVar = this.f268819d;
        ca4.d e17 = gVar.e();
        if (e17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            long j17 = gVar.f297705w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            e17.a((int) (currentTimeMillis - j17));
        }
        l44.z.n(gVar.e());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper$showBottomSheet$3");
    }
}

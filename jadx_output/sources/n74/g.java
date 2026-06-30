package n74;

/* loaded from: classes.dex */
public final class g implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f335355a;

    public g(kotlinx.coroutines.q qVar) {
        this.f335355a = qVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1");
        this.f335355a.resumeWith(kotlin.Result.m521constructorimpl(null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1");
        ((ku5.t0) ku5.t0.f312615d).q(new n74.f(this.f335355a, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1");
    }
}

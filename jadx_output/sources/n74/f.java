package n74;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f335350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335351e;

    public f(kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f335350d = qVar;
        this.f335351e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1$onDownloaded$1");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f335350d.resumeWith(kotlin.Result.m521constructorimpl(com.tencent.mm.sdk.platformtools.x.J(this.f335351e, null)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$callback$1$onDownloaded$1");
    }
}

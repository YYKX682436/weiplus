package n74;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f335374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335375e;

    public i(kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f335374d = qVar;
        this.f335375e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$3$1$onDownloaded$1");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f335374d.resumeWith(kotlin.Result.m521constructorimpl(com.tencent.mm.sdk.platformtools.x.J(this.f335375e, null)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$3$1$onDownloaded$1");
    }
}

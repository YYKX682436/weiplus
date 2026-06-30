package n74;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f335387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335388e;

    public l(yz5.p pVar, java.lang.String str) {
        this.f335387d = pVar;
        this.f335388e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$1");
        yz5.p pVar = this.f335387d;
        if (pVar != null) {
            pVar.invoke(this.f335388e, java.lang.Boolean.TRUE);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$1");
    }
}

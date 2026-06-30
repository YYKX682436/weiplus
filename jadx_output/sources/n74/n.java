package n74;

/* loaded from: classes.dex */
public final class n implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f335397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335398e;

    public n(yz5.p pVar, java.lang.String str) {
        this.f335397d = pVar;
        this.f335398e = str;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
        yz5.p pVar = this.f335397d;
        if (pVar != null) {
            pVar.invoke(this.f335398e, java.lang.Boolean.valueOf(z17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3$1");
    }
}

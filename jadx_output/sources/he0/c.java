package he0;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent adLandingPagesDownloadEventEvent = (com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        if (gm0.j1.a()) {
            java.lang.String str = adLandingPagesDownloadEventEvent.f53968g.f6801a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                } else {
                    ((ku5.t0) ku5.t0.f312615d).g(new za4.c1(str));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPagesDownloadEventListener", "AdLandingPagesDownloadEventEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.AdLandingPagesDownloadEventListener");
        return false;
    }
}

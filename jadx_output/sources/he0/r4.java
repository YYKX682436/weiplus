package he0;

/* loaded from: classes8.dex */
public class r4 extends com.tencent.mm.sdk.event.n {
    public r4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        com.tencent.mm.autogen.events.GetSnsResumeEvent getSnsResumeEvent = (com.tencent.mm.autogen.events.GetSnsResumeEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        if (gm0.j1.a()) {
            getSnsResumeEvent.f54412g.f7424a = com.tencent.mm.plugin.sns.model.l4.qj().b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetSnsResumeListener", "GetSnsResumeEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.GetSnsResumeListener");
        return false;
    }
}

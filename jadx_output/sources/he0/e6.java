package he0;

/* loaded from: classes4.dex */
public class e6 extends com.tencent.mm.sdk.event.n {
    public e6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsTimelineUIStatusListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsTimelineUIStatusListener");
        com.tencent.mm.plugin.sns.model.l4.oj();
        ((com.tencent.mm.autogen.events.SnsTimelineUIStatusEvent) iEvent).f54846g.getClass();
        throw null;
    }
}

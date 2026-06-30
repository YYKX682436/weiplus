package n34;

/* loaded from: classes10.dex */
public class k2 extends com.tencent.mm.sdk.event.n {
    public k2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        com.tencent.mm.autogen.events.GetSnsTagListEvent getSnsTagListEvent = (com.tencent.mm.autogen.events.GetSnsTagListEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetSnsTagListListener", "GetSnsTagListEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        } else if (getSnsTagListEvent instanceof com.tencent.mm.autogen.events.GetSnsTagListEvent) {
            z17 = true;
            if (getSnsTagListEvent.f54413g.f7532a == 0) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.d3(1));
            } else {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.d3(getSnsTagListEvent.f54413g.f7532a));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.GetSnsTagListListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        return z17;
    }
}

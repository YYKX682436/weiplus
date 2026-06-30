package n34;

/* loaded from: classes4.dex */
public class t4 extends com.tencent.mm.sdk.event.n {
    public t4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        com.tencent.mm.autogen.events.SnsfillEventInfoEvent snsfillEventInfoEvent = (com.tencent.mm.autogen.events.SnsfillEventInfoEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsfillEventInfoListener", "SnsfillEventInfoEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        } else if (snsfillEventInfoEvent instanceof com.tencent.mm.autogen.events.SnsfillEventInfoEvent) {
            am.lx lxVar = snsfillEventInfoEvent.f54855h;
            am.kx kxVar = snsfillEventInfoEvent.f54854g;
            lxVar.f7277a = qb4.a.c(kxVar.f7189c, kxVar.f7187a, kxVar.f7188b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.SnsfillEventInfoListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        return z17;
    }
}

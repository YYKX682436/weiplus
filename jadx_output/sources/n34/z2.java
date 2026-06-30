package n34;

/* loaded from: classes4.dex */
public class z2 extends com.tencent.mm.sdk.event.n {
    public z2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        com.tencent.mm.autogen.events.RemoveSnsTaskEvent removeSnsTaskEvent = (com.tencent.mm.autogen.events.RemoveSnsTaskEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoveSnsTaskEventListener", "RemoveSnsTaskEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        } else if (removeSnsTaskEvent instanceof com.tencent.mm.autogen.events.RemoveSnsTaskEvent) {
            if (removeSnsTaskEvent.f54678g.f8031a == 0) {
                com.tencent.mm.plugin.sns.model.t3.f164686e = true;
                com.tencent.mm.plugin.sns.model.t3 t3Var = new com.tencent.mm.plugin.sns.model.t3();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                t3Var.f164689b = java.lang.System.currentTimeMillis();
                if (t3Var.f164688a) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                } else {
                    new com.tencent.mm.plugin.sns.model.s3(t3Var).f("");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsTask", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                }
            } else {
                com.tencent.mm.plugin.sns.model.t3.f164686e = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.RemoveSnsTaskEventListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListener");
        return z17;
    }
}

package n34;

/* loaded from: classes4.dex */
public class r4 extends com.tencent.mm.sdk.event.n {
    public r4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        com.tencent.mm.autogen.events.SnsSyncEvent snsSyncEvent = (com.tencent.mm.autogen.events.SnsSyncEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        boolean z17 = false;
        if (!(snsSyncEvent instanceof com.tencent.mm.autogen.events.SnsSyncEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.SnsSyncListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        } else if (gm0.j1.a()) {
            if (snsSyncEvent.f54843g.f8611a == 2) {
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(68377, null);
                int f17 = ((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).f();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) && f17 == 0) {
                    z17 = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsSyncListener", "Strategy 3 isNotExistSnsNew %b", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.c3(256));
                }
            } else {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.c3(256));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsSyncListener", "SnsSyncEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        return z17;
    }
}

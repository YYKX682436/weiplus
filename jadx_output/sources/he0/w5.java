package he0;

/* loaded from: classes5.dex */
public class w5 extends com.tencent.mm.sdk.event.n {
    public w5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent = (com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        if (gm0.j1.a()) {
            if (snsLuckyMoneyIDKeyReportEvent instanceof com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent) {
                ha4.b.a(snsLuckyMoneyIDKeyReportEvent.f54824g.f6795a);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsLuckyMoneyIDKeyReportListener", "SnsLuckyMoneyIDKeyReportEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsLuckyMoneyIDKeyReportListener");
        return false;
    }
}

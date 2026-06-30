package ta4;

/* loaded from: classes12.dex */
public final class l1 extends com.tencent.mm.sdk.event.n {
    public l1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean contains;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent event = (com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        kotlin.jvm.internal.o.g(event, "event");
        am.xz xzVar = event.f54918g;
        if (xzVar != null && xzVar.f8410b == 1) {
            ta4.r rVar = ta4.r.f416815d;
            long j17 = xzVar.f8409a;
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMsgIdEventCallback", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
            synchronized (rVar.f259871c) {
                contains = ((java.util.ArrayList) rVar.f259871c).contains(java.lang.Long.valueOf(j17));
            }
            if (!contains) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContentType", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                com.tencent.mm.plugin.sns.storage.SnsInfo i17 = com.tencent.mm.plugin.sns.model.l4.Fj().i1((int) j17);
                int i18 = i17 != null ? i17.field_type : -1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContentType", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareSnsReporter", "snsMsg insert  db, snsType = " + i18 + ' ');
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShareStart", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                com.tencent.mm.autogen.events.ShareSnsReportStartEvent shareSnsReportStartEvent = new com.tencent.mm.autogen.events.ShareSnsReportStartEvent();
                shareSnsReportStartEvent.f54775g.getClass();
                shareSnsReportStartEvent.e();
                shareSnsReportStartEvent.f54776h.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShareStart", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tj("page_out", new ta4.q(j17));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMsgIdEventCallback", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.report.UpdateSnsMsgIdListener");
        return false;
    }
}

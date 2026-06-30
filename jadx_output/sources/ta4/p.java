package ta4;

/* loaded from: classes12.dex */
public final class p implements f65.a {
    @Override // f65.a
    public void a(long j17, java.util.Map params) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEnd", "com.tencent.mm.plugin.sns.report.ShareSnsReporter$updateMsgIdEventCallback$1$1$1");
        kotlin.jvm.internal.o.g(params, "params");
        ta4.r rVar = ta4.r.f416815d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onShareEnd", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShareEnd", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        rVar.b(j17);
        com.tencent.mm.autogen.events.ShareSnsReportEndEvent shareSnsReportEndEvent = new com.tencent.mm.autogen.events.ShareSnsReportEndEvent();
        int i17 = (int) j17;
        am.iu iuVar = shareSnsReportEndEvent.f54774g;
        iuVar.f6972b = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContentType", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        int i19 = i18 != null ? i18.field_type : -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContentType", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        iuVar.f6971a = i19;
        iuVar.f6973c = params;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSendOk", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        com.tencent.mm.plugin.sns.storage.SnsInfo i110 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i110 != null) {
            z17 = !kotlin.jvm.internal.o.b(pm0.v.u(i110.field_snsId), "0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSendOk", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSendOk", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
            z17 = false;
        }
        iuVar.f6974d = z17;
        shareSnsReportEndEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShareEnd", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onShareEnd", "com.tencent.mm.plugin.sns.report.ShareSnsReporter");
        synchronized (rVar.f259871c) {
            ((java.util.ArrayList) rVar.f259871c).remove(java.lang.Long.valueOf(j17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEnd", "com.tencent.mm.plugin.sns.report.ShareSnsReporter$updateMsgIdEventCallback$1$1$1");
    }
}

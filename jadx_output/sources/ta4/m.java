package ta4;

/* loaded from: classes12.dex */
public final class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        com.tencent.mm.autogen.events.ShareSnsReportEndEvent event = (com.tencent.mm.autogen.events.ShareSnsReportEndEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        kotlin.jvm.internal.o.g(event, "event");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        am.iu iuVar = event.f54774g;
        if (iuVar != null) {
            if (iuVar.f6973c != null) {
                ct.y2 y2Var = (ct.y2) i95.n0.c(ct.y2.class);
                java.util.Map sdkParams = iuVar.f6973c;
                kotlin.jvm.internal.o.f(sdkParams, "sdkParams");
                qg5.j2 j2Var = (qg5.j2) y2Var;
                j2Var.getClass();
                linkedHashMap.putAll(j2Var.wi(sdkParams));
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo i17 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(iuVar.f6972b);
            if (i17 != null) {
                linkedHashMap.put("sns_feed_id", pm0.v.u(i17.field_snsId));
                linkedHashMap.put("sns_feed_local_id", i17.getLocalid());
            }
            linkedHashMap.put("sns_content_type", java.lang.Integer.valueOf(iuVar.f6971a));
            linkedHashMap.put("forward_result", java.lang.Integer.valueOf(iuVar.f6974d ? 1 : 0));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sdk_forward_sns", linkedHashMap, 30644);
        com.tencent.mars.xlog.Log.i("MicroMsg.reportShareSns", "report 30644 " + linkedHashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.report.ShareSnsEndListener");
        return false;
    }
}

package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
class SnsPostReportLogic$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsPostInfoEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.z f164824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsPostReportLogic$1(com.tencent.mm.plugin.sns.statistics.z zVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f164824d = zVar;
        this.__eventId = 1901115748;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.SnsPostInfoEvent snsPostInfoEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.x(this, snsPostInfoEvent));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1");
        return false;
    }
}

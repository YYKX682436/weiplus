package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.c0 f164842d = new com.tencent.mm.plugin.sns.statistics.c0();

    public c0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        wa4.q snsPostCgiReportObj = (wa4.q) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        kotlin.jvm.internal.o.g(snsPostCgiReportObj, "snsPostCgiReportObj");
        dx1.f fVar = dx1.g.f244489a;
        fVar.i("SnsPublishProcess", "cgiReconnectCnt", java.lang.Integer.valueOf(snsPostCgiReportObj.f444276e));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(snsPostCgiReportObj.f444277f)) {
            java.lang.String cgiresult = snsPostCgiReportObj.f444277f;
            kotlin.jvm.internal.o.f(cgiresult, "cgiresult");
            fVar.i("SnsPublishProcess", "cgiresult", cgiresult);
        }
        fVar.i("SnsPublishProcess", "returnDuration", java.lang.Integer.valueOf((int) (c01.id.c() - snsPostCgiReportObj.f444278g)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        return f0Var;
    }
}

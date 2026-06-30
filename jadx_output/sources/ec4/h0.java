package ec4;

@j95.b
/* loaded from: classes4.dex */
public final class h0 extends i95.w implements fe0.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251158d = "MicroMsg.SnsFakeVideoPublishReportApi";

    public void wi(int i17, java.lang.String sessionId, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFakeVideoResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        ot5.g.c(this.f251158d, "reportFakeVideoResult >> action: " + i17 + ", sessionId: " + sessionId + ", fakePublishTime: " + j17 + ", muxTime: " + j18);
        com.tencent.mm.plugin.sns.statistics.w0 w0Var = com.tencent.mm.plugin.sns.statistics.w0.f164989a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFakeVideoResultAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.statistics.w0.f164994f;
        com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct snsVideoPublishLogStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct) hashMap.get(sessionId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportFakeVideoResultAction >> action: ");
        sb6.append(i17);
        sb6.append(", sessionId: ");
        sb6.append(sessionId);
        sb6.append(", fakePublishTime: ");
        sb6.append(j17);
        sb6.append(", muxTime: ");
        sb6.append(j18);
        sb6.append(", isContainStruct: ");
        sb6.append(snsVideoPublishLogStruct != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", sb6.toString());
        if (snsVideoPublishLogStruct != null) {
            snsVideoPublishLogStruct.f60795e = i17;
            snsVideoPublishLogStruct.f60802l = j17;
            snsVideoPublishLogStruct.f60801k = j18;
            snsVideoPublishLogStruct.f60796f = w0Var.a();
            snsVideoPublishLogStruct.k();
        }
        w0Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFakeVideoResultAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFakeVideoResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
    }
}

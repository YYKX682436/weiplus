package nb4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f336064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, nb4.m mVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f336064e = j17;
        this.f336065f = mVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        nb4.c cVar = new nb4.c(this.f336064e, this.f336065f, (kotlin.coroutines.Continuation) obj3);
        cVar.f336063d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f336063d;
        boolean z17 = th6 instanceof ob4.b;
        long j17 = this.f336064e;
        if (z17) {
            ob4.b bVar = (ob4.b) th6;
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrorCode", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$CgiException");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrorCode", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$CgiException");
            java.lang.String message = th6.getMessage();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGetFeedDetailError", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct();
            snsCoverReportStruct.f60517d = 6;
            snsCoverReportStruct.p(r26.i0.v("snsObjId:" + ca4.z0.t0(j17) + ";errorMsg:" + message, ",", ";", false, 4, null));
            snsCoverReportStruct.f60527n = bVar.f344094d;
            snsCoverReportStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetFeedDetailError", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        }
        com.tencent.mars.xlog.Log.printErrStackTrace(nb4.m.N6(this.f336065f), th6, "GetSnsObjectDetailCgi error id:" + j17, new java.lang.Object[0]);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        return f0Var;
    }
}

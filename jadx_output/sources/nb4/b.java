package nb4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336059d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f336061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, nb4.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336061f = j17;
        this.f336062g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        nb4.b bVar = new nb4.b(this.f336061f, this.f336062g, continuation);
        bVar.f336060e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        java.lang.Object invokeSuspend = ((nb4.b) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        java.lang.Object s17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336059d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar = (kotlinx.coroutines.flow.k) this.f336060e;
            ob4.a aVar2 = new ob4.a(this.f336061f);
            this.f336060e = kVar;
            this.f336059d = 1;
            s17 = aVar2.s(this);
            if (s17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i(nb4.m.N6(this.f336062g), "updateUserCoverFromDetail emit resp");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return f0Var;
            }
            kVar = (kotlinx.coroutines.flow.k) this.f336060e;
            kotlin.ResultKt.throwOnFailure(obj);
            s17 = obj;
        }
        r45.n96 n96Var = (r45.n96) s17;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = n96Var.f381186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        } else {
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct();
            java.lang.String f17 = x51.j1.f(snsObject.ObjectDesc);
            snsCoverReportStruct.f60517d = 6;
            snsCoverReportStruct.f60519f = snsCoverReportStruct.b("UserName", snsObject.Username, true);
            snsCoverReportStruct.p(r26.i0.v("xmlString:" + f17, ",", ";", false, 4, null));
            snsCoverReportStruct.f60527n = 0;
            snsCoverReportStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        }
        com.tencent.mm.protocal.protobuf.SnsObject Object = n96Var.f381186d;
        kotlin.jvm.internal.o.f(Object, "Object");
        this.f336060e = null;
        this.f336059d = 2;
        if (kVar.emit(Object, this) == aVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
            return aVar;
        }
        com.tencent.mars.xlog.Log.i(nb4.m.N6(this.f336062g), "updateUserCoverFromDetail emit resp");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        return f0Var2;
    }
}

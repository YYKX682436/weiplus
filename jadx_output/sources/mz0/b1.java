package mz0;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f332882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(mz0.b2 b2Var, dz0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332881e = b2Var;
        this.f332882f = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.b1 b1Var = new mz0.b1(this.f332881e, this.f332882f, (kotlin.coroutines.Continuation) obj3);
        b1Var.f332880d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Template.TemplateControlUIC", (java.lang.Throwable) this.f332880d, "maas error", new java.lang.Object[0]);
        this.f332881e.f7().dismiss();
        com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct maasAITemplateMakeReportStruct = oy0.a.f349833a;
        if (maasAITemplateMakeReportStruct != null) {
            maasAITemplateMakeReportStruct.f58969d = 2;
        }
        if (maasAITemplateMakeReportStruct != null) {
            maasAITemplateMakeReportStruct.f58977l = maasAITemplateMakeReportStruct.b("failReason", java.lang.String.valueOf(4), true);
        }
        com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct maasAITemplateMakeReportStruct2 = oy0.a.f349833a;
        if (maasAITemplateMakeReportStruct2 != null) {
            maasAITemplateMakeReportStruct2.k();
        }
        oy0.a.f349833a = null;
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) this.f332882f).r7(com.tencent.mm.R.string.m6j);
        return jz5.f0.f302826a;
    }
}

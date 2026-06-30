package dz0;

/* loaded from: classes5.dex */
public final class k0 implements az0.d {

    /* renamed from: a, reason: collision with root package name */
    public final az0.e f244902a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.coroutines.r2 f244903b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.f1 f244904c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.f1 f244905d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f244906e = "";

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244907f;

    public k0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.e eVar) {
        this.f244907f = maasSdkUIC;
        this.f244902a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "awaitActiveSwitchingJob: ready templateId=" + this.f244906e);
        kotlinx.coroutines.f1 f1Var = this.f244905d;
        if (f1Var != 0) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "awaitSwitchTemplateJob: templateId=" + this.f244906e + ", isActive=" + f1Var.a() + ", isCancelled=" + ((kotlinx.coroutines.c3) f1Var).isCancelled());
            if (f1Var.a()) {
                return f1Var.k(continuation);
            }
        }
        return java.lang.Boolean.TRUE;
    }

    public void d(java.lang.String skipCancelTemplateId) {
        kotlin.jvm.internal.o.g(skipCancelTemplateId, "skipCancelTemplateId");
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "cancel buildTemplateNonBlockingJob cur:" + this.f244906e + ", skipCancel:" + skipCancelTemplateId);
        com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct maasAITemplateMakeReportStruct = oy0.a.f349833a;
        if (maasAITemplateMakeReportStruct != null) {
            maasAITemplateMakeReportStruct.f58969d = 3;
        }
        if (maasAITemplateMakeReportStruct != null) {
            maasAITemplateMakeReportStruct.f58977l = maasAITemplateMakeReportStruct.b("failReason", java.lang.String.valueOf(1000), true);
        }
        com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct maasAITemplateMakeReportStruct2 = oy0.a.f349833a;
        if (maasAITemplateMakeReportStruct2 != null) {
            maasAITemplateMakeReportStruct2.k();
        }
        oy0.a.f349833a = null;
        kotlinx.coroutines.f1 f1Var = this.f244904c;
        if (f1Var != null) {
            if (!(f1Var.a() && !kotlin.jvm.internal.o.b(skipCancelTemplateId, this.f244906e))) {
                f1Var = null;
            }
            if (f1Var != null) {
                kotlinx.coroutines.p2.a(f1Var, null, 1, null);
            }
        }
    }

    public void e(java.lang.String skipCancelTemplateId) {
        kotlin.jvm.internal.o.g(skipCancelTemplateId, "skipCancelTemplateId");
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "cancel selectTemplateNonBlockingJob cur:" + this.f244906e + ", skipCancel:" + skipCancelTemplateId);
        if (this.f244903b != null) {
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct maasAITemplateMakeReportStruct = oy0.a.f349833a;
            if (maasAITemplateMakeReportStruct != null) {
                maasAITemplateMakeReportStruct.f58969d = 3;
            }
            if (maasAITemplateMakeReportStruct != null) {
                maasAITemplateMakeReportStruct.f58977l = maasAITemplateMakeReportStruct.b("failReason", java.lang.String.valueOf(1000), true);
            }
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct maasAITemplateMakeReportStruct2 = oy0.a.f349833a;
            if (maasAITemplateMakeReportStruct2 != null) {
                maasAITemplateMakeReportStruct2.k();
            }
            oy0.a.f349833a = null;
        }
        az0.e eVar = this.f244902a;
        if (eVar != null) {
            ((mz0.w1) eVar).b(this.f244906e);
        }
        kotlinx.coroutines.r2 r2Var = this.f244903b;
        if (r2Var != null) {
            if (!(((kotlinx.coroutines.a) r2Var).a() && !kotlin.jvm.internal.o.b(skipCancelTemplateId, this.f244906e))) {
                r2Var = null;
            }
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
    }

    public void f(com.tencent.mm.mj_template.sns.compose.widget.m5 data, yz5.l lVar) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = data.f70077a;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "startSelectTemplateNonBlockingJob ready " + str);
        this.f244903b = kotlinx.coroutines.l.d(this.f244907f.getMainScope(), null, null, new dz0.j0(this, str, lVar, this.f244907f, data, null), 3, null);
    }
}

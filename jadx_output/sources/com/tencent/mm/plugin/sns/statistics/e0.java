package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i17, int i18) {
        super(1);
        this.f164847d = i17;
        this.f164848e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        wa4.q snsPostCgiReportObj = (wa4.q) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        kotlin.jvm.internal.o.g(snsPostCgiReportObj, "snsPostCgiReportObj");
        java.lang.String str = snsPostCgiReportObj.f444277f;
        java.lang.String valueOf = java.lang.String.valueOf(this.f164847d);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            valueOf = str + "#" + valueOf;
        }
        snsPostCgiReportObj.f444277f = valueOf;
        snsPostCgiReportObj.f444276e++;
        com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
        i0Var.p(snsPostCgiReportObj);
        dx1.g.f244489a.j("SnsPublishProcess", "opresult_", 6, bx1.u.f36309d);
        i0Var.d(this.f164848e + "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        return f0Var;
    }
}

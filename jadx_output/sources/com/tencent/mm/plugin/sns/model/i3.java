package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.l3 f164295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164297f;

    public i3(com.tencent.mm.plugin.sns.model.j3 j3Var, com.tencent.mm.plugin.sns.model.l3 l3Var, java.lang.String str, java.lang.String str2) {
        this.f164295d = l3Var;
        this.f164296e = str;
        this.f164297f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1$1");
        com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.plugin.sns.model.l3 l3Var = this.f164295d;
        int i17 = l3Var.f164388i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        xj6.t(i17, l3Var.hashCode());
        gm0.j1.i();
        gm0.j1.n().f273288b.g(l3Var);
        com.tencent.mm.autogen.mmdata.rpt.SnsErrorCommonReportStruct snsErrorCommonReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsErrorCommonReportStruct();
        snsErrorCommonReportStruct.f60540d = 1;
        snsErrorCommonReportStruct.f60541e = snsErrorCommonReportStruct.b("StringParam1", this.f164296e, true);
        snsErrorCommonReportStruct.f60542f = snsErrorCommonReportStruct.b("StringParam2", this.f164297f, true);
        snsErrorCommonReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1$1");
    }
}

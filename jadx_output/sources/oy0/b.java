package oy0;

/* loaded from: classes5.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f349834a;

    public b(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f349834a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        com.tencent.mm.autogen.mmdata.rpt.MaasAIDialogActionReportStruct maasAIDialogActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasAIDialogActionReportStruct();
        maasAIDialogActionReportStruct.f58968e = maasAIDialogActionReportStruct.b("sessionid_", Bi, true);
        maasAIDialogActionReportStruct.f58967d = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AITemplateUtils", "reportDialogAction sessionId:" + Bi + " action:2");
        maasAIDialogActionReportStruct.k();
        this.f349834a.B();
    }
}

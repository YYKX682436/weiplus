package oy0;

/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f349835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349836b;

    public c(com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.a aVar) {
        this.f349835a = z2Var;
        this.f349836b = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        com.tencent.mm.autogen.mmdata.rpt.MaasAIDialogActionReportStruct maasAIDialogActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasAIDialogActionReportStruct();
        maasAIDialogActionReportStruct.f58968e = maasAIDialogActionReportStruct.b("sessionid_", Bi, true);
        maasAIDialogActionReportStruct.f58967d = 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AITemplateUtils", "reportDialogAction sessionId:" + Bi + " action:3");
        maasAIDialogActionReportStruct.k();
        com.tencent.mm.sdk.platformtools.o4.L().G("kv_ai_permission", true);
        this.f349835a.B();
        this.f349836b.invoke();
    }
}

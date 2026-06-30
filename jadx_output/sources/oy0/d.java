package oy0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final oy0.d f349837a = new oy0.d();

    public final void a(com.tencent.mm.mj_template.sns.compose.widget.k5 snsTemplateListData, android.content.Context context, yz5.a onClick) {
        kotlin.jvm.internal.o.g(snsTemplateListData, "snsTemplateListData");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        java.lang.String str = snsTemplateListData.f70034k;
        if (str == null || str.length() == 0) {
            onClick.invoke();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.o4.L().i("kv_ai_permission", false)) {
            onClick.invoke();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AITemplateUtils", "checkAITemplatePermission :" + str);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0, true);
        z2Var.m(i65.a.r(context, com.tencent.mm.R.string.f490347sg), i65.a.r(context, com.tencent.mm.R.string.hh_));
        android.widget.Button button = z2Var.f212068t;
        if (button != null) {
            com.tencent.mm.ui.bk.s0(button.getPaint());
        }
        android.widget.Button button2 = z2Var.f212069u;
        if (button2 != null) {
            com.tencent.mm.ui.bk.s0(button2.getPaint());
        }
        z2Var.i(com.tencent.mm.R.layout.dms);
        oy0.b bVar = new oy0.b(z2Var);
        oy0.c cVar = new oy0.c(z2Var, onClick);
        z2Var.D = bVar;
        z2Var.E = cVar;
        z2Var.C();
        b(1);
    }

    public final void b(int i17) {
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        com.tencent.mm.autogen.mmdata.rpt.MaasAIDialogActionReportStruct maasAIDialogActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasAIDialogActionReportStruct();
        maasAIDialogActionReportStruct.f58968e = maasAIDialogActionReportStruct.b("sessionid_", Bi, true);
        maasAIDialogActionReportStruct.f58967d = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AITemplateUtils", "reportDialogAction sessionId:" + Bi + " action:" + i17);
        maasAIDialogActionReportStruct.k();
    }
}

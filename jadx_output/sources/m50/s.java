package m50;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f323501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m50.x xVar) {
        super(1);
        this.f323501d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            m50.x xVar = this.f323501d;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseForwardUIC", "SelectConfirmAction usernameList:" + c0Var.f446282b + ": ");
            java.util.List list = c0Var.f446282b;
            xVar.f323513e.clear();
            xVar.f323513e.addAll(list);
            java.util.Map a17 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar.c7(), xVar.g7(), xVar.a7());
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardItemBtn: " + a17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_item_btn", "view_clk", a17, 32337);
            xVar.X6(list);
        }
        xi5.e eVar = (xi5.e) state.a(xi5.e.class);
        if (eVar != null) {
            m50.x xVar2 = this.f323501d;
            co.a c76 = xVar2.c7();
            com.tencent.mm.storage.f9 e76 = xVar2.e7();
            android.content.Intent intent = xVar2.getIntent();
            if (c76 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ForwardReportHelper", "reportClickForwardToWework viewmodel is null");
            } else {
                int intExtra = intent != null ? intent.getIntExtra("content_type_forward_to_wework", -1) : -1;
                if (intent == null || (str = intent.getStringExtra("Retr_Msg_view_model")) == null) {
                    str = "";
                }
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.contact.b4(c76, intent != null ? intent.getBooleanExtra("ForwardParams_FromSingleMultiForward", false) : false, intExtra, e76, str), "forward_wework_report");
            }
            if (eVar.f454741b == 2) {
                java.util.Map a18 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar2.c7(), xVar2.g7(), xVar2.a7());
                com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardWeGovBtn: " + a18);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_wegov_btn", "view_clk", a18, 32337);
            } else {
                java.util.Map a19 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar2.c7(), xVar2.g7(), xVar2.a7());
                com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardWecomBtn: " + a19);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_wecom_btn", "view_clk", a19, 32337);
            }
            m50.x.T6(xVar2, eVar, xVar2.a7(), new m50.r(xVar2, eVar));
        }
        if (((xi5.f) state.a(xi5.f.class)) != null) {
            m50.x xVar3 = this.f323501d;
            co.a c77 = xVar3.c7();
            int g76 = xVar3.g7();
            int a76 = xVar3.a7();
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar2 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
            java.util.Map a27 = eVar2.a(c77, g76, a76);
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardYuanBaoBtn: " + a27);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_yuanbao_btn", "view_clk", a27, 32337);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g = eVar2.a(xVar3.c7(), xVar3.g7(), xVar3.a7());
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).cj();
            xVar3.l7();
        }
        if (((xi5.c) state.a(xi5.c.class)) != null) {
            m50.x xVar4 = this.f323501d;
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar4.c7(), xVar4.getIntent().getIntExtra("ForwardParams_ReportFromScene", 0), 0);
            xVar4.h7(null);
        }
        if (((xi5.d) state.a(xi5.d.class)) != null) {
            m50.x xVar5 = this.f323501d;
            co.a c78 = xVar5.c7();
            int g77 = xVar5.g7();
            int a77 = xVar5.a7();
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar3 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
            java.util.Map a28 = eVar3.a(c78, g77, a77);
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherAppBtn: " + a28);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_app_btn", "view_clk", a28, 32337);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209300g = eVar3.a(xVar5.c7(), xVar5.g7(), xVar5.a7());
            xVar5.i7();
        }
        return jz5.f0.f302826a;
    }
}

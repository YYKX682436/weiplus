package m50;

/* loaded from: classes.dex */
public final class i implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m50.x f323483a;

    public i(m50.x xVar) {
        this.f323483a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        k50.o0 o0Var;
        if (i17 == -1) {
            m50.x xVar = this.f323483a;
            if (xVar.getActivity().isFinishing() || xVar.getActivity().isDestroyed()) {
                return;
            }
            int intExtra = intent != null ? intent.getIntExtra("selected_app_index", 0) : 0;
            if (intent != null && (stringExtra = intent.getStringExtra("selected_app")) != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    o0Var = kotlin.Result.m521constructorimpl(k50.o0.valueOf(stringExtra));
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    o0Var = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                r2 = kotlin.Result.m527isFailureimpl(o0Var) ? null : o0Var;
            }
            int i18 = r2 != null ? m50.h.f323482a[r2.ordinal()] : -1;
            if (i18 == 1) {
                java.util.Map m17 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar.c7(), xVar.g7(), xVar.a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intExtra))));
                com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWecomBtn: " + m17);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wecom_btn", "view_clk", m17, 32337);
                xi5.e eVar = new xi5.e(1);
                m50.x.T6(xVar, eVar, xVar.a7(), new m50.f(xVar, eVar));
                return;
            }
            if (i18 == 2) {
                java.util.Map m18 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar.c7(), xVar.g7(), xVar.a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intExtra))));
                com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWeGovBtn: " + m18);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wegov_btn", "view_clk", m18, 32337);
                xi5.e eVar2 = new xi5.e(2);
                m50.x.T6(xVar, eVar2, xVar.a7(), new m50.g(xVar, eVar2));
                return;
            }
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                xVar.h7(intent.getStringExtra("selected_clawbot_username"));
                return;
            }
            java.util.Map m19 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar.c7(), xVar.g7(), xVar.a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intExtra))));
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherYuanBaoBtn: " + m19);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_yuanbao_btn", "view_clk", m19, 32337);
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).cj();
            xVar.l7();
        }
    }
}

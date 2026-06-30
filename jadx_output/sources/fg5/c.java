package fg5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final fg5.c f262501a = new fg5.c();

    /* renamed from: b, reason: collision with root package name */
    public static long f262502b;

    public final void a(long j17, long j18, com.tencent.mm.storage.l4 l4Var, yf5.j0 j0Var) {
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        java.util.List list;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        if (h17 == null) {
            h17 = "";
        }
        if (l4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
            j19 = 0;
        } else if (com.tencent.mm.storage.z3.k4(h17)) {
            j19 = 3;
        } else if (com.tencent.mm.storage.z3.j4(h17)) {
            j19 = 5;
        } else {
            if (!c01.e2.U(h17) && !com.tencent.mm.storage.z3.D4(h17) && !com.tencent.mm.storage.z3.U4(h17)) {
                if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1) == 1) || !c01.e2.N(h17)) {
                    j19 = com.tencent.mm.storage.z3.B3(h17) ? 6L : r26.i0.y(h17, "gh_", false) ? 7L : com.tencent.mm.storage.z3.o4(h17) ? 9L : com.tencent.mm.storage.z3.R4(h17) ? 2L : 1L;
                }
            }
            j19 = 4;
        }
        if (l4Var != null) {
            j27 = l4Var.d1() + l4Var.f1();
            j28 = l4Var.f1() > 0 ? 1L : 2L;
        } else {
            j27 = 0;
            j28 = 0;
        }
        if (j0Var == null || (list = ((yf5.w0) j0Var).f461985q.f461847d) == null) {
            j29 = 0;
            j37 = 0;
        } else {
            int size = list.size();
            long j38 = 0;
            long j39 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                yf5.x xVar = (yf5.x) list.get(i17);
                com.tencent.mm.storage.l4 l4Var2 = xVar.f461995d;
                int d17 = l4Var2 != null ? l4Var2.d1() : 0;
                if (xVar.f462014z == 1) {
                    j39++;
                    j38 += d17;
                }
            }
            j29 = j38;
            j37 = j39;
        }
        long c17 = c01.id.c();
        if (j17 == 2) {
            f262502b = c17;
        }
        long j47 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.conversation.RepairerConfigConvUnreadMode()) == 1 ? 3L : 2L;
        com.tencent.mm.ui.conversation.v3 a17 = com.tencent.mm.ui.conversation.w3.f208214g.a(null);
        com.tencent.mm.autogen.mmdata.rpt.DoubleClickWechatReportStruct doubleClickWechatReportStruct = new com.tencent.mm.autogen.mmdata.rpt.DoubleClickWechatReportStruct();
        doubleClickWechatReportStruct.f55868d = j17;
        doubleClickWechatReportStruct.f55869e = j18;
        doubleClickWechatReportStruct.f55870f = j19;
        doubleClickWechatReportStruct.f55871g = doubleClickWechatReportStruct.b("UserName", h17, true);
        doubleClickWechatReportStruct.f55872h = doubleClickWechatReportStruct.b("unread_jump_event_ms", java.lang.String.valueOf(c17), true);
        doubleClickWechatReportStruct.f55873i = j28;
        doubleClickWechatReportStruct.f55874j = j27;
        int i18 = a17.f208183a;
        int i19 = a17.f208184b;
        doubleClickWechatReportStruct.f55875k = i18 + i19;
        doubleClickWechatReportStruct.f55876l = j29;
        doubleClickWechatReportStruct.f55877m = j37;
        doubleClickWechatReportStruct.f55878n = j47;
        doubleClickWechatReportStruct.f55882r = i18;
        doubleClickWechatReportStruct.f55883s = i19;
        doubleClickWechatReportStruct.f55880p = a17.f208185c;
        doubleClickWechatReportStruct.f55881q = a17.f208186d;
        doubleClickWechatReportStruct.f55879o = 1L;
        doubleClickWechatReportStruct.f55884t = 20260429L;
        doubleClickWechatReportStruct.k();
    }
}

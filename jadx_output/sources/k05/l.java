package k05;

/* loaded from: classes9.dex */
public class l implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        ((com.tencent.mm.plugin.wxpay.g) i95.n0.c(com.tencent.mm.plugin.wxpay.g.class)).getClass();
        if (z65.c.f470458d || m0Var == null || l0Var == null || l0Var.f454412c == null) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.utils.r rVar = new com.tencent.mm.plugin.wallet_core.utils.r();
        java.lang.String str = l0Var.f454411b;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1335458389:
                if (str.equals("delete")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c17 = 1;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                rVar.a(l0Var.f454412c, com.tencent.mm.plugin.wallet_core.utils.p.f180958f);
                com.tencent.mm.plugin.wallet_core.utils.i1.f180905a.d(l0Var.f454412c, com.tencent.mm.plugin.wallet_core.utils.e1.f180876h);
                return;
            case 1:
                rVar.a(l0Var.f454412c, com.tencent.mm.plugin.wallet_core.utils.p.f180957e);
                com.tencent.mm.plugin.wallet_core.utils.i1.f180905a.d(l0Var.f454412c, com.tencent.mm.plugin.wallet_core.utils.e1.f180873e);
                li3.g gVar = (li3.g) ((h45.s) i95.n0.c(h45.s.class));
                gVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new li3.f(gVar, l0Var), "PayPlugin_Msg_Handler");
                return;
            case 2:
                rVar.a(l0Var.f454412c, com.tencent.mm.plugin.wallet_core.utils.p.f180959g);
                com.tencent.mm.plugin.wallet_core.utils.i1.f180905a.d(l0Var.f454412c, com.tencent.mm.plugin.wallet_core.utils.e1.f180875g);
                return;
            default:
                return;
        }
    }
}

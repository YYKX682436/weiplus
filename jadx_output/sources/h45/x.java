package h45;

/* loaded from: classes9.dex */
public abstract class x {
    public static boolean a(com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        ot0.q v17;
        if (f9Var.getType() == 419430449) {
            if (f9Var.A0() == 0 && (v17 = ot0.q.v(f9Var.U1())) != null) {
                ot0.n nVar = (ot0.n) v17.y(ot0.n.class);
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && !c01.z1.r().equals(nVar.f348594c)) {
                    return false;
                }
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent();
                walletQueryRemittanceStatusEvent.f54971g.f8421a = v17.L0;
                walletQueryRemittanceStatusEvent.e();
                int i17 = walletQueryRemittanceStatusEvent.f54972h.f8505a;
                if (i17 <= 0) {
                    i17 = v17.I0;
                }
                if (i17 >= 0 && (i17 == 1 || i17 == 21 || i17 == 7 || i17 == 27)) {
                    return true;
                }
            }
        } else if (f9Var.getType() == 436207665 && f9Var.A0() == 0) {
            java.lang.String j17 = f9Var.j();
            ot0.q v18 = j17 != null ? ot0.q.v(j17) : null;
            if (v18 != null) {
                if (!"1001".equals(v18.f348700q1) && !com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(v18.f348704r1)) {
                        walletQueryHbStatusEvent.f54969g.f8253a = v18.f348704r1;
                        walletQueryHbStatusEvent.e();
                        am.x10 x10Var = walletQueryHbStatusEvent.f54970h;
                        int i18 = x10Var.f8336b;
                        if (x10Var.f8337c == 0) {
                            return true;
                        }
                    }
                } else if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    java.lang.String r17 = c01.z1.r();
                    int i19 = -1;
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(v18.E1)) {
                        java.util.Iterator it = ((java.util.ArrayList) v18.E1).iterator();
                        while (it.hasNext()) {
                            java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                            if (split.length == 3 && split[0].equals(r17)) {
                                i19 = com.tencent.mm.sdk.platformtools.t8.P(split[2], -1);
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17 && i19 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

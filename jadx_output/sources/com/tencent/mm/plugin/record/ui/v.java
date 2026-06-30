package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ul5 f155491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f155492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.w f155493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r45.ul5 ul5Var, boolean z17, com.tencent.mm.plugin.record.ui.w wVar) {
        super(0);
        this.f155491d = ul5Var;
        this.f155492e = z17;
        this.f155493f = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        com.tencent.mm.storage.f9 l17;
        r45.ip0 ip0Var;
        com.tencent.mm.storage.f9 l18;
        r45.ip0 ip0Var2;
        r45.ul5 ul5Var = this.f155491d;
        boolean z17 = false;
        if (ul5Var != null && (linkedList = ul5Var.f387465f) != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                java.lang.String str = null;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.gp0 gp0Var = (r45.gp0) obj;
                int i19 = gp0Var.I;
                if (i19 == 2) {
                    r45.hp0 hp0Var = gp0Var.J1;
                    if (hp0Var != null && (ip0Var2 = hp0Var.f376353d) != null) {
                        str = ip0Var2.f377231f;
                    }
                    if (str == null) {
                        str = "";
                    }
                    long j17 = gp0Var.f375435s2;
                    if ((!r26.n0.N(str)) && j17 != 0 && (l18 = pt0.f0.f358209b1.l(str, j17)) != null && l18.getType() == 3) {
                        i95.m c17 = i95.n0.c(tg3.u0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        tg3.u0 u0Var = (tg3.u0) c17;
                        java.lang.String z07 = l18.z0();
                        gp0Var.B0(tg3.u0.ga(u0Var, l18, z07 == null ? "" : z07, false, 4, null));
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b0 S1 = m11.b1.Di().S1(l18);
                        if (S1 != null && (S1.f322647o == l18.getMsgId() || S1.f322634b == l18.I0())) {
                            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                            java.lang.String c18 = m11.c0.c(l18, S1);
                            gp0Var.A0(c18 != null ? c18 : "");
                        }
                        zt.k kVar = new zt.k("Preview", bt3.x2.e(gp0Var), 1);
                        java.lang.String aj6 = ((ot.w) i95.n0.c(ot.w.class)).aj(kVar);
                        if (!com.tencent.mm.vfs.w6.j(gp0Var.X)) {
                            gp0Var.B0(((ot.w) i95.n0.c(ot.w.class)).bj(aj6, kVar));
                        }
                        if (!com.tencent.mm.vfs.w6.j(gp0Var.V)) {
                            gp0Var.A0(((ot.w) i95.n0.c(ot.w.class)).bj(aj6, kVar));
                        }
                        z17 = true;
                    }
                } else if (i19 == 4) {
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    if (hp0Var2 != null && (ip0Var = hp0Var2.f376353d) != null) {
                        str = ip0Var.f377231f;
                    }
                    if (str == null) {
                        str = "";
                    }
                    long j18 = gp0Var.f375435s2;
                    if ((!r26.n0.N(str)) && j18 != 0 && (l17 = pt0.f0.f358209b1.l(str, j18)) != null) {
                        if (l17.getType() == 43) {
                            i95.m c19 = i95.n0.c(tg3.u0.class);
                            kotlin.jvm.internal.o.f(c19, "getService(...)");
                            tg3.u0 u0Var2 = (tg3.u0) c19;
                            java.lang.String z08 = l17.z0();
                            gp0Var.B0(tg3.u0.L4(u0Var2, l17, z08 == null ? "" : z08, false, 4, null));
                            z17 = true;
                        }
                        zt.k kVar2 = new zt.k("Preview", bt3.x2.e(gp0Var), 1);
                        java.lang.String aj7 = ((ot.w) i95.n0.c(ot.w.class)).aj(kVar2);
                        if (!com.tencent.mm.vfs.w6.j(gp0Var.X)) {
                            gp0Var.B0(((ot.w) i95.n0.c(ot.w.class)).bj(aj7, kVar2));
                        }
                    }
                }
                i17 = i18;
            }
        }
        if (this.f155492e && z17) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.record.ui.u(this.f155493f));
        }
        return jz5.f0.f302826a;
    }
}

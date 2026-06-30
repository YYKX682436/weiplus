package nt1;

/* loaded from: classes9.dex */
public class d implements nt1.c {
    @Override // nt1.c
    public java.util.List b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        m11.b0 S1 = Di.S1(f9Var);
        if (S1 == null || S1.f322633a == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageMsgHandler", "can not get imgInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bm5.f0 f0Var = bm5.f0.f22564i;
        k90.b bVar = (k90.b) u0Var;
        java.lang.String aj6 = bVar.aj(f9Var, f0Var, S1.f322639g, "", "");
        nt1.c.a(arrayList, f9Var, aj6, 21);
        bm5.f0 f0Var2 = bm5.f0.f22565m;
        java.lang.String aj7 = bVar.aj(f9Var, f0Var2, S1.f322639g, "", "");
        nt1.c.a(arrayList, f9Var, aj7, 22);
        if (S1.j()) {
            m11.b0 C1 = Di.C1(java.lang.Long.valueOf(S1.f322649q));
            java.lang.String aj8 = bVar.aj(f9Var, bm5.f0.f22562g, C1.f322637e, "", "");
            if (!C1.f322637e.startsWith("SERVERID://")) {
                nt1.c.a(arrayList, f9Var, aj8, 23);
            }
            java.lang.String aj9 = bVar.aj(f9Var, f0Var, C1.f322639g, "", "");
            if (!com.tencent.mm.sdk.platformtools.t8.D0(aj9, aj6)) {
                nt1.c.a(arrayList, f9Var, aj9, 24);
            }
            java.lang.String aj10 = bVar.aj(f9Var, f0Var2, C1.f322639g, "", "");
            if (!com.tencent.mm.sdk.platformtools.t8.D0(aj10, aj7)) {
                nt1.c.a(arrayList, f9Var, aj10, 25);
            }
            nt1.c.a(arrayList, f9Var, bVar.hj(C1.f322637e + "_lp", "", "", false), 68);
        }
        java.lang.String aj11 = bVar.aj(f9Var, bm5.c0.f22550a.d(S1.l()), S1.f322637e, "", "");
        nt1.c.a(arrayList, f9Var, aj11, 20);
        java.lang.String aj12 = bVar.aj(f9Var, bm5.f0.f22563h, S1.f322638f, "", "");
        nt1.c.a(arrayList, f9Var, aj12, 26);
        h12.z zVar = (h12.z) ((k12.u) i95.n0.c(k12.u.class));
        nt1.c.a(arrayList, f9Var, zVar.Bi(aj11), 27);
        nt1.c.a(arrayList, f9Var, zVar.Bi(aj12), 28);
        nt1.c.a(arrayList, f9Var, bVar.aj(f9Var, bm5.f0.f22568p, S1.f322637e, "", ""), 67);
        return arrayList;
    }
}

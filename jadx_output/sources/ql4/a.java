package ql4;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ql4.a f364586a = new ql4.a();

    public bw5.lp0 a() {
        jm4.u2 a17;
        jm4.g3 g3Var = (((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj() == null || (a17 = jm4.w2.f300435d.a()) == null) ? null : (jm4.g3) urgen.ur_0025.UR_8227.UR_EDB6(((jm4.w2) a17).getCppPointer());
        if (g3Var == null) {
            return null;
        }
        byte[] UR_A3CD = urgen.ur_0025.UR_C8FE.UR_A3CD(((jm4.h3) g3Var).getCppPointer());
        bw5.lp0 lp0Var = new bw5.lp0();
        if (UR_A3CD.length == 0) {
            rk4.k5.d("playingItem is empty", "MicroMsg.TingPlayAppServiceImpl");
            return null;
        }
        try {
            lp0Var.parseFrom(UR_A3CD);
            return lp0Var;
        } catch (java.lang.Exception e17) {
            rk4.k5.d(e17.toString(), null);
            return null;
        }
    }
}

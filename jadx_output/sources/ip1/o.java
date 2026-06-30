package ip1;

/* loaded from: classes8.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ip1.o f293594d = new ip1.o();

    @Override // java.lang.Runnable
    public final void run() {
        byte[] UR_937E;
        try {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
            int i17 = jm4.f4.f300382d;
            jm4.e4 e4Var = (jm4.e4) urgen.ur_0025.UR_E533.UR_1332();
            bw5.vq0 vq0Var = (e4Var == null || (UR_937E = urgen.ur_0025.UR_E533.UR_937E(((jm4.f4) e4Var).getCppPointer())) == null) ? null : (bw5.vq0) jm4.r5.b(UR_937E, new bw5.vq0());
            ip1.q qVar = ip1.q.f293596a;
            pm0.v.X(new ip1.p(vq0Var));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AudioPanelTaskBarController", "parse ting item error, e:" + e17.getLocalizedMessage());
        }
    }
}

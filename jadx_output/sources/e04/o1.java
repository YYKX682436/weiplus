package e04;

/* loaded from: classes5.dex */
public final class o1 implements rt5.a {
    @Override // rt5.a
    public void submit(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.String str2 = e04.t1.f246101i;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c l17 = t0Var.l(runnable, 0L, str2);
        e04.r1 r1Var = e04.t1.f246095c;
        ((ku5.t0) ku5.t0.f312615d).h(new e04.n1(runnable, l17), "MicroMsg.ScanCameraThreadPoolManager");
    }
}

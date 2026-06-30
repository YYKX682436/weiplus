package rk4;

/* loaded from: classes11.dex */
public final class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f396829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396830e;

    public l6(bw5.lp0 lp0Var, bw5.ar0 ar0Var) {
        this.f396829d = lp0Var;
        this.f396830e = ar0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            bw5.ar0 ar0Var = this.f396830e;
            ((jm4.k4) Zi).e(this.f396829d, ar0Var, 0, new rk4.k6(ar0Var));
        }
    }
}

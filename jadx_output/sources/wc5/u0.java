package wc5;

/* loaded from: classes10.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444643d;

    public u0(wc5.y0 y0Var) {
        this.f444643d = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.y0 y0Var = this.f444643d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String g07 = kz5.n0.g0(((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).aj(), "#", null, null, 0, null, wc5.t0.f444641d, 30, null);
            y0Var.getClass();
            ((ku5.t0) ku5.t0.f312615d).q(new wc5.s0(y0Var, g07));
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}

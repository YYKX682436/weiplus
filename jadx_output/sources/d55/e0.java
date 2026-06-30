package d55;

/* loaded from: classes12.dex */
public class e0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d55.f0 f226582d;

    public e0(d55.f0 f0Var) {
        this.f226582d = f0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        d55.f0 f0Var = this.f226582d;
        f0Var.c();
        long j17 = f0Var.f226570m - f0Var.f226573p.f226588a;
        long j18 = f0Var.f226574q.f226559e;
        d55.o0.a(4, "MicroMsg.recovery.safePointLazy", "recovery interval = " + j17 + ", min = " + j18);
        if (j18 > 0 && j17 < j18) {
            d55.o0.a(4, "MicroMsg.recovery.safePointLazy", "too fast, skip and do nothing");
            f0Var.f226583r.set(false);
            return null;
        }
        f0Var.e();
        f0Var.i(true);
        f0Var.m();
        return null;
    }
}

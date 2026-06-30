package sj3;

/* loaded from: classes14.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408817d;

    public z3(sj3.d4 d4Var) {
        this.f408817d = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.q3 q3Var = this.f408817d.f408475d;
        if (q3Var != null) {
            boolean z17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150162e;
            sj3.n1 n1Var = q3Var.f408711m;
            if (n1Var != null) {
                n1Var.f408653g = z17;
                n1Var.a(z17, n1Var.f408652f);
            }
        }
    }
}

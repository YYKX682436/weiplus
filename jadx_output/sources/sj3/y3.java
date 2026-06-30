package sj3;

/* loaded from: classes14.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408811d;

    public y3(sj3.d4 d4Var) {
        this.f408811d = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.n1 n1Var;
        sj3.q3 q3Var = this.f408811d.f408475d;
        if (q3Var == null || (n1Var = q3Var.f408711m) == null) {
            return;
        }
        n1Var.f408652f = true;
        n1Var.a(n1Var.f408653g, true);
    }
}

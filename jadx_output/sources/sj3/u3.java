package sj3;

/* loaded from: classes14.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f408777e;

    public u3(sj3.d4 d4Var, boolean z17) {
        this.f408776d = d4Var;
        this.f408777e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.d4 d4Var = this.f408776d;
        sj3.q3 q3Var = d4Var.f408475d;
        if (q3Var == null || d4Var.f408478g || q3Var == null) {
            return;
        }
        q3Var.c(this.f408777e);
    }
}

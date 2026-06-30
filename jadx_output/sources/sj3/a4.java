package sj3;

/* loaded from: classes14.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408415d;

    public a4(sj3.d4 d4Var) {
        this.f408415d = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.d4 d4Var = this.f408415d;
        sj3.q3 q3Var = d4Var.f408475d;
        if (q3Var != null) {
            q3Var.m(null);
        }
        d4Var.n(false);
    }
}

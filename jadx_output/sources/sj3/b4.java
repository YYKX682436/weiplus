package sj3;

/* loaded from: classes14.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408443e;

    public b4(sj3.d4 d4Var, java.lang.String str) {
        this.f408442d = d4Var;
        this.f408443e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.d4 d4Var = this.f408442d;
        sj3.q3 q3Var = d4Var.f408475d;
        java.lang.String str = this.f408443e;
        if (q3Var != null) {
            q3Var.m(str);
        }
        sj3.q3 q3Var2 = d4Var.f408475d;
        if (q3Var2 != null) {
            q3Var2.o(str);
        }
        d4Var.n(true);
    }
}

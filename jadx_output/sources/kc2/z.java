package kc2;

/* loaded from: classes15.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f306545d;

    public z(kc2.c0 c0Var) {
        this.f306545d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.c0 c0Var = this.f306545d;
        c0Var.f306346p = e17;
        kc2.h1.f306405a.b(c0Var.g(), c0Var.f306346p, c0Var.f306348r, c0Var.f306347q);
    }
}

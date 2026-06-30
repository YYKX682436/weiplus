package kc2;

/* loaded from: classes15.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f306349d;

    public c1(kc2.g1 g1Var) {
        this.f306349d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.g1 g1Var = this.f306349d;
        kc2.a2.a(g1Var.o(), e17, false, 2, null);
        g1Var.d().a(new kc2.a(kc2.k.f306442w, e17));
    }
}

package ec3;

/* loaded from: classes9.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f250988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f250989e;

    public b1(ec3.g1 g1Var, yz5.a aVar) {
        this.f250988d = g1Var;
        this.f250989e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec3.r1 r1Var = ec3.r1.f251087a;
        ec3.g1 g1Var = this.f250988d;
        r1Var.c(g1Var.W6(), ec3.m.f251052f, g1Var.getActivity(), new ec3.a1(this.f250989e));
    }
}

package n0;

/* loaded from: classes14.dex */
public final class z1 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f333801d;

    /* renamed from: e, reason: collision with root package name */
    public n0.a2 f333802e;

    public z1(yz5.l effect) {
        kotlin.jvm.internal.o.g(effect, "effect");
        this.f333801d = effect;
    }

    @Override // n0.e4
    public void b() {
        this.f333802e = (n0.a2) this.f333801d.invoke(n0.d2.f333482a);
    }

    @Override // n0.e4
    public void c() {
    }

    @Override // n0.e4
    public void d() {
        n0.a2 a2Var = this.f333802e;
        if (a2Var != null) {
            a2Var.dispose();
        }
        this.f333802e = null;
    }
}

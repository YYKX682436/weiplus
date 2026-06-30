package ir;

/* loaded from: classes15.dex */
public final class i1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.u f293870d;

    /* renamed from: e, reason: collision with root package name */
    public ir.e1 f293871e;

    public i1(ir.u setInfo) {
        kotlin.jvm.internal.o.g(setInfo, "setInfo");
        this.f293870d = setInfo;
        this.f293871e = new ir.e1(setInfo, true);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.e1(this.f293870d, false);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f293871e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.e1 e1Var = (ir.e1) k0Var;
        kotlin.jvm.internal.o.g(e1Var, "<set-?>");
        this.f293871e = e1Var;
    }
}

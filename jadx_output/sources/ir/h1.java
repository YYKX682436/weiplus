package ir;

/* loaded from: classes15.dex */
public final class h1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.v f293863d;

    /* renamed from: e, reason: collision with root package name */
    public ir.f1 f293864e;

    public h1(ir.v introInfo) {
        kotlin.jvm.internal.o.g(introInfo, "introInfo");
        this.f293863d = introInfo;
        this.f293864e = new ir.f1(introInfo);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.f1(this.f293863d);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f293864e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.f1 f1Var = (ir.f1) k0Var;
        kotlin.jvm.internal.o.g(f1Var, "<set-?>");
        this.f293864e = f1Var;
    }
}

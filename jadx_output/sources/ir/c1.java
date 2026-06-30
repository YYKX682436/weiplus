package ir;

/* loaded from: classes15.dex */
public final class c1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f293822d;

    /* renamed from: e, reason: collision with root package name */
    public ir.b1 f293823e;

    public c1(ir.h config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f293822d = config;
        this.f293823e = new ir.b1(config.f293860s);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.b1(this.f293822d.f293860s);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f293823e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.b1 b1Var = (ir.b1) k0Var;
        kotlin.jvm.internal.o.g(b1Var, "<set-?>");
        this.f293823e = b1Var;
    }
}

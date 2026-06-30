package ir;

/* loaded from: classes15.dex */
public final class d extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f293824d;

    /* renamed from: e, reason: collision with root package name */
    public ir.c f293825e;

    public d(ir.h config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f293824d = config;
        this.f293825e = new ir.c(config.f293849h);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.c(this.f293824d.f293849h);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f293825e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.c cVar = (ir.c) k0Var;
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        this.f293825e = cVar;
    }
}

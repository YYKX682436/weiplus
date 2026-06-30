package ir;

/* loaded from: classes15.dex */
public final class f extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f293834d;

    /* renamed from: e, reason: collision with root package name */
    public ir.e f293835e;

    public f(ir.h config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f293834d = config;
        this.f293835e = new ir.e(config.f293847f, config.f293846e);
    }

    @Override // ir.t0
    public ir.k0 a() {
        ir.h hVar = this.f293834d;
        return new ir.e(hVar.f293847f, hVar.f293846e);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f293835e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.e eVar = (ir.e) k0Var;
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.f293835e = eVar;
    }
}

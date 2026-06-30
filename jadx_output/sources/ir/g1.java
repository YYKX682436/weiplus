package ir;

/* loaded from: classes15.dex */
public final class g1 extends ir.t0 {

    /* renamed from: d, reason: collision with root package name */
    public ir.t f293840d;

    /* renamed from: e, reason: collision with root package name */
    public ir.d1 f293841e;

    public g1(ir.t groupInfo) {
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        this.f293840d = groupInfo;
        this.f293841e = new ir.d1(this.f293840d, true);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new ir.d1(this.f293840d, false);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f293841e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        ir.d1 d1Var = (ir.d1) k0Var;
        kotlin.jvm.internal.o.g(d1Var, "<set-?>");
        this.f293841e = d1Var;
    }
}

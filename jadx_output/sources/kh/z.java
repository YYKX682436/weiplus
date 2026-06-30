package kh;

/* loaded from: classes12.dex */
public final class z extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.a0 f307958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kh.a0 a0Var, kh.a0 a0Var2) {
        super(a0Var, a0Var2);
        this.f307958e = a0Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.a0 a0Var = new kh.a0();
        kh.p1 p1Var = kh.t1.f307916i;
        rh.d3 end = this.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        p1Var.a(this.f307958e, (kh.t1) end, a0Var);
        return a0Var;
    }
}

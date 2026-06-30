package kh;

/* loaded from: classes12.dex */
public final class v0 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.w0 f307933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kh.w0 f307934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kh.w0 w0Var, kh.w0 w0Var2) {
        super(w0Var, w0Var2);
        this.f307933e = w0Var;
        this.f307934f = w0Var2;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.w0 w0Var = new kh.w0(this.f307934f.f307938j);
        kh.p1 p1Var = kh.t1.f307916i;
        rh.d3 end = this.f395485b;
        kotlin.jvm.internal.o.f(end, "end");
        p1Var.a(this.f307933e, (kh.t1) end, w0Var);
        return w0Var;
    }
}

package kh;

/* loaded from: classes12.dex */
public final class q1 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.r1 f307892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kh.r1 r1Var, kh.r1 r1Var2) {
        super(r1Var, r1Var2);
        this.f307892e = r1Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.r1 r1Var = (kh.r1) this.f395485b;
        java.lang.String str = r1Var.f307902d;
        kh.r1 r1Var2 = this.f307892e;
        java.lang.Number number = rh.p2.a(r1Var2.f307903e, r1Var.f307903e).f395552a;
        kotlin.jvm.internal.o.f(number, "get(...)");
        int intValue = number.intValue();
        java.lang.Number number2 = rh.p2.a(r1Var2.f307904f, r1Var.f307904f).f395552a;
        kotlin.jvm.internal.o.f(number2, "get(...)");
        return new kh.r1(str, intValue, number2.longValue());
    }
}

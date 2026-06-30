package dr0;

/* loaded from: classes12.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.t1 f242550d = new dr0.t1();

    public t1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr0.w1 w1Var = dr0.a3.f242403d;
        boolean z17 = true;
        if (!w1Var.a().g() && !mm.o.a() && !mm.k.j(mm.k.L, null, 1, null) && w1Var.a().i() <= 0 && (!mm.k.j(mm.k.F, null, 1, null) || mm.k.G.k("-1") < 0)) {
            z17 = kotlin.jvm.internal.o.b("0", "1");
        }
        return java.lang.Boolean.valueOf(mm.k.B.i(z17 ? "1" : "0"));
    }
}

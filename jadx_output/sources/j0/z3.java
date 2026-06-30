package j0;

/* loaded from: classes14.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.z3 f296697d = new j0.z3();

    public z3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer num;
        k0.p0 deleteIfSelectedOr = (k0.p0) obj;
        kotlin.jvm.internal.o.g(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        a2.k1 k1Var = deleteIfSelectedOr.f302928c;
        if (k1Var != null) {
            int c17 = a2.m1.c(deleteIfSelectedOr.f302931f);
            ((g2.t) deleteIfSelectedOr.f302929d).getClass();
            num = java.lang.Integer.valueOf(deleteIfSelectedOr.d(k1Var, c17));
        } else {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return new g2.b(a2.m1.c(deleteIfSelectedOr.f302931f) - num.intValue(), 0);
    }
}

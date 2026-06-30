package j0;

/* loaded from: classes14.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.a4 f296210d = new j0.a4();

    public a4() {
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
            num = java.lang.Integer.valueOf(deleteIfSelectedOr.c(k1Var, c17));
        } else {
            num = null;
        }
        if (num != null) {
            return new g2.b(0, num.intValue() - a2.m1.c(deleteIfSelectedOr.f302931f));
        }
        return null;
    }
}

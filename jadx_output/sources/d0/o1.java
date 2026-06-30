package d0;

/* loaded from: classes14.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.o1 f225182d = new d0.o1();

    public o1() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List measurables = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(measurables, "measurables");
        d0.m1 m1Var = d0.m1.f225172d;
        d0.n1 n1Var = d0.n1.f225178d;
        d0.t1 t1Var = d0.t1.Vertical;
        return java.lang.Integer.valueOf(d0.j2.a(measurables, m1Var, n1Var, intValue, intValue2, t1Var, t1Var));
    }
}

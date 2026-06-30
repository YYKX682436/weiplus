package d0;

/* loaded from: classes14.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.i1 f225144d = new d0.i1();

    public i1() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List measurables = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(measurables, "measurables");
        d0.g1 g1Var = d0.g1.f225121d;
        d0.h1 h1Var = d0.h1.f225126d;
        d0.t1 t1Var = d0.t1.Vertical;
        return java.lang.Integer.valueOf(d0.j2.a(measurables, g1Var, h1Var, intValue, intValue2, t1Var, t1Var));
    }
}

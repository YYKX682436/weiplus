package d0;

/* loaded from: classes14.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.f1 f225113d = new d0.f1();

    public f1() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List measurables = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(measurables, "measurables");
        d0.d1 d1Var = d0.d1.f225101d;
        d0.e1 e1Var = d0.e1.f225107d;
        d0.t1 t1Var = d0.t1.Horizontal;
        return java.lang.Integer.valueOf(d0.j2.a(measurables, d1Var, e1Var, intValue, intValue2, t1Var, t1Var));
    }
}

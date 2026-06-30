package d0;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.z0 f225248d = new d0.z0();

    public z0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List measurables = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(measurables, "measurables");
        d0.x0 x0Var = d0.x0.f225237d;
        d0.y0 y0Var = d0.y0.f225243d;
        d0.t1 t1Var = d0.t1.Horizontal;
        return java.lang.Integer.valueOf(d0.j2.a(measurables, x0Var, y0Var, intValue, intValue2, t1Var, t1Var));
    }
}

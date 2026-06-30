package d0;

/* loaded from: classes14.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.r1 f225202d = new d0.r1();

    public r1() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.List measurables = (java.util.List) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return java.lang.Integer.valueOf(d0.j2.a(measurables, d0.p1.f225190d, d0.q1.f225197d, intValue, intValue2, d0.t1.Vertical, d0.t1.Horizontal));
    }
}

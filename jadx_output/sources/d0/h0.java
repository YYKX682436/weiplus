package d0;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public static final d0.h0 f225125d = new d0.h0();

    public h0() {
        super(5);
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int intValue = ((java.lang.Number) obj).intValue();
        int[] size = (int[]) obj2;
        p2.f density = (p2.f) obj4;
        int[] outPosition = (int[]) obj5;
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g((p2.s) obj3, "<anonymous parameter 2>");
        kotlin.jvm.internal.o.g(density, "density");
        kotlin.jvm.internal.o.g(outPosition, "outPosition");
        ((d0.k) d0.p.f225186d).b(density, intValue, size, outPosition);
        return jz5.f0.f302826a;
    }
}

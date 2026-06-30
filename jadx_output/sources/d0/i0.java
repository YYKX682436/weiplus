package d0;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.l f225143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(d0.l lVar) {
        super(5);
        this.f225143d = lVar;
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
        this.f225143d.b(density, intValue, size, outPosition);
        return jz5.f0.f302826a;
    }
}

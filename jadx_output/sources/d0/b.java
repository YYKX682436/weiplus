package d0;

/* loaded from: classes14.dex */
public final class b implements d0.e {

    /* renamed from: a, reason: collision with root package name */
    public final float f225074a = 0;

    @Override // d0.d, d0.l
    public float a() {
        return this.f225074a;
    }

    @Override // d0.l
    public void b(p2.f fVar, int i17, int[] sizes, int[] outPositions) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(sizes, "sizes");
        kotlin.jvm.internal.o.g(outPositions, "outPositions");
        d0.p.f225183a.a(i17, sizes, outPositions, false);
    }

    @Override // d0.d
    public void c(p2.f fVar, int i17, int[] sizes, p2.s layoutDirection, int[] outPositions) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(sizes, "sizes");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(outPositions, "outPositions");
        if (layoutDirection == p2.s.Ltr) {
            d0.p.f225183a.a(i17, sizes, outPositions, false);
        } else {
            d0.p.f225183a.a(i17, sizes, outPositions, true);
        }
    }

    public java.lang.String toString() {
        return "Arrangement#Center";
    }
}

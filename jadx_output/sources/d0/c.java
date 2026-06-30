package d0;

/* loaded from: classes14.dex */
public final class c implements d0.d {
    @Override // d0.d, d0.l
    public float a() {
        return 0;
    }

    @Override // d0.d
    public void c(p2.f fVar, int i17, int[] sizes, p2.s layoutDirection, int[] outPositions) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(sizes, "sizes");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(outPositions, "outPositions");
        if (layoutDirection == p2.s.Ltr) {
            d0.p.f225183a.c(i17, sizes, outPositions, false);
        } else {
            d0.p.f225183a.b(sizes, outPositions, true);
        }
    }

    public java.lang.String toString() {
        return "Arrangement#End";
    }
}

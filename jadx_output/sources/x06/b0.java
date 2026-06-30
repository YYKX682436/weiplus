package x06;

/* loaded from: classes16.dex */
public final class b0 extends o06.r {
    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o06.g0
    public boolean a(z16.g gVar, o06.q qVar, o06.m mVar, boolean z17) {
        if (qVar == null) {
            b(0);
            throw null;
        }
        if (mVar != null) {
            return x06.d0.b(gVar, qVar, mVar);
        }
        b(1);
        throw null;
    }
}

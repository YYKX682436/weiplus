package xi;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xi.j f454656d = new xi.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ih.d d17 = ih.d.d();
        kotlin.jvm.internal.o.f(d17, "Matrix.with()");
        if (oj.m.c(d17.f291471b)) {
            return "Main";
        }
        ih.d d18 = ih.d.d();
        kotlin.jvm.internal.o.f(d18, "Matrix.with()");
        java.lang.String b17 = oj.m.b(d18.f291471b);
        kotlin.jvm.internal.o.f(b17, "MatrixUtil.getProcessNam…atrix.with().application)");
        java.lang.Object[] array = r26.n0.f0(b17, new java.lang.String[]{":"}, false, 0, 6, null).toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.String[] strArr = (java.lang.String[]) array;
        return strArr.length > 1 ? strArr[1] : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }
}

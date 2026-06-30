package j0;

/* loaded from: classes14.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.b4 f296220d = new j0.b4();

    public b4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        k0.p0 deleteIfSelectedOr = (k0.p0) obj;
        kotlin.jvm.internal.o.g(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        java.lang.Integer b17 = deleteIfSelectedOr.b();
        if (b17 == null) {
            return null;
        }
        return new g2.b(a2.m1.c(deleteIfSelectedOr.f302931f) - b17.intValue(), 0);
    }
}

package j0;

/* loaded from: classes14.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.c4 f296232d = new j0.c4();

    public c4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        k0.p0 deleteIfSelectedOr = (k0.p0) obj;
        kotlin.jvm.internal.o.g(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        java.lang.Integer a17 = deleteIfSelectedOr.a();
        if (a17 != null) {
            return new g2.b(0, a17.intValue() - a2.m1.c(deleteIfSelectedOr.f302931f));
        }
        return null;
    }
}

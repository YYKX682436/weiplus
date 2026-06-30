package j0;

/* loaded from: classes14.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.y3 f296670d = new j0.y3();

    public y3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        k0.p0 deleteIfSelectedOr = (k0.p0) obj;
        kotlin.jvm.internal.o.g(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        java.lang.String str = deleteIfSelectedOr.f302932g.f681d;
        int c17 = a2.m1.c(deleteIfSelectedOr.f302931f);
        kotlin.jvm.internal.o.g(str, "<this>");
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return new g2.b(0, characterInstance.following(c17) - a2.m1.c(deleteIfSelectedOr.f302931f));
    }
}

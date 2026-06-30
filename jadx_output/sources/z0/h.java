package z0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final z0.h f468908d = new z0.h();

    public h() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String acc = (java.lang.String) obj;
        z0.s element = (z0.s) obj2;
        kotlin.jvm.internal.o.g(acc, "acc");
        kotlin.jvm.internal.o.g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}

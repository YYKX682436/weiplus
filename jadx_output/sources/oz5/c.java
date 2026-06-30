package oz5;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oz5.c f350324d = new oz5.c();

    public c() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String acc = (java.lang.String) obj;
        oz5.i element = (oz5.i) obj2;
        kotlin.jvm.internal.o.g(acc, "acc");
        kotlin.jvm.internal.o.g(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}

package hd1;

/* loaded from: classes7.dex */
public final class b0 implements hd1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final hd1.b0 f280391a = new hd1.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f280392b = jz5.h.a(jz5.i.f302831f, hd1.a0.f280384d);

    @Override // hd1.e
    public void a(android.nfc.Tag tag, java.lang.String function, id1.a aVar, yz5.l callback) {
        java.lang.Object yVar;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(function, "function");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.nfc.tech.NfcA nfcA = android.nfc.tech.NfcA.get(tag);
        if (nfcA == null) {
            callback.invoke(new hd1.x(13015, "unavailable tech"));
            return;
        }
        if (kotlin.jvm.internal.o.b(function, "getAtqa")) {
            byte[] atqa = nfcA.getAtqa();
            if (atqa == null) {
                atqa = (byte[]) f280392b.getValue();
            }
            kotlin.jvm.internal.o.f(java.util.Arrays.toString(atqa), "toString(...)");
            yVar = new hd1.y(atqa);
        } else {
            yVar = kotlin.jvm.internal.o.b(function, "getSak") ? new hd1.y(java.lang.Short.valueOf(nfcA.getSak())) : new hd1.x(13024, "function not support");
        }
        callback.invoke(yVar);
    }
}

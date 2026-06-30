package hd1;

/* loaded from: classes7.dex */
public final class f implements hd1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final hd1.f f280398a = new hd1.f();

    @Override // hd1.e
    public void a(android.nfc.Tag tag, java.lang.String function, id1.a aVar, yz5.l callback) {
        java.lang.Object xVar;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(function, "function");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.nfc.tech.IsoDep isoDep = android.nfc.tech.IsoDep.get(tag);
        if (isoDep == null) {
            callback.invoke(new hd1.x(13015, "unavailable tech"));
            return;
        }
        if (kotlin.jvm.internal.o.b(function, "getHistoricalBytes")) {
            byte[] historicalBytes = isoDep.getHistoricalBytes();
            if (historicalBytes != null) {
                kotlin.jvm.internal.o.f(java.util.Arrays.toString(historicalBytes), "toString(...)");
            } else {
                historicalBytes = null;
            }
            xVar = new hd1.y(historicalBytes);
        } else {
            xVar = new hd1.x(13024, "function not support");
        }
        callback.invoke(xVar);
    }
}

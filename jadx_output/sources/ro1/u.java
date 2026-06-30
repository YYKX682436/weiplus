package ro1;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ro1.u f398013d = new ro1.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 b17 = oo1.o.f347151a.b();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.lang.String[] b18 = b17.b();
        kotlin.jvm.internal.o.f(b18, "allKeys(...)");
        for (java.lang.String str : b18) {
            po1.d b19 = po1.d.f357294i.b(b17.t(str));
            if (b19 != null) {
                kotlin.jvm.internal.o.d(str);
                concurrentHashMap.put(str, b19);
            }
        }
        return concurrentHashMap;
    }
}

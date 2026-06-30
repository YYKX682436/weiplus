package on1;

/* loaded from: classes11.dex */
public class b extends kn1.a {

    /* renamed from: b, reason: collision with root package name */
    public static on1.b f346803b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f346804c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f346805d;

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f346805d = concurrentHashMap;
        concurrentHashMap.put(3, new pn1.e());
        concurrentHashMap.put(47, new pn1.d());
        concurrentHashMap.put(49, new pn1.c());
        concurrentHashMap.put(34, new pn1.h());
        pn1.g gVar = new pn1.g();
        concurrentHashMap.put(43, gVar);
        concurrentHashMap.put(44, gVar);
        concurrentHashMap.put(62, gVar);
        pn1.f fVar = new pn1.f();
        concurrentHashMap.put(48, fVar);
        concurrentHashMap.put(42, fVar);
        concurrentHashMap.put(66, fVar);
        concurrentHashMap.put(10000, fVar);
        concurrentHashMap.put(1, fVar);
        concurrentHashMap.put(37, fVar);
        concurrentHashMap.put(40, fVar);
        concurrentHashMap.put(50, fVar);
        concurrentHashMap.put(838860849, fVar);
    }

    public static on1.b d() {
        if (f346803b == null) {
            on1.b bVar = new on1.b();
            f346803b = bVar;
            kn1.a.a(bVar);
        }
        return f346803b;
    }

    public static boolean e(int i17) {
        return i17 == 3 || i17 == 43 || i17 == 44 || i17 == 62 || i17 == 34 || com.tencent.mm.pluginsdk.model.app.k0.c(i17) == 49;
    }

    @Override // kn1.a
    public void b() {
        f346803b = null;
    }

    public on1.i c(int i17) {
        return (on1.i) f346805d.get(java.lang.Integer.valueOf(i17));
    }
}

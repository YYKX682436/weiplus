package ef5;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ef5.b f252492a = new ef5.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f252493b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f252494c = jz5.h.b(ef5.a.f252491d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f252495d = new java.util.LinkedHashMap();

    static {
        java.util.Iterator it = kz5.c0.i("kotlin", "java", "python", "javascript", "json", "xml", "html", "sql").iterator();
        while (it.hasNext()) {
            f252492a.a((java.lang.String) it.next());
        }
    }

    public final gf5.n a(java.lang.String languageName) {
        kotlin.jvm.internal.o.g(languageName, "languageName");
        java.util.Map map = f252493b;
        if (map.containsKey(languageName)) {
            return (gf5.n) map.get(languageName);
        }
        ff5.b bVar = ff5.b.f261715a;
        java.util.Map map2 = ff5.b.f261720f;
        java.lang.String lowerCase = r26.n0.u0(languageName).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        gf5.n nVar = (gf5.n) ((lz5.m) map2).get(lowerCase);
        if (nVar != null) {
            map.put(languageName, nVar);
            f252495d.put(languageName, new hf5.a(nVar));
        }
        return nVar;
    }
}

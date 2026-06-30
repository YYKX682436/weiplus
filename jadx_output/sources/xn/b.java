package xn;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public static final xn.a f455401c = new xn.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f455402a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f455403b = new java.util.LinkedHashMap();

    public b() {
        a45.g gVar = (a45.g) this;
        try {
            gVar.a(1000000, 0, a45.b.class);
            gVar.a(1, 0, a45.k.class);
            gVar.a(43, 0, a45.m.class);
            gVar.a(3, 0, a45.c.class);
            gVar.a(49, 6, a45.a.class);
            gVar.a(49, 130, a45.a.class);
            gVar.f455403b.put(49, a45.d.f1348d);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void a(int i17, int i18, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f455402a.put(java.lang.Integer.valueOf(f455401c.a("", i17, i18)), clazz);
    }
}

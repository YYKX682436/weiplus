package n16;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final n16.j f334180a = new n16.j();

    /* renamed from: b, reason: collision with root package name */
    public static final n16.c f334181b;

    /* renamed from: c, reason: collision with root package name */
    public static final n16.c f334182c;

    /* renamed from: d, reason: collision with root package name */
    public static final n16.c f334183d;

    /* renamed from: e, reason: collision with root package name */
    public static final n16.c f334184e;

    /* renamed from: f, reason: collision with root package name */
    public static final n16.c f334185f;

    /* renamed from: g, reason: collision with root package name */
    public static final n16.c f334186g;

    /* renamed from: h, reason: collision with root package name */
    public static final n16.c f334187h;

    /* renamed from: i, reason: collision with root package name */
    public static final n16.b f334188i;

    /* renamed from: j, reason: collision with root package name */
    public static final n16.b f334189j;

    /* renamed from: k, reason: collision with root package name */
    public static final n16.b f334190k;

    /* renamed from: l, reason: collision with root package name */
    public static final n16.b f334191l;

    /* renamed from: m, reason: collision with root package name */
    public static final n16.b f334192m;

    /* renamed from: n, reason: collision with root package name */
    public static final n16.b f334193n;

    /* renamed from: o, reason: collision with root package name */
    public static final n16.b f334194o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Set f334195p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Set f334196q;

    /* renamed from: r, reason: collision with root package name */
    public static final n16.b f334197r;

    /* renamed from: s, reason: collision with root package name */
    public static final n16.b f334198s;

    /* renamed from: t, reason: collision with root package name */
    public static final n16.b f334199t;

    /* renamed from: u, reason: collision with root package name */
    public static final n16.b f334200u;

    static {
        n16.c cVar = new n16.c("kotlin");
        f334181b = cVar;
        n16.c c17 = cVar.c(n16.g.k("reflect"));
        f334182c = c17;
        n16.c c18 = cVar.c(n16.g.k("collections"));
        f334183d = c18;
        n16.c c19 = cVar.c(n16.g.k("ranges"));
        f334184e = c19;
        cVar.c(n16.g.k("jvm")).c(n16.g.k("internal"));
        n16.c c27 = cVar.c(n16.g.k("annotation"));
        f334185f = c27;
        n16.c c28 = cVar.c(n16.g.k("internal"));
        c28.c(n16.g.k("ir"));
        n16.c c29 = cVar.c(n16.g.k("coroutines"));
        f334186g = c29;
        f334187h = cVar.c(n16.g.k("enums"));
        cVar.c(n16.g.k("contracts"));
        cVar.c(n16.g.k("concurrent"));
        cVar.c(n16.g.k("test"));
        kz5.p1.f(cVar, c18, c19, c27, c17, c28, c29);
        n16.k.a("Nothing");
        n16.k.a("Unit");
        n16.k.a("Any");
        n16.k.a("Enum");
        n16.k.a("Annotation");
        f334188i = n16.k.a("Array");
        n16.b a17 = n16.k.a("Boolean");
        n16.b a18 = n16.k.a("Char");
        n16.b a19 = n16.k.a("Byte");
        n16.b a27 = n16.k.a("Short");
        n16.b a28 = n16.k.a("Int");
        n16.b a29 = n16.k.a("Long");
        n16.b a37 = n16.k.a("Float");
        n16.b a38 = n16.k.a("Double");
        f334189j = n16.k.g(a19);
        f334190k = n16.k.g(a27);
        f334191l = n16.k.g(a28);
        f334192m = n16.k.g(a29);
        n16.k.a("CharSequence");
        f334193n = n16.k.a("String");
        n16.k.a("Throwable");
        n16.k.a("Cloneable");
        n16.k.f("KProperty");
        n16.k.f("KMutableProperty");
        n16.k.f("KProperty0");
        n16.k.f("KMutableProperty0");
        n16.k.f("KProperty1");
        n16.k.f("KMutableProperty1");
        n16.k.f("KProperty2");
        n16.k.f("KMutableProperty2");
        f334194o = n16.k.f("KFunction");
        n16.k.f("KClass");
        n16.k.f("KCallable");
        n16.k.f("KType");
        n16.k.a("Comparable");
        n16.k.a("Number");
        n16.k.a("Function");
        java.util.Set D0 = kz5.z.D0(new n16.b[]{a17, a18, a19, a27, a28, a29, a37, a38});
        f334195p = D0;
        int d17 = kz5.b1.d(kz5.d0.q(D0, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : D0) {
            n16.g j17 = ((n16.b) obj).j();
            kotlin.jvm.internal.o.f(j17, "getShortClassName(...)");
            linkedHashMap.put(obj, n16.k.d(j17));
        }
        n16.k.c(linkedHashMap);
        java.util.Set D02 = kz5.z.D0(new n16.b[]{f334189j, f334190k, f334191l, f334192m});
        f334196q = D02;
        int d18 = kz5.b1.d(kz5.d0.q(D02, 10));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d18 >= 16 ? d18 : 16);
        for (java.lang.Object obj2 : D02) {
            n16.g j18 = ((n16.b) obj2).j();
            kotlin.jvm.internal.o.f(j18, "getShortClassName(...)");
            linkedHashMap2.put(obj2, n16.k.d(j18));
        }
        n16.k.c(linkedHashMap2);
        kz5.q1.j(kz5.q1.i(f334195p, f334196q), f334193n);
        n16.c cVar2 = f334186g;
        n16.g k17 = n16.g.k("Continuation");
        if (cVar2 == null) {
            n16.b.a(3);
            throw null;
        }
        n16.c.j(k17);
        n16.k.b("Iterator");
        n16.k.b("Iterable");
        n16.k.b("Collection");
        n16.k.b("List");
        n16.k.b("ListIterator");
        n16.k.b("Set");
        n16.b b17 = n16.k.b("Map");
        n16.k.b("MutableIterator");
        n16.k.b("CharIterator");
        n16.k.b("MutableIterable");
        n16.k.b("MutableCollection");
        f334197r = n16.k.b("MutableList");
        n16.k.b("MutableListIterator");
        f334198s = n16.k.b("MutableSet");
        n16.b b18 = n16.k.b("MutableMap");
        f334199t = b18;
        b17.d(n16.g.k("Entry"));
        b18.d(n16.g.k("MutableEntry"));
        n16.k.a("Result");
        n16.k.e("IntRange");
        n16.k.e("LongRange");
        n16.k.e("CharRange");
        n16.c cVar3 = f334185f;
        n16.g k18 = n16.g.k("AnnotationRetention");
        if (cVar3 == null) {
            n16.b.a(3);
            throw null;
        }
        n16.c.j(k18);
        n16.c.j(n16.g.k("AnnotationTarget"));
        n16.k.a("DeprecationLevel");
        f334200u = new n16.b(f334187h, n16.g.k("EnumEntries"));
    }
}

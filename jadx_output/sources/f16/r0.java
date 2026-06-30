package f16;

/* loaded from: classes15.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f16.k f258768a = new f16.k(f16.n.f258756e, null, false, false, 8, null);

    /* renamed from: b, reason: collision with root package name */
    public static final f16.k f258769b;

    /* renamed from: c, reason: collision with root package name */
    public static final f16.k f258770c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f258771d;

    static {
        f16.n nVar = f16.n.f258757f;
        f258769b = new f16.k(nVar, null, false, false, 8, null);
        f258770c = new f16.k(nVar, null, true, false, 8, null);
        g16.a1 a1Var = g16.a1.f267591a;
        java.lang.String f17 = a1Var.f("Object");
        java.lang.String e17 = a1Var.e("Predicate");
        java.lang.String e18 = a1Var.e("Function");
        java.lang.String e19 = a1Var.e("Consumer");
        java.lang.String e27 = a1Var.e("BiFunction");
        java.lang.String e28 = a1Var.e("BiConsumer");
        java.lang.String e29 = a1Var.e("UnaryOperator");
        java.lang.String g17 = a1Var.g("stream/Stream");
        java.lang.String g18 = a1Var.g("Optional");
        f16.b1 b1Var = new f16.b1();
        new f16.a1(b1Var, a1Var.g("Iterator")).a("forEachRemaining", new f16.p(e19));
        new f16.a1(b1Var, a1Var.f("Iterable")).a("spliterator", new f16.v(a1Var));
        f16.a1 a1Var2 = new f16.a1(b1Var, a1Var.g("Collection"));
        a1Var2.a("removeIf", new f16.w(e17));
        a1Var2.a("stream", new f16.x(g17));
        a1Var2.a("parallelStream", new f16.y(g17));
        new f16.a1(b1Var, a1Var.g("List")).a("replaceAll", new f16.z(e29));
        f16.a1 a1Var3 = new f16.a1(b1Var, a1Var.g("Map"));
        a1Var3.a("forEach", new f16.a0(e28));
        a1Var3.a("putIfAbsent", new f16.b0(f17));
        a1Var3.a("replace", new f16.c0(f17));
        a1Var3.a("replace", new f16.d0(f17));
        a1Var3.a("replaceAll", new f16.e0(e27));
        a1Var3.a("compute", new f16.f0(f17, e27));
        a1Var3.a("computeIfAbsent", new f16.g0(f17, e18));
        a1Var3.a("computeIfPresent", new f16.h0(f17, e27));
        a1Var3.a("merge", new f16.i0(f17, e27));
        f16.a1 a1Var4 = new f16.a1(b1Var, g18);
        a1Var4.a("empty", new f16.j0(g18));
        a1Var4.a("of", new f16.k0(f17, g18));
        a1Var4.a("ofNullable", new f16.l0(f17, g18));
        a1Var4.a("get", new f16.m0(f17));
        a1Var4.a("ifPresent", new f16.n0(e19));
        new f16.a1(b1Var, a1Var.f("ref/Reference")).a("get", new f16.o0(f17));
        new f16.a1(b1Var, e17).a("test", new f16.p0(f17));
        new f16.a1(b1Var, a1Var.e("BiPredicate")).a("test", new f16.q0(f17));
        new f16.a1(b1Var, e19).a("accept", new f16.q(f17));
        new f16.a1(b1Var, e28).a("accept", new f16.r(f17));
        new f16.a1(b1Var, e18).a("apply", new f16.s(f17));
        new f16.a1(b1Var, e27).a("apply", new f16.t(f17));
        new f16.a1(b1Var, a1Var.e("Supplier")).a("get", new f16.u(f17));
        f258771d = b1Var.f258704a;
    }
}

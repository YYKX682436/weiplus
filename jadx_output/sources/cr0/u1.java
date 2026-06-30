package cr0;

/* loaded from: classes12.dex */
public final class u1 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.u1 f221760a = new cr0.u1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f221761b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f221762c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f221763d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f221764e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f221765f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f221766g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f221767h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f221768i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f221769j;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f221761b = jz5.h.a(iVar, cr0.l1.f221675d);
        f221762c = jz5.h.a(iVar, cr0.f1.f221623d);
        f221763d = jz5.h.a(iVar, cr0.g1.f221630d);
        f221764e = jz5.h.a(iVar, cr0.q1.f221721d);
        f221765f = mm.o.j(false, 1, null);
        f221766g = jz5.h.a(iVar, cr0.r1.f221733d);
        f221767h = jz5.h.a(iVar, cr0.t1.f221751d);
        f221768i = jz5.h.a(iVar, cr0.h1.f221641d);
        f221769j = jz5.h.b(cr0.m1.f221684d);
    }

    public static final void a(cr0.u1 u1Var, yz5.a aVar) {
        u1Var.getClass();
        if (java.lang.System.currentTimeMillis() % 100 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BinderTracker", (java.lang.String) aVar.invoke());
        }
    }

    public static final java.lang.reflect.Method b(cr0.u1 u1Var, java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        java.lang.Object obj;
        java.lang.reflect.Method b17;
        u1Var.getClass();
        kotlin.jvm.internal.o.g(cls, "<this>");
        java.util.Iterator it = ((java.util.ArrayList) g06.f.a(kotlin.jvm.internal.i0.a(cls))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((f06.g) obj).getName(), str)) {
                break;
            }
        }
        f06.g gVar = (f06.g) obj;
        if (gVar != null && (b17 = h06.c.b(gVar)) != null) {
            return b17;
        }
        if (clsArr == null) {
            java.lang.reflect.Method method = cls.getMethod(str, new java.lang.Class[0]);
            kotlin.jvm.internal.o.f(method, "getMethod(...)");
            return method;
        }
        java.lang.reflect.Method method2 = cls.getMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        kotlin.jvm.internal.o.f(method2, "getMethod(...)");
        return method2;
    }

    public final java.util.Map c() {
        return (java.util.Map) f221768i.getValue();
    }

    @Override // kh.e2
    public void d() {
        cr0.u0 g17 = g();
        if (g17.f221757a) {
            g17.c().lock(new cr0.k1(g17));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BinderTracker", "dump ProxyCalls: unsupported");
        }
        ((cr0.x0) f221767h.getValue()).getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.BinderTracker", "dump StubCalls: unsupported");
    }

    public final boolean e() {
        return ((java.lang.Boolean) f221761b.getValue()).booleanValue();
    }

    @Override // kh.e2
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BinderTracker", "#clearStats");
        cr0.u0 g17 = g();
        if (g17.f221757a) {
            g17.c().lock(new cr0.i1(g17));
        }
        ((cr0.x0) f221767h.getValue()).getClass();
    }

    public final cr0.u0 g() {
        return (cr0.u0) f221766g.getValue();
    }
}

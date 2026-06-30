package u1;

/* loaded from: classes14.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.w f423630a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f423631b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f423632c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f423633d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f423634e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f423635f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f423636g;

    /* renamed from: h, reason: collision with root package name */
    public u1.w f423637h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f423638i;

    public n0(u1.w layoutNode) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        this.f423630a = layoutNode;
        this.f423631b = true;
        this.f423638i = new java.util.HashMap();
    }

    public static final void b(u1.n0 n0Var, s1.a aVar, int i17, u1.c1 c1Var) {
        float f17 = i17;
        long a17 = d1.f.a(f17, f17);
        while (true) {
            a17 = c1Var.D0(a17);
            c1Var = c1Var.f423555i;
            kotlin.jvm.internal.o.d(c1Var);
            if (kotlin.jvm.internal.o.b(c1Var, n0Var.f423630a.I)) {
                break;
            } else if (c1Var.e0().c().containsKey(aVar)) {
                float s17 = c1Var.s(aVar);
                a17 = d1.f.a(s17, s17);
            }
        }
        int b17 = aVar instanceof s1.s ? a06.d.b(d1.e.d(a17)) : a06.d.b(d1.e.c(a17));
        java.util.Map map = n0Var.f423638i;
        if (((java.util.HashMap) map).containsKey(aVar)) {
            int intValue = ((java.lang.Number) kz5.c1.h(map, aVar)).intValue();
            s1.s sVar = s1.d.f401999a;
            kotlin.jvm.internal.o.g(aVar, "<this>");
            b17 = ((java.lang.Number) aVar.f401983a.invoke(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(b17))).intValue();
        }
        ((java.util.HashMap) map).put(aVar, java.lang.Integer.valueOf(b17));
    }

    public final boolean a() {
        return this.f423632c || this.f423634e || this.f423635f || this.f423636g;
    }

    public final void c() {
        u1.n0 n0Var;
        u1.n0 n0Var2;
        boolean a17 = a();
        u1.w wVar = this.f423630a;
        if (!a17) {
            u1.w p17 = wVar.p();
            if (p17 == null) {
                return;
            }
            wVar = p17.f423702z.f423637h;
            if (wVar == null || !wVar.f423702z.a()) {
                u1.w wVar2 = this.f423637h;
                if (wVar2 == null || wVar2.f423702z.a()) {
                    return;
                }
                u1.w p18 = wVar2.p();
                if (p18 != null && (n0Var2 = p18.f423702z) != null) {
                    n0Var2.c();
                }
                u1.w p19 = wVar2.p();
                wVar = (p19 == null || (n0Var = p19.f423702z) == null) ? null : n0Var.f423637h;
            }
        }
        this.f423637h = wVar;
    }
}

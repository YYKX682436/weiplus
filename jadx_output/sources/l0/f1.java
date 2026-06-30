package l0;

/* loaded from: classes14.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f314180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314183g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314184h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314185i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314186m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314187n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.i1 f314188o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f314189p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i17, int i18, s1.o1 o1Var, s1.o1 o1Var2, s1.o1 o1Var3, s1.o1 o1Var4, s1.o1 o1Var5, s1.o1 o1Var6, l0.i1 i1Var, s1.x0 x0Var) {
        super(1);
        this.f314180d = i17;
        this.f314181e = i18;
        this.f314182f = o1Var;
        this.f314183g = o1Var2;
        this.f314184h = o1Var3;
        this.f314185i = o1Var4;
        this.f314186m = o1Var5;
        this.f314187n = o1Var6;
        this.f314188o = i1Var;
        this.f314189p = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.o1 o1Var;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.o1 o1Var2 = this.f314184h;
        s1.o1 o1Var3 = this.f314187n;
        l0.i1 i1Var = this.f314188o;
        float f17 = i1Var.f314250c;
        s1.x0 x0Var = this.f314189p;
        float density = x0Var.getDensity();
        p2.s layoutDirection = x0Var.getLayoutDirection();
        float f18 = l0.c1.f314093a;
        d0.d2 d2Var = i1Var.f314251d;
        int b17 = a06.d.b(((d0.e2) d2Var).f225109b * density);
        int b18 = a06.d.b(d0.a2.e(d2Var, layoutDirection) * density);
        float f19 = l0.h4.f314226c * density;
        int i37 = this.f314180d;
        s1.o1 o1Var4 = this.f314182f;
        if (o1Var4 != null) {
            int i38 = z0.d.f468903a;
            o1Var = o1Var4;
            i17 = i37;
            i18 = b17;
            i19 = 1;
            s1.n1.e(layout, o1Var4, 0, a06.d.b(((i37 - o1Var4.f402051e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
        } else {
            o1Var = o1Var4;
            i17 = i37;
            i18 = b17;
            i19 = 1;
        }
        s1.o1 o1Var5 = this.f314183g;
        if (o1Var5 != null) {
            int i39 = this.f314181e - o1Var5.f402050d;
            int i47 = z0.d.f468903a;
            s1.n1.e(layout, o1Var5, i39, a06.d.b(((i17 - o1Var5.f402051e) / 2.0f) * (i19 + 0.0f)), 0.0f, 4, null);
        }
        boolean z17 = i1Var.f314249b;
        s1.o1 o1Var6 = this.f314185i;
        if (o1Var6 != null) {
            if (z17) {
                int i48 = z0.d.f468903a;
                i29 = a06.d.b(((i17 - o1Var6.f402051e) / 2.0f) * (i19 + 0.0f));
            } else {
                i29 = i18;
            }
            float f27 = i19 - f17;
            s1.n1.e(layout, o1Var6, a06.d.b(o1Var == null ? 0.0f : f27 * (l0.h4.e(o1Var) - f19)) + b18, a06.d.b((i29 * f27) - ((o1Var6.f402051e / 2) * f17)), 0.0f, 4, null);
        }
        if (z17) {
            int i49 = z0.d.f468903a;
            i27 = a06.d.b(((i17 - o1Var2.f402051e) / 2.0f) * (i19 + 0.0f));
        } else {
            i27 = i18;
        }
        s1.n1.e(layout, o1Var2, l0.h4.e(o1Var), i27, 0.0f, 4, null);
        s1.o1 o1Var7 = this.f314186m;
        if (o1Var7 != null) {
            if (z17) {
                int i57 = z0.d.f468903a;
                i28 = a06.d.b(((i17 - o1Var7.f402051e) / 2.0f) * (i19 + 0.0f));
            } else {
                i28 = i18;
            }
            s1.n1.e(layout, o1Var7, l0.h4.e(o1Var), i28, 0.0f, 4, null);
        }
        s1.n1.d(layout, o1Var3, p2.m.f351388b, 0.0f, 2, null);
        return jz5.f0.f302826a;
    }
}

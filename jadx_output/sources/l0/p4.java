package l0;

/* loaded from: classes14.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f314448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f314450h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314451i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314452m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314453n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f314454o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.s4 f314455p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f314456q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f314457r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f314458s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(s1.o1 o1Var, int i17, int i18, int i19, int i27, s1.o1 o1Var2, s1.o1 o1Var3, s1.o1 o1Var4, s1.o1 o1Var5, l0.s4 s4Var, int i28, int i29, s1.x0 x0Var) {
        super(1);
        this.f314446d = o1Var;
        this.f314447e = i17;
        this.f314448f = i18;
        this.f314449g = i19;
        this.f314450h = i27;
        this.f314451i = o1Var2;
        this.f314452m = o1Var3;
        this.f314453n = o1Var4;
        this.f314454o = o1Var5;
        this.f314455p = s4Var;
        this.f314456q = i28;
        this.f314457r = i29;
        this.f314458s = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        int i17;
        int i18;
        boolean z18;
        s1.o1 o1Var;
        s1.o1 o1Var2;
        l0.s4 s4Var;
        int i19;
        s1.o1 o1Var3;
        int b17;
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        s1.x0 x0Var = this.f314458s;
        s1.o1 o1Var4 = this.f314454o;
        s1.o1 o1Var5 = this.f314453n;
        s1.o1 o1Var6 = this.f314452m;
        int i27 = this.f314450h;
        int i28 = this.f314449g;
        l0.s4 s4Var2 = this.f314455p;
        s1.o1 o1Var7 = this.f314446d;
        if (o1Var7 != null) {
            int i29 = this.f314447e - this.f314448f;
            if (i29 < 0) {
                i29 = 0;
            }
            int i37 = i29;
            s1.o1 o1Var8 = this.f314451i;
            boolean z19 = s4Var2.f314515a;
            int i38 = this.f314457r + this.f314456q;
            float density = x0Var.getDensity();
            float f17 = l0.m4.f314380a;
            if (o1Var5 != null) {
                int i39 = z0.d.f468903a;
                z18 = z19;
                o1Var = o1Var8;
                o1Var2 = o1Var7;
                s4Var = s4Var2;
                i19 = i28;
                s1.n1.e(layout, o1Var5, 0, a06.d.b(((i27 - o1Var5.f402051e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            } else {
                z18 = z19;
                o1Var = o1Var8;
                o1Var2 = o1Var7;
                s4Var = s4Var2;
                i19 = i28;
            }
            if (o1Var4 != null) {
                int i47 = i19 - o1Var4.f402050d;
                int i48 = z0.d.f468903a;
                s1.n1.e(layout, o1Var4, i47, a06.d.b(((i27 - o1Var4.f402051e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            }
            if (z18) {
                int i49 = z0.d.f468903a;
                o1Var3 = o1Var2;
                b17 = a06.d.b(((i27 - o1Var3.f402051e) / 2.0f) * (1 + 0.0f));
            } else {
                o1Var3 = o1Var2;
                b17 = a06.d.b(l0.h4.f314225b * density);
            }
            s1.n1.e(layout, o1Var3, l0.h4.e(o1Var5), b17 - a06.d.b((b17 - i37) * s4Var.f314516b), 0.0f, 4, null);
            s1.n1.e(layout, o1Var, l0.h4.e(o1Var5), i38, 0.0f, 4, null);
            if (o1Var6 != null) {
                s1.n1.e(layout, o1Var6, l0.h4.e(o1Var5), i38, 0.0f, 4, null);
            }
        } else {
            s1.o1 o1Var9 = this.f314451i;
            boolean z27 = s4Var2.f314515a;
            float density2 = x0Var.getDensity();
            float f18 = l0.m4.f314380a;
            int b18 = a06.d.b(((d0.e2) s4Var2.f314517c).f225109b * density2);
            if (o1Var5 != null) {
                int i57 = z0.d.f468903a;
                z17 = z27;
                s1.n1.e(layout, o1Var5, 0, a06.d.b(((i27 - o1Var5.f402051e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            } else {
                z17 = z27;
            }
            if (o1Var4 != null) {
                int i58 = i28 - o1Var4.f402050d;
                int i59 = z0.d.f468903a;
                s1.n1.e(layout, o1Var4, i58, a06.d.b(((i27 - o1Var4.f402051e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            }
            if (z17) {
                int i66 = z0.d.f468903a;
                i17 = a06.d.b(((i27 - o1Var9.f402051e) / 2.0f) * (1 + 0.0f));
            } else {
                i17 = b18;
            }
            s1.n1.e(layout, o1Var9, l0.h4.e(o1Var5), i17, 0.0f, 4, null);
            if (o1Var6 != null) {
                if (z17) {
                    int i67 = z0.d.f468903a;
                    i18 = a06.d.b(((i27 - o1Var6.f402051e) / 2.0f) * (1 + 0.0f));
                } else {
                    i18 = b18;
                }
                s1.n1.e(layout, o1Var6, l0.h4.e(o1Var5), i18, 0.0f, 4, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

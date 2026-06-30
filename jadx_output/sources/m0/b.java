package m0;

/* loaded from: classes14.dex */
public final class b extends m0.w implements n0.e4 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f322429e;

    /* renamed from: f, reason: collision with root package name */
    public final float f322430f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.e5 f322431g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e5 f322432h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.t f322433i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f322434m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f322435n;

    /* renamed from: o, reason: collision with root package name */
    public long f322436o;

    /* renamed from: p, reason: collision with root package name */
    public int f322437p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.a f322438q;

    public b(boolean z17, float f17, n0.e5 e5Var, n0.e5 e5Var2, m0.t tVar, kotlin.jvm.internal.i iVar) {
        super(z17, e5Var2);
        this.f322429e = z17;
        this.f322430f = f17;
        this.f322431g = e5Var;
        this.f322432h = e5Var2;
        this.f322433i = tVar;
        this.f322434m = n0.s4.c(null, null, 2, null);
        this.f322435n = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f322436o = d1.k.f225641b;
        this.f322437p = -1;
        this.f322438q = new m0.a(this);
    }

    @Override // a0.s1
    public void a(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        u1.o0 o0Var = (u1.o0) fVar;
        this.f322436o = o0Var.a();
        float f17 = this.f322430f;
        this.f322437p = java.lang.Float.isNaN(f17) ? a06.d.b(m0.s.a(fVar, this.f322429e, o0Var.a())) : o0Var.G(f17);
        long j17 = ((e1.y) this.f322431g.getValue()).f246322a;
        float f18 = ((m0.j) this.f322432h.getValue()).f322478d;
        o0Var.b();
        f(fVar, f17, j17);
        e1.u a17 = ((g1.b) o0Var.f423652d.f267507e).a();
        ((java.lang.Boolean) ((n0.q4) this.f322435n).getValue()).booleanValue();
        m0.v vVar = (m0.v) ((n0.q4) this.f322434m).getValue();
        if (vVar != null) {
            vVar.e(o0Var.a(), this.f322437p, j17, f18);
            android.graphics.Canvas canvas = e1.c.f246229a;
            kotlin.jvm.internal.o.g(a17, "<this>");
            vVar.draw(((e1.b) a17).f246225a);
        }
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
        h();
    }

    @Override // n0.e4
    public void d() {
        h();
    }

    @Override // m0.w
    public void e(c0.r interaction, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(interaction, "interaction");
        kotlin.jvm.internal.o.g(scope, "scope");
        m0.t tVar = this.f322433i;
        tVar.getClass();
        m0.u uVar = tVar.f322511g;
        uVar.getClass();
        m0.v rippleHostView = (m0.v) ((java.util.LinkedHashMap) uVar.f322513a).get(this);
        if (rippleHostView == null) {
            rippleHostView = (m0.v) kz5.h0.C(tVar.f322510f);
            java.util.Map map = uVar.f322514b;
            if (rippleHostView == null) {
                int i17 = tVar.f322512h;
                java.util.List list = tVar.f322509e;
                if (i17 > kz5.c0.h(list)) {
                    android.content.Context context = tVar.getContext();
                    kotlin.jvm.internal.o.f(context, "context");
                    rippleHostView = new m0.v(context);
                    tVar.addView(rippleHostView);
                    ((java.util.ArrayList) list).add(rippleHostView);
                } else {
                    rippleHostView = (m0.v) ((java.util.ArrayList) list).get(tVar.f322512h);
                    kotlin.jvm.internal.o.g(rippleHostView, "rippleHostView");
                    m0.b bVar = (m0.b) ((java.util.LinkedHashMap) map).get(rippleHostView);
                    if (bVar != null) {
                        ((n0.q4) bVar.f322434m).setValue(null);
                        uVar.a(bVar);
                        rippleHostView.c();
                    }
                }
                int i18 = tVar.f322512h;
                if (i18 < tVar.f322508d - 1) {
                    tVar.f322512h = i18 + 1;
                } else {
                    tVar.f322512h = 0;
                }
            }
            uVar.f322513a.put(this, rippleHostView);
            map.put(rippleHostView, this);
        }
        rippleHostView.b(interaction, this.f322429e, this.f322436o, this.f322437p, ((e1.y) this.f322431g.getValue()).f246322a, ((m0.j) this.f322432h.getValue()).f322478d, this.f322438q);
        ((n0.q4) this.f322434m).setValue(rippleHostView);
    }

    @Override // m0.w
    public void g(c0.r interaction) {
        kotlin.jvm.internal.o.g(interaction, "interaction");
        m0.v vVar = (m0.v) ((n0.q4) this.f322434m).getValue();
        if (vVar != null) {
            vVar.d();
        }
    }

    public final void h() {
        m0.t tVar = this.f322433i;
        tVar.getClass();
        ((n0.q4) this.f322434m).setValue(null);
        m0.u uVar = tVar.f322511g;
        uVar.getClass();
        m0.v vVar = (m0.v) ((java.util.LinkedHashMap) uVar.f322513a).get(this);
        if (vVar != null) {
            vVar.c();
            uVar.a(this);
            ((java.util.ArrayList) tVar.f322510f).add(vVar);
        }
    }
}

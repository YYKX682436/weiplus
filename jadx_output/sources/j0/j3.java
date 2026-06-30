package j0;

/* loaded from: classes14.dex */
public final class j3 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final j0.f5 f296382d;

    /* renamed from: e, reason: collision with root package name */
    public j0.l3 f296383e;

    /* renamed from: f, reason: collision with root package name */
    public final s1.t0 f296384f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.t f296385g;

    /* renamed from: h, reason: collision with root package name */
    public z0.t f296386h;

    /* renamed from: i, reason: collision with root package name */
    public z0.t f296387i;

    public j3(j0.f5 state) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f296382d = state;
        this.f296384f = new j0.g3(this);
        z0.p pVar = z0.p.f468921d;
        this.f296385g = s1.h1.a(b1.j.a(e1.d0.b(pVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new j0.e3(this)), new j0.b3(this));
        this.f296386h = y1.t.b(pVar, false, new j0.d3(state.f296288a.f296403a, this));
        this.f296387i = pVar;
    }

    public static final boolean a(j0.j3 j3Var, long j17, long j18) {
        a2.k1 k1Var = j3Var.f296382d.f296292e;
        if (k1Var != null) {
            int length = k1Var.f765a.f754a.f681d.length();
            int l17 = k1Var.l(j17);
            int l18 = k1Var.l(j18);
            int i17 = length - 1;
            if (l17 >= i17 && l18 >= i17) {
                return true;
            }
            if (l17 < 0 && l18 < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
        this.f296382d.getClass();
    }

    @Override // n0.e4
    public void d() {
        this.f296382d.getClass();
    }

    public final void e(k0.i0 i0Var) {
        z0.t tVar = z0.p.f468921d;
        if (i0Var != null) {
            j0.h3 h3Var = new j0.h3(this, i0Var);
            this.f296383e = h3Var;
            tVar = p1.x0.b(tVar, h3Var, new j0.i3(this, null));
        }
        this.f296387i = tVar;
    }
}

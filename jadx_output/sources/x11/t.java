package x11;

/* loaded from: classes12.dex */
public final class t implements com.tencent.mm.sdk.platformtools.a4 {
    public static boolean F;
    public java.lang.Long A;
    public java.lang.Thread B;
    public final jz5.g C;

    /* renamed from: d, reason: collision with root package name */
    public final w11.k0 f451390d;

    /* renamed from: e, reason: collision with root package name */
    public int f451391e;

    /* renamed from: f, reason: collision with root package name */
    public int f451392f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451393g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f451394h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f451395i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.iu4 f451396m;

    /* renamed from: n, reason: collision with root package name */
    public int f451397n;

    /* renamed from: o, reason: collision with root package name */
    public int f451398o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f451399p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f451400q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f451401r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Queue f451402s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f451403t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f451404u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f451405v;

    /* renamed from: w, reason: collision with root package name */
    public long f451406w;

    /* renamed from: x, reason: collision with root package name */
    public long f451407x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f451408y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f451409z;
    public static final x11.g D = new x11.g(null);
    public static final jz5.g E = jz5.h.b(x11.c.f451352d);
    public static final jz5.g G = jz5.h.b(x11.d.f451355d);
    public static final jz5.g H = jz5.h.b(x11.b.f451349d);
    public static final jz5.g I = jz5.h.b(x11.e.f451356d);

    /* renamed from: J, reason: collision with root package name */
    public static final jz5.g f451389J = jz5.h.b(x11.f.f451358d);

    public t(w11.k0 initScene) {
        kotlin.jvm.internal.o.g(initScene, "initScene");
        this.f451390d = initScene;
        this.f451396m = new r45.iu4();
        this.f451399p = new java.util.HashMap();
        this.f451401r = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) this, true);
        this.f451402s = new java.util.LinkedList();
        this.f451403t = jz5.h.b(x11.j.f451376d);
        this.f451404u = jz5.h.b(new x11.k(this));
        this.f451405v = jz5.h.b(new x11.m(this));
        this.f451409z = jz5.h.b(new x11.h(this));
        this.C = jz5.h.b(x11.l.f451378d);
    }

    public final x11.f0 a() {
        return (x11.f0) ((jz5.n) this.f451405v).getValue();
    }

    public final boolean b() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SYNC_CONTROL_USE_INIT_CONTACT_INT_SYNC, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        return D.c() && (num != null ? num.intValue() : 0) != 0;
    }

    public final void c(int i17, int i18, java.lang.String str) {
        this.f451395i = true;
        com.tencent.mm.modelbase.u0 u0Var = this.f451394h;
        if (u0Var != null) {
            u0Var.onSceneEnd(i17, i18, str, this.f451390d);
        }
        a().c(i17, i18, this.f451397n, this.f451391e);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "removeBlockDetect");
        ((ku5.t0) ku5.t0.f312615d).A("initBlockDetector");
        this.f451408y = true;
    }

    public final void d(r45.b50 b50Var) {
        if (b50Var == null) {
            return;
        }
        java.util.HashMap hashMap = this.f451399p;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b50Var.f370530d);
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(b50Var.f370530d));
        if (num == null) {
            num = 0;
        }
        hashMap.put(valueOf, java.lang.Integer.valueOf(num.intValue() + 1));
        this.f451398o++;
    }

    public final void e(boolean z17) {
        this.f451390d.trackState().d(true);
        if (!z17) {
            c(3, -1, "");
        } else {
            this.f451393g = true;
            f(new x11.w(a(), 0, 0, "", this.f451390d));
        }
    }

    public final void f(x11.a aVar) {
        ((jz5.n) this.f451409z).getValue();
        if (((java.lang.Boolean) ((jz5.n) this.f451403t).getValue()).booleanValue()) {
            if (!this.f451400q) {
                a().d();
            }
            ((ku5.t0) ku5.t0.f312615d).h(new x11.s(this, aVar), w11.h2.f442050f);
            return;
        }
        ((java.util.LinkedList) this.f451402s).add(aVar);
        if (this.f451401r.e()) {
            a().d();
            this.f451401r.c(50L, 50L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x11.t.g():boolean");
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        return g();
    }
}

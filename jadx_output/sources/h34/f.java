package h34;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public tl.w f278514p;

    /* renamed from: t, reason: collision with root package name */
    public int f278518t;

    /* renamed from: v, reason: collision with root package name */
    public long f278520v;

    /* renamed from: w, reason: collision with root package name */
    public int f278521w;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f278505d = new byte[com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES];

    /* renamed from: e, reason: collision with root package name */
    public int f278506e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f278507f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f278508g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f278509h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f278510i = false;

    /* renamed from: m, reason: collision with root package name */
    public h34.j f278511m = null;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f278512n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public h34.s f278513o = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f278515q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f278516r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f278517s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f278519u = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f278522x = false;

    /* renamed from: y, reason: collision with root package name */
    public final tl.v f278523y = new h34.c(this);

    public static void a(h34.f fVar, r45.js5 js5Var, long j17, boolean z17) {
        synchronized (fVar) {
            if (fVar.f278522x) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MusicFingerPrintRecorder", "hy: already call backed to UI");
            } else {
                fVar.f278513o.a(js5Var, j17, z17);
                fVar.f278522x = true;
            }
        }
    }

    public final void b() {
        tl.w wVar = this.f278514p;
        if (wVar != null) {
            wVar.l();
            this.f278514p = null;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new h34.d(this, false, false));
    }

    public boolean c() {
        c01.d9.e().q(367, this);
        c01.d9.e().q(408, this);
        synchronized (this.f278505d) {
            this.f278506e = 0;
        }
        tl.w wVar = this.f278514p;
        if (wVar == null) {
            return true;
        }
        wVar.l();
        this.f278514p = null;
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 367 || m1Var.getType() == 408) {
            this.f278515q = false;
            h34.j jVar = (h34.j) m1Var;
            if (jVar.f278544d) {
                c();
                this.f278511m = jVar;
                this.f278510i = true;
                com.tencent.mm.sdk.platformtools.u3.h(new h34.d(this, false, false));
                return;
            }
            if (this.f278506e != 0 || !this.f278516r) {
                gm0.j1.e().j(new h34.e(this));
                return;
            }
            this.f278511m = null;
            this.f278510i = true;
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new h34.d(this, false, false));
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new h34.d(this, false, true));
            }
            c01.d9.e().q(367, this);
            c01.d9.e().q(408, this);
        }
    }
}

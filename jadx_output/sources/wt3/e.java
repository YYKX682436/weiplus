package wt3;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f449392a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f449393b;

    /* renamed from: c, reason: collision with root package name */
    public long f449394c;

    /* renamed from: d, reason: collision with root package name */
    public long f449395d;

    /* renamed from: e, reason: collision with root package name */
    public int f449396e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f449397f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f449398g;

    /* renamed from: h, reason: collision with root package name */
    public int f449399h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f449400i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f449401j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f449402k;

    /* renamed from: l, reason: collision with root package name */
    public final wt3.d f449403l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f449404m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f449405n;

    public e(im5.b lifeCycleKeeper, java.lang.String str) {
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        this.f449392a = lifeCycleKeeper;
        this.f449393b = str;
        this.f449399h = 10;
        this.f449401j = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f449402k = jz5.h.b(new wt3.a(this));
        int i17 = vt3.q.f440037a;
        com.tencent.mm.sdk.platformtools.n3 d17 = gm0.j1.e().d();
        kotlin.jvm.internal.o.f(d17, "getWorkerHandler(...)");
        this.f449403l = new wt3.d(this, d17.getLooper());
    }

    public void b() {
        this.f449403l.obtainMessage(0).sendToTarget();
    }

    public final void c() {
        this.f449397f = true;
        wt3.n0 g17 = g();
        if (g17.f449455e && g17.f449456f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsGetRecommendAudioTask", "destroy");
            kotlinx.coroutines.r2 r2Var = this.f449400i;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        wt3.n0 g18 = g();
        if (g18.f449455e && g18.f449456f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaFrameFeatureExtractor", "destroy");
            g18.f449451a.a();
        }
    }

    public final boolean d() {
        wt3.n0 g17 = g();
        return (g17.f449455e && g17.f449456f) && i();
    }

    public wt3.q e() {
        return new wt3.q();
    }

    public abstract wt3.n0 f(wt3.q qVar);

    public final wt3.n0 g() {
        return (wt3.n0) ((jz5.n) this.f449402k).getValue();
    }

    public void h(com.tencent.mm.protobuf.g gVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsGetRecommendAudioTask", "getMusicListResultCgi");
        wt3.y yVar = new wt3.y(g().f449457g, 0.0f, 0.0f, this.f449394c, this.f449395d, this.f449396e, this.f449399h, gVar, d());
        yVar.f70649i = true;
        yVar.l().f(this.f449392a).h(new wt3.c(this));
    }

    public abstract boolean i();

    public final void j(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsGetRecommendAudioTask", "onLoadData: " + this.f449405n + ' ' + this.f449397f);
        if (this.f449405n || this.f449397f) {
            return;
        }
        this.f449405n = true;
        if (d()) {
            this.f449400i = kotlinx.coroutines.l.d(this.f449401j, null, null, new wt3.b(this, z17, null), 3, null);
        } else {
            h(null, z17);
        }
    }

    public void k() {
        g().a();
    }
}

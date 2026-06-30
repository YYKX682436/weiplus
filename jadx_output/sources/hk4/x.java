package hk4;

/* loaded from: classes10.dex */
public final class x extends hk4.a {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f281985k = "MicroMsg.MultiMediaVideoPlayer@" + hashCode();

    /* renamed from: l, reason: collision with root package name */
    public final kk4.v f281986l;

    /* renamed from: m, reason: collision with root package name */
    public long f281987m;

    /* renamed from: n, reason: collision with root package name */
    public long f281988n;

    /* renamed from: o, reason: collision with root package name */
    public int f281989o;

    /* renamed from: p, reason: collision with root package name */
    public int f281990p;

    /* renamed from: q, reason: collision with root package name */
    public int f281991q;

    /* renamed from: r, reason: collision with root package name */
    public long f281992r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f281993s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f281994t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f281995u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f281996v;

    /* renamed from: w, reason: collision with root package name */
    public long f281997w;

    public x() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kk4.v vVar = new kk4.v(context);
        this.f281986l = vVar;
        this.f281997w = -1L;
        vVar.I(new hk4.p(this), 33L);
        vVar.f308595t = new hk4.q(this);
        vVar.F(new hk4.t(this));
    }

    public static final void p(hk4.x xVar) {
        synchronized (xVar) {
            if (!xVar.f281994t && xVar.f281989o > 0 && xVar.f281990p > 0) {
                pm0.v.X(new hk4.v(xVar));
                xVar.f281994t = true;
            }
        }
    }

    public static final void q(hk4.x xVar) {
        kk4.c cVar = xVar.f281986l.f308577b;
        if (cVar == null) {
            return;
        }
        kk4.f0 f0Var = (kk4.f0) cVar;
        int propertyLong = (int) f0Var.getPropertyLong(205);
        xVar.f281991q = propertyLong;
        boolean z17 = propertyLong == 90 || propertyLong == 270;
        xVar.f281989o = z17 ? f0Var.getVideoHeight() : f0Var.getVideoWidth();
        xVar.f281990p = z17 ? f0Var.getVideoWidth() : f0Var.getVideoHeight();
        long propertyLong2 = f0Var.getPropertyLong(206);
        if (f0Var.getDurationMs() > 0) {
            xVar.f281992r = f0Var.getDurationMs();
        }
        com.tencent.mars.xlog.Log.i(xVar.f281985k, "updateVideoSize, video size:[" + xVar.f281989o + ", " + xVar.f281990p + "], rotate:" + xVar.f281991q + ", videoFps:" + propertyLong2 + ", duration:" + xVar.f281992r);
    }

    @Override // hk4.a
    public boolean a() {
        return this.f281986l.s();
    }

    @Override // hk4.a
    public boolean b() {
        return this.f281994t;
    }

    @Override // hk4.a
    public boolean c() {
        return this.f281995u;
    }

    @Override // hk4.a
    public hk4.b d() {
        return hk4.b.f281934f;
    }

    @Override // hk4.a
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f281985k, "pause");
        kk4.b.i(this.f281986l, false, false, 3, null);
        this.f281995u = false;
    }

    @Override // hk4.a
    public void f() {
        com.tencent.mars.xlog.Log.i(this.f281985k, "preloadMedia");
        kk4.v vVar = this.f281986l;
        vVar.f308585j = false;
        vVar.O();
    }

    @Override // hk4.a
    public void g() {
        com.tencent.mars.xlog.Log.i(this.f281985k, "release");
        kk4.v vVar = this.f281986l;
        vVar.F(null);
        vVar.R();
        kk4.b.e(vVar, null, 1, null);
        vVar.P();
        vVar.recycle();
    }

    @Override // hk4.a
    public void h() {
        kk4.v vVar = this.f281986l;
        vVar.f308585j = true;
        vVar.O();
        this.f281995u = true;
    }

    @Override // hk4.a
    public void i(long j17, yz5.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f281985k, "seek:" + j17);
        if (!this.f281994t) {
            this.f281997w = j17;
        }
        this.f281986l.z((int) j17, true, new hk4.w(this, j17, aVar));
    }

    @Override // hk4.a
    public void j(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f281985k, "setLoop:" + z17);
        this.f281996v = z17;
        this.f281986l.A(z17);
    }

    @Override // hk4.a
    public void k(boolean z17) {
        this.f281986l.C(z17);
    }

    @Override // hk4.a
    public void l(long j17, long j18) {
        com.tencent.mars.xlog.Log.i(this.f281985k, "setPlayRange:[" + j17 + ',' + j18 + ']');
        this.f281987m = j17;
        this.f281988n = j18;
    }

    @Override // hk4.a
    public void n() {
        com.tencent.mars.xlog.Log.i(this.f281985k, "start");
        kk4.v vVar = this.f281986l;
        vVar.f308585j = true;
        vVar.O();
        this.f281993s = false;
        this.f281994t = false;
        this.f281995u = true;
    }

    @Override // hk4.a
    public void o() {
        com.tencent.mars.xlog.Log.i(this.f281985k, "stop");
        this.f281986l.stop();
        this.f281995u = false;
    }
}

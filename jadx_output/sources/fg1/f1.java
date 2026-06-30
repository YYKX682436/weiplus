package fg1;

/* loaded from: classes7.dex */
public class f1 implements pd1.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f261858a = "MicroMsg.AppBrand.XWebVideoVideoController#" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public pd1.m f261859b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f261860c = false;

    /* renamed from: d, reason: collision with root package name */
    public final ye1.m f261861d = new fg1.b1(this);

    /* renamed from: e, reason: collision with root package name */
    public final ye1.n f261862e = new fg1.c1(this);

    /* renamed from: f, reason: collision with root package name */
    public final ye1.g f261863f = new fg1.d1(this);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f261864g;

    public f1(fg1.g1 g1Var, fg1.y0 y0Var) {
        this.f261864g = g1Var;
        bg.f fVar = g1Var.f261868a;
        fg1.e1 e1Var = new fg1.e1(this);
        fVar.L1 = e1Var;
        if (fVar.f19764h != null) {
            e1Var.a(fVar.f19786z);
        }
    }

    @Override // pd1.o
    public boolean b() {
        return this.f261864g.f261868a.R1;
    }

    @Override // pd1.o
    public java.lang.Integer c() {
        bg.f fVar = this.f261864g.f261868a;
        sf.f fVar2 = fVar.f19775s;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.w(fVar.A(), "getOriginPageViewId, invokeContext is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 f17 = tf.d.f(fVar2);
        if (f17 != null) {
            return java.lang.Integer.valueOf(f17.hashCode());
        }
        com.tencent.mars.xlog.Log.w(fVar.A(), "getOriginPageViewId, pageView is null");
        return null;
    }

    @Override // pd1.o
    public com.tencent.mm.plugin.appbrand.jsapi.media.w1 g() {
        com.tencent.mm.plugin.appbrand.jsapi.media.n nVar = com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e;
        bg.f fVar = this.f261864g.f261868a;
        return nVar.U2(fVar.P, fVar.Q);
    }

    @Override // pd1.o
    public java.lang.String getKey() {
        return this.f261864g.f261868a.z();
    }

    @Override // pd1.o
    public pd1.n getType() {
        return pd1.n.Video;
    }

    @Override // pd1.o
    public int getVideoHeight() {
        ye1.e eVar = this.f261864g.f261868a.f19764h;
        ye1.r rVar = !(eVar instanceof ye1.r) ? null : (ye1.r) eVar;
        if (rVar == null) {
            return 0;
        }
        return rVar.getVideoHeight();
    }

    @Override // pd1.o
    public int getVideoWidth() {
        ye1.e eVar = this.f261864g.f261868a.f19764h;
        ye1.r rVar = !(eVar instanceof ye1.r) ? null : (ye1.r) eVar;
        if (rVar == null) {
            return 0;
        }
        return rVar.getVideoWidth();
    }

    @Override // pd1.o
    public void h(pd1.m mVar) {
        if (mVar != null) {
            if (this.f261860c) {
                com.tencent.mars.xlog.Log.i(this.f261858a, "onLoadEnd from mPrepared");
                ((com.tencent.mm.plugin.appbrand.pip.y) mVar).b(this);
            } else {
                com.tencent.mars.xlog.Log.i(this.f261858a, "onLoading from mPrepared");
                ((com.tencent.mm.plugin.appbrand.pip.y) mVar).c(this);
            }
        }
        this.f261859b = mVar;
    }

    @Override // pd1.o
    public void pause() {
        bg.f fVar = this.f261864g.f261868a;
        fVar.getClass();
        fVar.Q(new bg.f$$c(fVar, false));
    }

    @Override // pd1.o
    public void release() {
        bg.f fVar = this.f261864g.f261868a;
        fVar.getClass();
        fVar.Q(new bg.u(fVar));
    }

    @Override // pd1.o
    public void start() {
        bg.f fVar = this.f261864g.f261868a;
        fVar.getClass();
        fVar.Q(new bg.t(fVar));
    }
}

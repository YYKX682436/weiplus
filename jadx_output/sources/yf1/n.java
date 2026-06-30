package yf1;

/* loaded from: classes7.dex */
public class n implements pd1.o {

    /* renamed from: a, reason: collision with root package name */
    public pd1.m f461648a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f461649b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf1.o f461650c;

    public n(yf1.o oVar, yf1.l lVar) {
        this.f461650c = oVar;
        yf1.m mVar = new yf1.m(this);
        wf.b bVar = oVar.f461651a;
        bVar.N = mVar;
        tf.n0.a(bVar.P, mVar);
    }

    @Override // pd1.o
    public boolean b() {
        return this.f461650c.f461651a.T;
    }

    @Override // pd1.o
    public java.lang.Integer c() {
        wf.b bVar = this.f461650c.f461651a;
        sf.f fVar = bVar.f445422p;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(bVar.w(), "getOriginPageViewId, invokeContext is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 f17 = tf.d.f(fVar);
        if (f17 != null) {
            return java.lang.Integer.valueOf(f17.hashCode());
        }
        com.tencent.mars.xlog.Log.w(bVar.w(), "getOriginPageViewId, pageView is null");
        return null;
    }

    @Override // pd1.o
    public com.tencent.mm.plugin.appbrand.jsapi.media.w1 g() {
        com.tencent.mm.plugin.appbrand.jsapi.media.n nVar = com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e;
        wf.b bVar = this.f461650c.f461651a;
        return nVar.U2(bVar.f445428u, bVar.f445429v);
    }

    @Override // pd1.o
    public java.lang.String getKey() {
        return this.f461650c.f461651a.v();
    }

    @Override // pd1.o
    public pd1.n getType() {
        return pd1.n.LivePlayer;
    }

    @Override // pd1.o
    public int getVideoHeight() {
        return -1;
    }

    @Override // pd1.o
    public int getVideoWidth() {
        return -1;
    }

    @Override // pd1.o
    public void h(pd1.m mVar) {
        this.f461648a = mVar;
        if (mVar != null) {
            switch (this.f461649b) {
                case 0:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).c(this);
                    return;
                case 1:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).b(this);
                    return;
                case 2:
                    com.tencent.mm.plugin.appbrand.pip.y yVar = (com.tencent.mm.plugin.appbrand.pip.y) mVar;
                    yVar.b(this);
                    yVar.e(this, true);
                    return;
                case 3:
                    com.tencent.mm.plugin.appbrand.pip.y yVar2 = (com.tencent.mm.plugin.appbrand.pip.y) mVar;
                    yVar2.b(this);
                    yVar2.e(this, false);
                    return;
                case 4:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).d(this);
                    return;
                case 5:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).a(this);
                    return;
                case 6:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).g(this);
                    return;
                case 7:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).f(this);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // pd1.o
    public void pause() {
        this.f461650c.f461651a.C("stop", null);
    }

    @Override // pd1.o
    public void release() {
        final wf.b bVar = this.f461650c.f461651a;
        bVar.getClass();
        bVar.L(new java.lang.Runnable() { // from class: wf.b$$n
            @Override // java.lang.Runnable
            public final void run() {
                wf.b.this.J();
            }
        });
    }

    @Override // pd1.o
    public void start() {
        this.f461650c.f461651a.H();
    }
}

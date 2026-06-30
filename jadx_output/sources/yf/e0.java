package yf;

/* loaded from: classes7.dex */
public final class e0 implements pd1.j, pd1.o, tf.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final yf.i0 f461337a;

    /* renamed from: b, reason: collision with root package name */
    public int f461338b;

    /* renamed from: c, reason: collision with root package name */
    public pd1.m f461339c;

    public e0(yf.i0 pluginHandler) {
        kotlin.jvm.internal.o.g(pluginHandler, "pluginHandler");
        this.f461337a = pluginHandler;
        zf.c cVar = pluginHandler.f461365o;
        if (cVar != null) {
            bg1.h hVar = (bg1.h) cVar;
            hVar.f19899j = this;
            tf.n0.a(hVar.f19900k, this);
        }
        this.f461338b = -1;
    }

    @Override // tf.m0
    public void a() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).a(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = 5;
        }
    }

    @Override // pd1.o
    public boolean b() {
        return false;
    }

    @Override // pd1.o
    public java.lang.Integer c() {
        yf.i0 i0Var = this.f461337a;
        sf.f fVar = i0Var.f461366p;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(i0Var.x(), "getOriginPageViewId, invokeContext is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.v5 f17 = tf.d.f(fVar);
        if (f17 != null) {
            return java.lang.Integer.valueOf(f17.hashCode());
        }
        com.tencent.mars.xlog.Log.w(i0Var.x(), "getOriginPageViewId, pageView is null");
        return null;
    }

    @Override // pd1.j
    public void d(com.tencent.mm.plugin.appbrand.page.v5 pageView, pd1.i onVideoPositionGotCallback) {
        kotlin.jvm.internal.o.g(pageView, "pageView");
        kotlin.jvm.internal.o.g(onVideoPositionGotCallback, "onVideoPositionGotCallback");
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = pageView.getJsRuntime();
        yf.i0 i0Var = this.f461337a;
        if (jsRuntime == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.LivePusherOriginVideoContainer", "getVideoPositionAsync, jsRuntime is null");
            onVideoPositionGotCallback.a(i0Var.Q, i0Var.R);
        } else {
            jsRuntime.evaluateJavascript("document.querySelector('embed[embed-id=" + i0Var.f252497d + "]').getBoundingClientRect().toJSON()", new yf.d0(this, onVideoPositionGotCallback));
        }
    }

    @Override // tf.m0
    public void e(boolean z17) {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).e(this, z17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = z17 ? 2 : 3;
        }
    }

    @Override // tf.m0
    public void f() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).f(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = 7;
        }
    }

    @Override // pd1.o
    public com.tencent.mm.plugin.appbrand.jsapi.media.w1 g() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e.U2(true, true);
    }

    @Override // pd1.o
    public java.lang.String getKey() {
        java.lang.String w17 = this.f461337a.w();
        kotlin.jvm.internal.o.f(w17, "also(...)");
        return w17;
    }

    @Override // pd1.o
    public pd1.n getType() {
        return pd1.n.LivePusher;
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
        this.f461339c = mVar;
        if (mVar != null) {
            switch (this.f461338b) {
                case 0:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).c(this);
                    break;
                case 1:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).b(this);
                    break;
                case 2:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).e(this, true);
                    break;
                case 3:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).e(this, false);
                    break;
                case 4:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).d(this);
                    break;
                case 5:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).a(this);
                    break;
                case 6:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).g(this);
                    break;
                case 7:
                    ((com.tencent.mm.plugin.appbrand.pip.y) mVar).f(this);
                    break;
            }
            this.f461338b = -1;
        }
    }

    @Override // pd1.j
    public int i() {
        return this.f461337a.f461367q;
    }

    @Override // pd1.j
    public boolean isPlaying() {
        yf.o oVar = this.f461337a.f461362i;
        if (oVar != null) {
            return oVar.isPushing();
        }
        return false;
    }

    @Override // tf.m0
    public void j() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).c(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = 0;
        }
    }

    @Override // pd1.j
    public int k() {
        return this.f461337a.f461368r;
    }

    @Override // tf.m0
    public void l() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).b(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = 1;
        }
    }

    @Override // pd1.j
    public android.graphics.Point m() {
        yf.i0 i0Var = this.f461337a;
        return new android.graphics.Point(i0Var.Q, i0Var.R);
    }

    @Override // pd1.j
    public pd1.o n() {
        return this;
    }

    public final boolean o(android.view.Surface surface) {
        yf.i0 i0Var = this.f461337a;
        yf.o oVar = i0Var.f461362i;
        if (oVar != null) {
            oVar.setSurface(surface);
            return true;
        }
        com.tencent.mars.xlog.Log.w(i0Var.x(), "setSurface, Adapter is null");
        return false;
    }

    @Override // tf.m0
    public void onPause() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).d(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = 4;
        }
    }

    @Override // tf.m0
    public void onStop() {
        jz5.f0 f0Var;
        pd1.m mVar = this.f461339c;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).g(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f461338b = 6;
        }
    }

    public final boolean p(int i17, int i18) {
        yf.o oVar;
        yf.i0 i0Var = this.f461337a;
        i0Var.x();
        if (i17 == 0 || i18 == 0 || (oVar = i0Var.f461362i) == null) {
            com.tencent.mars.xlog.Log.w(i0Var.x(), "setSurfaceSize, Adapter is null");
            return false;
        }
        oVar.setSurfaceSize(i17, i18);
        return true;
    }

    @Override // pd1.o
    public void pause() {
        yf.i0 i0Var = this.f461337a;
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "pauseExternal");
        i0Var.H = true;
        i0Var.G(new yf.i0$$p(i0Var, "pause"));
    }

    @Override // pd1.o
    public void release() {
        final yf.i0 i0Var = this.f461337a;
        i0Var.H = false;
        i0Var.G(new java.lang.Runnable() { // from class: yf.i0$$n
            @Override // java.lang.Runnable
            public final void run() {
                yf.i0.this.E();
            }
        });
    }

    @Override // pd1.o
    public void start() {
        yf.i0 i0Var = this.f461337a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "startExternal mHadPauseFromExternal:%b mAdapter.isPushing():%b", java.lang.Boolean.valueOf(i0Var.H), java.lang.Boolean.valueOf(((yf.n1) i0Var.f461362i).isPushing()));
        yf.o oVar = i0Var.f461362i;
        if (oVar != null && !((yf.n1) oVar).isPushing()) {
            i0Var.G(new yf.i0$$p(i0Var, "start"));
        } else if (i0Var.H && ((yf.n1) i0Var.f461362i).isPushing()) {
            i0Var.G(new yf.i0$$p(i0Var, "resume"));
        }
        i0Var.H = false;
    }
}

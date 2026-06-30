package qa1;

/* loaded from: classes14.dex */
public class f0 implements qa1.n {

    /* renamed from: d, reason: collision with root package name */
    public final qa1.p f360983d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f360984e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f360985f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f360986g;

    /* renamed from: h, reason: collision with root package name */
    public rs0.h f360987h;

    /* renamed from: i, reason: collision with root package name */
    public ms0.c f360988i;

    /* renamed from: m, reason: collision with root package name */
    public ft0.d f360989m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f360990n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    public ms0.c f360991o = null;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f360992p = false;

    public f0(qa1.p pVar) {
        this.f360983d = pVar;
    }

    @Override // qa1.n
    public void A(android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        try {
            this.f360991o = new qa1.x(this, 1, 2);
            setPreviewRenderer(new qa1.y(this, 1, 2));
            a(new qa1.z(this, surfaceHolder, oVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: onSurfaceTextureAvailable, error:" + e17.getMessage());
            this.f360983d.b(oVar);
        }
    }

    public void a(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() == this.f360984e.getId()) {
            runnable.run();
        } else {
            this.f360985f.post(runnable);
        }
    }

    @Override // qa1.n
    public boolean g(int i17) {
        if (!this.f360992p) {
            return false;
        }
        int i18 = qa1.p.f361010p;
        if ((i17 & 1) > 0) {
            return !((i17 & 2) > 0);
        }
        return false;
    }

    @Override // qa1.u
    public ms0.c getAbsSurfaceRenderer() {
        return this.f360991o;
    }

    @Override // qa1.u
    public android.opengl.EGLContext getEGLContext() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "getEGLContext environment:" + this.f360987h);
        rs0.h hVar = this.f360987h;
        if (hVar == null) {
            return null;
        }
        return hVar.f399294c;
    }

    @Override // qa1.u
    public int getPreviewTextureId() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "getPreviewTextureId previewController:" + this.f360989m.c());
        ft0.d dVar = this.f360989m;
        if (dVar == null || dVar.c() == null) {
            return -1;
        }
        return this.f360989m.c().f294395e;
    }

    @Override // qa1.u
    public int getSurfaceHeight() {
        return this.f360983d.f361015n;
    }

    @Override // qa1.n
    public java.lang.Object getSurfaceTexture() {
        return this.f360989m.b();
    }

    @Override // qa1.u
    public int getSurfaceWidth() {
        return this.f360983d.f361014m;
    }

    @Override // qa1.n
    public void init() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("GameTextureView_renderThread", -2);
        this.f360984e = a17;
        a17.start();
        this.f360985f = new com.tencent.mm.sdk.platformtools.n3(this.f360984e.getLooper());
    }

    @Override // qa1.u
    public boolean isAvailable() {
        return this.f360983d.f361013i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        a(new qa1.e0(this, aVar));
    }

    @Override // qa1.n
    public void p(android.view.SurfaceHolder surfaceHolder, qa1.o oVar, boolean z17) {
        ms0.c cVar = this.f360991o;
        if (cVar != null) {
            cVar.n(false);
        }
        a(new qa1.b0(this, oVar));
    }

    @Override // qa1.n
    public void r(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19, qa1.o oVar) {
        a(new qa1.a0(this, i18, i19, surfaceHolder, i17, oVar));
    }

    @Override // et0.r
    public void requestRender() {
        a(new qa1.d0(this));
    }

    @Override // qa1.u
    public void setOnSurfaceTextureAvailableDelegate(qa1.t tVar) {
        if (this.f360990n.get()) {
            tVar.a(this.f360989m.b());
        }
    }

    @Override // qa1.u
    public void setOnTextureDrawFinishDelegate(yz5.l lVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "setOnTextureDrawFinishDelegate:");
        this.f360989m.f266464e = lVar;
    }

    @Override // qa1.u
    public void setPreviewRenderer(ms0.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "setRenderer: %d", java.lang.Integer.valueOf(cVar.hashCode()));
        ft0.d dVar = this.f360989m;
        if (dVar != null) {
            dVar.g(true, false);
            this.f360989m = new ft0.h(this);
        }
        ft0.h hVar = new ft0.h(this);
        this.f360989m = hVar;
        hVar.i(cVar);
        a(new qa1.c0(this, cVar));
    }
}

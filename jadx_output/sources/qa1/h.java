package qa1;

/* loaded from: classes14.dex */
public abstract class h extends gh.k implements qa1.u {

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f360994g;

    /* renamed from: h, reason: collision with root package name */
    public rs0.h f360995h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f360996i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f360997m;

    /* renamed from: n, reason: collision with root package name */
    public ms0.c f360998n;

    /* renamed from: o, reason: collision with root package name */
    public ft0.d f360999o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f361000p;

    public h(android.content.Context context) {
        super(context);
        this.f361000p = new java.util.concurrent.atomic.AtomicBoolean(false);
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("GameTextureView_renderThread", -2);
        this.f360996i = a17;
        a17.start();
        this.f360997m = new com.tencent.mm.sdk.platformtools.n3(this.f360996i.getLooper());
    }

    public static /* synthetic */ boolean a(qa1.h hVar, android.graphics.SurfaceTexture surfaceTexture) {
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    public void d(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() == this.f360996i.getId()) {
            runnable.run();
        } else {
            this.f360997m.post(runnable);
        }
    }

    @Override // qa1.u
    public abstract /* synthetic */ ms0.c getAbsSurfaceRenderer();

    @Override // qa1.u
    public android.opengl.EGLContext getEGLContext() {
        rs0.h hVar = this.f360995h;
        if (hVar == null) {
            return null;
        }
        return hVar.f399294c;
    }

    @Override // qa1.u
    public int getPreviewTextureId() {
        ft0.d dVar = this.f360999o;
        if (dVar == null || dVar.c() == null) {
            return -1;
        }
        return this.f360999o.c().f294395e;
    }

    @Override // qa1.u
    public abstract /* synthetic */ int getSurfaceHeight();

    @Override // qa1.u
    public abstract /* synthetic */ int getSurfaceWidth();

    @Override // et0.r
    public void l(yz5.a aVar) {
        if (java.lang.Thread.currentThread().getId() == this.f360996i.getId()) {
            aVar.invoke();
        } else {
            this.f360997m.post(new qa1.b(this, aVar));
        }
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureAvailable, surfaceTexture:%s, width:%d, height:%d", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d(new qa1.c(this, i17, i18, surfaceTexture));
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureDestroyed");
        d(new qa1.g(this));
        return false;
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "onSurfaceTextureSizeChanged, surfaceTexture:%s, width:%d, height:%d", surfaceTexture, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d(new qa1.d(this, i17, i18));
    }

    @Override // et0.r
    public void requestRender() {
        d(new qa1.f(this));
    }

    @Override // qa1.u
    public void setOnSurfaceTextureAvailableDelegate(qa1.t tVar) {
        if (this.f361000p.get()) {
            tVar.a(this.f360999o.b());
        }
    }

    @Override // qa1.u
    public void setOnTextureDrawFinishDelegate(yz5.l lVar) {
        this.f360999o.f266464e = lVar;
    }

    @Override // qa1.u
    public void setPreviewRenderer(ms0.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "setRenderer: %d", java.lang.Integer.valueOf(cVar.hashCode()));
        ft0.d dVar = this.f360999o;
        if (dVar != null) {
            dVar.g(true, false);
            this.f360999o = new ft0.h(this);
        }
        ft0.h hVar = new ft0.h(this);
        this.f360999o = hVar;
        hVar.i(cVar);
        d(new qa1.e(this, cVar));
    }
}

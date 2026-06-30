package qa1;

/* loaded from: classes14.dex */
public class p extends gh.j implements qa1.u {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f361010p = 0;

    /* renamed from: g, reason: collision with root package name */
    public qa1.n f361011g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.SurfaceHolder f361012h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f361013i;

    /* renamed from: m, reason: collision with root package name */
    public int f361014m;

    /* renamed from: n, reason: collision with root package name */
    public int f361015n;

    /* renamed from: o, reason: collision with root package name */
    public int f361016o;

    public p(android.content.Context context) {
        super(context);
        this.f361012h = null;
        this.f361013i = false;
        this.f361014m = 0;
        this.f361015n = 0;
        this.f361016o = 0;
        qa1.a aVar = new qa1.a(this);
        this.f361011g = aVar;
        aVar.init();
    }

    public void b(qa1.o oVar) {
        if (oVar != null) {
            post(new qa1.i(this, oVar));
        }
    }

    public java.lang.Object c() {
        return super.getSurfaceTexture();
    }

    public void d(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        super.surfaceChanged(surfaceHolder, i17, i18, i19);
    }

    public void e(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
    }

    public void f(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }

    @Override // qa1.u
    public ms0.c getAbsSurfaceRenderer() {
        return this.f361011g.getAbsSurfaceRenderer();
    }

    @Override // qa1.u
    public android.opengl.EGLContext getEGLContext() {
        return this.f361011g.getEGLContext();
    }

    @Override // qa1.u
    public int getPreviewTextureId() {
        return this.f361011g.getPreviewTextureId();
    }

    @Override // qa1.u
    public int getSurfaceHeight() {
        return this.f361015n;
    }

    @Override // gh.j
    public java.lang.Object getSurfaceTexture() {
        return this.f361011g.getSurfaceTexture();
    }

    @Override // qa1.u
    public int getSurfaceWidth() {
        return this.f361014m;
    }

    @Override // qa1.u
    public boolean isAvailable() {
        return this.f361013i;
    }

    @Override // et0.r
    public void l(yz5.a aVar) {
        this.f361011g.l(aVar);
    }

    @Override // gh.j, gh.r
    public void n(boolean z17, int i17, yz5.l lVar, com.tencent.magicbrush.MBRuntime mBRuntime) {
        post(new qa1.m(this, i17, z17, lVar, mBRuntime));
    }

    @Override // et0.r
    public void requestRender() {
        this.f361011g.requestRender();
    }

    @Override // qa1.u
    public void setOnSurfaceTextureAvailableDelegate(qa1.t tVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "setOnSurfaceTextureAvailableDelegate:");
        this.f361011g.setOnSurfaceTextureAvailableDelegate(tVar);
    }

    @Override // qa1.u
    public void setOnTextureDrawFinishDelegate(yz5.l lVar) {
        this.f361011g.setOnTextureDrawFinishDelegate(lVar);
    }

    @Override // qa1.u
    public void setPreviewRenderer(ms0.c cVar) {
        this.f361011g.setPreviewRenderer(cVar);
    }

    @Override // gh.j, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "surfaceChanged %s", surfaceHolder);
        synchronized (this) {
            this.f361016o = i17;
            this.f361014m = i18;
            this.f361015n = i19;
            this.f361012h = surfaceHolder;
        }
        this.f361011g.r(surfaceHolder, i17, i18, i19, null);
    }

    @Override // gh.j, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "surfaceCreated %s", surfaceHolder);
        synchronized (this) {
            this.f361012h = surfaceHolder;
        }
        this.f361011g.A(surfaceHolder, null);
        synchronized (this) {
            this.f361013i = true;
        }
    }

    @Override // gh.j, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "surfaceDestroyed, holder:" + surfaceHolder);
        synchronized (this) {
            this.f361012h = surfaceHolder;
        }
        this.f361011g.p(surfaceHolder, null, false);
        synchronized (this) {
            this.f361013i = false;
        }
    }
}

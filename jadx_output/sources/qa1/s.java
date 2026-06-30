package qa1;

/* loaded from: classes10.dex */
public class s extends qa1.h {

    /* renamed from: q, reason: collision with root package name */
    public boolean f361019q;

    /* renamed from: r, reason: collision with root package name */
    public int f361020r;

    /* renamed from: s, reason: collision with root package name */
    public int f361021s;

    /* renamed from: t, reason: collision with root package name */
    public ms0.c f361022t;

    public s(android.content.Context context) {
        super(context);
        this.f361019q = false;
        this.f361020r = 0;
        this.f361021s = 0;
        this.f361022t = null;
    }

    @Override // qa1.h, qa1.u
    public ms0.c getAbsSurfaceRenderer() {
        return this.f361022t;
    }

    @Override // qa1.h, qa1.u
    public int getSurfaceHeight() {
        return this.f361021s;
    }

    @Override // qa1.h, qa1.u
    public int getSurfaceWidth() {
        return this.f361020r;
    }

    @Override // android.view.TextureView, qa1.u
    public boolean isAvailable() {
        return this.f361019q;
    }

    @Override // qa1.h, gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenView", "onSurfaceTextureAvailable, surface:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        try {
            qa1.q qVar = new qa1.q(this, 1, 2);
            this.f361022t = qVar;
            qVar.u(i17, i18);
            this.f361022t.t(i17, i18);
            setPreviewRenderer(new qa1.r(this, 1, 2, i17, i18));
            synchronized (this) {
                this.f361019q = true;
                this.f361020r = i17;
                this.f361021s = i18;
            }
            super.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenView", "onSurfaceTextureAvailable, error:" + e17.getMessage());
        }
    }

    @Override // qa1.h, gh.k, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenView", "onSurfaceTextureDestroyed, surface:" + surfaceTexture);
        ms0.c cVar = this.f361022t;
        if (cVar != null) {
            cVar.n(true);
        }
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    @Override // qa1.h, gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenView", "onSurfaceTextureSizeChanged, surface:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        super.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // gh.k, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

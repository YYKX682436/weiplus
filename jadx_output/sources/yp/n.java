package yp;

/* loaded from: classes10.dex */
public class n implements yp.j, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.TextureView f464390d;

    /* renamed from: e, reason: collision with root package name */
    public yp.i f464391e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f464392f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f464393g = false;

    public n(android.view.TextureView textureView, boolean z17) {
        this.f464392f = z17;
        this.f464390d = textureView;
        textureView.setOpaque(false);
        textureView.setSurfaceTextureListener(this);
        com.tencent.mars.xlog.Log.i("TextureDanmakuView", java.lang.String.format("init textureview useSurfaceTextureUpdatedForCallback:%b,danmakuViewChangedhaveCallback:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f464393g)));
    }

    @Override // yp.j
    public void a(yp.i iVar) {
        this.f464391e = iVar;
        com.tencent.mars.xlog.Log.i("TextureDanmakuView", "setCallBack");
    }

    @Override // yp.j
    public float b() {
        return this.f464390d.getY();
    }

    @Override // yp.j
    public android.view.View getView() {
        return this.f464390d;
    }

    @Override // yp.j
    public android.graphics.Canvas lockCanvas() {
        return this.f464390d.lockCanvas();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f464393g = true;
        this.f464390d.setOpaque(false);
        yp.i iVar = this.f464391e;
        if (iVar != null) {
            iVar.b();
            this.f464391e.c();
        }
        com.tencent.mars.xlog.Log.i("TextureDanmakuView", java.lang.String.format("onSurfaceTextureAvailable width=%d,height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        yp.i iVar = this.f464391e;
        if (iVar != null) {
            iVar.a();
        }
        com.tencent.mars.xlog.Log.i("TextureDanmakuView", "onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f464393g = true;
        yp.i iVar = this.f464391e;
        if (iVar != null) {
            iVar.c();
        }
        com.tencent.mars.xlog.Log.i("TextureDanmakuView", java.lang.String.format("onSurfaceTextureSizeChanged width=%d,height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        if (!this.f464392f || this.f464393g) {
            return;
        }
        this.f464393g = true;
        yp.i iVar = this.f464391e;
        if (iVar != null) {
            iVar.c();
        }
        com.tencent.mars.xlog.Log.i("TextureDanmakuView", "onSurfaceTextureUpdated");
    }

    @Override // yp.j
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f464390d.setOnTouchListener(onTouchListener);
    }

    @Override // yp.j
    public void unlock() {
    }

    @Override // yp.j
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
        this.f464390d.unlockCanvasAndPost(canvas);
    }
}

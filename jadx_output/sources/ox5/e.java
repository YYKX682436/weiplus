package ox5;

/* loaded from: classes14.dex */
public class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView.SurfaceTextureListener f349807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f349808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f349809f;

    public e(ox5.c cVar, android.view.TextureView.SurfaceTextureListener surfaceTextureListener, boolean z17, android.view.TextureView textureView) {
        this.f349807d = surfaceTextureListener;
        this.f349808e = z17;
        this.f349809f = textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f349807d;
        if (surfaceTextureListener == null || this.f349808e) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f349807d;
        if (surfaceTextureListener == null || this.f349808e) {
            return true;
        }
        return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f349807d;
        if (surfaceTextureListener == null || this.f349808e) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f349807d;
        if (surfaceTextureListener != null && !this.f349808e) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        this.f349809f.postOnAnimation(new ox5.d(this));
    }
}

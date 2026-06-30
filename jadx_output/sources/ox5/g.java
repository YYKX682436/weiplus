package ox5;

/* loaded from: classes14.dex */
public class g implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView.SurfaceTextureListener f349811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.FlutterTextureView f349812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox5.a f349813f;

    public g(ox5.a aVar, android.view.TextureView.SurfaceTextureListener surfaceTextureListener, io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
        this.f349813f = aVar;
        this.f349811d = surfaceTextureListener;
        this.f349812e = flutterTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f349811d.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        return this.f349811d.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f349811d.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f349811d.onSurfaceTextureUpdated(surfaceTexture);
        this.f349813f.f349795d.postOnAnimation(new ox5.f(this));
    }
}

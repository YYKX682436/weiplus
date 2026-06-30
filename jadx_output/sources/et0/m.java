package et0;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView f256557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView) {
        super(0);
        this.f256557d = cameraPreviewGLTextureView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f256557d;
        ms0.c renderer = cameraPreviewGLTextureView.getRenderer();
        if (renderer != null) {
            ms0.c.o(renderer, false, 1, null);
        }
        rs0.h hVar = cameraPreviewGLTextureView.f68941i;
        if (hVar != null) {
            android.opengl.EGL14.eglDestroyContext(hVar.f399292a, hVar.f399294c);
            android.opengl.EGL14.eglDestroySurface(hVar.f399292a, hVar.f399293b);
            android.view.Surface surface = cameraPreviewGLTextureView.f68943n;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = cameraPreviewGLTextureView.f68942m;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            android.os.HandlerThread handlerThread = cameraPreviewGLTextureView.f68946q;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            cameraPreviewGLTextureView.f68946q = null;
            cameraPreviewGLTextureView.f68947r = null;
        }
        return jz5.f0.f302826a;
    }
}

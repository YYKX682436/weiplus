package et0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView f256561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView) {
        super(0);
        this.f256561d = cameraPreviewGLTextureView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture b17;
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f256561d;
        ft0.d dVar = cameraPreviewGLTextureView.f68949t;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        ms0.c renderer = cameraPreviewGLTextureView.getRenderer();
        if (renderer != null) {
            renderer.onDrawFrame(null);
        }
        rs0.h hVar = cameraPreviewGLTextureView.f68941i;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f399292a, hVar.f399293b, java.lang.System.nanoTime());
            android.opengl.EGL14.eglSwapBuffers(hVar.f399292a, hVar.f399293b);
        }
        return jz5.f0.f302826a;
    }
}

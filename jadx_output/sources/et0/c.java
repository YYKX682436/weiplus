package et0;

/* loaded from: classes14.dex */
public final class c implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView f256530a;

    public c(com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView) {
        this.f256530a = cameraPreviewGLSurfaceView;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        int i17 = com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView.f68937g;
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f256530a;
        cameraPreviewGLSurfaceView.getClass();
        ft0.d dVar = cameraPreviewGLSurfaceView.f68939e;
        if (dVar != null) {
            dVar.d(gl10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceChanged width:" + i17 + " height:" + i18, new java.lang.Object[0]);
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f256530a;
        ft0.d dVar = cameraPreviewGLSurfaceView.f68939e;
        if (dVar != null) {
            dVar.f266460a.l(new ft0.a(dVar, new et0.b(cameraPreviewGLSurfaceView, gl10, i17, i18), true, 0));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceCreated", new java.lang.Object[0]);
        ft0.d dVar = this.f256530a.f68939e;
        if (dVar != null) {
            dVar.f(gl10, eGLConfig);
        }
    }
}

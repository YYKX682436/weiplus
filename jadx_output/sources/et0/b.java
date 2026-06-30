package et0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView f256526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ javax.microedition.khronos.opengles.GL10 f256527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f256529g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView, javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        super(0);
        this.f256526d = cameraPreviewGLSurfaceView;
        this.f256527e = gl10;
        this.f256528f = i17;
        this.f256529g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        is0.c c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("previewController initRender  ");
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView cameraPreviewGLSurfaceView = this.f256526d;
        sb6.append(cameraPreviewGLSurfaceView.f68938d == null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", sb6.toString(), new java.lang.Object[0]);
        ft0.d dVar = cameraPreviewGLSurfaceView.f68939e;
        int i17 = this.f256529g;
        int i18 = this.f256528f;
        if (dVar != null) {
            dVar.e(this.f256527e, i18, i17);
        }
        ft0.d dVar2 = cameraPreviewGLSurfaceView.f68939e;
        if (dVar2 != null && (c17 = dVar2.c()) != null) {
            c17.f294400m = i18;
            c17.f294401n = i17;
        }
        cameraPreviewGLSurfaceView.f68940f = true;
        if (cameraPreviewGLSurfaceView.f68938d != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("callback.invoke  ");
            ft0.d dVar3 = cameraPreviewGLSurfaceView.f68939e;
            sb7.append(dVar3 != null ? dVar3.b() : null);
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewGLSurfaceView", sb7.toString(), new java.lang.Object[0]);
            yz5.l lVar = cameraPreviewGLSurfaceView.f68938d;
            if (lVar != null) {
                ft0.d dVar4 = cameraPreviewGLSurfaceView.f68939e;
                lVar.invoke(dVar4 != null ? dVar4.b() : null);
            }
        }
        return jz5.f0.f302826a;
    }
}

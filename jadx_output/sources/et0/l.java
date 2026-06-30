package et0;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView f256552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f256553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f256555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f256556h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, android.graphics.SurfaceTexture surfaceTexture2) {
        super(0);
        this.f256552d = cameraPreviewGLTextureView;
        this.f256553e = surfaceTexture;
        this.f256554f = i17;
        this.f256555g = i18;
        this.f256556h = surfaceTexture2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture = this.f256553e;
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f256552d;
        cameraPreviewGLTextureView.f68942m = surfaceTexture;
        int i17 = this.f256554f;
        cameraPreviewGLTextureView.f68944o = i17;
        int i18 = this.f256555g;
        cameraPreviewGLTextureView.f68945p = i18;
        android.view.Surface surface = new android.view.Surface(cameraPreviewGLTextureView.f68942m);
        cameraPreviewGLTextureView.f68943n = surface;
        cameraPreviewGLTextureView.f68941i = rs0.g.n(rs0.i.f399296a, surface, null, 0, 0, null, 16, null);
        ms0.c renderer = cameraPreviewGLTextureView.getRenderer();
        if (renderer != null) {
            renderer.onSurfaceCreated(null, null);
        }
        ms0.c renderer2 = cameraPreviewGLTextureView.getRenderer();
        if (renderer2 != null) {
            renderer2.t(i17, i18);
        }
        ms0.c renderer3 = cameraPreviewGLTextureView.getRenderer();
        if (renderer3 != null) {
            renderer3.k(true);
        }
        super/*com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView*/.onSurfaceTextureAvailable(this.f256556h, i17, i18);
        cameraPreviewGLTextureView.f68950u = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "previewCallback?.invoke");
        yz5.l lVar = cameraPreviewGLTextureView.f68951v;
        if (lVar != null) {
            ft0.d dVar = cameraPreviewGLTextureView.f68949t;
            lVar.invoke(dVar != null ? dVar.b() : null);
        }
        return jz5.f0.f302826a;
    }
}

package et0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView f256558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView, int i17, int i18) {
        super(0);
        this.f256558d = cameraPreviewGLTextureView;
        this.f256559e = i17;
        this.f256560f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f256559e;
        com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView cameraPreviewGLTextureView = this.f256558d;
        cameraPreviewGLTextureView.f68944o = i17;
        cameraPreviewGLTextureView.f68945p = this.f256560f;
        ms0.c renderer = cameraPreviewGLTextureView.getRenderer();
        if (renderer != null) {
            renderer.t(cameraPreviewGLTextureView.f68944o, cameraPreviewGLTextureView.f68945p);
        }
        return jz5.f0.f302826a;
    }
}

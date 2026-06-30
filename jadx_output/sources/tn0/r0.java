package tn0;

/* loaded from: classes3.dex */
public final class r0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420741d;

    public r0(tn0.w0 w0Var) {
        this.f420741d = w0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "docMode onSurfaceTextureAvailable, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        tn0.w0 w0Var = this.f420741d;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = w0Var.f420774u;
        android.view.TextureView cameraView = livePreviewView != null ? livePreviewView.getCameraView() : null;
        if (cameraView != null) {
            cameraView.setSurfaceTextureListener(null);
        }
        w0Var.f420771r.a(surface, w0Var.L());
        w0Var.f420771r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "docMode onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "docMode onSurfaceTextureSizeChanged, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        this.f420741d.f420771r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

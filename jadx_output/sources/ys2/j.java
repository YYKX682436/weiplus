package ys2;

/* loaded from: classes10.dex */
public final class j implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.o f465167d;

    public j(ys2.o oVar) {
        this.f465167d = oVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        ys2.o oVar = this.f465167d;
        com.tencent.mars.xlog.Log.i(oVar.f465173m, "onSurfaceTextureAvailable");
        kk4.c cVar = oVar.f465179s;
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(new android.view.Surface(surface));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f465167d.f465173m, "onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i(this.f465167d.f465173m, "onSurfaceTextureSizeChanged  width = " + i17 + "  height = " + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

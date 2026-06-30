package in0;

/* loaded from: classes3.dex */
public final class g implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f292749d;

    public g(go0.q1 q1Var) {
        this.f292749d = q1Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        go0.q1 renderSurface = this.f292749d;
        kotlin.jvm.internal.o.f(renderSurface, "$renderSurface");
        go0.i0.b(renderSurface, new android.view.Surface(surfaceTexture), false, 2, null);
        renderSurface.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureDestroyed");
        go0.q1 q1Var = this.f292749d;
        q1Var.getClass();
        q1Var.c(new go0.n1(q1Var));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f292749d.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

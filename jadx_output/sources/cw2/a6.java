package cw2;

/* loaded from: classes14.dex */
public final class a6 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.b6 f223566d;

    public a6(cw2.b6 b6Var) {
        this.f223566d = b6Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        cw2.b6 b6Var = this.f223566d;
        try {
            surfaceTexture.updateTexImage();
            yz5.a aVar = b6Var.f223598d;
            if (aVar != null) {
                aVar.invoke();
            }
        } catch (java.lang.RuntimeException unused) {
            com.tencent.mars.xlog.Log.e("FinderThumbPlayerPostProcessor", "Update texture image failed. " + b6Var);
        }
    }
}

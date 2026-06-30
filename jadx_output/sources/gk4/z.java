package gk4;

/* loaded from: classes10.dex */
public final class z implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272639d;

    public z(gk4.h0 h0Var) {
        this.f272639d = h0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        gk4.h0 h0Var = this.f272639d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = h0Var.f272560e;
        if (!kotlin.jvm.internal.o.b(myLooper, n3Var != null ? n3Var.getLooper() : null)) {
            h0Var.e(new gk4.y(surfaceTexture, h0Var));
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(h0Var.f272556a, e17, "updateTexImage error", new java.lang.Object[0]);
        }
        gk4.h0.b(h0Var, surfaceTexture.getTimestamp());
    }
}

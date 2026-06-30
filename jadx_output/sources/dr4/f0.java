package dr4;

/* loaded from: classes14.dex */
public final class f0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f242629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f242630e;

    public f0(dr4.n0 n0Var, is0.c cVar) {
        this.f242629d = n0Var;
        this.f242630e = cVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        is0.c cVar = this.f242630e;
        dr4.n0 n0Var = this.f242629d;
        n0Var.d(new dr4.e0(surfaceTexture, n0Var, cVar));
    }
}

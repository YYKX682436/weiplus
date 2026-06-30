package dr4;

/* loaded from: classes14.dex */
public final class a0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242589d;

    public a0(dr4.c0 c0Var) {
        this.f242589d = c0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        dr4.c0 c0Var = this.f242589d;
        dr4.c0.a(c0Var);
        c0Var.f242605h = true;
    }
}

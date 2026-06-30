package dr4;

/* loaded from: classes14.dex */
public final class s implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242738d;

    public s(dr4.c0 c0Var) {
        this.f242738d = c0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        dr4.c0.a(this.f242738d);
    }
}

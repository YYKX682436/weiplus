package go0;

/* loaded from: classes14.dex */
public final class u0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f273871d;

    public u0(go0.v0 v0Var) {
        this.f273871d = v0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        go0.v0 v0Var = this.f273871d;
        v0Var.c(new go0.t0(v0Var));
    }
}

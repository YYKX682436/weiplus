package gk4;

/* loaded from: classes10.dex */
public final class q implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f272595e;

    public q(gk4.r rVar, android.graphics.SurfaceTexture surfaceTexture) {
        this.f272594d = rVar;
        this.f272595e = surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        gk4.r rVar = this.f272594d;
        com.tencent.mars.xlog.Log.i(rVar.f272602g, "first frame available");
        rVar.l();
        this.f272595e.setOnFrameAvailableListener(null);
    }
}

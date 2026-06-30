package vu1;

/* loaded from: classes13.dex */
public final class g implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu1.h f440188d;

    public g(vu1.h hVar) {
        this.f440188d = hVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f440188d.f440202n = true;
    }
}

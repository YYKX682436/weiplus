package ro5;

/* loaded from: classes14.dex */
public final class q0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f398285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp5.f f398286e;

    public q0(yz5.p pVar, dp5.f fVar) {
        this.f398285d = pVar;
        this.f398286e = fVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((dp5.a) this.f398286e).f242272d);
        kotlin.jvm.internal.o.d(surfaceTexture);
        this.f398285d.invoke(valueOf, surfaceTexture);
    }
}

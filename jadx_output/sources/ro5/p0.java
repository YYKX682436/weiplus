package ro5;

/* loaded from: classes14.dex */
public final class p0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f398275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.f0 f398276e;

    public p0(yz5.p pVar, ro5.f0 f0Var) {
        this.f398275d = pVar;
        this.f398276e = f0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((dp5.a) this.f398276e.f398192b).f242272d);
        kotlin.jvm.internal.o.d(surfaceTexture);
        this.f398275d.invoke(valueOf, surfaceTexture);
    }
}

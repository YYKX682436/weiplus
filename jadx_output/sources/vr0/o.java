package vr0;

/* loaded from: classes10.dex */
public final class o implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr0.y f439491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439492b;

    public o(nr0.y yVar, vr0.z zVar) {
        this.f439491a = yVar;
        this.f439492b = zVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "provideSurface result:" + ((androidx.camera.core.SurfaceRequest.Result) obj));
        ((pr0.n) this.f439491a).l("ProvideSurfaceCallback", new vr0.n(this.f439492b, null));
    }
}

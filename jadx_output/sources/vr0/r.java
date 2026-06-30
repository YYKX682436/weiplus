package vr0;

/* loaded from: classes14.dex */
public final class r implements androidx.camera.core.Preview.SurfaceProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr0.y f439503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr0.x f439505c;

    public r(nr0.y yVar, vr0.z zVar, nr0.x xVar) {
        this.f439503a = yVar;
        this.f439504b = zVar;
        this.f439505c = xVar;
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public final void onSurfaceRequested(androidx.camera.core.SurfaceRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        nr0.y yVar = this.f439503a;
        ((pr0.n) yVar).l("SurfaceProviderCallback", new vr0.q(request, this.f439504b, this.f439505c, yVar, null));
    }
}

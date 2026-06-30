package ro5;

/* loaded from: classes14.dex */
public final class e0 implements bp5.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f398186d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f398187e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Size f398188f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f398189g;

    public e0(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        this.f398186d = surfaceTexture;
        this.f398187e = "MicroMsg.ILinkVoIPRenderLogic-" + hashCode() + '-' + surfaceTexture;
        this.f398188f = new android.util.Size(0, 0);
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f398189g;
    }

    @Override // bp5.h
    public android.util.Size getRenderSize() {
        return this.f398188f;
    }

    @Override // bp5.h
    public java.lang.Object getRenderTarget() {
        return this.f398186d;
    }

    @Override // bp5.h
    public void setNeedRecreate(boolean z17) {
        this.f398189g = z17;
    }
}

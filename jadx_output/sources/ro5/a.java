package ro5;

/* loaded from: classes14.dex */
public final class a implements bp5.h {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.SurfaceProducer f398128d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f398129e;

    /* renamed from: f, reason: collision with root package name */
    public long f398130f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f398131g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Size f398132h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f398133i;

    public a(io.flutter.view.TextureRegistry.SurfaceProducer flutterTexture, android.view.Surface surface, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(flutterTexture, "flutterTexture");
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f398128d = flutterTexture;
        this.f398129e = surface;
        this.f398130f = j17;
        this.f398131g = z17;
        this.f398132h = new android.util.Size(0, 0);
    }

    public final void a(int i17, int i18) {
        this.f398128d.setSize(i17, i18);
        this.f398133i = true;
        this.f398132h = new android.util.Size(i17, i18);
    }

    @Override // bp5.h
    public boolean getImpellerEnabled() {
        return this.f398131g;
    }

    @Override // bp5.h
    public boolean getNeedRecreate() {
        return this.f398133i;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size getSize() {
        return this.f398132h;
    }

    @Override // bp5.h
    public java.lang.Object getRenderTarget() {
        return this.f398128d.getSurface();
    }

    @Override // bp5.h
    public void setNeedRecreate(boolean z17) {
        this.f398133i = z17;
    }
}

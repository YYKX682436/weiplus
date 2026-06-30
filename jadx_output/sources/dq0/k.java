package dq0;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f242313a;

    /* renamed from: b, reason: collision with root package name */
    public final cf3.d f242314b;

    /* renamed from: c, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.SurfaceProducer f242315c;

    /* renamed from: d, reason: collision with root package name */
    public long f242316d;

    /* renamed from: e, reason: collision with root package name */
    public long f242317e;

    /* renamed from: f, reason: collision with root package name */
    public long f242318f;

    /* renamed from: g, reason: collision with root package name */
    public long f242319g;

    public k(java.lang.String viewId, cf3.d view, io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer, long j17, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(view, "view");
        this.f242313a = viewId;
        this.f242314b = view;
        this.f242315c = surfaceProducer;
        this.f242316d = j17;
        this.f242317e = j18;
        this.f242318f = j19;
        this.f242319g = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq0.k)) {
            return false;
        }
        dq0.k kVar = (dq0.k) obj;
        return kotlin.jvm.internal.o.b(this.f242313a, kVar.f242313a) && kotlin.jvm.internal.o.b(this.f242314b, kVar.f242314b) && kotlin.jvm.internal.o.b(this.f242315c, kVar.f242315c) && this.f242316d == kVar.f242316d && this.f242317e == kVar.f242317e && this.f242318f == kVar.f242318f && this.f242319g == kVar.f242319g;
    }

    public int hashCode() {
        int hashCode = ((this.f242313a.hashCode() * 31) + this.f242314b.hashCode()) * 31;
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f242315c;
        return ((((((((hashCode + (surfaceProducer == null ? 0 : surfaceProducer.hashCode())) * 31) + java.lang.Long.hashCode(this.f242316d)) * 31) + java.lang.Long.hashCode(this.f242317e)) * 31) + java.lang.Long.hashCode(this.f242318f)) * 31) + java.lang.Long.hashCode(this.f242319g);
    }

    public java.lang.String toString() {
        return "ViewInfo(viewId=" + this.f242313a + ", view=" + this.f242314b + ", textureEntry=" + this.f242315c + ", left=" + this.f242316d + ", top=" + this.f242317e + ", width=" + this.f242318f + ", height=" + this.f242319g + ')';
    }
}

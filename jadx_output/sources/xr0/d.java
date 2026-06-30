package xr0;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final xr0.a f456159a;

    /* renamed from: b, reason: collision with root package name */
    public xr0.k f456160b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f456161c;

    /* renamed from: d, reason: collision with root package name */
    public int f456162d;

    /* renamed from: e, reason: collision with root package name */
    public int f456163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456164f;

    /* renamed from: g, reason: collision with root package name */
    public int f456165g;

    public d(xr0.a aVar, xr0.k kVar, boolean z17, int i17, int i18, boolean z18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        xr0.a deviceInfo = (i27 & 1) != 0 ? new xr0.a(0, false, false, 7, null) : aVar;
        xr0.k sizeParameter = (i27 & 2) != 0 ? new xr0.k(null, null, null, 0, false, 31, null) : kVar;
        boolean z19 = (i27 & 4) != 0 ? true : z17;
        int i28 = (i27 & 8) != 0 ? -1 : i17;
        int i29 = (i27 & 16) != 0 ? 0 : i18;
        boolean z27 = (i27 & 32) != 0 ? false : z18;
        int i37 = (i27 & 64) == 0 ? i19 : 0;
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.o.g(sizeParameter, "sizeParameter");
        this.f456159a = deviceInfo;
        this.f456160b = sizeParameter;
        this.f456161c = z19;
        this.f456162d = i28;
        this.f456163e = i29;
        this.f456164f = z27;
        this.f456165g = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.d)) {
            return false;
        }
        xr0.d dVar = (xr0.d) obj;
        return kotlin.jvm.internal.o.b(this.f456159a, dVar.f456159a) && kotlin.jvm.internal.o.b(this.f456160b, dVar.f456160b) && this.f456161c == dVar.f456161c && this.f456162d == dVar.f456162d && this.f456163e == dVar.f456163e && this.f456164f == dVar.f456164f && this.f456165g == dVar.f456165g;
    }

    public int hashCode() {
        return (((((((((((this.f456159a.hashCode() * 31) + this.f456160b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f456161c)) * 31) + java.lang.Integer.hashCode(this.f456162d)) * 31) + java.lang.Integer.hashCode(this.f456163e)) * 31) + java.lang.Boolean.hashCode(this.f456164f)) * 31) + java.lang.Integer.hashCode(this.f456165g);
    }

    public java.lang.String toString() {
        return "CameraKitInfo(deviceInfo=" + this.f456159a + ", sizeParameter=" + this.f456160b + ", isBackCamera=" + this.f456161c + ", cameraId=" + this.f456162d + ", rotate=" + this.f456163e + ", isPreviewing=" + this.f456164f + ", frameRate=" + this.f456165g + ')';
    }
}

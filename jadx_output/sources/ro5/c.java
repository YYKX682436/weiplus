package ro5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f398167a;

    /* renamed from: b, reason: collision with root package name */
    public final double f398168b;

    /* renamed from: c, reason: collision with root package name */
    public final long f398169c;

    /* renamed from: d, reason: collision with root package name */
    public final double f398170d;

    /* renamed from: e, reason: collision with root package name */
    public final double f398171e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f398172f;

    /* renamed from: g, reason: collision with root package name */
    public final long f398173g;

    public c(long j17, double d17, long j18, double d18, double d19, boolean z17, long j19) {
        this.f398167a = j17;
        this.f398168b = d17;
        this.f398169c = j18;
        this.f398170d = d18;
        this.f398171e = d19;
        this.f398172f = z17;
        this.f398173g = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro5.c)) {
            return false;
        }
        ro5.c cVar = (ro5.c) obj;
        return this.f398167a == cVar.f398167a && java.lang.Double.compare(this.f398168b, cVar.f398168b) == 0 && this.f398169c == cVar.f398169c && java.lang.Double.compare(this.f398170d, cVar.f398170d) == 0 && java.lang.Double.compare(this.f398171e, cVar.f398171e) == 0 && this.f398172f == cVar.f398172f && this.f398173g == cVar.f398173g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Long.hashCode(this.f398167a) * 31) + java.lang.Double.hashCode(this.f398168b)) * 31) + java.lang.Long.hashCode(this.f398169c)) * 31) + java.lang.Double.hashCode(this.f398170d)) * 31) + java.lang.Double.hashCode(this.f398171e)) * 31) + java.lang.Boolean.hashCode(this.f398172f)) * 31) + java.lang.Long.hashCode(this.f398173g);
    }

    public java.lang.String toString() {
        return "TextureInfo(texId=" + this.f398167a + ", ratio=" + this.f398168b + ", rotate=" + this.f398169c + ", width=" + this.f398170d + ", height=" + this.f398171e + ", isLandscapeMode=" + this.f398172f + ", surfacePtr=" + this.f398173g + ')';
    }
}

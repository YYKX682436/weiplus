package df;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f229482a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f229483b;

    /* renamed from: c, reason: collision with root package name */
    public final int f229484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f229485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f229486e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f229487f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f229488g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.skyline.ColorScheme f229489h;

    public i(long j17, boolean z17, int i17, int i18, boolean z18, java.lang.String splashAppId, java.lang.String splashPath, com.tencent.skyline.ColorScheme colorScheme) {
        kotlin.jvm.internal.o.g(splashAppId, "splashAppId");
        kotlin.jvm.internal.o.g(splashPath, "splashPath");
        kotlin.jvm.internal.o.g(colorScheme, "colorScheme");
        this.f229482a = j17;
        this.f229483b = z17;
        this.f229484c = i17;
        this.f229485d = i18;
        this.f229486e = z18;
        this.f229487f = splashAppId;
        this.f229488g = splashPath;
        this.f229489h = colorScheme;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df.i)) {
            return false;
        }
        df.i iVar = (df.i) obj;
        return this.f229482a == iVar.f229482a && this.f229483b == iVar.f229483b && this.f229484c == iVar.f229484c && this.f229485d == iVar.f229485d && this.f229486e == iVar.f229486e && kotlin.jvm.internal.o.b(this.f229487f, iVar.f229487f) && kotlin.jvm.internal.o.b(this.f229488g, iVar.f229488g) && this.f229489h == iVar.f229489h;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.f229482a) * 31) + java.lang.Boolean.hashCode(this.f229483b)) * 31) + java.lang.Integer.hashCode(this.f229484c)) * 31) + java.lang.Integer.hashCode(this.f229485d)) * 31) + java.lang.Boolean.hashCode(this.f229486e)) * 31) + this.f229487f.hashCode()) * 31) + this.f229488g.hashCode()) * 31) + this.f229489h.hashCode();
    }

    public java.lang.String toString() {
        return "SkylineConstructArgs(runtimePtr=" + this.f229482a + ", createRuntime=" + this.f229483b + ", width=" + this.f229484c + ", height=" + this.f229485d + ", useSplashCache=" + this.f229486e + ", splashAppId=" + this.f229487f + ", splashPath=" + this.f229488g + ", colorScheme=" + this.f229489h + ')';
    }
}

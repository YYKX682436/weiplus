package v5;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f433289a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f433290b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.ColorSpace f433291c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.g f433292d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f433293e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f433294f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f433295g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.i0 f433296h;

    /* renamed from: i, reason: collision with root package name */
    public final c6.p f433297i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.b f433298j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.b f433299k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.b f433300l;

    public k(android.content.Context context, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, d6.g scale, boolean z17, boolean z18, boolean z19, l36.i0 headers, c6.p parameters, c6.b memoryCachePolicy, c6.b diskCachePolicy, c6.b networkCachePolicy) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(scale, "scale");
        kotlin.jvm.internal.o.g(headers, "headers");
        kotlin.jvm.internal.o.g(parameters, "parameters");
        kotlin.jvm.internal.o.g(memoryCachePolicy, "memoryCachePolicy");
        kotlin.jvm.internal.o.g(diskCachePolicy, "diskCachePolicy");
        kotlin.jvm.internal.o.g(networkCachePolicy, "networkCachePolicy");
        this.f433289a = context;
        this.f433290b = config;
        this.f433291c = colorSpace;
        this.f433292d = scale;
        this.f433293e = z17;
        this.f433294f = z18;
        this.f433295g = z19;
        this.f433296h = headers;
        this.f433297i = parameters;
        this.f433298j = memoryCachePolicy;
        this.f433299k = diskCachePolicy;
        this.f433300l = networkCachePolicy;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v5.k) {
            v5.k kVar = (v5.k) obj;
            if (kotlin.jvm.internal.o.b(this.f433289a, kVar.f433289a) && this.f433290b == kVar.f433290b && ((android.os.Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.o.b(this.f433291c, kVar.f433291c)) && this.f433292d == kVar.f433292d && this.f433293e == kVar.f433293e && this.f433294f == kVar.f433294f && this.f433295g == kVar.f433295g && kotlin.jvm.internal.o.b(this.f433296h, kVar.f433296h) && kotlin.jvm.internal.o.b(this.f433297i, kVar.f433297i) && this.f433298j == kVar.f433298j && this.f433299k == kVar.f433299k && this.f433300l == kVar.f433300l)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f433289a.hashCode() * 31) + this.f433290b.hashCode()) * 31;
        android.graphics.ColorSpace colorSpace = this.f433291c;
        return ((((((((((((((((((hashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f433292d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f433293e)) * 31) + java.lang.Boolean.hashCode(this.f433294f)) * 31) + java.lang.Boolean.hashCode(this.f433295g)) * 31) + this.f433296h.hashCode()) * 31) + this.f433297i.hashCode()) * 31) + this.f433298j.hashCode()) * 31) + this.f433299k.hashCode()) * 31) + this.f433300l.hashCode();
    }

    public java.lang.String toString() {
        return "Options(context=" + this.f433289a + ", config=" + this.f433290b + ", colorSpace=" + this.f433291c + ", scale=" + this.f433292d + ", allowInexactSize=" + this.f433293e + ", allowRgb565=" + this.f433294f + ", premultipliedAlpha=" + this.f433295g + ", headers=" + this.f433296h + ", parameters=" + this.f433297i + ", memoryCachePolicy=" + this.f433298j + ", diskCachePolicy=" + this.f433299k + ", networkCachePolicy=" + this.f433300l + ')';
    }
}

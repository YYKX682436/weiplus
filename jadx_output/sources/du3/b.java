package du3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final du3.a f243513e = new du3.a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.l f243514f = new jz5.l("c06ea14e737d3990e1d27c218cd1d524", i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.pdn));

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.l f243515g = new jz5.l("379c04e07d05f131d63ac559e54bf6e8", i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.pdo));

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.l f243516h = new jz5.l("023cf761adaff2e38afaa5b5b952848c", i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.pdl));

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.l f243517i = new jz5.l("c9255a86d6c422c1859284674af617fd", i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.pdm));

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f243518j = "0";

    /* renamed from: k, reason: collision with root package name */
    public static final int f243519k = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f243520a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f243521b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f243522c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f243523d;

    public b(int i17, java.lang.String template, java.lang.String title, java.lang.String hostUrl) {
        kotlin.jvm.internal.o.g(template, "template");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(hostUrl, "hostUrl");
        this.f243520a = i17;
        this.f243521b = template;
        this.f243522c = title;
        this.f243523d = hostUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du3.b)) {
            return false;
        }
        du3.b bVar = (du3.b) obj;
        return this.f243520a == bVar.f243520a && kotlin.jvm.internal.o.b(this.f243521b, bVar.f243521b) && kotlin.jvm.internal.o.b(this.f243522c, bVar.f243522c) && kotlin.jvm.internal.o.b(this.f243523d, bVar.f243523d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f243520a) * 31) + this.f243521b.hashCode()) * 31) + this.f243522c.hashCode()) * 31) + this.f243523d.hashCode();
    }

    public java.lang.String toString() {
        return "AiFeature(type=" + this.f243520a + ", template=" + this.f243521b + ", title=" + this.f243522c + ", hostUrl=" + this.f243523d + ')';
    }
}

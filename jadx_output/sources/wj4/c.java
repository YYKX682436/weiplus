package wj4;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f446753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f446754b;

    /* renamed from: c, reason: collision with root package name */
    public final float f446755c;

    /* renamed from: d, reason: collision with root package name */
    public final float f446756d;

    /* renamed from: e, reason: collision with root package name */
    public final int f446757e;

    /* renamed from: f, reason: collision with root package name */
    public final float f446758f;

    /* renamed from: g, reason: collision with root package name */
    public final int f446759g;

    /* renamed from: h, reason: collision with root package name */
    public final int f446760h;

    /* renamed from: i, reason: collision with root package name */
    public final double f446761i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f446762j;

    public c(java.lang.String branchName, boolean z17, float f17, float f18, int i17, float f19, int i18, int i19, double d17, java.lang.String analysisSource) {
        kotlin.jvm.internal.o.g(branchName, "branchName");
        kotlin.jvm.internal.o.g(analysisSource, "analysisSource");
        this.f446753a = branchName;
        this.f446754b = z17;
        this.f446755c = f17;
        this.f446756d = f18;
        this.f446757e = i17;
        this.f446758f = f19;
        this.f446759g = i18;
        this.f446760h = i19;
        this.f446761i = d17;
        this.f446762j = analysisSource;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4.c)) {
            return false;
        }
        wj4.c cVar = (wj4.c) obj;
        return kotlin.jvm.internal.o.b(this.f446753a, cVar.f446753a) && this.f446754b == cVar.f446754b && java.lang.Float.compare(this.f446755c, cVar.f446755c) == 0 && java.lang.Float.compare(this.f446756d, cVar.f446756d) == 0 && this.f446757e == cVar.f446757e && java.lang.Float.compare(this.f446758f, cVar.f446758f) == 0 && this.f446759g == cVar.f446759g && this.f446760h == cVar.f446760h && java.lang.Double.compare(this.f446761i, cVar.f446761i) == 0 && kotlin.jvm.internal.o.b(this.f446762j, cVar.f446762j);
    }

    public int hashCode() {
        return (((((((((((((((((this.f446753a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f446754b)) * 31) + java.lang.Float.hashCode(this.f446755c)) * 31) + java.lang.Float.hashCode(this.f446756d)) * 31) + java.lang.Integer.hashCode(this.f446757e)) * 31) + java.lang.Float.hashCode(this.f446758f)) * 31) + java.lang.Integer.hashCode(this.f446759g)) * 31) + java.lang.Integer.hashCode(this.f446760h)) * 31) + java.lang.Double.hashCode(this.f446761i)) * 31) + this.f446762j.hashCode();
    }

    public java.lang.String toString() {
        return "CardStrokeRenderSpec(branchName=" + this.f446753a + ", isDarkMode=" + this.f446754b + ", cornerRadiusPx=" + this.f446755c + ", primaryWidthPx=" + this.f446756d + ", primaryColor=" + this.f446757e + ", supportWidthPx=" + this.f446758f + ", supportColor=" + this.f446759g + ", edgeColor=" + this.f446760h + ", contrastRatio=" + this.f446761i + ", analysisSource=" + this.f446762j + ')';
    }
}

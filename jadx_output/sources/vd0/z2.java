package vd0;

/* loaded from: classes8.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f435545a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f435546b;

    /* renamed from: c, reason: collision with root package name */
    public final int f435547c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f435548d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f435549e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f435550f;

    /* renamed from: g, reason: collision with root package name */
    public final int f435551g;

    /* renamed from: h, reason: collision with root package name */
    public final int f435552h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f435553i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f435554j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f435555k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f435556l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f435557m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f435558n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f435559o;

    public z2(java.lang.String key, java.lang.String parentKey, int i17, boolean z17, boolean z18, boolean z19, int i18, int i19, java.lang.String name, java.lang.String nameLower, java.lang.String summary, java.lang.String summaryLower, java.lang.String header, java.lang.String headerLower, java.lang.String path) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(parentKey, "parentKey");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(nameLower, "nameLower");
        kotlin.jvm.internal.o.g(summary, "summary");
        kotlin.jvm.internal.o.g(summaryLower, "summaryLower");
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(headerLower, "headerLower");
        kotlin.jvm.internal.o.g(path, "path");
        this.f435545a = key;
        this.f435546b = parentKey;
        this.f435547c = i17;
        this.f435548d = z17;
        this.f435549e = z18;
        this.f435550f = z19;
        this.f435551g = i18;
        this.f435552h = i19;
        this.f435553i = name;
        this.f435554j = nameLower;
        this.f435555k = summary;
        this.f435556l = summaryLower;
        this.f435557m = header;
        this.f435558n = headerLower;
        this.f435559o = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.z2)) {
            return false;
        }
        vd0.z2 z2Var = (vd0.z2) obj;
        return kotlin.jvm.internal.o.b(this.f435545a, z2Var.f435545a) && kotlin.jvm.internal.o.b(this.f435546b, z2Var.f435546b) && this.f435547c == z2Var.f435547c && this.f435548d == z2Var.f435548d && this.f435549e == z2Var.f435549e && this.f435550f == z2Var.f435550f && this.f435551g == z2Var.f435551g && this.f435552h == z2Var.f435552h && kotlin.jvm.internal.o.b(this.f435553i, z2Var.f435553i) && kotlin.jvm.internal.o.b(this.f435554j, z2Var.f435554j) && kotlin.jvm.internal.o.b(this.f435555k, z2Var.f435555k) && kotlin.jvm.internal.o.b(this.f435556l, z2Var.f435556l) && kotlin.jvm.internal.o.b(this.f435557m, z2Var.f435557m) && kotlin.jvm.internal.o.b(this.f435558n, z2Var.f435558n) && kotlin.jvm.internal.o.b(this.f435559o, z2Var.f435559o);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f435545a.hashCode() * 31) + this.f435546b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f435547c)) * 31) + java.lang.Boolean.hashCode(this.f435548d)) * 31) + java.lang.Boolean.hashCode(this.f435549e)) * 31) + java.lang.Boolean.hashCode(this.f435550f)) * 31) + java.lang.Integer.hashCode(this.f435551g)) * 31) + java.lang.Integer.hashCode(this.f435552h)) * 31) + this.f435553i.hashCode()) * 31) + this.f435554j.hashCode()) * 31) + this.f435555k.hashCode()) * 31) + this.f435556l.hashCode()) * 31) + this.f435557m.hashCode()) * 31) + this.f435558n.hashCode()) * 31) + this.f435559o.hashCode();
    }

    public java.lang.String toString() {
        return "IndexedNode(key=" + this.f435545a + ", parentKey=" + this.f435546b + ", type=" + this.f435547c + ", searchable=" + this.f435548d + ", isSwitch=" + this.f435549e + ", isRoot=" + this.f435550f + ", depth=" + this.f435551g + ", originalOrder=" + this.f435552h + ", name=" + this.f435553i + ", nameLower=" + this.f435554j + ", summary=" + this.f435555k + ", summaryLower=" + this.f435556l + ", header=" + this.f435557m + ", headerLower=" + this.f435558n + ", path=" + this.f435559o + ')';
    }
}

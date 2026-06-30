package yf;

/* loaded from: classes11.dex */
public final class d implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f461327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f461328b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.b f461329c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f461330d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461331e;

    /* renamed from: f, reason: collision with root package name */
    public final float f461332f;

    public d(float f17, int i17, yf.b blendMode, java.lang.String path, java.lang.String str, float f18) {
        kotlin.jvm.internal.o.g(blendMode, "blendMode");
        kotlin.jvm.internal.o.g(path, "path");
        this.f461327a = f17;
        this.f461328b = i17;
        this.f461329c = blendMode;
        this.f461330d = path;
        this.f461331e = str;
        this.f461332f = f18;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "EyeBrowInfo(path='" + this.f461330d + "', pathMd5='" + this.f461331e + "')";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.d)) {
            return false;
        }
        yf.d dVar = (yf.d) obj;
        return java.lang.Float.compare(this.f461327a, dVar.f461327a) == 0 && this.f461328b == dVar.f461328b && this.f461329c == dVar.f461329c && kotlin.jvm.internal.o.b(this.f461330d, dVar.f461330d) && kotlin.jvm.internal.o.b(this.f461331e, dVar.f461331e) && java.lang.Float.compare(this.f461332f, dVar.f461332f) == 0;
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Float.hashCode(this.f461327a) * 31) + java.lang.Integer.hashCode(this.f461328b)) * 31) + this.f461329c.hashCode()) * 31) + this.f461330d.hashCode()) * 31;
        java.lang.String str = this.f461331e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Float.hashCode(this.f461332f);
    }

    public java.lang.String toString() {
        return "EyeBrowInfo(alpha=" + this.f461327a + ", faceModel=" + this.f461328b + ", blendMode=" + this.f461329c + ", path=" + this.f461330d + ", pathMd5=" + this.f461331e + ", shrinkRate=" + this.f461332f + ')';
    }
}

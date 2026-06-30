package yf;

/* loaded from: classes11.dex */
public final class c implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f461314a;

    /* renamed from: b, reason: collision with root package name */
    public final int f461315b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.b f461316c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f461317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461318e;

    public c(float f17, int i17, yf.b blendMode, java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(blendMode, "blendMode");
        kotlin.jvm.internal.o.g(path, "path");
        this.f461314a = f17;
        this.f461315b = i17;
        this.f461316c = blendMode;
        this.f461317d = path;
        this.f461318e = str;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "BlusherStickInfo(path='" + this.f461317d + "', pathMd5='" + this.f461318e + "')";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.c)) {
            return false;
        }
        yf.c cVar = (yf.c) obj;
        return java.lang.Float.compare(this.f461314a, cVar.f461314a) == 0 && this.f461315b == cVar.f461315b && this.f461316c == cVar.f461316c && kotlin.jvm.internal.o.b(this.f461317d, cVar.f461317d) && kotlin.jvm.internal.o.b(this.f461318e, cVar.f461318e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Float.hashCode(this.f461314a) * 31) + java.lang.Integer.hashCode(this.f461315b)) * 31) + this.f461316c.hashCode()) * 31) + this.f461317d.hashCode()) * 31;
        java.lang.String str = this.f461318e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "BlusherStickInfo(alpha=" + this.f461314a + ", faceModel=" + this.f461315b + ", blendMode=" + this.f461316c + ", path=" + this.f461317d + ", pathMd5=" + this.f461318e + ')';
    }
}

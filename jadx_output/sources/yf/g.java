package yf;

/* loaded from: classes11.dex */
public final class g implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f461350a;

    /* renamed from: b, reason: collision with root package name */
    public final float f461351b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f461352c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f461353d;

    public g(int i17, float f17, java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f461350a = i17;
        this.f461351b = f17;
        this.f461352c = path;
        this.f461353d = str;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "FaceContourInfo(path='" + this.f461352c + "', pathMd5='" + this.f461353d + "')";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.g)) {
            return false;
        }
        yf.g gVar = (yf.g) obj;
        return this.f461350a == gVar.f461350a && java.lang.Float.compare(this.f461351b, gVar.f461351b) == 0 && kotlin.jvm.internal.o.b(this.f461352c, gVar.f461352c) && kotlin.jvm.internal.o.b(this.f461353d, gVar.f461353d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f461350a) * 31) + java.lang.Float.hashCode(this.f461351b)) * 31) + this.f461352c.hashCode()) * 31;
        java.lang.String str = this.f461353d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "FaceContourInfo(faceModel=" + this.f461350a + ", alpha=" + this.f461351b + ", path=" + this.f461352c + ", pathMd5=" + this.f461353d + ')';
    }
}

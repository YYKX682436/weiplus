package ox;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349445a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349446b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f349447c;

    public b0(java.lang.String bizCntWording, java.lang.String coverImgUrl, java.lang.String aggrUrl) {
        kotlin.jvm.internal.o.g(bizCntWording, "bizCntWording");
        kotlin.jvm.internal.o.g(coverImgUrl, "coverImgUrl");
        kotlin.jvm.internal.o.g(aggrUrl, "aggrUrl");
        this.f349445a = bizCntWording;
        this.f349446b = coverImgUrl;
        this.f349447c = aggrUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox.b0)) {
            return false;
        }
        ox.b0 b0Var = (ox.b0) obj;
        return kotlin.jvm.internal.o.b(this.f349445a, b0Var.f349445a) && kotlin.jvm.internal.o.b(this.f349446b, b0Var.f349446b) && kotlin.jvm.internal.o.b(this.f349447c, b0Var.f349447c);
    }

    public int hashCode() {
        return (((this.f349445a.hashCode() * 31) + this.f349446b.hashCode()) * 31) + this.f349447c.hashCode();
    }

    public java.lang.String toString() {
        return "MomentPoiInfo(bizCntWording=" + this.f349445a + ", coverImgUrl=" + this.f349446b + ", aggrUrl=" + this.f349447c + ')';
    }
}

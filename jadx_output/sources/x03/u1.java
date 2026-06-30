package x03;

/* loaded from: classes11.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f451146a;

    /* renamed from: b, reason: collision with root package name */
    public double f451147b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f451148c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451149d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f451150e;

    public u1(int i17, double d17, java.lang.String fileName, java.lang.String filePath, java.util.Map map, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        d17 = (i18 & 2) != 0 ? 0.0d : d17;
        fileName = (i18 & 4) != 0 ? "" : fileName;
        filePath = (i18 & 8) != 0 ? "" : filePath;
        map = (i18 & 16) != 0 ? null : map;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f451146a = i17;
        this.f451147b = d17;
        this.f451148c = fileName;
        this.f451149d = filePath;
        this.f451150e = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x03.u1)) {
            return false;
        }
        x03.u1 u1Var = (x03.u1) obj;
        return this.f451146a == u1Var.f451146a && java.lang.Double.compare(this.f451147b, u1Var.f451147b) == 0 && kotlin.jvm.internal.o.b(this.f451148c, u1Var.f451148c) && kotlin.jvm.internal.o.b(this.f451149d, u1Var.f451149d) && kotlin.jvm.internal.o.b(this.f451150e, u1Var.f451150e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f451146a) * 31) + java.lang.Double.hashCode(this.f451147b)) * 31) + this.f451148c.hashCode()) * 31) + this.f451149d.hashCode()) * 31;
        java.util.Map map = this.f451150e;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public java.lang.String toString() {
        return "M3U8SegmentInfo(sequenceNumber=" + this.f451146a + ", duration=" + this.f451147b + ", fileName=" + this.f451148c + ", filePath=" + this.f451149d + ", dicXKeyParams=" + this.f451150e + ')';
    }
}

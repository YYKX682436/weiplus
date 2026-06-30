package ha3;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f279900a;

    /* renamed from: b, reason: collision with root package name */
    public double f279901b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f279902c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f279903d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f279904e;

    public m0(int i17, double d17, java.lang.String fileName, java.lang.String filePath, java.util.Map map, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        d17 = (i18 & 2) != 0 ? 0.0d : d17;
        fileName = (i18 & 4) != 0 ? "" : fileName;
        filePath = (i18 & 8) != 0 ? "" : filePath;
        map = (i18 & 16) != 0 ? null : map;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f279900a = i17;
        this.f279901b = d17;
        this.f279902c = fileName;
        this.f279903d = filePath;
        this.f279904e = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha3.m0)) {
            return false;
        }
        ha3.m0 m0Var = (ha3.m0) obj;
        return this.f279900a == m0Var.f279900a && java.lang.Double.compare(this.f279901b, m0Var.f279901b) == 0 && kotlin.jvm.internal.o.b(this.f279902c, m0Var.f279902c) && kotlin.jvm.internal.o.b(this.f279903d, m0Var.f279903d) && kotlin.jvm.internal.o.b(this.f279904e, m0Var.f279904e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f279900a) * 31) + java.lang.Double.hashCode(this.f279901b)) * 31) + this.f279902c.hashCode()) * 31) + this.f279903d.hashCode()) * 31;
        java.util.Map map = this.f279904e;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public java.lang.String toString() {
        return "M3U8SegmentInfo(sequenceNumber=" + this.f279900a + ", duration=" + this.f279901b + ", fileName=" + this.f279902c + ", filePath=" + this.f279903d + ", dicXKeyParams=" + this.f279904e + ')';
    }
}

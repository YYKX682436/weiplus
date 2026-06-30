package yj;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f462625a;

    /* renamed from: b, reason: collision with root package name */
    public int f462626b;

    /* renamed from: c, reason: collision with root package name */
    public int f462627c;

    /* renamed from: d, reason: collision with root package name */
    public int f462628d;

    /* renamed from: e, reason: collision with root package name */
    public int f462629e;

    public a(com.tencent.mm.protobuf.g reportLink, int i17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        reportLink = (i28 & 1) != 0 ? com.tencent.mm.protobuf.g.c("") : reportLink;
        i17 = (i28 & 2) != 0 ? 0 : i17;
        i18 = (i28 & 4) != 0 ? 0 : i18;
        i19 = (i28 & 8) != 0 ? 0 : i19;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        kotlin.jvm.internal.o.g(reportLink, "reportLink");
        this.f462625a = reportLink;
        this.f462626b = i17;
        this.f462627c = i18;
        this.f462628d = i19;
        this.f462629e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj.a)) {
            return false;
        }
        yj.a aVar = (yj.a) obj;
        return kotlin.jvm.internal.o.b(this.f462625a, aVar.f462625a) && this.f462626b == aVar.f462626b && this.f462627c == aVar.f462627c && this.f462628d == aVar.f462628d && this.f462629e == aVar.f462629e;
    }

    public int hashCode() {
        return (((((((this.f462625a.hashCode() * 31) + java.lang.Integer.hashCode(this.f462626b)) * 31) + java.lang.Integer.hashCode(this.f462627c)) * 31) + java.lang.Integer.hashCode(this.f462628d)) * 31) + java.lang.Integer.hashCode(this.f462629e);
    }

    public java.lang.String toString() {
        return "ReportProcessData(reportLink=" + this.f462625a + ", notDisplayAdReason=" + this.f462626b + ", clickPosId=" + this.f462627c + ", exposeType=" + this.f462628d + ", exposeTime=" + this.f462629e + ')';
    }
}

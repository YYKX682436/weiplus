package y00;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f458545a;

    /* renamed from: b, reason: collision with root package name */
    public final long f458546b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f458547c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f458548d;

    public s(java.lang.String talker, long j17, java.util.List products, java.lang.String reportExtraInfoJson) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(products, "products");
        kotlin.jvm.internal.o.g(reportExtraInfoJson, "reportExtraInfoJson");
        this.f458545a = talker;
        this.f458546b = j17;
        this.f458547c = products;
        this.f458548d = reportExtraInfoJson;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00.s)) {
            return false;
        }
        y00.s sVar = (y00.s) obj;
        return kotlin.jvm.internal.o.b(this.f458545a, sVar.f458545a) && this.f458546b == sVar.f458546b && kotlin.jvm.internal.o.b(this.f458547c, sVar.f458547c) && kotlin.jvm.internal.o.b(this.f458548d, sVar.f458548d);
    }

    public int hashCode() {
        return (((((this.f458545a.hashCode() * 31) + java.lang.Long.hashCode(this.f458546b)) * 31) + this.f458547c.hashCode()) * 31) + this.f458548d.hashCode();
    }

    public java.lang.String toString() {
        return "EcsKfProductCardRequest(talker=" + this.f458545a + ", msgSvrId=" + this.f458546b + ", products=" + this.f458547c + ", reportExtraInfoJson=" + this.f458548d + ')';
    }
}

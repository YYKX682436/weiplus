package or0;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f347441a;

    /* renamed from: b, reason: collision with root package name */
    public long f347442b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f347443c;

    /* renamed from: d, reason: collision with root package name */
    public long f347444d;

    public d(long j17, long j18, long j19, java.lang.String str, long j27, int i17, kotlin.jvm.internal.i iVar) {
        j27 = (i17 & 16) != 0 ? 0L : j27;
        this.f347441a = j17;
        this.f347442b = j18;
        this.f347443c = str;
        this.f347444d = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or0.d)) {
            return false;
        }
        or0.d dVar = (or0.d) obj;
        return this.f347441a == dVar.f347441a && this.f347442b == dVar.f347442b && kotlin.jvm.internal.o.b(this.f347443c, dVar.f347443c) && this.f347444d == dVar.f347444d;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f347441a) * 31) + java.lang.Long.hashCode(this.f347442b)) * 31) + java.lang.Long.hashCode(1000L)) * 31;
        java.lang.String str = this.f347443c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f347444d);
    }

    public java.lang.String toString() {
        return "CameraAnalyseStruct(startTime=" + this.f347441a + ", count=" + this.f347442b + ", interval=1000, tag=" + this.f347443c + ", average=" + this.f347444d + ')';
    }
}

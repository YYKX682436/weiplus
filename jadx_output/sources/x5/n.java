package x5;

/* loaded from: classes14.dex */
public final class n extends x5.f {

    /* renamed from: a, reason: collision with root package name */
    public final x36.m f451959a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f451960b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.d f451961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x36.m source, java.lang.String str, v5.d dataSource) {
        super(null);
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        this.f451959a = source;
        this.f451960b = str;
        this.f451961c = dataSource;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5.n)) {
            return false;
        }
        x5.n nVar = (x5.n) obj;
        return kotlin.jvm.internal.o.b(this.f451959a, nVar.f451959a) && kotlin.jvm.internal.o.b(this.f451960b, nVar.f451960b) && this.f451961c == nVar.f451961c;
    }

    public int hashCode() {
        int hashCode = this.f451959a.hashCode() * 31;
        java.lang.String str = this.f451960b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f451961c.hashCode();
    }

    public java.lang.String toString() {
        return "SourceResult(source=" + this.f451959a + ", mimeType=" + ((java.lang.Object) this.f451960b) + ", dataSource=" + this.f451961c + ')';
    }
}

package ns5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f339692a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONArray f339693b;

    public a(java.lang.String detectorSource, org.json.JSONArray traceDump) {
        kotlin.jvm.internal.o.g(detectorSource, "detectorSource");
        kotlin.jvm.internal.o.g(traceDump, "traceDump");
        this.f339692a = detectorSource;
        this.f339693b = traceDump;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns5.a)) {
            return false;
        }
        ns5.a aVar = (ns5.a) obj;
        return kotlin.jvm.internal.o.b(this.f339692a, aVar.f339692a) && kotlin.jvm.internal.o.b(this.f339693b, aVar.f339693b);
    }

    public int hashCode() {
        return (this.f339692a.hashCode() * 31) + this.f339693b.hashCode();
    }

    public java.lang.String toString() {
        return "DetectParams(detectorSource=" + this.f339692a + ", traceDump=" + this.f339693b + ')';
    }
}

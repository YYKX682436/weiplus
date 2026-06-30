package dx;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f244418a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f244419b;

    public b(java.util.Collection mbJsApiSet, java.util.Collection appBrandJsApi) {
        kotlin.jvm.internal.o.g(mbJsApiSet, "mbJsApiSet");
        kotlin.jvm.internal.o.g(appBrandJsApi, "appBrandJsApi");
        this.f244418a = mbJsApiSet;
        this.f244419b = appBrandJsApi;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx.b)) {
            return false;
        }
        dx.b bVar = (dx.b) obj;
        return kotlin.jvm.internal.o.b(this.f244418a, bVar.f244418a) && kotlin.jvm.internal.o.b(this.f244419b, bVar.f244419b);
    }

    public int hashCode() {
        return (this.f244418a.hashCode() * 31) + this.f244419b.hashCode();
    }

    public java.lang.String toString() {
        return "MagicBrandServiceJsApiGroup(mbJsApiSet=" + this.f244418a + ", appBrandJsApi=" + this.f244419b + ')';
    }
}

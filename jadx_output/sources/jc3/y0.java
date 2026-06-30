package jc3;

/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Collection f299012a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Collection f299013b;

    public y0(java.util.Collection mbJsApiSet, java.util.Collection appBrandJsApi) {
        kotlin.jvm.internal.o.g(mbJsApiSet, "mbJsApiSet");
        kotlin.jvm.internal.o.g(appBrandJsApi, "appBrandJsApi");
        this.f299012a = mbJsApiSet;
        this.f299013b = appBrandJsApi;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3.y0)) {
            return false;
        }
        jc3.y0 y0Var = (jc3.y0) obj;
        return kotlin.jvm.internal.o.b(this.f299012a, y0Var.f299012a) && kotlin.jvm.internal.o.b(this.f299013b, y0Var.f299013b);
    }

    public int hashCode() {
        return (this.f299012a.hashCode() * 31) + this.f299013b.hashCode();
    }

    public java.lang.String toString() {
        return "MagicBushJsApiGroup(mbJsApiSet=" + this.f299012a + ", appBrandJsApi=" + this.f299013b + ')';
    }
}

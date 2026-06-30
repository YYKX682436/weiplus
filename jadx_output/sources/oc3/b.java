package oc3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344329a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f344330b;

    public b(java.lang.String version, java.lang.String provider) {
        kotlin.jvm.internal.o.g(version, "version");
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f344329a = version;
        this.f344330b = provider;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3.b)) {
            return false;
        }
        oc3.b bVar = (oc3.b) obj;
        return kotlin.jvm.internal.o.b(this.f344329a, bVar.f344329a) && kotlin.jvm.internal.o.b(this.f344330b, bVar.f344330b);
    }

    public int hashCode() {
        return (this.f344329a.hashCode() * 31) + this.f344330b.hashCode();
    }

    public java.lang.String toString() {
        return "MBBizConfigProviderInfo(version=" + this.f344329a + ", provider=" + this.f344330b + ')';
    }
}

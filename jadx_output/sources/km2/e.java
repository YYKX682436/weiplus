package km2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f309091b;

    public e(java.lang.String path, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f309090a = path;
        this.f309091b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.e)) {
            return false;
        }
        km2.e eVar = (km2.e) obj;
        return kotlin.jvm.internal.o.b(this.f309090a, eVar.f309090a) && this.f309091b == eVar.f309091b;
    }

    public int hashCode() {
        return (this.f309090a.hashCode() * 31) + java.lang.Integer.hashCode(this.f309091b);
    }

    public java.lang.String toString() {
        return "LocalSelectCache(path=" + this.f309090a + ", updateTime=" + this.f309091b + ')';
    }
}

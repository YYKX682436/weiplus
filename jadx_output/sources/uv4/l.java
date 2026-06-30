package uv4;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f431438a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f431439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f431440c;

    public l(int i17, java.lang.String location, boolean z17) {
        kotlin.jvm.internal.o.g(location, "location");
        this.f431438a = i17;
        this.f431439b = location;
        this.f431440c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv4.l)) {
            return false;
        }
        uv4.l lVar = (uv4.l) obj;
        return this.f431438a == lVar.f431438a && kotlin.jvm.internal.o.b(this.f431439b, lVar.f431439b) && this.f431440c == lVar.f431440c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f431438a) * 31) + this.f431439b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f431440c);
    }

    public java.lang.String toString() {
        return "VersionInfo(version=" + this.f431438a + ", location=" + this.f431439b + ", isRootDir=" + this.f431440c + ')';
    }
}

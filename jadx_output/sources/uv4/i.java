package uv4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f431435a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f431436b;

    public i(int i17, boolean z17) {
        this.f431435a = i17;
        this.f431436b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv4.i)) {
            return false;
        }
        uv4.i iVar = (uv4.i) obj;
        return this.f431435a == iVar.f431435a && this.f431436b == iVar.f431436b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f431435a) * 31) + java.lang.Boolean.hashCode(this.f431436b);
    }

    public java.lang.String toString() {
        return "VersionLocation(version=" + this.f431435a + ", isInRootDir=" + this.f431436b + ')';
    }
}

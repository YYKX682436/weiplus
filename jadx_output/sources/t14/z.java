package t14;

/* loaded from: classes11.dex */
public final class z extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f414604b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f414605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f414606d;

    public z(java.lang.String viewId, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        this.f414604b = viewId;
        this.f414605c = str;
        this.f414606d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t14.z)) {
            return false;
        }
        t14.z zVar = (t14.z) obj;
        return kotlin.jvm.internal.o.b(this.f414604b, zVar.f414604b) && kotlin.jvm.internal.o.b(this.f414605c, zVar.f414605c) && this.f414606d == zVar.f414606d;
    }

    public int hashCode() {
        int hashCode = this.f414604b.hashCode() * 31;
        java.lang.String str = this.f414605c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f414606d);
    }

    public java.lang.String toString() {
        return "UpdatePreferenceSelectInfoAction(viewId=" + this.f414604b + ", selectInfo=" + this.f414605c + ", reportType=" + this.f414606d + ')';
    }
}

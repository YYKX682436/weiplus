package km2;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309164a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309165b;

    public n0(java.lang.String str, java.lang.String str2) {
        this.f309164a = str;
        this.f309165b = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.n0)) {
            return false;
        }
        km2.n0 n0Var = (km2.n0) obj;
        return kotlin.jvm.internal.o.b(this.f309164a, n0Var.f309164a) && kotlin.jvm.internal.o.b(this.f309165b, n0Var.f309165b);
    }

    public int hashCode() {
        java.lang.String str = this.f309164a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f309165b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ScreenDeviceData(displayName=" + this.f309164a + ", id=" + this.f309165b + ')';
    }
}

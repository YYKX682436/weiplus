package m92;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f324987a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f324988b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f324989c;

    public i(int i17, java.lang.String str, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        str = (i18 & 2) != 0 ? null : str;
        z17 = (i18 & 4) != 0 ? false : z17;
        this.f324987a = i17;
        this.f324988b = str;
        this.f324989c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m92.i)) {
            return false;
        }
        m92.i iVar = (m92.i) obj;
        return this.f324987a == iVar.f324987a && kotlin.jvm.internal.o.b(this.f324988b, iVar.f324988b) && this.f324989c == iVar.f324989c;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f324987a) * 31;
        java.lang.String str = this.f324988b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f324989c);
    }

    public java.lang.String toString() {
        return "FinderUserLogOutInfo(logOutFlag=" + this.f324987a + ", logOutUrl=" + this.f324988b + ", hasLogOut=" + this.f324989c + ')';
    }
}

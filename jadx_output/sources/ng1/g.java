package ng1;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f336925a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f336926b;

    /* renamed from: c, reason: collision with root package name */
    public final k91.d5 f336927c;

    public g(java.lang.String str, java.lang.String str2, k91.d5 cgiSyncExtraParams) {
        kotlin.jvm.internal.o.g(cgiSyncExtraParams, "cgiSyncExtraParams");
        this.f336925a = str;
        this.f336926b = str2;
        this.f336927c = cgiSyncExtraParams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.g)) {
            return false;
        }
        ng1.g gVar = (ng1.g) obj;
        return kotlin.jvm.internal.o.b(this.f336925a, gVar.f336925a) && kotlin.jvm.internal.o.b(this.f336926b, gVar.f336926b) && kotlin.jvm.internal.o.b(this.f336927c, gVar.f336927c);
    }

    public int hashCode() {
        java.lang.String str = this.f336925a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f336926b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f336927c.hashCode();
    }

    public java.lang.String toString() {
        return "WAContactFetcherParams(username=" + this.f336925a + ", appId=" + this.f336926b + ", cgiSyncExtraParams=" + this.f336927c + ')';
    }
}

package kn0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309596a;

    /* renamed from: b, reason: collision with root package name */
    public int f309597b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309598c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f309599d;

    public r(java.lang.String url, int i17, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f309596a = url;
        this.f309597b = i17;
        this.f309598c = str;
        this.f309599d = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.r)) {
            return false;
        }
        kn0.r rVar = (kn0.r) obj;
        return kotlin.jvm.internal.o.b(this.f309596a, rVar.f309596a) && this.f309597b == rVar.f309597b && kotlin.jvm.internal.o.b(this.f309598c, rVar.f309598c) && kotlin.jvm.internal.o.b(this.f309599d, rVar.f309599d);
    }

    public int hashCode() {
        int hashCode = ((this.f309596a.hashCode() * 31) + java.lang.Integer.hashCode(this.f309597b)) * 31;
        java.lang.String str = this.f309598c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f309599d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "url:" + this.f309596a + ", level:" + this.f309597b + ", desc:" + this.f309598c + " backUrl: " + this.f309599d;
    }
}

package d12;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f225715a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f225716b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f225717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f225718d;

    /* renamed from: e, reason: collision with root package name */
    public final int f225719e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225720f;

    public b(java.lang.String keyword, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.String str3, int i18, kotlin.jvm.internal.i iVar) {
        keyword = (i18 & 1) != 0 ? "" : keyword;
        str = (i18 & 2) != 0 ? null : str;
        str2 = (i18 & 4) != 0 ? null : str2;
        z17 = (i18 & 8) != 0 ? false : z17;
        i17 = (i18 & 16) != 0 ? 10 : i17;
        str3 = (i18 & 32) != 0 ? null : str3;
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f225715a = keyword;
        this.f225716b = str;
        this.f225717c = str2;
        this.f225718d = z17;
        this.f225719e = i17;
        this.f225720f = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d12.b)) {
            return false;
        }
        d12.b bVar = (d12.b) obj;
        return kotlin.jvm.internal.o.b(this.f225715a, bVar.f225715a) && kotlin.jvm.internal.o.b(this.f225716b, bVar.f225716b) && kotlin.jvm.internal.o.b(this.f225717c, bVar.f225717c) && this.f225718d == bVar.f225718d && this.f225719e == bVar.f225719e && kotlin.jvm.internal.o.b(this.f225720f, bVar.f225720f);
    }

    public int hashCode() {
        int hashCode = this.f225715a.hashCode() * 31;
        java.lang.String str = this.f225716b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f225717c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f225718d)) * 31) + java.lang.Integer.hashCode(this.f225719e)) * 31;
        java.lang.String str3 = this.f225720f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LuckyBagInfo(keyword=" + this.f225715a + ", traceId=" + this.f225716b + ", appId=" + this.f225717c + ", hasLuckyBag=" + this.f225718d + ", interval=" + this.f225719e + ", url=" + this.f225720f + ')';
    }
}

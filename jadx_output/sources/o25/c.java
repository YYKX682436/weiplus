package o25;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f342481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342482b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f342483c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f342484d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f342485e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f342486f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f342487g;

    public c(java.util.List coverUrls, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.o.g(coverUrls, "coverUrls");
        this.f342481a = coverUrls;
        this.f342482b = i17;
        this.f342483c = str;
        this.f342484d = str2;
        this.f342485e = str3;
        this.f342486f = str4;
        this.f342487g = str5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o25.c)) {
            return false;
        }
        o25.c cVar = (o25.c) obj;
        return kotlin.jvm.internal.o.b(this.f342481a, cVar.f342481a) && this.f342482b == cVar.f342482b && kotlin.jvm.internal.o.b(this.f342483c, cVar.f342483c) && kotlin.jvm.internal.o.b(this.f342484d, cVar.f342484d) && kotlin.jvm.internal.o.b(this.f342485e, cVar.f342485e) && kotlin.jvm.internal.o.b(this.f342486f, cVar.f342486f) && kotlin.jvm.internal.o.b(this.f342487g, cVar.f342487g);
    }

    public int hashCode() {
        int hashCode = ((this.f342481a.hashCode() * 31) + java.lang.Integer.hashCode(this.f342482b)) * 31;
        java.lang.String str = this.f342483c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f342484d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f342485e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f342486f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f342487g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CoverFields(coverUrls=" + this.f342481a + ", coversDisplayMode=" + this.f342482b + ", cover=" + this.f342483c + ", cover11=" + this.f342484d + ", cover34=" + this.f342485e + ", cover1235=" + this.f342486f + ", cover169=" + this.f342487g + ')';
    }
}

package d71;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f226868a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f226869b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f226870c;

    /* renamed from: d, reason: collision with root package name */
    public final int f226871d;

    /* renamed from: e, reason: collision with root package name */
    public final int f226872e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f226873f;

    public a(java.lang.String str, java.lang.String str2, java.util.List arrayFormats, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(arrayFormats, "arrayFormats");
        this.f226868a = str;
        this.f226869b = str2;
        this.f226870c = arrayFormats;
        this.f226871d = i17;
        this.f226872e = i18;
        this.f226873f = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71.a)) {
            return false;
        }
        d71.a aVar = (d71.a) obj;
        return kotlin.jvm.internal.o.b(this.f226868a, aVar.f226868a) && kotlin.jvm.internal.o.b(this.f226869b, aVar.f226869b) && kotlin.jvm.internal.o.b(this.f226870c, aVar.f226870c) && this.f226871d == aVar.f226871d && this.f226872e == aVar.f226872e && this.f226873f == aVar.f226873f;
    }

    public int hashCode() {
        java.lang.String str = this.f226868a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f226869b;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f226870c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f226871d)) * 31) + java.lang.Integer.hashCode(this.f226872e)) * 31) + java.lang.Boolean.hashCode(this.f226873f);
    }

    public java.lang.String toString() {
        return "CountryFormatConfig(nsCountryCode=" + this.f226868a + ", nsISOCode=" + this.f226869b + ", arrayFormats=" + this.f226870c + ", uiMinLength=" + this.f226871d + ", uiMaxLength=" + this.f226872e + ", bHasLeading=" + this.f226873f + ')';
    }
}

package d71;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f226874a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f226875b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f226876c;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        str2 = (i17 & 2) != 0 ? null : str2;
        str3 = (i17 & 4) != 0 ? null : str3;
        this.f226874a = str;
        this.f226875b = str2;
        this.f226876c = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71.b)) {
            return false;
        }
        d71.b bVar = (d71.b) obj;
        return kotlin.jvm.internal.o.b(this.f226874a, bVar.f226874a) && kotlin.jvm.internal.o.b(this.f226875b, bVar.f226875b) && kotlin.jvm.internal.o.b(this.f226876c, bVar.f226876c);
    }

    public int hashCode() {
        java.lang.String str = this.f226874a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f226875b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f226876c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PhoneNumberFormatInfo(leadingDigitsRegex=" + this.f226874a + ", pattern=" + this.f226875b + ", formatRegex=" + this.f226876c + ')';
    }
}

package n4;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334856a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f334857b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334858c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334859d;

    /* renamed from: e, reason: collision with root package name */
    public final int f334860e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334861f;

    /* renamed from: g, reason: collision with root package name */
    public final int f334862g;

    public c(java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.String str3, int i18) {
        this.f334856a = str;
        this.f334857b = str2;
        this.f334859d = z17;
        this.f334860e = i17;
        int i19 = 5;
        if (str2 != null) {
            java.lang.String upperCase = str2.toUpperCase(java.util.Locale.US);
            if (upperCase.contains("INT")) {
                i19 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i19 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i19 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f334858c = i19;
        this.f334861f = str3;
        this.f334862g = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.c.class != obj.getClass()) {
            return false;
        }
        n4.c cVar = (n4.c) obj;
        if (this.f334860e != cVar.f334860e || !this.f334856a.equals(cVar.f334856a) || this.f334859d != cVar.f334859d) {
            return false;
        }
        java.lang.String str = this.f334861f;
        int i17 = this.f334862g;
        int i18 = cVar.f334862g;
        java.lang.String str2 = cVar.f334861f;
        if (i17 == 1 && i18 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i17 != 2 || i18 != 1 || str2 == null || str2.equals(str)) {
            return (i17 == 0 || i17 != i18 || (str == null ? str2 == null : str.equals(str2))) && this.f334858c == cVar.f334858c;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f334856a.hashCode() * 31) + this.f334858c) * 31) + (this.f334859d ? 1231 : 1237)) * 31) + this.f334860e;
    }

    public java.lang.String toString() {
        return "Column{name='" + this.f334856a + "', type='" + this.f334857b + "', affinity='" + this.f334858c + "', notNull=" + this.f334859d + ", primaryKeyPosition=" + this.f334860e + ", defaultValue='" + this.f334861f + "'}";
    }
}

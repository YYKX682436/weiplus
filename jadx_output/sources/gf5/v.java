package gf5;

/* loaded from: classes11.dex */
public final class v implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f271457a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f271458b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f271459c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f271460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f271461e;

    /* renamed from: f, reason: collision with root package name */
    public final int f271462f;

    public v(java.util.List prefixes, gf5.z tokenType, java.lang.String str, java.util.Set bodyChars, boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 4) != 0 ? null : str;
        bodyChars = (i18 & 8) != 0 ? kz5.r0.f314002d : bodyChars;
        z17 = (i18 & 16) != 0 ? true : z17;
        i17 = (i18 & 32) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(prefixes, "prefixes");
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        kotlin.jvm.internal.o.g(bodyChars, "bodyChars");
        this.f271457a = prefixes;
        this.f271458b = tokenType;
        this.f271459c = str;
        this.f271460d = bodyChars;
        this.f271461e = z17;
        this.f271462f = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.v)) {
            return false;
        }
        gf5.v vVar = (gf5.v) obj;
        return kotlin.jvm.internal.o.b(this.f271457a, vVar.f271457a) && this.f271458b == vVar.f271458b && kotlin.jvm.internal.o.b(this.f271459c, vVar.f271459c) && kotlin.jvm.internal.o.b(this.f271460d, vVar.f271460d) && this.f271461e == vVar.f271461e && this.f271462f == vVar.f271462f;
    }

    public int hashCode() {
        int hashCode = ((this.f271457a.hashCode() * 31) + this.f271458b.hashCode()) * 31;
        java.lang.String str = this.f271459c;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f271460d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f271461e)) * 31) + java.lang.Integer.hashCode(this.f271462f);
    }

    public java.lang.String toString() {
        return "PrefixedSpanSyntaxRule(prefixes=" + this.f271457a + ", tokenType=" + this.f271458b + ", suffix=" + this.f271459c + ", bodyChars=" + this.f271460d + ", useIdentifierRules=" + this.f271461e + ", priority=" + this.f271462f + ')';
    }
}

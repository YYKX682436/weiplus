package gf5;

/* loaded from: classes11.dex */
public final class f implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f271390a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f271391b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f271392c;

    /* renamed from: d, reason: collision with root package name */
    public final int f271393d;

    public f(java.util.List prefixes, gf5.z tokenType, boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(prefixes, "prefixes");
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        this.f271390a = prefixes;
        this.f271391b = tokenType;
        this.f271392c = z17;
        this.f271393d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.f)) {
            return false;
        }
        gf5.f fVar = (gf5.f) obj;
        return kotlin.jvm.internal.o.b(this.f271390a, fVar.f271390a) && this.f271391b == fVar.f271391b && this.f271392c == fVar.f271392c && this.f271393d == fVar.f271393d;
    }

    public int hashCode() {
        return (((((this.f271390a.hashCode() * 31) + this.f271391b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f271392c)) * 31) + java.lang.Integer.hashCode(this.f271393d);
    }

    public java.lang.String toString() {
        return "DiffLineSyntaxRule(prefixes=" + this.f271390a + ", tokenType=" + this.f271391b + ", trimLeadingWhitespace=" + this.f271392c + ", priority=" + this.f271393d + ')';
    }
}

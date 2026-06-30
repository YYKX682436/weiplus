package gf5;

/* loaded from: classes11.dex */
public final class r implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f271437a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f271438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f271439c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f271440d;

    /* renamed from: e, reason: collision with root package name */
    public final gf5.q f271441e;

    /* renamed from: f, reason: collision with root package name */
    public final int f271442f;

    public r(java.util.List prefixes, gf5.z tokenType, boolean z17, java.lang.Integer num, gf5.q behavior, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 4) != 0 ? true : z17;
        num = (i18 & 8) != 0 ? null : num;
        behavior = (i18 & 16) != 0 ? gf5.q.f271434d : behavior;
        i17 = (i18 & 32) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(prefixes, "prefixes");
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        kotlin.jvm.internal.o.g(behavior, "behavior");
        this.f271437a = prefixes;
        this.f271438b = tokenType;
        this.f271439c = z17;
        this.f271440d = num;
        this.f271441e = behavior;
        this.f271442f = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.r)) {
            return false;
        }
        gf5.r rVar = (gf5.r) obj;
        return kotlin.jvm.internal.o.b(this.f271437a, rVar.f271437a) && this.f271438b == rVar.f271438b && this.f271439c == rVar.f271439c && kotlin.jvm.internal.o.b(this.f271440d, rVar.f271440d) && this.f271441e == rVar.f271441e && this.f271442f == rVar.f271442f;
    }

    public int hashCode() {
        int hashCode = ((((this.f271437a.hashCode() * 31) + this.f271438b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f271439c)) * 31;
        java.lang.Integer num = this.f271440d;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f271441e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f271442f);
    }

    public java.lang.String toString() {
        return "LineMatchSyntaxRule(prefixes=" + this.f271437a + ", tokenType=" + this.f271438b + ", trimLeadingWhitespace=" + this.f271439c + ", lineIndex=" + this.f271440d + ", behavior=" + this.f271441e + ", priority=" + this.f271442f + ')';
    }
}

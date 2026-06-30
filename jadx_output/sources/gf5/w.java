package gf5;

/* loaded from: classes11.dex */
public final class w implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f271463a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f271464b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.z f271465c;

    /* renamed from: d, reason: collision with root package name */
    public final int f271466d;

    public w(java.util.List prefixes, gf5.z markerTokenType, gf5.z directiveTokenType, int i17, int i18, kotlin.jvm.internal.i iVar) {
        markerTokenType = (i18 & 2) != 0 ? gf5.z.f271477n : markerTokenType;
        directiveTokenType = (i18 & 4) != 0 ? gf5.z.f271470d : directiveTokenType;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(prefixes, "prefixes");
        kotlin.jvm.internal.o.g(markerTokenType, "markerTokenType");
        kotlin.jvm.internal.o.g(directiveTokenType, "directiveTokenType");
        this.f271463a = prefixes;
        this.f271464b = markerTokenType;
        this.f271465c = directiveTokenType;
        this.f271466d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.w)) {
            return false;
        }
        gf5.w wVar = (gf5.w) obj;
        return kotlin.jvm.internal.o.b(this.f271463a, wVar.f271463a) && this.f271464b == wVar.f271464b && this.f271465c == wVar.f271465c && this.f271466d == wVar.f271466d;
    }

    public int hashCode() {
        return (((((this.f271463a.hashCode() * 31) + this.f271464b.hashCode()) * 31) + this.f271465c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f271466d);
    }

    public java.lang.String toString() {
        return "PreprocessorSyntaxRule(prefixes=" + this.f271463a + ", markerTokenType=" + this.f271464b + ", directiveTokenType=" + this.f271465c + ", priority=" + this.f271466d + ')';
    }
}

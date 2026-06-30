package gf5;

/* loaded from: classes11.dex */
public final class a implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271366a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271367b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.z f271368c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f271369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f271370e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f271371f;

    /* renamed from: g, reason: collision with root package name */
    public final int f271372g;

    public a(java.lang.String start, java.lang.String end, gf5.z tokenType, boolean z17, boolean z18, boolean z19, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 8) != 0 ? true : z17;
        z18 = (i18 & 16) != 0 ? true : z18;
        z19 = (i18 & 32) != 0 ? false : z19;
        i17 = (i18 & 64) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(end, "end");
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        this.f271366a = start;
        this.f271367b = end;
        this.f271368c = tokenType;
        this.f271369d = z17;
        this.f271370e = z18;
        this.f271371f = z19;
        this.f271372g = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.a)) {
            return false;
        }
        gf5.a aVar = (gf5.a) obj;
        return kotlin.jvm.internal.o.b(this.f271366a, aVar.f271366a) && kotlin.jvm.internal.o.b(this.f271367b, aVar.f271367b) && this.f271368c == aVar.f271368c && this.f271369d == aVar.f271369d && this.f271370e == aVar.f271370e && this.f271371f == aVar.f271371f && this.f271372g == aVar.f271372g;
    }

    public int hashCode() {
        return (((((((((((this.f271366a.hashCode() * 31) + this.f271367b.hashCode()) * 31) + this.f271368c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f271369d)) * 31) + java.lang.Boolean.hashCode(this.f271370e)) * 31) + java.lang.Boolean.hashCode(this.f271371f)) * 31) + java.lang.Integer.hashCode(this.f271372g);
    }

    public java.lang.String toString() {
        return "DelimitedSyntaxRule(start=" + this.f271366a + ", end=" + this.f271367b + ", tokenType=" + this.f271368c + ", multiline=" + this.f271369d + ", supportsEscape=" + this.f271370e + ", nestable=" + this.f271371f + ", priority=" + this.f271372g + ')';
    }
}

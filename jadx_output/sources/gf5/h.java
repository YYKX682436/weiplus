package gf5;

/* loaded from: classes11.dex */
public final class h implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f271396a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f271397b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f271398c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f271399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f271400e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f271401f;

    /* renamed from: g, reason: collision with root package name */
    public final int f271402g;

    public h(java.util.List separators, gf5.z keyTokenType, boolean z17, java.util.List linePrefixesToSkip, java.util.Set bodyChars, boolean z18, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 4) != 0 ? true : z17;
        linePrefixesToSkip = (i18 & 8) != 0 ? kz5.p0.f313996d : linePrefixesToSkip;
        bodyChars = (i18 & 16) != 0 ? kz5.r0.f314002d : bodyChars;
        z18 = (i18 & 32) != 0 ? true : z18;
        i17 = (i18 & 64) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(separators, "separators");
        kotlin.jvm.internal.o.g(keyTokenType, "keyTokenType");
        kotlin.jvm.internal.o.g(linePrefixesToSkip, "linePrefixesToSkip");
        kotlin.jvm.internal.o.g(bodyChars, "bodyChars");
        this.f271396a = separators;
        this.f271397b = keyTokenType;
        this.f271398c = z17;
        this.f271399d = linePrefixesToSkip;
        this.f271400e = bodyChars;
        this.f271401f = z18;
        this.f271402g = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.h)) {
            return false;
        }
        gf5.h hVar = (gf5.h) obj;
        return kotlin.jvm.internal.o.b(this.f271396a, hVar.f271396a) && this.f271397b == hVar.f271397b && this.f271398c == hVar.f271398c && kotlin.jvm.internal.o.b(this.f271399d, hVar.f271399d) && kotlin.jvm.internal.o.b(this.f271400e, hVar.f271400e) && this.f271401f == hVar.f271401f && this.f271402g == hVar.f271402g;
    }

    public int hashCode() {
        return (((((((((((this.f271396a.hashCode() * 31) + this.f271397b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f271398c)) * 31) + this.f271399d.hashCode()) * 31) + this.f271400e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f271401f)) * 31) + java.lang.Integer.hashCode(this.f271402g);
    }

    public java.lang.String toString() {
        return "KeyValueSyntaxRule(separators=" + this.f271396a + ", keyTokenType=" + this.f271397b + ", trimLeadingWhitespace=" + this.f271398c + ", linePrefixesToSkip=" + this.f271399d + ", bodyChars=" + this.f271400e + ", useIdentifierRules=" + this.f271401f + ", priority=" + this.f271402g + ')';
    }
}

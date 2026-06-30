package gf5;

/* loaded from: classes11.dex */
public final class s implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271443a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271444b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f271445c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f271446d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f271447e;

    /* renamed from: f, reason: collision with root package name */
    public final gf5.z f271448f;

    /* renamed from: g, reason: collision with root package name */
    public final gf5.z f271449g;

    /* renamed from: h, reason: collision with root package name */
    public final gf5.z f271450h;

    /* renamed from: i, reason: collision with root package name */
    public final int f271451i;

    public s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, gf5.z zVar, gf5.z zVar2, gf5.z zVar3, int i17, int i18, kotlin.jvm.internal.i iVar) {
        java.util.List attributeValueDelimiters;
        java.lang.String tagOpen = (i18 & 1) != 0 ? "<" : str;
        java.lang.String tagClose = (i18 & 2) != 0 ? ">" : str2;
        java.lang.String closingTagPrefix = (i18 & 4) != 0 ? "/" : str3;
        java.lang.String selfClosingMarker = (i18 & 8) == 0 ? str4 : "/";
        if ((i18 & 16) != 0) {
            gf5.z zVar4 = gf5.z.f271481r;
            attributeValueDelimiters = kz5.c0.i(new gf5.a("\"", "\"", zVar4, false, false, false, 0, 96, null), new gf5.a("'", "'", zVar4, false, false, false, 0, 96, null));
        } else {
            attributeValueDelimiters = list;
        }
        gf5.z tagNameTokenType = (i18 & 32) != 0 ? gf5.z.f271478o : zVar;
        gf5.z attributeNameTokenType = (i18 & 64) != 0 ? gf5.z.f271479p : zVar2;
        gf5.z delimiterTokenType = (i18 & 128) != 0 ? gf5.z.f271476m : zVar3;
        int i19 = (i18 & 256) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(tagOpen, "tagOpen");
        kotlin.jvm.internal.o.g(tagClose, "tagClose");
        kotlin.jvm.internal.o.g(closingTagPrefix, "closingTagPrefix");
        kotlin.jvm.internal.o.g(selfClosingMarker, "selfClosingMarker");
        kotlin.jvm.internal.o.g(attributeValueDelimiters, "attributeValueDelimiters");
        kotlin.jvm.internal.o.g(tagNameTokenType, "tagNameTokenType");
        kotlin.jvm.internal.o.g(attributeNameTokenType, "attributeNameTokenType");
        kotlin.jvm.internal.o.g(delimiterTokenType, "delimiterTokenType");
        this.f271443a = tagOpen;
        this.f271444b = tagClose;
        this.f271445c = closingTagPrefix;
        this.f271446d = selfClosingMarker;
        this.f271447e = attributeValueDelimiters;
        this.f271448f = tagNameTokenType;
        this.f271449g = attributeNameTokenType;
        this.f271450h = delimiterTokenType;
        this.f271451i = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.s)) {
            return false;
        }
        gf5.s sVar = (gf5.s) obj;
        return kotlin.jvm.internal.o.b(this.f271443a, sVar.f271443a) && kotlin.jvm.internal.o.b(this.f271444b, sVar.f271444b) && kotlin.jvm.internal.o.b(this.f271445c, sVar.f271445c) && kotlin.jvm.internal.o.b(this.f271446d, sVar.f271446d) && kotlin.jvm.internal.o.b(this.f271447e, sVar.f271447e) && this.f271448f == sVar.f271448f && this.f271449g == sVar.f271449g && this.f271450h == sVar.f271450h && this.f271451i == sVar.f271451i;
    }

    public int hashCode() {
        return (((((((((((((((this.f271443a.hashCode() * 31) + this.f271444b.hashCode()) * 31) + this.f271445c.hashCode()) * 31) + this.f271446d.hashCode()) * 31) + this.f271447e.hashCode()) * 31) + this.f271448f.hashCode()) * 31) + this.f271449g.hashCode()) * 31) + this.f271450h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f271451i);
    }

    public java.lang.String toString() {
        return "MarkupSyntaxRule(tagOpen=" + this.f271443a + ", tagClose=" + this.f271444b + ", closingTagPrefix=" + this.f271445c + ", selfClosingMarker=" + this.f271446d + ", attributeValueDelimiters=" + this.f271447e + ", tagNameTokenType=" + this.f271448f + ", attributeNameTokenType=" + this.f271449g + ", delimiterTokenType=" + this.f271450h + ", priority=" + this.f271451i + ')';
    }
}

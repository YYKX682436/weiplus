package xj;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454753a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f454754b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f454755c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f454756d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f454757e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f454758f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f454759g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f454760h;

    public m(java.lang.String aid, java.lang.String hintText, java.lang.String adDescText, java.lang.String iconUrl, java.lang.String iconUrlForDark, java.lang.String str, java.lang.Long l17, boolean z17) {
        kotlin.jvm.internal.o.g(aid, "aid");
        kotlin.jvm.internal.o.g(hintText, "hintText");
        kotlin.jvm.internal.o.g(adDescText, "adDescText");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(iconUrlForDark, "iconUrlForDark");
        this.f454753a = aid;
        this.f454754b = hintText;
        this.f454755c = adDescText;
        this.f454756d = iconUrl;
        this.f454757e = iconUrlForDark;
        this.f454758f = str;
        this.f454759g = l17;
        this.f454760h = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj.m)) {
            return false;
        }
        xj.m mVar = (xj.m) obj;
        return kotlin.jvm.internal.o.b(this.f454753a, mVar.f454753a) && kotlin.jvm.internal.o.b(this.f454754b, mVar.f454754b) && kotlin.jvm.internal.o.b(this.f454755c, mVar.f454755c) && kotlin.jvm.internal.o.b(this.f454756d, mVar.f454756d) && kotlin.jvm.internal.o.b(this.f454757e, mVar.f454757e) && kotlin.jvm.internal.o.b(this.f454758f, mVar.f454758f) && kotlin.jvm.internal.o.b(this.f454759g, mVar.f454759g) && this.f454760h == mVar.f454760h;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f454753a.hashCode() * 31) + this.f454754b.hashCode()) * 31) + this.f454755c.hashCode()) * 31) + this.f454756d.hashCode()) * 31) + this.f454757e.hashCode()) * 31;
        java.lang.String str = this.f454758f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.f454759g;
        return ((hashCode2 + (l17 != null ? l17.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f454760h);
    }

    public java.lang.String toString() {
        return "MagicAdInfo(aid=" + this.f454753a + ", hintText=" + this.f454754b + ", adDescText=" + this.f454755c + ", iconUrl=" + this.f454756d + ", iconUrlForDark=" + this.f454757e + ", pkgName=" + this.f454758f + ", applicationMinVersion=" + this.f454759g + ", matchLetActiveCondition=" + this.f454760h + ')';
    }
}

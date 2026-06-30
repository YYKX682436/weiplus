package zv4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f476462a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f476463b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f476464c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f476465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f476466e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f476467f;

    /* renamed from: g, reason: collision with root package name */
    public final int f476468g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f476469h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f476470i;

    /* renamed from: j, reason: collision with root package name */
    public final int f476471j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f476472k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f476473l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f476474m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f476475n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f476476o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f476477p;

    public i(java.lang.String query, java.lang.Integer num, java.lang.Integer num2, java.lang.String sessionId, java.lang.String searchId, java.lang.String subSessionId, int i17, java.lang.String extParams, java.lang.String placeHolder, int i18, boolean z17, boolean z18, java.lang.String forceUseThemeMode, boolean z19, boolean z27, java.lang.String title) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(subSessionId, "subSessionId");
        kotlin.jvm.internal.o.g(extParams, "extParams");
        kotlin.jvm.internal.o.g(placeHolder, "placeHolder");
        kotlin.jvm.internal.o.g(forceUseThemeMode, "forceUseThemeMode");
        kotlin.jvm.internal.o.g(title, "title");
        this.f476462a = query;
        this.f476463b = num;
        this.f476464c = num2;
        this.f476465d = sessionId;
        this.f476466e = searchId;
        this.f476467f = subSessionId;
        this.f476468g = i17;
        this.f476469h = extParams;
        this.f476470i = placeHolder;
        this.f476471j = i18;
        this.f476472k = z17;
        this.f476473l = z18;
        this.f476474m = forceUseThemeMode;
        this.f476475n = z19;
        this.f476476o = z27;
        this.f476477p = title;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv4.i)) {
            return false;
        }
        zv4.i iVar = (zv4.i) obj;
        return kotlin.jvm.internal.o.b(this.f476462a, iVar.f476462a) && kotlin.jvm.internal.o.b(this.f476463b, iVar.f476463b) && kotlin.jvm.internal.o.b(this.f476464c, iVar.f476464c) && kotlin.jvm.internal.o.b(this.f476465d, iVar.f476465d) && kotlin.jvm.internal.o.b(this.f476466e, iVar.f476466e) && kotlin.jvm.internal.o.b(this.f476467f, iVar.f476467f) && this.f476468g == iVar.f476468g && kotlin.jvm.internal.o.b(this.f476469h, iVar.f476469h) && kotlin.jvm.internal.o.b(this.f476470i, iVar.f476470i) && this.f476471j == iVar.f476471j && this.f476472k == iVar.f476472k && this.f476473l == iVar.f476473l && kotlin.jvm.internal.o.b(this.f476474m, iVar.f476474m) && this.f476475n == iVar.f476475n && this.f476476o == iVar.f476476o && kotlin.jvm.internal.o.b(this.f476477p, iVar.f476477p);
    }

    public int hashCode() {
        int hashCode = this.f476462a.hashCode() * 31;
        java.lang.Integer num = this.f476463b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f476464c;
        return ((((((((((((((((((((((((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f476465d.hashCode()) * 31) + this.f476466e.hashCode()) * 31) + this.f476467f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f476468g)) * 31) + this.f476469h.hashCode()) * 31) + this.f476470i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f476471j)) * 31) + java.lang.Boolean.hashCode(this.f476472k)) * 31) + java.lang.Boolean.hashCode(this.f476473l)) * 31) + this.f476474m.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f476475n)) * 31) + java.lang.Boolean.hashCode(this.f476476o)) * 31) + this.f476477p.hashCode();
    }

    public java.lang.String toString() {
        return "SearchParams(query=" + this.f476462a + ", scene=" + this.f476463b + ", type=" + this.f476464c + ", sessionId=" + this.f476465d + ", searchId=" + this.f476466e + ", subSessionId=" + this.f476467f + ", ftsNeedKeyboard=" + this.f476468g + ", extParams=" + this.f476469h + ", placeHolder=" + this.f476470i + ", isHomePage=" + this.f476471j + ", needPreGet=" + this.f476472k + ", enableRestoreEducatePage=" + this.f476473l + ", forceUseThemeMode=" + this.f476474m + ", isHideSearchInput=" + this.f476475n + ", isHideNavBar=" + this.f476476o + ", title=" + this.f476477p + ')';
    }
}

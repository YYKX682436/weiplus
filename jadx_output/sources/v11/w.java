package v11;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f432473a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.x f432474b;

    /* renamed from: c, reason: collision with root package name */
    public final float f432475c;

    /* renamed from: d, reason: collision with root package name */
    public final int f432476d;

    /* renamed from: e, reason: collision with root package name */
    public final float f432477e;

    /* renamed from: f, reason: collision with root package name */
    public final int f432478f;

    /* renamed from: g, reason: collision with root package name */
    public final int f432479g;

    /* renamed from: h, reason: collision with root package name */
    public final int f432480h;

    /* renamed from: i, reason: collision with root package name */
    public final int f432481i;

    /* renamed from: j, reason: collision with root package name */
    public final int f432482j;

    /* renamed from: k, reason: collision with root package name */
    public final int f432483k;

    /* renamed from: l, reason: collision with root package name */
    public final int f432484l;

    /* renamed from: m, reason: collision with root package name */
    public final int f432485m;

    /* renamed from: n, reason: collision with root package name */
    public final int f432486n;

    public w(v11.j0 contentTextView, v11.x highlightColors, float f17, int i17, float f18, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        kotlin.jvm.internal.o.g(contentTextView, "contentTextView");
        kotlin.jvm.internal.o.g(highlightColors, "highlightColors");
        this.f432473a = contentTextView;
        this.f432474b = highlightColors;
        this.f432475c = f17;
        this.f432476d = i17;
        this.f432477e = f18;
        this.f432478f = i18;
        this.f432479g = i19;
        this.f432480h = i27;
        this.f432481i = i28;
        this.f432482j = i29;
        this.f432483k = i37;
        this.f432484l = i38;
        this.f432485m = i39;
        this.f432486n = i47;
    }

    public static v11.w a(v11.w wVar, v11.j0 j0Var, v11.x xVar, float f17, int i17, float f18, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, java.lang.Object obj) {
        v11.j0 contentTextView = (i48 & 1) != 0 ? wVar.f432473a : j0Var;
        v11.x highlightColors = (i48 & 2) != 0 ? wVar.f432474b : xVar;
        float f19 = (i48 & 4) != 0 ? wVar.f432475c : f17;
        int i49 = (i48 & 8) != 0 ? wVar.f432476d : i17;
        float f27 = (i48 & 16) != 0 ? wVar.f432477e : f18;
        int i57 = (i48 & 32) != 0 ? wVar.f432478f : i18;
        int i58 = (i48 & 64) != 0 ? wVar.f432479g : i19;
        int i59 = (i48 & 128) != 0 ? wVar.f432480h : i27;
        int i66 = (i48 & 256) != 0 ? wVar.f432481i : i28;
        int i67 = (i48 & 512) != 0 ? wVar.f432482j : i29;
        int i68 = (i48 & 1024) != 0 ? wVar.f432483k : i37;
        int i69 = (i48 & 2048) != 0 ? wVar.f432484l : i38;
        int i76 = (i48 & 4096) != 0 ? wVar.f432485m : i39;
        int i77 = (i48 & 8192) != 0 ? wVar.f432486n : i47;
        wVar.getClass();
        kotlin.jvm.internal.o.g(contentTextView, "contentTextView");
        kotlin.jvm.internal.o.g(highlightColors, "highlightColors");
        return new v11.w(contentTextView, highlightColors, f19, i49, f27, i57, i58, i59, i66, i67, i68, i69, i76, i77);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.w)) {
            return false;
        }
        v11.w wVar = (v11.w) obj;
        return kotlin.jvm.internal.o.b(this.f432473a, wVar.f432473a) && kotlin.jvm.internal.o.b(this.f432474b, wVar.f432474b) && java.lang.Float.compare(this.f432475c, wVar.f432475c) == 0 && this.f432476d == wVar.f432476d && java.lang.Float.compare(this.f432477e, wVar.f432477e) == 0 && this.f432478f == wVar.f432478f && this.f432479g == wVar.f432479g && this.f432480h == wVar.f432480h && this.f432481i == wVar.f432481i && this.f432482j == wVar.f432482j && this.f432483k == wVar.f432483k && this.f432484l == wVar.f432484l && this.f432485m == wVar.f432485m && this.f432486n == wVar.f432486n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f432473a.hashCode() * 31) + this.f432474b.hashCode()) * 31) + java.lang.Float.hashCode(this.f432475c)) * 31) + java.lang.Integer.hashCode(this.f432476d)) * 31) + java.lang.Float.hashCode(this.f432477e)) * 31) + java.lang.Integer.hashCode(this.f432478f)) * 31) + java.lang.Integer.hashCode(this.f432479g)) * 31) + java.lang.Integer.hashCode(this.f432480h)) * 31) + java.lang.Integer.hashCode(this.f432481i)) * 31) + java.lang.Integer.hashCode(this.f432482j)) * 31) + java.lang.Integer.hashCode(this.f432483k)) * 31) + java.lang.Integer.hashCode(this.f432484l)) * 31) + java.lang.Integer.hashCode(this.f432485m)) * 31) + java.lang.Integer.hashCode(this.f432486n);
    }

    public java.lang.String toString() {
        return "NativeMarkdownCodeBlockConfig(contentTextView=" + this.f432473a + ", highlightColors=" + this.f432474b + ", languageTextSizeDp=" + this.f432475c + ", languageTextColor=" + this.f432476d + ", languageTextFontWeight=" + this.f432477e + ", copyButtonSizePx=" + this.f432478f + ", copyIconColor=" + this.f432479g + ", elementGapPx=" + this.f432480h + ", actionBarTopMarginPx=" + this.f432481i + ", contentMarginTopPx=" + this.f432482j + ", contentMarginBottomPx=" + this.f432483k + ", separatorColor=" + this.f432484l + ", separatorHeightPx=" + this.f432485m + ", separatorMarginPx=" + this.f432486n + ')';
    }
}

package v11;

/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f432377a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.j0 f432378b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432379c;

    /* renamed from: d, reason: collision with root package name */
    public final int f432380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f432381e;

    /* renamed from: f, reason: collision with root package name */
    public final int f432382f;

    /* renamed from: g, reason: collision with root package name */
    public final int f432383g;

    /* renamed from: h, reason: collision with root package name */
    public final int f432384h;

    /* renamed from: i, reason: collision with root package name */
    public final int f432385i;

    /* renamed from: j, reason: collision with root package name */
    public final int f432386j;

    /* renamed from: k, reason: collision with root package name */
    public final int f432387k;

    /* renamed from: l, reason: collision with root package name */
    public final int f432388l;

    /* renamed from: m, reason: collision with root package name */
    public final int f432389m;

    /* renamed from: n, reason: collision with root package name */
    public final int f432390n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f432391o;

    /* renamed from: p, reason: collision with root package name */
    public final v11.b0 f432392p;

    public g0(v11.j0 cellTextView, v11.j0 headerTextView, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, boolean z17, v11.b0 b0Var) {
        kotlin.jvm.internal.o.g(cellTextView, "cellTextView");
        kotlin.jvm.internal.o.g(headerTextView, "headerTextView");
        this.f432377a = cellTextView;
        this.f432378b = headerTextView;
        this.f432379c = i17;
        this.f432380d = i18;
        this.f432381e = i19;
        this.f432382f = i27;
        this.f432383g = i28;
        this.f432384h = i29;
        this.f432385i = i37;
        this.f432386j = i38;
        this.f432387k = i39;
        this.f432388l = i47;
        this.f432389m = i48;
        this.f432390n = i49;
        this.f432391o = z17;
        this.f432392p = b0Var;
    }

    public static v11.g0 a(v11.g0 g0Var, v11.j0 j0Var, v11.j0 j0Var2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, boolean z17, v11.b0 b0Var, int i57, java.lang.Object obj) {
        v11.j0 cellTextView = (i57 & 1) != 0 ? g0Var.f432377a : j0Var;
        v11.j0 headerTextView = (i57 & 2) != 0 ? g0Var.f432378b : j0Var2;
        int i58 = (i57 & 4) != 0 ? g0Var.f432379c : i17;
        int i59 = (i57 & 8) != 0 ? g0Var.f432380d : i18;
        int i66 = (i57 & 16) != 0 ? g0Var.f432381e : i19;
        int i67 = (i57 & 32) != 0 ? g0Var.f432382f : i27;
        int i68 = (i57 & 64) != 0 ? g0Var.f432383g : i28;
        int i69 = (i57 & 128) != 0 ? g0Var.f432384h : i29;
        int i76 = (i57 & 256) != 0 ? g0Var.f432385i : i37;
        int i77 = (i57 & 512) != 0 ? g0Var.f432386j : i38;
        int i78 = (i57 & 1024) != 0 ? g0Var.f432387k : i39;
        int i79 = (i57 & 2048) != 0 ? g0Var.f432388l : i47;
        int i86 = (i57 & 4096) != 0 ? g0Var.f432389m : i48;
        int i87 = (i57 & 8192) != 0 ? g0Var.f432390n : i49;
        boolean z18 = (i57 & 16384) != 0 ? g0Var.f432391o : z17;
        v11.b0 b0Var2 = (i57 & 32768) != 0 ? g0Var.f432392p : b0Var;
        g0Var.getClass();
        kotlin.jvm.internal.o.g(cellTextView, "cellTextView");
        kotlin.jvm.internal.o.g(headerTextView, "headerTextView");
        return new v11.g0(cellTextView, headerTextView, i58, i59, i66, i67, i68, i69, i76, i77, i78, i79, i86, i87, z18, b0Var2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.g0)) {
            return false;
        }
        v11.g0 g0Var = (v11.g0) obj;
        return kotlin.jvm.internal.o.b(this.f432377a, g0Var.f432377a) && kotlin.jvm.internal.o.b(this.f432378b, g0Var.f432378b) && this.f432379c == g0Var.f432379c && this.f432380d == g0Var.f432380d && this.f432381e == g0Var.f432381e && this.f432382f == g0Var.f432382f && this.f432383g == g0Var.f432383g && this.f432384h == g0Var.f432384h && this.f432385i == g0Var.f432385i && this.f432386j == g0Var.f432386j && this.f432387k == g0Var.f432387k && this.f432388l == g0Var.f432388l && this.f432389m == g0Var.f432389m && this.f432390n == g0Var.f432390n && this.f432391o == g0Var.f432391o && kotlin.jvm.internal.o.b(this.f432392p, g0Var.f432392p);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.f432377a.hashCode() * 31) + this.f432378b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f432379c)) * 31) + java.lang.Integer.hashCode(this.f432380d)) * 31) + java.lang.Integer.hashCode(this.f432381e)) * 31) + java.lang.Integer.hashCode(this.f432382f)) * 31) + java.lang.Integer.hashCode(this.f432383g)) * 31) + java.lang.Integer.hashCode(this.f432384h)) * 31) + java.lang.Integer.hashCode(this.f432385i)) * 31) + java.lang.Integer.hashCode(this.f432386j)) * 31) + java.lang.Integer.hashCode(this.f432387k)) * 31) + java.lang.Integer.hashCode(this.f432388l)) * 31) + java.lang.Integer.hashCode(this.f432389m)) * 31) + java.lang.Integer.hashCode(this.f432390n)) * 31) + java.lang.Boolean.hashCode(this.f432391o)) * 31;
        v11.b0 b0Var = this.f432392p;
        return hashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public java.lang.String toString() {
        return "NativeMarkdownTableConfig(cellTextView=" + this.f432377a + ", headerTextView=" + this.f432378b + ", horizontalPaddingPx=" + this.f432379c + ", verticalPaddingPx=" + this.f432380d + ", cellStartPaddingPx=" + this.f432381e + ", cellEndPaddingPx=" + this.f432382f + ", lastRowCellEndPaddingPx=" + this.f432383g + ", cellVerticalPaddingPx=" + this.f432384h + ", headerTopPaddingPx=" + this.f432385i + ", bottomDividerBottomMarginPx=" + this.f432386j + ", minCellWidthPx=" + this.f432387k + ", maxCellWidthPx=" + this.f432388l + ", borderWidthPx=" + this.f432389m + ", borderColor=" + this.f432390n + ", drawVerticalDivider=" + this.f432391o + ", inlineStyleOverride=" + this.f432392p + ')';
    }
}

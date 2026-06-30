package v11;

/* loaded from: classes11.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f432333a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432334b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f432335c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f432336d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f432337e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f432338f;

    /* renamed from: g, reason: collision with root package name */
    public final int f432339g;

    /* renamed from: h, reason: collision with root package name */
    public final int f432340h;

    /* renamed from: i, reason: collision with root package name */
    public final int f432341i;

    /* renamed from: j, reason: collision with root package name */
    public final int f432342j;

    /* renamed from: k, reason: collision with root package name */
    public final int f432343k;

    /* renamed from: l, reason: collision with root package name */
    public final int f432344l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f432345m;

    public b0(int i17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, int i19, int i27, int i28, int i29, int i37, int i38, boolean z28) {
        this.f432333a = i17;
        this.f432334b = i18;
        this.f432335c = z17;
        this.f432336d = z18;
        this.f432337e = z19;
        this.f432338f = z27;
        this.f432339g = i19;
        this.f432340h = i27;
        this.f432341i = i28;
        this.f432342j = i29;
        this.f432343k = i37;
        this.f432344l = i38;
        this.f432345m = z28;
    }

    public static v11.b0 a(v11.b0 b0Var, int i17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, int i19, int i27, int i28, int i29, int i37, int i38, boolean z28, int i39, java.lang.Object obj) {
        int i47 = (i39 & 1) != 0 ? b0Var.f432333a : i17;
        int i48 = (i39 & 2) != 0 ? b0Var.f432334b : i18;
        boolean z29 = (i39 & 4) != 0 ? b0Var.f432335c : z17;
        boolean z37 = (i39 & 8) != 0 ? b0Var.f432336d : z18;
        boolean z38 = (i39 & 16) != 0 ? b0Var.f432337e : z19;
        boolean z39 = (i39 & 32) != 0 ? b0Var.f432338f : z27;
        int i49 = (i39 & 64) != 0 ? b0Var.f432339g : i19;
        int i57 = (i39 & 128) != 0 ? b0Var.f432340h : i27;
        int i58 = (i39 & 256) != 0 ? b0Var.f432341i : i28;
        int i59 = (i39 & 512) != 0 ? b0Var.f432342j : i29;
        int i66 = (i39 & 1024) != 0 ? b0Var.f432343k : i37;
        int i67 = (i39 & 2048) != 0 ? b0Var.f432344l : i38;
        boolean z47 = (i39 & 4096) != 0 ? b0Var.f432345m : z28;
        b0Var.getClass();
        return new v11.b0(i47, i48, z29, z37, z38, z39, i49, i57, i58, i59, i66, i67, z47);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.b0)) {
            return false;
        }
        v11.b0 b0Var = (v11.b0) obj;
        return this.f432333a == b0Var.f432333a && this.f432334b == b0Var.f432334b && this.f432335c == b0Var.f432335c && this.f432336d == b0Var.f432336d && this.f432337e == b0Var.f432337e && this.f432338f == b0Var.f432338f && this.f432339g == b0Var.f432339g && this.f432340h == b0Var.f432340h && this.f432341i == b0Var.f432341i && this.f432342j == b0Var.f432342j && this.f432343k == b0Var.f432343k && this.f432344l == b0Var.f432344l && this.f432345m == b0Var.f432345m;
    }

    public int hashCode() {
        return (((((((((((((((((((((((java.lang.Integer.hashCode(this.f432333a) * 31) + java.lang.Integer.hashCode(this.f432334b)) * 31) + java.lang.Boolean.hashCode(this.f432335c)) * 31) + java.lang.Boolean.hashCode(this.f432336d)) * 31) + java.lang.Boolean.hashCode(this.f432337e)) * 31) + java.lang.Boolean.hashCode(this.f432338f)) * 31) + java.lang.Integer.hashCode(this.f432339g)) * 31) + java.lang.Integer.hashCode(this.f432340h)) * 31) + java.lang.Integer.hashCode(this.f432341i)) * 31) + java.lang.Integer.hashCode(this.f432342j)) * 31) + java.lang.Integer.hashCode(this.f432343k)) * 31) + java.lang.Integer.hashCode(this.f432344l)) * 31) + java.lang.Boolean.hashCode(this.f432345m);
    }

    public java.lang.String toString() {
        return "NativeMarkdownInlineStyleConfig(linkColor=" + this.f432333a + ", linkPressedBgColor=" + this.f432334b + ", linkBold=" + this.f432335c + ", underlineLink=" + this.f432336d + ", useMonospaceForInlineCode=" + this.f432337e + ", useMonospaceForInlineMath=" + this.f432338f + ", inlineCodeTextSizePx=" + this.f432339g + ", inlineCodeBackgroundColor=" + this.f432340h + ", inlineCodeCornerRadiusPx=" + this.f432341i + ", inlineCodeHorizontalPaddingPx=" + this.f432342j + ", inlineCodeHorizontalMarginPx=" + this.f432343k + ", inlineCodeVerticalPaddingPx=" + this.f432344l + ", inlineCodeUseMediumWeight=" + this.f432345m + ')';
    }
}

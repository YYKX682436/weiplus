package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public float f187418a;

    /* renamed from: b, reason: collision with root package name */
    public float f187419b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f187420c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f187421d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f187422e;

    /* renamed from: f, reason: collision with root package name */
    public int f187423f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f187424g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f187425h;

    /* renamed from: i, reason: collision with root package name */
    public int f187426i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f187427j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f187428k;

    /* renamed from: l, reason: collision with root package name */
    public int f187429l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f187430m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f187431n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f187432o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f187433p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f187434q;

    /* renamed from: r, reason: collision with root package name */
    public int f187435r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f187436s;

    /* renamed from: t, reason: collision with root package name */
    public int f187437t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f187438u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f187439v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f187440w;

    public n1() {
        this(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388607, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.webview.ui.tools.widget.n1)) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.n1) obj;
        return java.lang.Float.compare(this.f187418a, n1Var.f187418a) == 0 && java.lang.Float.compare(this.f187419b, n1Var.f187419b) == 0 && kotlin.jvm.internal.o.b(this.f187420c, n1Var.f187420c) && this.f187421d == n1Var.f187421d && this.f187422e == n1Var.f187422e && this.f187423f == n1Var.f187423f && this.f187424g == n1Var.f187424g && this.f187425h == n1Var.f187425h && this.f187426i == n1Var.f187426i && this.f187427j == n1Var.f187427j && this.f187428k == n1Var.f187428k && this.f187429l == n1Var.f187429l && this.f187430m == n1Var.f187430m && this.f187431n == n1Var.f187431n && this.f187432o == n1Var.f187432o && kotlin.jvm.internal.o.b(this.f187433p, n1Var.f187433p) && this.f187434q == n1Var.f187434q && this.f187435r == n1Var.f187435r && this.f187436s == n1Var.f187436s && this.f187437t == n1Var.f187437t && this.f187438u == n1Var.f187438u && this.f187439v == n1Var.f187439v && this.f187440w == n1Var.f187440w;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Float.hashCode(this.f187418a) * 31) + java.lang.Float.hashCode(this.f187419b)) * 31;
        java.lang.String str = this.f187420c;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f187421d)) * 31) + java.lang.Boolean.hashCode(this.f187422e)) * 31) + java.lang.Integer.hashCode(this.f187423f)) * 31) + java.lang.Boolean.hashCode(this.f187424g)) * 31) + java.lang.Boolean.hashCode(this.f187425h)) * 31) + java.lang.Integer.hashCode(this.f187426i)) * 31) + java.lang.Boolean.hashCode(this.f187427j)) * 31) + java.lang.Boolean.hashCode(this.f187428k)) * 31) + java.lang.Integer.hashCode(this.f187429l)) * 31) + java.lang.Boolean.hashCode(this.f187430m)) * 31) + java.lang.Boolean.hashCode(this.f187431n)) * 31) + java.lang.Boolean.hashCode(this.f187432o)) * 31;
        java.lang.String str2 = this.f187433p;
        return ((((((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f187434q)) * 31) + java.lang.Integer.hashCode(this.f187435r)) * 31) + java.lang.Boolean.hashCode(this.f187436s)) * 31) + java.lang.Integer.hashCode(this.f187437t)) * 31) + java.lang.Boolean.hashCode(this.f187438u)) * 31) + java.lang.Boolean.hashCode(this.f187439v)) * 31) + java.lang.Boolean.hashCode(this.f187440w);
    }

    public java.lang.String toString() {
        return "HalfScreenWebViewOption(heightPercent=" + this.f187418a + ", maxWidthPercent=" + this.f187419b + ", extData=" + this.f187420c + ", reuseWebView=" + this.f187421d + ", showMenu=" + this.f187422e + ", backMode=" + this.f187423f + ", addDragLine=" + this.f187424g + ", immersiveUIStyle=" + this.f187425h + ", openType=" + this.f187426i + ", showBgMask=" + this.f187427j + ", closeWhenClickEmptyArea=" + this.f187428k + ", getA8KeyScene=" + this.f187429l + ", readMode=" + this.f187430m + ", showRefreshIcon=" + this.f187431n + ", showTitle=" + this.f187432o + ", hexBackgroundColor=" + this.f187433p + ", forcePortrait=" + this.f187434q + ", contentLayoutPosition=" + this.f187435r + ", windowFullScreen=" + this.f187436s + ", arrowBgMode=" + this.f187437t + ", isSupportHorizontalDrag=" + this.f187438u + ", isDragLineCustomBackgroundColor=" + this.f187439v + ", hideNavigationBar=" + this.f187440w + ')';
    }

    public n1(float f17, float f18, java.lang.String str, boolean z17, boolean z18, int i17, boolean z19, boolean z27, int i18, boolean z28, boolean z29, int i19, boolean z37, boolean z38, boolean z39, java.lang.String str2, boolean z47, int i27, boolean z48, int i28, boolean z49, boolean z57, boolean z58, int i29, kotlin.jvm.internal.i iVar) {
        float f19 = (i29 & 1) != 0 ? 0.75f : f17;
        float f27 = (i29 & 2) != 0 ? 0.0f : f18;
        java.lang.String str3 = (i29 & 4) != 0 ? null : str;
        boolean z59 = (i29 & 8) != 0 ? true : z17;
        boolean z66 = (i29 & 16) != 0 ? true : z18;
        int i37 = (i29 & 32) != 0 ? 0 : i17;
        boolean z67 = (i29 & 64) != 0 ? false : z19;
        boolean z68 = (i29 & 128) != 0 ? false : z27;
        int i38 = (i29 & 256) != 0 ? 0 : i18;
        boolean z69 = (i29 & 512) != 0 ? true : z28;
        boolean z76 = (i29 & 1024) != 0 ? true : z29;
        int i39 = (i29 & 2048) != 0 ? 80 : i19;
        boolean z77 = (i29 & 4096) != 0 ? false : z37;
        boolean z78 = (i29 & 8192) != 0 ? false : z38;
        boolean z79 = (i29 & 16384) != 0 ? true : z39;
        java.lang.String str4 = (i29 & 32768) != 0 ? "" : str2;
        boolean z86 = (i29 & 65536) != 0 ? false : z47;
        int i47 = (i29 & 131072) != 0 ? 0 : i27;
        boolean z87 = (i29 & 262144) != 0 ? false : z48;
        int i48 = (i29 & 524288) != 0 ? 0 : i28;
        boolean z88 = (i29 & 1048576) != 0 ? false : z49;
        boolean z89 = (i29 & 2097152) != 0 ? false : z57;
        boolean z96 = (i29 & 4194304) != 0 ? false : z58;
        this.f187418a = f19;
        this.f187419b = f27;
        this.f187420c = str3;
        this.f187421d = z59;
        this.f187422e = z66;
        this.f187423f = i37;
        this.f187424g = z67;
        this.f187425h = z68;
        this.f187426i = i38;
        this.f187427j = z69;
        this.f187428k = z76;
        this.f187429l = i39;
        this.f187430m = z77;
        this.f187431n = z78;
        this.f187432o = z79;
        this.f187433p = str4;
        this.f187434q = z86;
        this.f187435r = i47;
        this.f187436s = z87;
        this.f187437t = i48;
        this.f187438u = z88;
        this.f187439v = z89;
        this.f187440w = z96;
    }
}

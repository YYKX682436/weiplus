package nf2;

/* loaded from: classes10.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f336719a;

    /* renamed from: b, reason: collision with root package name */
    public final float f336720b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f336721c;

    /* renamed from: d, reason: collision with root package name */
    public final long f336722d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f336723e;

    /* renamed from: f, reason: collision with root package name */
    public final float f336724f;

    /* renamed from: g, reason: collision with root package name */
    public final float f336725g;

    /* renamed from: h, reason: collision with root package name */
    public final float f336726h;

    /* renamed from: i, reason: collision with root package name */
    public final float f336727i;

    /* renamed from: j, reason: collision with root package name */
    public final float f336728j;

    /* renamed from: k, reason: collision with root package name */
    public final float f336729k;

    /* renamed from: l, reason: collision with root package name */
    public final float f336730l;

    /* renamed from: m, reason: collision with root package name */
    public final float f336731m;

    /* renamed from: n, reason: collision with root package name */
    public final nf2.a f336732n;

    /* renamed from: o, reason: collision with root package name */
    public final nf2.k1 f336733o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f336734p;

    /* renamed from: q, reason: collision with root package name */
    public final long f336735q;

    /* renamed from: r, reason: collision with root package name */
    public final nf2.l1 f336736r;

    public f1(int i17, float f17, boolean z17, long j17, boolean z18, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, nf2.a componentLayoutMode, nf2.k1 renderDirection, java.lang.String rotateCharsPattern, long j18, nf2.l1 textColorStyle) {
        kotlin.jvm.internal.o.g(componentLayoutMode, "componentLayoutMode");
        kotlin.jvm.internal.o.g(renderDirection, "renderDirection");
        kotlin.jvm.internal.o.g(rotateCharsPattern, "rotateCharsPattern");
        kotlin.jvm.internal.o.g(textColorStyle, "textColorStyle");
        this.f336719a = i17;
        this.f336720b = f17;
        this.f336721c = z17;
        this.f336722d = j17;
        this.f336723e = z18;
        this.f336724f = f18;
        this.f336725g = f19;
        this.f336726h = f27;
        this.f336727i = f28;
        this.f336728j = f29;
        this.f336729k = f37;
        this.f336730l = f38;
        this.f336731m = f39;
        this.f336732n = componentLayoutMode;
        this.f336733o = renderDirection;
        this.f336734p = rotateCharsPattern;
        this.f336735q = j18;
        this.f336736r = textColorStyle;
    }

    public static nf2.f1 a(nf2.f1 f1Var, int i17, float f17, boolean z17, long j17, boolean z18, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, nf2.a aVar, nf2.k1 k1Var, java.lang.String str, long j18, nf2.l1 l1Var, int i18, java.lang.Object obj) {
        int i19 = (i18 & 1) != 0 ? f1Var.f336719a : i17;
        float f47 = (i18 & 2) != 0 ? f1Var.f336720b : f17;
        boolean z19 = (i18 & 4) != 0 ? f1Var.f336721c : z17;
        long j19 = (i18 & 8) != 0 ? f1Var.f336722d : j17;
        boolean z27 = (i18 & 16) != 0 ? f1Var.f336723e : z18;
        float f48 = (i18 & 32) != 0 ? f1Var.f336724f : f18;
        float f49 = (i18 & 64) != 0 ? f1Var.f336725g : f19;
        float f57 = (i18 & 128) != 0 ? f1Var.f336726h : f27;
        float f58 = (i18 & 256) != 0 ? f1Var.f336727i : f28;
        float f59 = (i18 & 512) != 0 ? f1Var.f336728j : f29;
        float f66 = (i18 & 1024) != 0 ? f1Var.f336729k : f37;
        float f67 = (i18 & 2048) != 0 ? f1Var.f336730l : f38;
        float f68 = (i18 & 4096) != 0 ? f1Var.f336731m : f39;
        nf2.a componentLayoutMode = (i18 & 8192) != 0 ? f1Var.f336732n : aVar;
        float f69 = f67;
        nf2.k1 renderDirection = (i18 & 16384) != 0 ? f1Var.f336733o : k1Var;
        float f76 = f66;
        java.lang.String rotateCharsPattern = (i18 & 32768) != 0 ? f1Var.f336734p : str;
        float f77 = f58;
        float f78 = f59;
        long j27 = (i18 & 65536) != 0 ? f1Var.f336735q : j18;
        nf2.l1 textColorStyle = (i18 & 131072) != 0 ? f1Var.f336736r : l1Var;
        f1Var.getClass();
        kotlin.jvm.internal.o.g(componentLayoutMode, "componentLayoutMode");
        kotlin.jvm.internal.o.g(renderDirection, "renderDirection");
        kotlin.jvm.internal.o.g(rotateCharsPattern, "rotateCharsPattern");
        kotlin.jvm.internal.o.g(textColorStyle, "textColorStyle");
        return new nf2.f1(i19, f47, z19, j19, z27, f48, f49, f57, f77, f78, f76, f69, f68, componentLayoutMode, renderDirection, rotateCharsPattern, j27, textColorStyle);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf2.f1)) {
            return false;
        }
        nf2.f1 f1Var = (nf2.f1) obj;
        return this.f336719a == f1Var.f336719a && java.lang.Float.compare(this.f336720b, f1Var.f336720b) == 0 && this.f336721c == f1Var.f336721c && this.f336722d == f1Var.f336722d && this.f336723e == f1Var.f336723e && java.lang.Float.compare(this.f336724f, f1Var.f336724f) == 0 && java.lang.Float.compare(this.f336725g, f1Var.f336725g) == 0 && java.lang.Float.compare(this.f336726h, f1Var.f336726h) == 0 && java.lang.Float.compare(this.f336727i, f1Var.f336727i) == 0 && java.lang.Float.compare(this.f336728j, f1Var.f336728j) == 0 && java.lang.Float.compare(this.f336729k, f1Var.f336729k) == 0 && java.lang.Float.compare(this.f336730l, f1Var.f336730l) == 0 && java.lang.Float.compare(this.f336731m, f1Var.f336731m) == 0 && this.f336732n == f1Var.f336732n && this.f336733o == f1Var.f336733o && kotlin.jvm.internal.o.b(this.f336734p, f1Var.f336734p) && this.f336735q == f1Var.f336735q && this.f336736r == f1Var.f336736r;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f336719a) * 31) + java.lang.Float.hashCode(this.f336720b)) * 31) + java.lang.Boolean.hashCode(this.f336721c)) * 31) + java.lang.Long.hashCode(this.f336722d)) * 31) + java.lang.Boolean.hashCode(this.f336723e)) * 31) + java.lang.Float.hashCode(this.f336724f)) * 31) + java.lang.Float.hashCode(this.f336725g)) * 31) + java.lang.Float.hashCode(this.f336726h)) * 31) + java.lang.Float.hashCode(this.f336727i)) * 31) + java.lang.Float.hashCode(this.f336728j)) * 31) + java.lang.Float.hashCode(this.f336729k)) * 31) + java.lang.Float.hashCode(this.f336730l)) * 31) + java.lang.Float.hashCode(this.f336731m)) * 31) + this.f336732n.hashCode()) * 31) + this.f336733o.hashCode()) * 31) + this.f336734p.hashCode()) * 31) + java.lang.Long.hashCode(this.f336735q)) * 31) + this.f336736r.hashCode();
    }

    public java.lang.String toString() {
        return "FinderLiveNormalRoomLyricsRenderConfig(normalTextColorResId=" + this.f336719a + ", textSizeSp=" + this.f336720b + ", enableDrag=" + this.f336721c + ", longPressDurationMs=" + this.f336722d + ", enableMenu=" + this.f336723e + ", initialPositionX=" + this.f336724f + ", initialPositionY=" + this.f336725g + ", baseSafeAreaRatioTop=" + this.f336726h + ", baseSafeAreaRatioBottom=" + this.f336727i + ", extraPaddingHorizontalDp=" + this.f336728j + ", extraPaddingVerticalDp=" + this.f336729k + ", componentHorizontalSafeMarginDp=" + this.f336730l + ", alignmentTriggerWidthDp=" + this.f336731m + ", componentLayoutMode=" + this.f336732n + ", renderDirection=" + this.f336733o + ", rotateCharsPattern=" + this.f336734p + ", renderTransitionDurationMs=" + this.f336735q + ", textColorStyle=" + this.f336736r + ')';
    }

    public /* synthetic */ f1(int i17, float f17, boolean z17, long j17, boolean z18, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, nf2.a aVar, nf2.k1 k1Var, java.lang.String str, long j18, nf2.l1 l1Var, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? com.tencent.mm.R.color.adh : i17, (i18 & 2) != 0 ? 16.0f : f17, (i18 & 4) != 0 ? true : z17, (i18 & 8) != 0 ? 30L : j17, (i18 & 16) == 0 ? z18 : true, (i18 & 32) != 0 ? 0.5f : f18, (i18 & 64) != 0 ? 0.4f : f19, (i18 & 128) != 0 ? 0.15f : f27, (i18 & 256) != 0 ? 0.35f : f28, (i18 & 512) != 0 ? 12.0f : f29, (i18 & 1024) != 0 ? 8.0f : f37, (i18 & 2048) != 0 ? 56.0f : f38, (i18 & 4096) != 0 ? 24.0f : f39, (i18 & 8192) != 0 ? nf2.a.f336649f : aVar, (i18 & 16384) != 0 ? nf2.k1.f336768e : k1Var, (i18 & 32768) != 0 ? "[A-Za-z0-9]" : str, (i18 & 65536) != 0 ? 200L : j18, (i18 & 131072) != 0 ? nf2.l1.f336772e : l1Var);
    }
}

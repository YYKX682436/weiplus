package gm2;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f273370a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f273371b;

    /* renamed from: c, reason: collision with root package name */
    public int f273372c;

    /* renamed from: d, reason: collision with root package name */
    public int f273373d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273374e;

    /* renamed from: f, reason: collision with root package name */
    public int f273375f;

    /* renamed from: g, reason: collision with root package name */
    public final int f273376g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f273377h;

    /* renamed from: i, reason: collision with root package name */
    public int f273378i;

    /* renamed from: j, reason: collision with root package name */
    public int f273379j;

    /* renamed from: k, reason: collision with root package name */
    public int f273380k;

    /* renamed from: l, reason: collision with root package name */
    public int f273381l;

    /* renamed from: m, reason: collision with root package name */
    public int f273382m;

    /* renamed from: n, reason: collision with root package name */
    public int f273383n;

    /* renamed from: o, reason: collision with root package name */
    public final float f273384o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f273385p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f273386q;

    /* renamed from: r, reason: collision with root package name */
    public int f273387r;

    /* renamed from: s, reason: collision with root package name */
    public int f273388s;

    /* renamed from: t, reason: collision with root package name */
    public int f273389t;

    public h1(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, int i18, boolean z17, int i19, int i27, boolean z18, int i28, int i29, int i37, int i38, int i39, int i47, float f17, android.graphics.Bitmap bitmap, int[] iArr, int i48, int i49, kotlin.jvm.internal.i iVar) {
        int i57;
        int i58;
        java.lang.CharSequence textContent = (i49 & 1) != 0 ? "" : charSequence;
        java.lang.CharSequence number = (i49 & 2) == 0 ? charSequence2 : "";
        int color = (i49 & 4) != 0 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0) : i17;
        int e17 = (i49 & 8) != 0 ? gm2.c1.f273320a.e() : i18;
        boolean z19 = (i49 & 16) != 0 ? false : z17;
        int i59 = (i49 & 32) != 0 ? 0 : i19;
        int i66 = (i49 & 64) != 0 ? 255 : i27;
        boolean z27 = (i49 & 128) != 0 ? false : z18;
        int k17 = (i49 & 256) != 0 ? gm2.c1.f273320a.k() : i28;
        if ((i49 & 512) != 0) {
            gm2.c1 c1Var = gm2.c1.f273320a;
            i57 = ((java.lang.Number) ((jz5.n) gm2.c1.f273322c).getValue()).intValue();
        } else {
            i57 = i29;
        }
        if ((i49 & 1024) != 0) {
            gm2.c1 c1Var2 = gm2.c1.f273320a;
            i58 = ((java.lang.Number) ((jz5.n) gm2.c1.f273322c).getValue()).intValue();
        } else {
            i58 = i37;
        }
        int i67 = (i49 & 2048) != 0 ? 0 : i38;
        int i68 = (i49 & 4096) != 0 ? 0 : i39;
        int g17 = (i49 & 8192) != 0 ? gm2.c1.f273320a.g() : i47;
        float f18 = (i49 & 16384) != 0 ? 0.0f : f17;
        android.graphics.Bitmap bitmap2 = (i49 & 32768) != 0 ? null : bitmap;
        int[] iArr2 = (i49 & 65536) != 0 ? null : iArr;
        int i69 = (i49 & 131072) != 0 ? 0 : i48;
        kotlin.jvm.internal.o.g(textContent, "textContent");
        kotlin.jvm.internal.o.g(number, "number");
        this.f273370a = textContent;
        this.f273371b = number;
        this.f273372c = color;
        this.f273373d = e17;
        this.f273374e = z19;
        this.f273375f = i59;
        this.f273376g = i66;
        this.f273377h = z27;
        this.f273378i = k17;
        this.f273379j = i57;
        this.f273380k = i58;
        this.f273381l = i67;
        this.f273382m = i68;
        this.f273383n = g17;
        this.f273384o = f18;
        this.f273385p = bitmap2;
        this.f273386q = iArr2;
        this.f273387r = i69;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.h1)) {
            return false;
        }
        gm2.h1 h1Var = (gm2.h1) obj;
        return kotlin.jvm.internal.o.b(this.f273370a, h1Var.f273370a) && kotlin.jvm.internal.o.b(this.f273371b, h1Var.f273371b) && this.f273372c == h1Var.f273372c && this.f273373d == h1Var.f273373d && this.f273374e == h1Var.f273374e && this.f273375f == h1Var.f273375f && this.f273376g == h1Var.f273376g && this.f273377h == h1Var.f273377h && this.f273378i == h1Var.f273378i && this.f273379j == h1Var.f273379j && this.f273380k == h1Var.f273380k && this.f273381l == h1Var.f273381l && this.f273382m == h1Var.f273382m && this.f273383n == h1Var.f273383n && java.lang.Float.compare(this.f273384o, h1Var.f273384o) == 0 && kotlin.jvm.internal.o.b(this.f273385p, h1Var.f273385p) && kotlin.jvm.internal.o.b(this.f273386q, h1Var.f273386q) && this.f273387r == h1Var.f273387r;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((this.f273370a.hashCode() * 31) + this.f273371b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f273372c)) * 31) + java.lang.Integer.hashCode(this.f273373d)) * 31) + java.lang.Boolean.hashCode(this.f273374e)) * 31) + java.lang.Integer.hashCode(this.f273375f)) * 31) + java.lang.Integer.hashCode(this.f273376g)) * 31) + java.lang.Boolean.hashCode(this.f273377h)) * 31) + java.lang.Integer.hashCode(this.f273378i)) * 31) + java.lang.Integer.hashCode(this.f273379j)) * 31) + java.lang.Integer.hashCode(this.f273380k)) * 31) + java.lang.Integer.hashCode(this.f273381l)) * 31) + java.lang.Integer.hashCode(this.f273382m)) * 31) + java.lang.Integer.hashCode(this.f273383n)) * 31) + java.lang.Float.hashCode(this.f273384o)) * 31;
        android.graphics.Bitmap bitmap = this.f273385p;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        int[] iArr = this.f273386q;
        return ((hashCode2 + (iArr != null ? java.util.Arrays.hashCode(iArr) : 0)) * 31) + java.lang.Integer.hashCode(this.f273387r);
    }

    public java.lang.String toString() {
        return "FinderLiveTagImageSpanConfig(textContent=" + ((java.lang.Object) this.f273370a) + ", number=" + ((java.lang.Object) this.f273371b) + ", textColor=" + this.f273372c + ", textSize=" + this.f273373d + ", textBold=" + this.f273374e + ", leftMargin=" + this.f273375f + ", alpha=" + this.f273376g + ", hasFrame=" + this.f273377h + ", rightMargin=" + this.f273378i + ", leftPading=" + this.f273379j + ", rightPading=" + this.f273380k + ", centerPading=" + this.f273381l + ", bgColor=" + this.f273382m + ", bgHeight=" + this.f273383n + ", radius=" + this.f273384o + ", bgBitmap=" + this.f273385p + ", gradientColor=" + java.util.Arrays.toString(this.f273386q) + ", lineHeight=" + this.f273387r + ')';
    }
}

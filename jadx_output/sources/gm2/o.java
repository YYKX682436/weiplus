package gm2;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f273436a;

    /* renamed from: b, reason: collision with root package name */
    public int f273437b;

    /* renamed from: c, reason: collision with root package name */
    public int f273438c;

    /* renamed from: d, reason: collision with root package name */
    public int f273439d;

    /* renamed from: e, reason: collision with root package name */
    public int f273440e;

    /* renamed from: f, reason: collision with root package name */
    public int f273441f;

    /* renamed from: g, reason: collision with root package name */
    public int f273442g;

    /* renamed from: h, reason: collision with root package name */
    public int f273443h;

    /* renamed from: i, reason: collision with root package name */
    public int f273444i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f273445j;

    /* renamed from: k, reason: collision with root package name */
    public int f273446k;

    /* renamed from: l, reason: collision with root package name */
    public int f273447l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f273448m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f273449n;

    /* renamed from: o, reason: collision with root package name */
    public int f273450o;

    /* renamed from: p, reason: collision with root package name */
    public int f273451p;

    /* renamed from: q, reason: collision with root package name */
    public int f273452q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f273453r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f273454s;

    /* renamed from: t, reason: collision with root package name */
    public int f273455t;

    public o(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, java.lang.CharSequence charSequence, int i47, int i48, boolean z17, android.graphics.drawable.Drawable drawable, int i49, int i57, int i58, boolean z18, boolean z19, int i59, kotlin.jvm.internal.i iVar) {
        int i66;
        int i67;
        int i68 = (i59 & 1) != 0 ? 0 : i17;
        int k17 = (i59 & 2) != 0 ? gm2.c1.f273320a.k() : i18;
        int k18 = (i59 & 4) != 0 ? gm2.c1.f273320a.k() : i19;
        int intValue = (i59 & 8) != 0 ? ((java.lang.Number) ((jz5.n) gm2.c1.f273323d).getValue()).intValue() : i27;
        int j17 = (i59 & 16) != 0 ? gm2.c1.f273320a.j() : i28;
        int i69 = (i59 & 32) != 0 ? 0 : i29;
        int i76 = (i59 & 64) != 0 ? 0 : i37;
        int g17 = (i59 & 128) != 0 ? gm2.c1.f273320a.g() : i38;
        int i77 = (i59 & 256) != 0 ? gm2.c1.f273320a.i() : i39;
        java.lang.CharSequence text = (i59 & 512) != 0 ? "" : charSequence;
        int i78 = (i59 & 1024) != 0 ? 0 : i47;
        int e17 = (i59 & 2048) != 0 ? gm2.c1.f273320a.e() : i48;
        boolean z27 = (i59 & 4096) != 0 ? false : z17;
        android.graphics.drawable.Drawable drawable2 = (i59 & 8192) != 0 ? null : drawable;
        if ((i59 & 16384) != 0) {
            gm2.c1 c1Var = gm2.c1.f273320a;
            i66 = ((java.lang.Number) ((jz5.n) gm2.c1.f273336q).getValue()).intValue();
        } else {
            i66 = i49;
        }
        if ((i59 & 32768) != 0) {
            gm2.c1 c1Var2 = gm2.c1.f273320a;
            i67 = ((java.lang.Number) ((jz5.n) gm2.c1.f273336q).getValue()).intValue();
        } else {
            i67 = i57;
        }
        int i79 = (i59 & 65536) != 0 ? 0 : i58;
        boolean z28 = (i59 & 131072) != 0 ? true : z18;
        boolean z29 = (i59 & 262144) != 0 ? true : z19;
        kotlin.jvm.internal.o.g(text, "text");
        this.f273436a = i68;
        this.f273437b = k17;
        this.f273438c = k18;
        this.f273439d = intValue;
        this.f273440e = j17;
        this.f273441f = i69;
        this.f273442g = i76;
        this.f273443h = g17;
        this.f273444i = i77;
        this.f273445j = text;
        this.f273446k = i78;
        this.f273447l = e17;
        this.f273448m = z27;
        this.f273449n = drawable2;
        this.f273450o = i66;
        this.f273451p = i67;
        this.f273452q = i79;
        this.f273453r = z28;
        this.f273454s = z29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.o)) {
            return false;
        }
        gm2.o oVar = (gm2.o) obj;
        return this.f273436a == oVar.f273436a && this.f273437b == oVar.f273437b && this.f273438c == oVar.f273438c && this.f273439d == oVar.f273439d && this.f273440e == oVar.f273440e && this.f273441f == oVar.f273441f && this.f273442g == oVar.f273442g && this.f273443h == oVar.f273443h && this.f273444i == oVar.f273444i && kotlin.jvm.internal.o.b(this.f273445j, oVar.f273445j) && this.f273446k == oVar.f273446k && this.f273447l == oVar.f273447l && this.f273448m == oVar.f273448m && kotlin.jvm.internal.o.b(this.f273449n, oVar.f273449n) && this.f273450o == oVar.f273450o && this.f273451p == oVar.f273451p && this.f273452q == oVar.f273452q && this.f273453r == oVar.f273453r && this.f273454s == oVar.f273454s;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((java.lang.Integer.hashCode(this.f273436a) * 31) + java.lang.Integer.hashCode(this.f273437b)) * 31) + java.lang.Integer.hashCode(this.f273438c)) * 31) + java.lang.Integer.hashCode(this.f273439d)) * 31) + java.lang.Integer.hashCode(this.f273440e)) * 31) + java.lang.Integer.hashCode(this.f273441f)) * 31) + java.lang.Integer.hashCode(this.f273442g)) * 31) + java.lang.Integer.hashCode(this.f273443h)) * 31) + java.lang.Integer.hashCode(this.f273444i)) * 31) + this.f273445j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f273446k)) * 31) + java.lang.Integer.hashCode(this.f273447l)) * 31) + java.lang.Boolean.hashCode(this.f273448m)) * 31;
        android.graphics.drawable.Drawable drawable = this.f273449n;
        return ((((((((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + java.lang.Integer.hashCode(this.f273450o)) * 31) + java.lang.Integer.hashCode(this.f273451p)) * 31) + java.lang.Integer.hashCode(this.f273452q)) * 31) + java.lang.Boolean.hashCode(this.f273453r)) * 31) + java.lang.Boolean.hashCode(this.f273454s);
    }

    public java.lang.String toString() {
        return "FinderLiveImageSpanParams(leftMargin=" + this.f273436a + ", rightMargin=" + this.f273437b + ", leftPading=" + this.f273438c + ", rightPading=" + this.f273439d + ", itemPading=" + this.f273440e + ", bgColor=" + this.f273441f + ", bgDrawableId=" + this.f273442g + ", bgHeight=" + this.f273443h + ", bgRadius=" + this.f273444i + ", text=" + ((java.lang.Object) this.f273445j) + ", textColor=" + this.f273446k + ", textSize=" + this.f273447l + ", textBold=" + this.f273448m + ", leftIcon=" + this.f273449n + ", leftIconWidth=" + this.f273450o + ", leftIconHeight=" + this.f273451p + ", leftIconColor=" + this.f273452q + ", drawBg=" + this.f273453r + ", leftIconColorFilling=" + this.f273454s + ')';
    }
}

package xt2;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f457059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f457060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f457061c;

    /* renamed from: d, reason: collision with root package name */
    public final int f457062d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457063e;

    /* renamed from: f, reason: collision with root package name */
    public final int f457064f;

    /* renamed from: g, reason: collision with root package name */
    public final int f457065g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f457066h;

    /* renamed from: i, reason: collision with root package name */
    public final float f457067i;

    /* renamed from: j, reason: collision with root package name */
    public final int f457068j;

    /* renamed from: k, reason: collision with root package name */
    public final int f457069k;

    /* renamed from: l, reason: collision with root package name */
    public final int f457070l;

    public v1(int i17, int i18, int i19, int i27, int i28, int i29, int i37, boolean z17, float f17, int i38, int i39, int i47) {
        this.f457059a = i17;
        this.f457060b = i18;
        this.f457061c = i19;
        this.f457062d = i27;
        this.f457063e = i28;
        this.f457064f = i29;
        this.f457065g = i37;
        this.f457066h = z17;
        this.f457067i = f17;
        this.f457068j = i38;
        this.f457069k = i39;
        this.f457070l = i47;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2.v1)) {
            return false;
        }
        xt2.v1 v1Var = (xt2.v1) obj;
        return this.f457059a == v1Var.f457059a && this.f457060b == v1Var.f457060b && this.f457061c == v1Var.f457061c && this.f457062d == v1Var.f457062d && this.f457063e == v1Var.f457063e && this.f457064f == v1Var.f457064f && this.f457065g == v1Var.f457065g && this.f457066h == v1Var.f457066h && java.lang.Float.compare(this.f457067i, v1Var.f457067i) == 0 && this.f457068j == v1Var.f457068j && this.f457069k == v1Var.f457069k && this.f457070l == v1Var.f457070l;
    }

    public int hashCode() {
        return (((((((((((((((((((((java.lang.Integer.hashCode(this.f457059a) * 31) + java.lang.Integer.hashCode(this.f457060b)) * 31) + java.lang.Integer.hashCode(this.f457061c)) * 31) + java.lang.Integer.hashCode(this.f457062d)) * 31) + java.lang.Integer.hashCode(this.f457063e)) * 31) + java.lang.Integer.hashCode(this.f457064f)) * 31) + java.lang.Integer.hashCode(this.f457065g)) * 31) + java.lang.Boolean.hashCode(this.f457066h)) * 31) + java.lang.Float.hashCode(this.f457067i)) * 31) + java.lang.Integer.hashCode(this.f457068j)) * 31) + java.lang.Integer.hashCode(this.f457069k)) * 31) + java.lang.Integer.hashCode(this.f457070l);
    }

    public java.lang.String toString() {
        return "MeasureCacheKey(widthSpecMode=" + this.f457059a + ", widthSpecSize=" + this.f457060b + ", heightSpecMode=" + this.f457061c + ", heightSpecSize=" + this.f457062d + ", textHashCode=" + this.f457063e + ", textLength=" + this.f457064f + ", spanCount=" + this.f457065g + ", isDarkMode=" + this.f457066h + ", fontSize=" + this.f457067i + ", drawableHashCode=" + this.f457068j + ", maxLines=" + this.f457069k + ", minLines=" + this.f457070l + ')';
    }
}

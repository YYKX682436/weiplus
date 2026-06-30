package gm2;

/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f273470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273474e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273475f;

    /* renamed from: g, reason: collision with root package name */
    public final float f273476g;

    /* renamed from: h, reason: collision with root package name */
    public final int f273477h;

    /* renamed from: i, reason: collision with root package name */
    public final int f273478i;

    public s1(android.graphics.Bitmap swipeBitmap, int i17, int i18, int i19, int i27, int i28, float f17, int i29, int i37) {
        kotlin.jvm.internal.o.g(swipeBitmap, "swipeBitmap");
        this.f273470a = swipeBitmap;
        this.f273471b = i17;
        this.f273472c = i18;
        this.f273473d = i19;
        this.f273474e = i27;
        this.f273475f = i28;
        this.f273476g = f17;
        this.f273477h = i29;
        this.f273478i = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.s1)) {
            return false;
        }
        gm2.s1 s1Var = (gm2.s1) obj;
        return kotlin.jvm.internal.o.b(this.f273470a, s1Var.f273470a) && this.f273471b == s1Var.f273471b && this.f273472c == s1Var.f273472c && this.f273473d == s1Var.f273473d && this.f273474e == s1Var.f273474e && this.f273475f == s1Var.f273475f && java.lang.Float.compare(this.f273476g, s1Var.f273476g) == 0 && this.f273477h == s1Var.f273477h && this.f273478i == s1Var.f273478i;
    }

    public int hashCode() {
        return (((((((((((((((this.f273470a.hashCode() * 31) + java.lang.Integer.hashCode(this.f273471b)) * 31) + java.lang.Integer.hashCode(this.f273472c)) * 31) + java.lang.Integer.hashCode(this.f273473d)) * 31) + java.lang.Integer.hashCode(this.f273474e)) * 31) + java.lang.Integer.hashCode(this.f273475f)) * 31) + java.lang.Float.hashCode(this.f273476g)) * 31) + java.lang.Integer.hashCode(this.f273477h)) * 31) + java.lang.Integer.hashCode(this.f273478i);
    }

    public java.lang.String toString() {
        return "HightLevelAnimParam(swipeBitmap=" + this.f273470a + ", bg1Light=" + this.f273471b + ", bg2Light=" + this.f273472c + ", bg1Dark=" + this.f273473d + ", bg2Dark=" + this.f273474e + ", borderColor=" + this.f273475f + ", borderWidth=" + this.f273476g + ", lightBgMask=" + this.f273477h + ", darkBgMask=" + this.f273478i + ')';
    }
}

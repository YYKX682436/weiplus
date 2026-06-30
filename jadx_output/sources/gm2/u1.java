package gm2;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public float f273492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273495d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273496e;

    /* renamed from: f, reason: collision with root package name */
    public final float f273497f;

    public u1(float f17, int i17, int i18, int i19, int i27, float f18) {
        this.f273492a = f17;
        this.f273493b = i17;
        this.f273494c = i18;
        this.f273495d = i19;
        this.f273496e = i27;
        this.f273497f = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.u1)) {
            return false;
        }
        gm2.u1 u1Var = (gm2.u1) obj;
        return java.lang.Float.compare(this.f273492a, u1Var.f273492a) == 0 && this.f273493b == u1Var.f273493b && this.f273494c == u1Var.f273494c && this.f273495d == u1Var.f273495d && this.f273496e == u1Var.f273496e && java.lang.Float.compare(this.f273497f, u1Var.f273497f) == 0;
    }

    public int hashCode() {
        return (((((((((java.lang.Float.hashCode(this.f273492a) * 31) + java.lang.Integer.hashCode(this.f273493b)) * 31) + java.lang.Integer.hashCode(this.f273494c)) * 31) + java.lang.Integer.hashCode(this.f273495d)) * 31) + java.lang.Integer.hashCode(this.f273496e)) * 31) + java.lang.Float.hashCode(this.f273497f);
    }

    public java.lang.String toString() {
        return "BgParams(bgRadius=" + this.f273492a + ", bgLeftTopColor=" + this.f273493b + ", bgRightBottomColor=" + this.f273494c + ", bgMaskColor=" + this.f273495d + ", borderColor=" + this.f273496e + ", borderWidth=" + this.f273497f + ')';
    }
}

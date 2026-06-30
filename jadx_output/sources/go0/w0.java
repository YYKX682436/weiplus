package go0;

/* loaded from: classes14.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f273890a;

    /* renamed from: b, reason: collision with root package name */
    public int f273891b;

    /* renamed from: c, reason: collision with root package name */
    public int f273892c;

    /* renamed from: d, reason: collision with root package name */
    public int f273893d;

    /* renamed from: e, reason: collision with root package name */
    public int f273894e;

    /* renamed from: f, reason: collision with root package name */
    public int f273895f;

    public w0(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f273890a = i17;
        this.f273891b = i18;
        this.f273892c = i19;
        this.f273893d = i27;
        this.f273894e = i28;
        this.f273895f = i29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go0.w0)) {
            return false;
        }
        go0.w0 w0Var = (go0.w0) obj;
        return this.f273890a == w0Var.f273890a && this.f273891b == w0Var.f273891b && this.f273892c == w0Var.f273892c && this.f273893d == w0Var.f273893d && this.f273894e == w0Var.f273894e && this.f273895f == w0Var.f273895f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f273890a) * 31) + java.lang.Integer.hashCode(this.f273891b)) * 31) + java.lang.Integer.hashCode(this.f273892c)) * 31) + java.lang.Integer.hashCode(this.f273893d)) * 31) + java.lang.Integer.hashCode(this.f273894e)) * 31) + java.lang.Integer.hashCode(this.f273895f);
    }

    public java.lang.String toString() {
        return "ViewPortMeta(posX=" + this.f273890a + ", posY=" + this.f273891b + ", drawWidth=" + this.f273892c + ", drawHeight=" + this.f273893d + ", textureWidth=" + this.f273894e + ", textureHeight=" + this.f273895f + ')';
    }
}

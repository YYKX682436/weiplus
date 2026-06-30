package tp0;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f421020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f421021b;

    /* renamed from: c, reason: collision with root package name */
    public final int f421022c;

    /* renamed from: d, reason: collision with root package name */
    public final int f421023d;

    /* renamed from: e, reason: collision with root package name */
    public final int f421024e;

    /* renamed from: f, reason: collision with root package name */
    public final int f421025f;

    public j(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f421020a = i17;
        this.f421021b = i18;
        this.f421022c = i19;
        this.f421023d = i27;
        this.f421024e = i28;
        this.f421025f = i29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0.j)) {
            return false;
        }
        tp0.j jVar = (tp0.j) obj;
        return this.f421020a == jVar.f421020a && this.f421021b == jVar.f421021b && this.f421022c == jVar.f421022c && this.f421023d == jVar.f421023d && this.f421024e == jVar.f421024e && this.f421025f == jVar.f421025f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f421020a) * 31) + java.lang.Integer.hashCode(this.f421021b)) * 31) + java.lang.Integer.hashCode(this.f421022c)) * 31) + java.lang.Integer.hashCode(this.f421023d)) * 31) + java.lang.Integer.hashCode(this.f421024e)) * 31) + java.lang.Integer.hashCode(this.f421025f);
    }

    public java.lang.String toString() {
        return "CommonCoverViewPositionAndSize(x=" + this.f421020a + ", y=" + this.f421021b + ", width=" + this.f421022c + ", height=" + this.f421023d + ", zIndex=" + this.f421024e + ", hide=" + this.f421025f + ')';
    }
}

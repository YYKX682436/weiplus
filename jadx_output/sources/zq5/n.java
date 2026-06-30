package zq5;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final zq5.n f475081e = new zq5.n(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f475082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f475083b;

    /* renamed from: c, reason: collision with root package name */
    public final float f475084c;

    /* renamed from: d, reason: collision with root package name */
    public final float f475085d;

    public n(float f17, float f18, float f19, float f27) {
        this.f475082a = f17;
        this.f475083b = f18;
        this.f475084c = f19;
        this.f475085d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.n)) {
            return false;
        }
        zq5.n nVar = (zq5.n) obj;
        return java.lang.Float.compare(this.f475082a, nVar.f475082a) == 0 && java.lang.Float.compare(this.f475083b, nVar.f475083b) == 0 && java.lang.Float.compare(this.f475084c, nVar.f475084c) == 0 && java.lang.Float.compare(this.f475085d, nVar.f475085d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f475082a) * 31) + java.lang.Float.hashCode(this.f475083b)) * 31) + java.lang.Float.hashCode(this.f475084c)) * 31) + java.lang.Float.hashCode(this.f475085d);
    }

    public java.lang.String toString() {
        return "RectCompat.fromLTRB(" + zq5.b.e(this.f475082a, 1) + ", " + zq5.b.e(this.f475083b, 1) + ", " + zq5.b.e(this.f475084c, 1) + ", " + zq5.b.e(this.f475085d, 1) + ')';
    }
}

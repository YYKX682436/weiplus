package l2;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final l2.m f315125c = new l2.m(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f315126a;

    /* renamed from: b, reason: collision with root package name */
    public final float f315127b;

    public m(float f17, float f18) {
        this.f315126a = f17;
        this.f315127b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2.m)) {
            return false;
        }
        l2.m mVar = (l2.m) obj;
        if (this.f315126a == mVar.f315126a) {
            return (this.f315127b > mVar.f315127b ? 1 : (this.f315127b == mVar.f315127b ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f315126a) * 31) + java.lang.Float.hashCode(this.f315127b);
    }

    public java.lang.String toString() {
        return "TextGeometricTransform(scaleX=" + this.f315126a + ", skewX=" + this.f315127b + ')';
    }
}

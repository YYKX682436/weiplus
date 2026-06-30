package gr5;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final gr5.f f274920e = new gr5.f(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f274921a;

    /* renamed from: b, reason: collision with root package name */
    public final float f274922b;

    /* renamed from: c, reason: collision with root package name */
    public final float f274923c;

    /* renamed from: d, reason: collision with root package name */
    public final float f274924d;

    public f(float f17, float f18, float f19, float f27) {
        this.f274921a = f17;
        this.f274922b = f18;
        this.f274923c = f19;
        this.f274924d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.f)) {
            return false;
        }
        gr5.f fVar = (gr5.f) obj;
        return java.lang.Float.compare(this.f274921a, fVar.f274921a) == 0 && java.lang.Float.compare(this.f274922b, fVar.f274922b) == 0 && java.lang.Float.compare(this.f274923c, fVar.f274923c) == 0 && java.lang.Float.compare(this.f274924d, fVar.f274924d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f274921a) * 31) + java.lang.Float.hashCode(this.f274922b)) * 31) + java.lang.Float.hashCode(this.f274923c)) * 31) + java.lang.Float.hashCode(this.f274924d);
    }

    public java.lang.String toString() {
        return "ContainerWhitespace(left=" + this.f274921a + ", top=" + this.f274922b + ", right=" + this.f274923c + ", bottom=" + this.f274924d + ')';
    }
}

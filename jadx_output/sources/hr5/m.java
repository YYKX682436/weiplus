package hr5;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final hr5.m f284406f;

    /* renamed from: a, reason: collision with root package name */
    public final float f284407a;

    /* renamed from: b, reason: collision with root package name */
    public final float f284408b;

    /* renamed from: c, reason: collision with root package name */
    public final float f284409c;

    /* renamed from: d, reason: collision with root package name */
    public final zq5.v f284410d;

    /* renamed from: e, reason: collision with root package name */
    public final zq5.v f284411e;

    static {
        zq5.v vVar = zq5.v.f475094f;
        f284406f = new hr5.m(1.0f, 1.0f, 1.0f, vVar, vVar);
    }

    public m(float f17, float f18, float f19, zq5.v baseTransform, zq5.v userTransform) {
        kotlin.jvm.internal.o.g(baseTransform, "baseTransform");
        kotlin.jvm.internal.o.g(userTransform, "userTransform");
        this.f284407a = f17;
        this.f284408b = f18;
        this.f284409c = f19;
        this.f284410d = baseTransform;
        this.f284411e = userTransform;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr5.m)) {
            return false;
        }
        hr5.m mVar = (hr5.m) obj;
        return java.lang.Float.compare(this.f284407a, mVar.f284407a) == 0 && java.lang.Float.compare(this.f284408b, mVar.f284408b) == 0 && java.lang.Float.compare(this.f284409c, mVar.f284409c) == 0 && kotlin.jvm.internal.o.b(this.f284410d, mVar.f284410d) && kotlin.jvm.internal.o.b(this.f284411e, mVar.f284411e);
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f284407a) * 31) + java.lang.Float.hashCode(this.f284408b)) * 31) + java.lang.Float.hashCode(this.f284409c)) * 31) + this.f284410d.hashCode()) * 31) + this.f284411e.hashCode();
    }

    public java.lang.String toString() {
        return "InitialZoom(minScale=" + this.f284407a + ", mediumScale=" + this.f284408b + ", maxScale=" + this.f284409c + ", baseTransform=" + this.f284410d + ", userTransform=" + this.f284411e + ')';
    }
}

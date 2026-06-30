package er5;

/* loaded from: classes5.dex */
public final class d implements gr5.d {

    /* renamed from: c, reason: collision with root package name */
    public static final er5.d f256233c;

    /* renamed from: d, reason: collision with root package name */
    public static final er5.d f256234d;

    /* renamed from: a, reason: collision with root package name */
    public final int f256235a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.Interpolator f256236b;

    static {
        android.view.animation.AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
        f256233c = new er5.d(300, accelerateDecelerateInterpolator);
        f256234d = new er5.d(0, accelerateDecelerateInterpolator);
    }

    public d(int i17, android.view.animation.Interpolator interpolator) {
        kotlin.jvm.internal.o.g(interpolator, "interpolator");
        this.f256235a = i17;
        this.f256236b = interpolator;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5.d)) {
            return false;
        }
        er5.d dVar = (er5.d) obj;
        return this.f256235a == dVar.f256235a && kotlin.jvm.internal.o.b(this.f256236b, dVar.f256236b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f256235a) * 31) + this.f256236b.hashCode();
    }

    public java.lang.String toString() {
        return "ZoomAnimationSpec(durationMillis=" + this.f256235a + ", interpolator=" + this.f256236b + ')';
    }
}

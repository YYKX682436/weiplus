package y;

/* loaded from: classes13.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f458368a;

    /* renamed from: b, reason: collision with root package name */
    public final z.k0 f458369b;

    public i1(float f17, z.k0 animationSpec) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        this.f458368a = f17;
        this.f458369b = animationSpec;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.i1)) {
            return false;
        }
        y.i1 i1Var = (y.i1) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f458368a), java.lang.Float.valueOf(i1Var.f458368a)) && kotlin.jvm.internal.o.b(this.f458369b, i1Var.f458369b);
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f458368a) * 31) + this.f458369b.hashCode();
    }

    public java.lang.String toString() {
        return "Fade(alpha=" + this.f458368a + ", animationSpec=" + this.f458369b + ')';
    }
}

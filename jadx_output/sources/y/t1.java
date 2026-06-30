package y;

/* loaded from: classes13.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f458447a;

    /* renamed from: b, reason: collision with root package name */
    public final z.k0 f458448b;

    public t1(yz5.l slideOffset, z.k0 animationSpec) {
        kotlin.jvm.internal.o.g(slideOffset, "slideOffset");
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        this.f458447a = slideOffset;
        this.f458448b = animationSpec;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.t1)) {
            return false;
        }
        y.t1 t1Var = (y.t1) obj;
        return kotlin.jvm.internal.o.b(this.f458447a, t1Var.f458447a) && kotlin.jvm.internal.o.b(this.f458448b, t1Var.f458448b);
    }

    public int hashCode() {
        return (this.f458447a.hashCode() * 31) + this.f458448b.hashCode();
    }

    public java.lang.String toString() {
        return "Slide(slideOffset=" + this.f458447a + ", animationSpec=" + this.f458448b + ')';
    }
}

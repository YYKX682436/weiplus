package y;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final z0.d f458449a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f458450b;

    /* renamed from: c, reason: collision with root package name */
    public final z.k0 f458451c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f458452d;

    public u(z0.d alignment, yz5.l size, z.k0 animationSpec, boolean z17) {
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        this.f458449a = alignment;
        this.f458450b = size;
        this.f458451c = animationSpec;
        this.f458452d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.u)) {
            return false;
        }
        y.u uVar = (y.u) obj;
        return kotlin.jvm.internal.o.b(this.f458449a, uVar.f458449a) && kotlin.jvm.internal.o.b(this.f458450b, uVar.f458450b) && kotlin.jvm.internal.o.b(this.f458451c, uVar.f458451c) && this.f458452d == uVar.f458452d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f458449a.hashCode() * 31) + this.f458450b.hashCode()) * 31) + this.f458451c.hashCode()) * 31;
        boolean z17 = this.f458452d;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    public java.lang.String toString() {
        return "ChangeSize(alignment=" + this.f458449a + ", size=" + this.f458450b + ", animationSpec=" + this.f458451c + ", clip=" + this.f458452d + ')';
    }
}

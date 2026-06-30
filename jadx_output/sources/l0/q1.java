package l0;

/* loaded from: classes14.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.a f314469a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.a f314470b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.a f314471c;

    public q1(i0.a small, i0.a medium, i0.a large, int i17, kotlin.jvm.internal.i iVar) {
        small = (i17 & 1) != 0 ? i0.h.a(4) : small;
        medium = (i17 & 2) != 0 ? i0.h.a(4) : medium;
        large = (i17 & 4) != 0 ? i0.h.a(0) : large;
        kotlin.jvm.internal.o.g(small, "small");
        kotlin.jvm.internal.o.g(medium, "medium");
        kotlin.jvm.internal.o.g(large, "large");
        this.f314469a = small;
        this.f314470b = medium;
        this.f314471c = large;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0.q1)) {
            return false;
        }
        l0.q1 q1Var = (l0.q1) obj;
        return kotlin.jvm.internal.o.b(this.f314469a, q1Var.f314469a) && kotlin.jvm.internal.o.b(this.f314470b, q1Var.f314470b) && kotlin.jvm.internal.o.b(this.f314471c, q1Var.f314471c);
    }

    public int hashCode() {
        return (((this.f314469a.hashCode() * 31) + this.f314470b.hashCode()) * 31) + this.f314471c.hashCode();
    }

    public java.lang.String toString() {
        return "Shapes(small=" + this.f314469a + ", medium=" + this.f314470b + ", large=" + this.f314471c + ')';
    }
}

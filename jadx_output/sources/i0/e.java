package i0;

/* loaded from: classes14.dex */
public final class e implements i0.b {

    /* renamed from: a, reason: collision with root package name */
    public final float f286491a;

    public e(float f17, kotlin.jvm.internal.i iVar) {
        this.f286491a = f17;
    }

    @Override // i0.b
    public float a(long j17, p2.f density) {
        kotlin.jvm.internal.o.g(density, "density");
        return density.R(this.f286491a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0.e) && p2.h.a(this.f286491a, ((i0.e) obj).f286491a);
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f286491a);
    }

    public java.lang.String toString() {
        return "CornerSize(size = " + this.f286491a + ".dp)";
    }
}

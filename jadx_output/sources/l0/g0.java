package l0;

/* loaded from: classes14.dex */
public final class g0 implements l0.f5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f314208a;

    public g0(float f17, kotlin.jvm.internal.i iVar) {
        this.f314208a = f17;
    }

    @Override // l0.f5
    public float a(p2.f fVar, float f17, float f18) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        return f17 + (fVar.R(this.f314208a) * java.lang.Math.signum(f18 - f17));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0.g0) && p2.h.a(this.f314208a, ((l0.g0) obj).f314208a);
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f314208a);
    }

    public java.lang.String toString() {
        return "FixedThreshold(offset=" + ((java.lang.Object) p2.h.b(this.f314208a)) + ')';
    }
}

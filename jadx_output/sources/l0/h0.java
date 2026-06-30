package l0;

/* loaded from: classes14.dex */
public final class h0 implements l0.f5 {
    public h0(float f17) {
    }

    @Override // l0.f5
    public float a(p2.f fVar, float f17, float f18) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        return q2.a.a(f17, f18, 0.5f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0.h0)) {
            return false;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(0.5f);
        ((l0.h0) obj).getClass();
        return kotlin.jvm.internal.o.b(valueOf, java.lang.Float.valueOf(0.5f));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(0.5f);
    }

    public java.lang.String toString() {
        return "FractionalThreshold(fraction=0.5)";
    }
}

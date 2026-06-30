package gr5;

/* loaded from: classes13.dex */
public final class x implements gr5.h0 {
    @Override // gr5.h0
    public gr5.g0 a(long j17, long j18, long j19, gr5.n contentScale, float f17, float f18) {
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        if (kotlin.jvm.internal.o.b(contentScale, gr5.m.f274940g) || f18 <= f17) {
            f18 = f17 * 0.0f;
        }
        return new gr5.g0(f17, f18, 0.0f * f18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.x)) {
            return false;
        }
        ((gr5.x) obj).getClass();
        return java.lang.Float.compare(0.0f, 0.0f) == 0;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(0.0f);
    }

    public java.lang.String toString() {
        return "FixedScalesCalculator(multiple=" + zq5.b.c(0.0f, 2) + ')';
    }
}

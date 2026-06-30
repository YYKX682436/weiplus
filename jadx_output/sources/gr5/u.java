package gr5;

/* loaded from: classes13.dex */
public final class u implements gr5.h0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f274948b;

    public u(float f17, int i17, kotlin.jvm.internal.i iVar) {
        this.f274948b = (i17 & 1) != 0 ? 3.0f : f17;
    }

    @Override // gr5.h0
    public gr5.g0 a(long j17, long j18, long j19, gr5.n contentScale, float f17, float f18) {
        float max;
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        float f19 = this.f274948b;
        float f27 = f17 * f19;
        int i17 = gr5.n.f274941a;
        if (kotlin.jvm.internal.o.b(contentScale, gr5.m.f274940g)) {
            max = f19 * f27;
        } else {
            float max2 = zq5.h.c(j19) ? java.lang.Math.max(((int) (j19 >> 32)) / ((int) (j18 >> 32)), zq5.g.b(j19) / zq5.g.b(j18)) : 1.0f;
            if (f18 <= f17) {
                f18 = java.lang.Math.max(f27, java.lang.Math.max(java.lang.Math.max(((int) (j17 >> 32)) / ((int) (j18 >> 32)), zq5.g.b(j17) / zq5.g.b(j18)), max2));
            }
            max = java.lang.Math.max(f19 * f18, max2);
            f27 = f18;
        }
        return new gr5.g0(f17, f27, max);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr5.u) && java.lang.Float.compare(this.f274948b, ((gr5.u) obj).f274948b) == 0;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f274948b);
    }

    public java.lang.String toString() {
        return "DynamicScalesCalculator(multiple=" + zq5.b.c(this.f274948b, 2) + ')';
    }
}

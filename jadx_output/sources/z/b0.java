package z;

/* loaded from: classes13.dex */
public final class b0 implements z.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f468592a;

    public b0(float f17, float f18, float f19, float f27) {
        this.f468592a = f19;
    }

    @Override // z.h0
    public float a(float f17) {
        if (f17 <= 0.0f || f17 >= 1.0f) {
            return f17;
        }
        float f18 = 0.0f;
        float f19 = 1.0f;
        while (true) {
            float f27 = (f18 + f19) / 2;
            float f28 = 3;
            float f29 = 1 - f27;
            float f37 = f27 * f27 * f27;
            float f38 = (0.4f * f28 * f29 * f29 * f27) + (this.f468592a * f28 * f29 * f27 * f27) + f37;
            if (java.lang.Math.abs(f17 - f38) < 0.001f) {
                return (0.0f * f28 * f29 * f29 * f27) + (f28 * 1.0f * f29 * f27 * f27) + f37;
            }
            if (f38 < f17) {
                f18 = f27;
            } else {
                f19 = f27;
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof z.b0)) {
            return false;
        }
        z.b0 b0Var = (z.b0) obj;
        b0Var.getClass();
        return (this.f468592a > b0Var.f468592a ? 1 : (this.f468592a == b0Var.f468592a ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(0.4f) * 31) + java.lang.Float.hashCode(0.0f)) * 31) + java.lang.Float.hashCode(this.f468592a)) * 31) + java.lang.Float.hashCode(1.0f);
    }
}

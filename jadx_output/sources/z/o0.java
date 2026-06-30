package z;

/* loaded from: classes13.dex */
public final class o0 implements z.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f468765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f468766b;

    /* renamed from: c, reason: collision with root package name */
    public final z.h0 f468767c;

    public o0(int i17, int i18, z.h0 easing) {
        kotlin.jvm.internal.o.g(easing, "easing");
        this.f468765a = i17;
        this.f468766b = i18;
        this.f468767c = easing;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        return new z.z3(this);
    }

    @Override // z.l0
    public float b(long j17, float f17, float f18, float f19) {
        long h17 = e06.p.h((j17 / 1000000) - this.f468766b, 0L, this.f468765a);
        if (h17 < 0) {
            return 0.0f;
        }
        if (h17 == 0) {
            return f19;
        }
        return (e(h17 * 1000000, f17, f18, f19) - e((h17 - 1) * 1000000, f17, f18, f19)) * 1000.0f;
    }

    @Override // z.l0
    public long c(float f17, float f18, float f19) {
        return (this.f468766b + this.f468765a) * 1000000;
    }

    @Override // z.l0
    public float d(float f17, float f18, float f19) {
        return b(c(f17, f18, f19), f17, f18, f19);
    }

    @Override // z.l0
    public float e(long j17, float f17, float f18, float f19) {
        long j18 = (j17 / 1000000) - this.f468766b;
        int i17 = this.f468765a;
        float a17 = this.f468767c.a(e06.p.e(i17 == 0 ? 1.0f : ((float) e06.p.h(j18, 0L, i17)) / i17, 0.0f, 1.0f));
        z.w2 w2Var = z.q3.f468801a;
        return (f17 * (1 - a17)) + (f18 * a17);
    }
}

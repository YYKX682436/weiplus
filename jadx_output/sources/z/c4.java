package z;

/* loaded from: classes13.dex */
public final class c4 implements z.x3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f468621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f468622b;

    /* renamed from: c, reason: collision with root package name */
    public final int f468623c;

    /* renamed from: d, reason: collision with root package name */
    public z.w f468624d;

    /* renamed from: e, reason: collision with root package name */
    public z.w f468625e;

    public c4(java.util.Map keyframes, int i17, int i18) {
        kotlin.jvm.internal.o.g(keyframes, "keyframes");
        this.f468621a = keyframes;
        this.f468622b = i17;
        this.f468623c = i18;
    }

    @Override // z.r3
    public boolean a() {
        return false;
    }

    @Override // z.r3
    public z.w b(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return f(d(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public z.w c(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        int h17 = (int) e06.p.h((j17 / 1000000) - e(), 0L, g());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(h17);
        java.util.Map map = this.f468621a;
        if (map.containsKey(valueOf)) {
            return (z.w) ((jz5.l) kz5.c1.h(map, java.lang.Integer.valueOf(h17))).f302833d;
        }
        int i17 = this.f468622b;
        if (h17 >= i17) {
            return targetValue;
        }
        if (h17 <= 0) {
            return initialValue;
        }
        z.h0 h0Var = z.i0.f468696a;
        z.w wVar = initialValue;
        int i18 = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            jz5.l lVar = (jz5.l) entry.getValue();
            if (h17 > intValue && intValue >= i18) {
                wVar = (z.w) lVar.f302833d;
                h0Var = (z.h0) lVar.f302834e;
                i18 = intValue;
            } else if (h17 < intValue && intValue <= i17) {
                targetValue = (z.w) lVar.f302833d;
                i17 = intValue;
            }
        }
        float a17 = h0Var.a((h17 - i18) / (i17 - i18));
        if (this.f468624d == null) {
            this.f468624d = initialValue.c();
            this.f468625e = initialValue.c();
        }
        int b17 = wVar.b();
        for (int i19 = 0; i19 < b17; i19++) {
            z.w wVar2 = this.f468624d;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("valueVector");
                throw null;
            }
            float a18 = wVar.a(i19);
            float a19 = targetValue.a(i19);
            z.w2 w2Var = z.q3.f468801a;
            wVar2.e(i19, (a18 * (1 - a17)) + (a19 * a17));
        }
        z.w wVar3 = this.f468624d;
        if (wVar3 != null) {
            return wVar3;
        }
        kotlin.jvm.internal.o.o("valueVector");
        throw null;
    }

    @Override // z.r3
    public long d(z.w wVar, z.w wVar2, z.w wVar3) {
        return z.w3.a(this, wVar, wVar2, wVar3);
    }

    @Override // z.x3
    public int e() {
        return this.f468623c;
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        long h17 = e06.p.h((j17 / 1000000) - e(), 0L, g());
        if (h17 <= 0) {
            return initialVelocity;
        }
        z.w a17 = z.u3.a(this, h17 - 1, initialValue, targetValue, initialVelocity);
        z.w a18 = z.u3.a(this, h17, initialValue, targetValue, initialVelocity);
        if (this.f468624d == null) {
            this.f468624d = initialValue.c();
            this.f468625e = initialValue.c();
        }
        int b17 = a17.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar = this.f468625e;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("velocityVector");
                throw null;
            }
            wVar.e(i17, (a17.a(i17) - a18.a(i17)) * 1000.0f);
        }
        z.w wVar2 = this.f468625e;
        if (wVar2 != null) {
            return wVar2;
        }
        kotlin.jvm.internal.o.o("velocityVector");
        throw null;
    }

    @Override // z.x3
    public int g() {
        return this.f468622b;
    }
}

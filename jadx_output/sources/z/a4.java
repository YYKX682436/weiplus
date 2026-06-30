package z;

/* loaded from: classes14.dex */
public final class a4 implements z.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.m0 f468580a;

    /* renamed from: b, reason: collision with root package name */
    public z.w f468581b;

    /* renamed from: c, reason: collision with root package name */
    public z.w f468582c;

    /* renamed from: d, reason: collision with root package name */
    public z.w f468583d;

    public a4(z.m0 floatDecaySpec) {
        kotlin.jvm.internal.o.g(floatDecaySpec, "floatDecaySpec");
        this.f468580a = floatDecaySpec;
    }

    public z.w a(z.w wVar, z.w wVar2) {
        z.w initialValue = wVar;
        z.w initialVelocity = wVar2;
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        if (this.f468583d == null) {
            this.f468583d = wVar.c();
        }
        z.w wVar3 = this.f468583d;
        if (wVar3 == null) {
            kotlin.jvm.internal.o.o("targetVector");
            throw null;
        }
        int b17 = wVar3.b();
        int i17 = 0;
        while (i17 < b17) {
            z.w wVar4 = this.f468583d;
            if (wVar4 == null) {
                kotlin.jvm.internal.o.o("targetVector");
                throw null;
            }
            float a17 = initialValue.a(i17);
            float a18 = initialVelocity.a(i17);
            double b18 = ((y.y1) this.f468580a).f458484a.b(a18);
            double d17 = y.l1.f458394a;
            wVar4.e(i17, a17 + (((float) (r10.f458382a * r10.f458383b * java.lang.Math.exp((d17 / (d17 - 1.0d)) * b18))) * java.lang.Math.signum(a18)));
            i17++;
            initialValue = wVar;
            initialVelocity = wVar2;
        }
        z.w wVar5 = this.f468583d;
        if (wVar5 != null) {
            return wVar5;
        }
        kotlin.jvm.internal.o.o("targetVector");
        throw null;
    }

    public z.w b(long j17, z.w initialValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        if (this.f468582c == null) {
            this.f468582c = initialValue.c();
        }
        z.w wVar = this.f468582c;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("velocityVector");
            throw null;
        }
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            z.w wVar2 = this.f468582c;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("velocityVector");
                throw null;
            }
            initialValue.a(i17);
            float a17 = initialVelocity.a(i17);
            y.y1 y1Var = (y.y1) this.f468580a;
            y1Var.getClass();
            long j18 = j17 / 1000000;
            y.j1 a18 = y1Var.f458484a.a(a17);
            long j19 = a18.f458376c;
            wVar2.e(i17, (((y.b.f458309a.a(j19 > 0 ? ((float) j18) / ((float) j19) : 1.0f).f458304b * java.lang.Math.signum(a18.f458374a)) * a18.f458375b) / ((float) j19)) * 1000.0f);
        }
        z.w wVar3 = this.f468582c;
        if (wVar3 != null) {
            return wVar3;
        }
        kotlin.jvm.internal.o.o("velocityVector");
        throw null;
    }
}

package z;

/* loaded from: classes13.dex */
public final class e4 implements z.x3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f468647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f468648b;

    /* renamed from: c, reason: collision with root package name */
    public final z.z3 f468649c;

    public e4(int i17, int i18, z.h0 easing) {
        kotlin.jvm.internal.o.g(easing, "easing");
        this.f468647a = i17;
        this.f468648b = i18;
        this.f468649c = new z.z3(new z.o0(i17, i18, easing));
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
        return this.f468649c.c(j17, initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public long d(z.w wVar, z.w wVar2, z.w wVar3) {
        return z.w3.a(this, wVar, wVar2, wVar3);
    }

    @Override // z.x3
    public int e() {
        return this.f468648b;
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return this.f468649c.f(j17, initialValue, targetValue, initialVelocity);
    }

    @Override // z.x3
    public int g() {
        return this.f468647a;
    }
}

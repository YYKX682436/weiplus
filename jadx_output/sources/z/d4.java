package z;

/* loaded from: classes13.dex */
public final class d4 implements z.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.z3 f468629a;

    public d4(float f17, float f18, z.w wVar) {
        this.f468629a = new z.z3(wVar != null ? new z.s3(wVar, f17, f18) : new z.t3(f17, f18));
    }

    @Override // z.r3
    public boolean a() {
        this.f468629a.getClass();
        return false;
    }

    @Override // z.r3
    public z.w b(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return this.f468629a.b(initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public z.w c(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return this.f468629a.c(j17, initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public long d(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return this.f468629a.d(initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return this.f468629a.f(j17, initialValue, targetValue, initialVelocity);
    }
}

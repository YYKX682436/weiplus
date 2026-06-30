package z;

/* loaded from: classes13.dex */
public final class b4 implements z.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.x3 f468600a;

    /* renamed from: b, reason: collision with root package name */
    public final z.j1 f468601b;

    /* renamed from: c, reason: collision with root package name */
    public final long f468602c;

    /* renamed from: d, reason: collision with root package name */
    public final long f468603d;

    public b4(z.x3 x3Var, z.j1 j1Var, long j17, kotlin.jvm.internal.i iVar) {
        this.f468600a = x3Var;
        this.f468601b = j1Var;
        this.f468602c = (x3Var.e() + x3Var.g()) * 1000000;
        this.f468603d = j17 * 1000000;
    }

    @Override // z.r3
    public boolean a() {
        return true;
    }

    @Override // z.r3
    public z.w b(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        d(initialValue, targetValue, initialVelocity);
        return f(com.tencent.wcdb.core.Database.DictDefaultMatchValue, initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public z.w c(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        z.x3 x3Var = this.f468600a;
        long h17 = h(j17);
        long j18 = this.f468603d;
        long j19 = j17 + j18;
        long j27 = this.f468602c;
        return x3Var.c(h17, initialValue, targetValue, j19 > j27 ? f(j27 - j18, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // z.r3
    public long d(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        kotlin.jvm.internal.o.g(targetValue, "targetValue");
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        z.x3 x3Var = this.f468600a;
        long h17 = h(j17);
        long j18 = this.f468603d;
        long j19 = j17 + j18;
        long j27 = this.f468602c;
        return x3Var.f(h17, initialValue, targetValue, j19 > j27 ? f(j27 - j18, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    public final long h(long j17) {
        long j18 = this.f468603d;
        if (j17 + j18 <= 0) {
            return 0L;
        }
        long j19 = j17 + j18;
        long j27 = this.f468602c;
        long j28 = j19 / j27;
        return (this.f468601b == z.j1.Restart || j28 % ((long) 2) == 0) ? j19 - (j28 * j27) : ((j28 + 1) * j27) - j19;
    }
}

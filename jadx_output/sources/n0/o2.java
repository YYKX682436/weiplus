package n0;

/* loaded from: classes11.dex */
public final class o2 implements n0.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f333632d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f333633e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f333634f;

    public o2(oz5.l parentCoroutineContext, yz5.p task) {
        kotlin.jvm.internal.o.g(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.o.g(task, "task");
        this.f333632d = task;
        this.f333633e = kotlinx.coroutines.z0.a(parentCoroutineContext);
    }

    @Override // n0.e4
    public void b() {
        kotlinx.coroutines.r2 r2Var = this.f333634f;
        if (r2Var != null) {
            ((kotlinx.coroutines.c3) r2Var).b(kotlinx.coroutines.e2.a("Old job was still running!", null));
        }
        this.f333634f = kotlinx.coroutines.l.d(this.f333633e, null, null, this.f333632d, 3, null);
    }

    @Override // n0.e4
    public void c() {
        kotlinx.coroutines.r2 r2Var = this.f333634f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f333634f = null;
    }

    @Override // n0.e4
    public void d() {
        kotlinx.coroutines.r2 r2Var = this.f333634f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f333634f = null;
    }
}

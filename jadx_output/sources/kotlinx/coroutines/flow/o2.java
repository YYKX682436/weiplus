package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class o2 implements kotlinx.coroutines.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.q2 f310352d;

    /* renamed from: e, reason: collision with root package name */
    public final long f310353e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f310354f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f310355g;

    public o2(kotlinx.coroutines.flow.q2 q2Var, long j17, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f310352d = q2Var;
        this.f310353e = j17;
        this.f310354f = obj;
        this.f310355g = continuation;
    }

    @Override // kotlinx.coroutines.s1
    public void dispose() {
        kotlinx.coroutines.flow.q2 q2Var = this.f310352d;
        synchronized (q2Var) {
            if (this.f310353e < q2Var.p()) {
                return;
            }
            java.lang.Object[] objArr = q2Var.f310375n;
            kotlin.jvm.internal.o.d(objArr);
            int i17 = (int) this.f310353e;
            if (objArr[(objArr.length - 1) & i17] != this) {
                return;
            }
            objArr[i17 & (objArr.length - 1)] = kotlinx.coroutines.flow.r2.f310389a;
            q2Var.k();
        }
    }
}

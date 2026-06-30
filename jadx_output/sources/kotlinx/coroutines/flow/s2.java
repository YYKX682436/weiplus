package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class s2 extends v26.d {

    /* renamed from: a, reason: collision with root package name */
    public long f310402a = -1;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.coroutines.Continuation f310403b;

    @Override // v26.d
    public boolean a(java.lang.Object obj) {
        kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) obj;
        if (this.f310402a >= 0) {
            return false;
        }
        long j17 = q2Var.f310376o;
        if (j17 < q2Var.f310377p) {
            q2Var.f310377p = j17;
        }
        this.f310402a = j17;
        return true;
    }

    @Override // v26.d
    public kotlin.coroutines.Continuation[] b(java.lang.Object obj) {
        long j17 = this.f310402a;
        this.f310402a = -1L;
        this.f310403b = null;
        return ((kotlinx.coroutines.flow.q2) obj).v(j17);
    }
}

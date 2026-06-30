package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class b4 extends kotlinx.coroutines.p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.b4 f310145e = new kotlinx.coroutines.b4();

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        kotlinx.coroutines.f4 f4Var = (kotlinx.coroutines.f4) lVar.get(kotlinx.coroutines.f4.f310183e);
        if (f4Var == null) {
            throw new java.lang.UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f4Var.f310184d = true;
    }

    @Override // kotlinx.coroutines.p0
    public kotlinx.coroutines.p0 J(int i17) {
        throw new java.lang.UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.p0
    public java.lang.String toString() {
        return "Dispatchers.Unconfined";
    }
}

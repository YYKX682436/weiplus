package fn5;

/* loaded from: classes3.dex */
public final class y implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264772d;

    public y(fn5.n0 n0Var) {
        this.f264772d = n0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + arrayList.size());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new fn5.x(arrayList, this.f264772d, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }
}

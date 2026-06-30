package fn5;

/* loaded from: classes5.dex */
public final class d0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264652d;

    public d0(fn5.n0 n0Var) {
        this.f264652d = n0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.util.Pair pair = (android.util.Pair) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyPersonReq: " + java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryViewModel", "applyPersonReq >> cropImage size: " + ((java.util.ArrayList) pair.first).size() + "  personImage size: " + ((java.util.ArrayList) pair.second).size());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new fn5.c0(pair, this.f264652d, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }
}

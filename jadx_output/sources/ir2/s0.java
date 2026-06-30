package ir2;

/* loaded from: classes2.dex */
public final class s0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f294216d;

    public s0(yz5.l lVar) {
        this.f294216d = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ir2.v1 v1Var = (ir2.v1) obj;
        com.tencent.mars.xlog.Log.i("Finder.NewLoader", "observeState state:" + v1Var);
        this.f294216d.invoke(v1Var);
        return jz5.f0.f302826a;
    }
}

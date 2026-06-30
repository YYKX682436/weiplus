package l0;

/* loaded from: classes14.dex */
public final class g3 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f314211d;

    public g3(x0.i0 i0Var) {
        this.f314211d = i0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.r;
        x0.i0 i0Var = this.f314211d;
        if (z17) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.s) {
            i0Var.remove(((c0.s) mVar).f36944a);
        } else if (mVar instanceof c0.q) {
            i0Var.remove(((c0.q) mVar).f36942a);
        } else if (mVar instanceof c0.b) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.c) {
            i0Var.remove(((c0.c) mVar).f36928a);
        } else if (mVar instanceof c0.a) {
            i0Var.remove(((c0.a) mVar).f36927a);
        }
        return jz5.f0.f302826a;
    }
}

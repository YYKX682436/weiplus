package l0;

/* loaded from: classes14.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f314493d;

    public r(x0.i0 i0Var) {
        this.f314493d = i0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.i;
        x0.i0 i0Var = this.f314493d;
        if (z17) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.j) {
            i0Var.remove(((c0.j) mVar).f36935a);
        } else if (mVar instanceof c0.d) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.e) {
            i0Var.remove(((c0.e) mVar).f36929a);
        } else if (mVar instanceof c0.r) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.s) {
            i0Var.remove(((c0.s) mVar).f36944a);
        } else if (mVar instanceof c0.q) {
            i0Var.remove(((c0.q) mVar).f36942a);
        }
        return jz5.f0.f302826a;
    }
}

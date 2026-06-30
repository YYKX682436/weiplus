package g4;

/* loaded from: classes5.dex */
public final class g implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.h f268296d;

    public g(g4.h hVar) {
        this.f268296d = hVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kz5.u0 u0Var = (kz5.u0) obj;
        g4.h hVar = this.f268296d;
        hVar.f268323g.f310116d = u0Var.f314015a;
        java.lang.Object t17 = ((g4.n4) hVar.f268321e).t(u0Var.f314016b, continuation);
        return t17 == pz5.a.f359186d ? t17 : jz5.f0.f302826a;
    }
}

package v26;

/* loaded from: classes14.dex */
public final class e0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f432994d;

    public e0(yz5.q qVar) {
        this.f432994d = qVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        v26.f0 f0Var = new v26.f0(this.f432994d, kVar, null);
        v26.d0 d0Var = new v26.d0(continuation.getContext(), continuation);
        java.lang.Object b17 = w26.a.b(d0Var, d0Var, f0Var);
        return b17 == pz5.a.f359186d ? b17 : jz5.f0.f302826a;
    }
}

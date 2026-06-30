package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class r implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.t f310380d;

    public r(u26.t tVar) {
        this.f310380d = tVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = kotlinx.coroutines.flow.t.a(kVar, this.f310380d.d(), true, continuation);
        pz5.a aVar = pz5.a.f359186d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (a17 != aVar) {
            a17 = f0Var;
        }
        return a17 == aVar ? a17 : f0Var;
    }
}

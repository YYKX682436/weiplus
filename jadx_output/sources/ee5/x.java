package ee5;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f252081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ee5.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252081d = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.x(this.f252081d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.x xVar = (ee5.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        aq.n nVar = aq.o.f12922c;
        if (nVar != null) {
            nVar.a(this.f252081d.getActivity());
        }
        return jz5.f0.f302826a;
    }
}

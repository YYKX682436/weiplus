package ix3;

/* loaded from: classes10.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.y f295601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ix3.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295601d = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix3.x(this.f295601d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.x xVar = (ix3.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j75.f Q6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ix3.y yVar = this.f295601d;
        j75.f Q62 = yVar.Q6();
        if (Q62 != null && ((ix3.p0) Q62.getState()) != null && (Q6 = yVar.Q6()) != null) {
            Q6.B3(new ix3.f0(ix3.i.f295434j.a()));
        }
        return jz5.f0.f302826a;
    }
}

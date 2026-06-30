package xo5;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xo5.n f455777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xo5.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455777d = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xo5.c(this.f455777d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xo5.c cVar = (xo5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((yo5.e) this.f455777d.f455796g.getValue()).P();
        return jz5.f0.f302826a;
    }
}

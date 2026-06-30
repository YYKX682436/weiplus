package fo5;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265118d = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.t(this.f265118d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.t tVar = (fo5.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        lo5.h.b(this.f265118d.f265095n, false, 1, null);
        return jz5.f0.f302826a;
    }
}

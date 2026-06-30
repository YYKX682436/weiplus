package zr0;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.s f475177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(zr0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f475177d = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zr0.r(this.f475177d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zr0.r rVar = (zr0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zr0.s sVar = this.f475177d;
        ms0.c cVar = sVar.A;
        if (cVar != null) {
            cVar.n(true);
        }
        sVar.A = null;
        return jz5.f0.f302826a;
    }
}

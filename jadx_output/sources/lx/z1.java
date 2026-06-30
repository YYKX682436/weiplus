package lx;

/* loaded from: classes.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322024d = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.z1(this.f322024d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lx.z1 z1Var = (lx.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f322024d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        return jz5.f0.f302826a;
    }
}

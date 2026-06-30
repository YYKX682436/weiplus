package th5;

/* loaded from: classes11.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.o f419339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(th5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419339d = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.a0(this.f419339d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        th5.a0 a0Var = (th5.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.l lVar = this.f419339d.f419425j;
        if (lVar != null) {
            lVar.invoke(new java.lang.Float(0.0f));
        }
        return jz5.f0.f302826a;
    }
}

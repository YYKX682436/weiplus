package so2;

/* loaded from: classes8.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f410596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f410597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(so2.k5 k5Var, jz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410596d = k5Var;
        this.f410597e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.s5(this.f410596d, this.f410597e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        so2.s5 s5Var = (so2.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.l lVar = this.f410597e;
        this.f410596d.a("", 0, ((java.lang.Number) lVar.f302833d).intValue(), (java.lang.String) lVar.f302834e);
        return jz5.f0.f302826a;
    }
}

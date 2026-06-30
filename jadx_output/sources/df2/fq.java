package df2;

/* loaded from: classes3.dex */
public final class fq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f230157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f230158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(yz5.l lVar, df2.gq gqVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230157d = lVar;
        this.f230158e = gqVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.fq(this.f230157d, this.f230158e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.fq fqVar = (df2.fq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f230157d.invoke(this.f230158e.f230238n);
        return jz5.f0.f302826a;
    }
}

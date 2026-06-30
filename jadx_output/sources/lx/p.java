package lx;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.l lVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321899d = lVar;
        this.f321900e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.p(this.f321899d, this.f321900e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lx.p pVar = (lx.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321899d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(this.f321900e)));
        return jz5.f0.f302826a;
    }
}

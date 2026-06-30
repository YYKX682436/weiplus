package lx;

/* loaded from: classes.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f321710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(yz5.l lVar, java.lang.Exception exc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321709d = lVar;
        this.f321710e = exc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.c2(this.f321709d, this.f321710e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lx.c2 c2Var = (lx.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f321709d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(this.f321710e))));
        return jz5.f0.f302826a;
    }
}

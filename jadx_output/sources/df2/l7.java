package df2;

/* loaded from: classes.dex */
public final class l7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.s8 s8Var) {
        super(2, continuation);
        this.f230648d = hVar;
        this.f230649e = s8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.l7(this.f230648d, continuation, this.f230649e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.l7 l7Var = (df2.l7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f230649e.m7(df2.h7.f230307m);
        return jz5.f0.f302826a;
    }
}

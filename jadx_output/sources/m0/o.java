package m0;

/* loaded from: classes13.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.r f322490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322490e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        m0.o oVar = new m0.o(this.f322490e, continuation);
        oVar.f322489d = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f322489d;
        m0.r rVar = this.f322490e;
        kotlinx.coroutines.l.d(y0Var, null, null, new m0.l(rVar, null), 3, null);
        kotlinx.coroutines.l.d(y0Var, null, null, new m0.m(rVar, null), 3, null);
        return kotlinx.coroutines.l.d(y0Var, null, null, new m0.n(rVar, null), 3, null);
    }
}

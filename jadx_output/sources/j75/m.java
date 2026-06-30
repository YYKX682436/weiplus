package j75;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j75.r f298079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.a f298080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j75.r rVar, j75.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298079d = rVar;
        this.f298080e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j75.m(this.f298079d, this.f298080e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j75.m mVar = (j75.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f298079d.f298090h.notify(this.f298080e);
        return jz5.f0.f302826a;
    }
}

package wc5;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wc5.q qVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444598d = qVar;
        this.f444599e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.l(this.f444598d, this.f444599e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.l lVar = (wc5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wc5.q qVar = this.f444598d;
        qVar.V6();
        qVar.Z6(this.f444599e);
        return jz5.f0.f302826a;
    }
}

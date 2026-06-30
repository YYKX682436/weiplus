package ed2;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f251265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251265d = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ed2.g(this.f251265d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ed2.g gVar = (ed2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f251265d.invoke();
        return jz5.f0.f302826a;
    }
}

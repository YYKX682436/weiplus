package g43;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f268775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g43.x xVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268775d = xVar;
        this.f268776e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.q(this.f268775d, this.f268776e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.q qVar = (g43.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((y33.h) this.f268775d.f268798h.getValue()).jc(this.f268776e);
        return jz5.f0.f302826a;
    }
}

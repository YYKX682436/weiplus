package qy1;

/* loaded from: classes13.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qy1.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367748d = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.q(this.f367748d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qy1.q qVar = (qy1.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((u26.k) this.f367748d.f367713l.f367745c).b(null);
        return jz5.f0.f302826a;
    }
}

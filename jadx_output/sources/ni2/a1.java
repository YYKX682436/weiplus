package ni2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.f1 f337253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ni2.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337253d = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.a1(this.f337253d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ni2.a1 a1Var = (ni2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f337253d.a();
        return jz5.f0.f302826a;
    }
}

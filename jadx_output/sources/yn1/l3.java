package yn1;

/* loaded from: classes11.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.p0 f463747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(bw5.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463747d = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.l3(this.f463747d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.l3 l3Var = (yn1.l3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yn1.z0 z0Var = yn1.z0.f463933a;
        bw5.p0 sceneModel = this.f463747d;
        kotlin.jvm.internal.o.g(sceneModel, "sceneModel");
        yn1.z0.f463940h = sceneModel;
        z0Var.p();
        return jz5.f0.f302826a;
    }
}

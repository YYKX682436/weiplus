package yn1;

/* loaded from: classes9.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463924d = r2Var;
        this.f463925e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.y1(this.f463924d, this.f463925e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.y1 y1Var = (yn1.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.wechat.aff.migration.g gVar = this.f463924d.f463810a;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        gVar.g1(this.f463925e, oo1.o.f347151a.d());
        return jz5.f0.f302826a;
    }
}

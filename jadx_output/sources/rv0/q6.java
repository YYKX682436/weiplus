package rv0;

/* loaded from: classes5.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f400211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(rv0.z6 z6Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400210e = z6Var;
        this.f400211f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.q6(this.f400210e, this.f400211f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.q6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400209d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rv0.z6 z6Var = this.f400210e;
            com.tencent.maas.model.time.MJTime r76 = z6Var.r7(null);
            this.f400209d = 1;
            if (rv0.z6.n7(z6Var, r76, this.f400211f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

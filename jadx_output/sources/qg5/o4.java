package qg5;

/* loaded from: classes8.dex */
public final class o4 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f363114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f363115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(qg5.q4 q4Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f363115e = q4Var;
        this.f363116f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new qg5.o4(this.f363115e, this.f363116f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((qg5.o4) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363114d;
        qg5.q4 q4Var = this.f363115e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ct.q2 V6 = q4Var.V6();
            this.f363114d = 1;
            obj = ((qg5.l0) V6).nj(this.f363116f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((java.lang.Boolean) obj).booleanValue();
        ((qg5.l0) q4Var.V6()).ij();
        return obj;
    }
}

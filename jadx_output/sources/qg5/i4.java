package qg5;

/* loaded from: classes8.dex */
public final class i4 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f363019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f363020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(qg5.q4 q4Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f363020e = q4Var;
        this.f363021f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new qg5.i4(this.f363020e, this.f363021f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((qg5.i4) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363019d;
        qg5.q4 q4Var = this.f363020e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ct.q2 V6 = q4Var.V6();
            this.f363019d = 1;
            obj = ((qg5.l0) V6).nj(this.f363021f, this);
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

package n0;

/* loaded from: classes3.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333729d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f333731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.r2 f333732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(yz5.q qVar, n0.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333731f = qVar;
        this.f333732g = r2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n0.v3 v3Var = new n0.v3(this.f333731f, this.f333732g, continuation);
        v3Var.f333730e = obj;
        return v3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.v3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333729d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f333730e;
            this.f333729d = 1;
            if (this.f333731f.invoke(y0Var, this.f333732g, this) == aVar) {
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

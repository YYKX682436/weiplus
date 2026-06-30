package h4;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278660d;

    /* renamed from: e, reason: collision with root package name */
    public int f278661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.k0 f278662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(h4.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278662f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        h4.h0 h0Var = new h4.h0(this.f278662f, completion);
        h0Var.f278660d = obj;
        return h0Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.h0) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278661e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f278660d;
            java.lang.Object obj3 = h4.k0.f278677d;
            java.lang.Object obj4 = h4.k0.f278677d;
            h4.k0 k0Var = this.f278662f;
            if (obj2 == obj4) {
                h4.k0.a(k0Var);
            } else {
                this.f278661e = 1;
                h4.i iVar = (h4.i) k0Var;
                iVar.getClass();
                if (iVar.h((h4.q) obj2, this) == aVar) {
                    return aVar;
                }
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

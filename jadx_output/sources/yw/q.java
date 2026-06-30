package yw;

/* loaded from: classes9.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f466426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f466427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f466428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yw.y yVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466427e = yVar;
        this.f466428f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw.q(this.f466427e, this.f466428f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466426d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.storage.v9 v9Var = com.tencent.mm.storage.w9.f196313a;
            this.f466426d = 1;
            obj = v9Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.q(new yw.p(this.f466427e, this.f466428f, (com.tencent.wechat.mm.biz.l1) obj));
        return jz5.f0.f302826a;
    }
}

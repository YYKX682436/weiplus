package r01;

/* loaded from: classes7.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f368255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f368256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f368257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r01.l1 l1Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f368256e = l1Var;
        this.f368257f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new r01.u0(this.f368256e, this.f368257f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((r01.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f368255d;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("TAG", "Error: " + e17.getMessage());
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r01.s0 s0Var = new r01.s0(this.f368256e, null);
            this.f368255d = 1;
            obj = kotlinx.coroutines.z0.f(s0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        com.tencent.wechat.mm.biz.b bVar = (com.tencent.wechat.mm.biz.b) lVar.f302833d;
        com.tencent.wechat.mm.biz.b bVar2 = (com.tencent.wechat.mm.biz.b) lVar.f302834e;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        r01.t0 t0Var = new r01.t0(this.f368257f, bVar, bVar2, null);
        this.f368255d = 2;
        if (kotlinx.coroutines.l.g(g3Var, t0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}

package rm;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397372d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.g f397374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.v1 f397375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.wechat.iam.biz.g gVar, com.tencent.wechat.iam.biz.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397374f = gVar;
        this.f397375g = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        rm.g gVar = new rm.g(this.f397374f, this.f397375g, continuation);
        gVar.f397373e = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.f1 b17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397372d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f397373e;
            com.tencent.wechat.iam.biz.g gVar = this.f397374f;
            com.tencent.wechat.iam.biz.v1 v1Var = this.f397375g;
            kotlinx.coroutines.f1 b18 = kotlinx.coroutines.l.b(y0Var, null, null, new rm.d(gVar, v1Var, null), 3, null);
            b17 = kotlinx.coroutines.l.b(y0Var, null, null, new rm.f(gVar, v1Var, null), 3, null);
            this.f397373e = b17;
            this.f397372d = 1;
            obj = ((kotlinx.coroutines.g1) b18).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f397373e;
                kotlin.ResultKt.throwOnFailure(obj);
                return new jz5.l(obj2, obj);
            }
            b17 = (kotlinx.coroutines.f1) this.f397373e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f397373e = obj;
        this.f397372d = 2;
        java.lang.Object k17 = b17.k(this);
        if (k17 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = k17;
        return new jz5.l(obj2, obj);
    }
}

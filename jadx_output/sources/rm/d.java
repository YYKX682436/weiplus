package rm;

/* loaded from: classes8.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397360d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397361e;

    /* renamed from: f, reason: collision with root package name */
    public int f397362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.g f397363g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.iam.biz.v1 f397364h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.wechat.iam.biz.g gVar, com.tencent.wechat.iam.biz.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397363g = gVar;
        this.f397364h = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rm.d(this.f397363g, this.f397364h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397362f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.wechat.iam.biz.g gVar = this.f397363g;
            this.f397360d = gVar;
            com.tencent.wechat.iam.biz.v1 v1Var = this.f397364h;
            this.f397361e = v1Var;
            this.f397362f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            gVar.d(v1Var, new rm.c(rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

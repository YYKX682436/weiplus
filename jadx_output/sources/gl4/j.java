package gl4;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.u80 f272863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl4.a f272864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f272865h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gl4.z zVar, bw5.u80 u80Var, gl4.a aVar, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f272862e = zVar;
        this.f272863f = u80Var;
        this.f272864g = aVar;
        this.f272865h = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gl4.j(this.f272862e, this.f272863f, this.f272864g, this.f272865h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl4.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ie baseResponse;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272861d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f272861d = 1;
            obj = this.f272862e.b(this.f272863f, 1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bw5.y80 y80Var = (bw5.y80) obj;
        boolean z17 = (y80Var == null || (baseResponse = y80Var.getBaseResponse()) == null || baseResponse.f376959d != 0) ? false : true;
        kotlin.coroutines.Continuation continuation = this.f272865h;
        if (z17) {
            gl4.a aVar2 = this.f272864g;
            if (aVar2 != null) {
                aVar2.f272843b = y80Var.f35403h[3] ? y80Var.f35400e : new bw5.r70();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinMembershipByWeCoin success, respBuffer length: ");
            sb6.append((y80Var.f35403h[2] ? y80Var.f35399d : com.tencent.mm.protobuf.g.f192155b).f192156a.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl((y80Var.f35403h[2] ? y80Var.f35399d : com.tencent.mm.protobuf.g.f192155b).g()));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}

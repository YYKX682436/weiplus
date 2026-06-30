package f00;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f258311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f258313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f258314h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, java.lang.String str, int i17, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258311e = j17;
        this.f258312f = str;
        this.f258313g = i17;
        this.f258314h = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f00.i(this.f258311e, this.f258312f, this.f258313g, this.f258314h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f00.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258310d;
        boolean z17 = false;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.ne0 ne0Var = new bw5.ne0();
            ne0Var.d(this.f258311e);
            ne0Var.c(this.f258312f);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            this.f258310d = 1;
            obj = ((b00.r) z2Var).vj(ne0Var, this.f258313g, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bw5.qe0 qe0Var = (bw5.qe0) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (qe0Var == null) {
            return f0Var;
        }
        int i18 = qe0Var.b().f31595f;
        int i19 = qe0Var.b().f31594e;
        if (i18 == 1 && i19 == 1) {
            z17 = true;
        }
        this.f258314h.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        return f0Var;
    }
}

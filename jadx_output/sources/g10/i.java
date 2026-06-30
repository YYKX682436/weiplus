package g10;

/* loaded from: classes7.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f267523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g10.v f267524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.s7 f267525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f267527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g10.v vVar, bw5.s7 s7Var, java.lang.String str, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f267524e = vVar;
        this.f267525f = s7Var;
        this.f267526g = str;
        this.f267527h = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g10.i(this.f267524e, this.f267525f, this.f267526g, this.f267527h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g10.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f267523d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g10.v vVar = this.f267524e;
            bw5.s7 s7Var = this.f267525f;
            if (!vVar.Ni(s7Var)) {
                this.f267523d = 1;
                obj = g10.v.wi(vVar, s7Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "checkBizValid, bizName = " + this.f267526g + ", result = " + z17);
            this.f267527h.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!((java.lang.Boolean) obj).booleanValue()) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "checkBizValid, bizName = " + this.f267526g + ", result = " + z17);
        this.f267527h.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
        return jz5.f0.f302826a;
    }
}

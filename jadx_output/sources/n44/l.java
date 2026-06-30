package n44;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f334967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n44.p f334968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab0.v f334969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f334970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f334971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334972i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334973m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334974n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334975o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f334976p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s34.p1 f334977q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334978r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n44.p pVar, ab0.v vVar, android.content.Intent intent, int i17, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, s34.p1 p1Var, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334968e = pVar;
        this.f334969f = vVar;
        this.f334970g = intent;
        this.f334971h = i17;
        this.f334972i = context;
        this.f334973m = str;
        this.f334974n = str2;
        this.f334975o = str3;
        this.f334976p = i18;
        this.f334977q = p1Var;
        this.f334978r = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        n44.l lVar = new n44.l(this.f334968e, this.f334969f, this.f334970g, this.f334971h, this.f334972i, this.f334973m, this.f334974n, this.f334975o, this.f334976p, this.f334977q, this.f334978r, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        java.lang.Object invokeSuspend = ((n44.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f334967d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f334969f;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) obj2;
            n44.k kVar = new n44.k(this.f334968e, this.f334970g, this.f334971h, this.f334972i, this.f334973m, this.f334974n, this.f334975o, this.f334976p, this.f334977q, this.f334978r);
            this.f334967d = 1;
            this.f334968e.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            n44.n nVar = new n44.n(m1Var, rVar, kVar);
            gm0.j1.d().a(m1Var.getType(), nVar);
            rVar.m(new n44.m(m1Var, nVar));
            gm0.j1.d().g(m1Var);
            java.lang.Object j17 = rVar.j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1");
        return f0Var;
    }
}

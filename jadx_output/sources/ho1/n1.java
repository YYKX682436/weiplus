package ho1;

/* loaded from: classes9.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn1.k f282765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.w0 f282766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f282767i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282768m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(long j17, java.lang.String str, xn1.k kVar, bw5.w0 w0Var, long j18, ho1.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282763e = j17;
        this.f282764f = str;
        this.f282765g = kVar;
        this.f282766h = w0Var;
        this.f282767i = j18;
        this.f282768m = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ho1.n1(this.f282763e, this.f282764f, this.f282765g, this.f282766h, this.f282767i, this.f282768m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ho1.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f282762d;
        xn1.k kVar = this.f282765g;
        java.lang.String str = this.f282764f;
        long j17 = this.f282763e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[insertChatPackageAsync] Real start, taskId=" + j17 + ", convId=" + str + ", st=" + kVar);
            co1.g gVar = co1.g.f43768a;
            java.lang.String str2 = this.f282764f;
            bw5.w0 w0Var = this.f282766h;
            long j18 = this.f282767i;
            this.f282762d = 1;
            if (gVar.k(str2, w0Var, j18, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oo1.o.f347151a.f(str);
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282768m.f282787a;
        if (g0Var != null) {
            g0Var.v(j17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[insertChatPackageAsync] Done, taskId=" + j17 + ", convId=" + str + ", st=" + kVar);
        return jz5.f0.f302826a;
    }
}

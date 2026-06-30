package pz0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359138d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pz0.m f359140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f359141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pz0.m mVar, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359140f = mVar;
        this.f359141g = j17;
        this.f359142h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pz0.k kVar = new pz0.k(this.f359140f, this.f359141g, this.f359142h, continuation);
        kVar.f359139e = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359138d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f359142h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.n7 n7Var = this.f359140f.f359150g;
            if (n7Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: movieSessionManager is null");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                return f0Var;
            }
            com.tencent.maas.model.time.MJTime fromMilliseconds = com.tencent.maas.model.time.MJTime.fromMilliseconds(this.f359141g);
            kotlin.jvm.internal.o.f(fromMilliseconds, "fromMilliseconds(...)");
            this.f359138d = 1;
            obj = az0.n7.p(n7Var, fromMilliseconds, null, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "startPlay: ret " + booleanValue);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue))));
        return f0Var;
    }
}

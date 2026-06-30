package pz0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359143d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pz0.m f359145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pz0.m mVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359145f = mVar;
        this.f359146g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pz0.l lVar = new pz0.l(this.f359145f, this.f359146g, continuation);
        lVar.f359144e = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359143d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f359146g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.n7 n7Var = this.f359145f.f359150g;
            if (n7Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay: movieSessionManager is null");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                return f0Var;
            }
            this.f359143d = 1;
            obj = n7Var.q(this);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "stopPlay: " + booleanValue);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue))));
        return f0Var;
    }
}

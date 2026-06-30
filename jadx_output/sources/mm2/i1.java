package mm2;

/* loaded from: classes3.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f329136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String str, mm2.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329135e = str;
        this.f329136f = s1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.i1(this.f329135e, this.f329136f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329134d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context n17 = com.tencent.mm.app.w.INSTANCE.n();
            kotlin.jvm.internal.o.f(n17, "getTopContext(...)");
            java.lang.String appid = this.f329135e;
            kotlin.jvm.internal.o.f(appid, "$appid");
            this.f329134d = 1;
            obj = ((com.tencent.mm.feature.finder.live.v4) w0Var).Sj(n17, appid, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.n73 n73Var = (r45.n73) obj;
        mm2.s1 s1Var = this.f329136f;
        java.lang.String str = s1Var.f329386f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initGameModeFromCache] gameInfo = ");
        if (n73Var == null || (obj2 = pm0.b0.g(n73Var)) == null) {
            obj2 = "null";
        }
        sb6.append(obj2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (n73Var != null) {
            ((mm2.g1) s1Var.business(mm2.g1.class)).V6(n73Var);
        }
        return jz5.f0.f302826a;
    }
}

package nu0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340032d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f340033e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f340034f;

    /* renamed from: g, reason: collision with root package name */
    public int f340035g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f340036h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f340037i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f340038m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nu0.q0 q0Var, android.view.SurfaceView surfaceView, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340036h = q0Var;
        this.f340037i = surfaceView;
        this.f340038m = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.n0(this.f340036h, this.f340037i, this.f340038m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f340035g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nu0.q0 q0Var = this.f340036h;
            android.view.SurfaceView surfaceView = this.f340037i;
            java.util.List list = this.f340038m;
            this.f340032d = q0Var;
            this.f340033e = surfaceView;
            this.f340034f = list;
            this.f340035g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            try {
                com.tencent.maas.base.Vec2 c76 = q0Var.c7();
                com.tencent.maas.base.Vec2 vec2 = new com.tencent.maas.base.Vec2(128.0f, 128.0f);
                com.tencent.maas.imagestudio.MJImageMaskStyle a17 = com.tencent.maas.imagestudio.MJImageMaskStyle.a();
                com.tencent.maas.imagestudio.MJImageSessionStartupSettings mJImageSessionStartupSettings = new com.tencent.maas.imagestudio.MJImageSessionStartupSettings(c76, vec2);
                com.tencent.maas.imagestudio.MJImageSession mJImageSession = q0Var.f340075r;
                if (mJImageSession != null) {
                    mJImageSession.o(surfaceView, list, a17, mJImageSessionStartupSettings, new nu0.l0(q0Var, rVar));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ImageControlUIC", "[startup] failed, " + e17.getMessage());
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17)));
            }
            rVar.m(nu0.m0.f340016d);
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
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

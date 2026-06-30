package h63;

/* loaded from: classes7.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f279214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h63.g1 f279215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(h63.g1 g1Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279215e = g1Var;
        this.f279216f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h63.b1(this.f279215e, this.f279216f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h63.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f279214d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h63.g1 g1Var = this.f279215e;
            boolean z17 = false;
            if (g1Var.f279235e) {
                kotlinx.coroutines.r2 r2Var2 = g1Var.f279236f;
                if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
                    z17 = true;
                }
                if (z17 && (r2Var = g1Var.f279236f) != null) {
                    this.f279214d = 1;
                    if (kotlinx.coroutines.v2.d(r2Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "do start service");
                    int i18 = android.os.Build.VERSION.SDK_INT;
                    android.content.Context context = this.f279216f;
                    if (i18 >= 26) {
                        context.startForegroundService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.gamelive.service.GameLiveForegroundService.class));
                    } else {
                        context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.gamelive.service.GameLiveForegroundService.class));
                    }
                    g1Var.f279235e = true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameLiveMainProcessService", e17, "start foreground service error", new java.lang.Object[0]);
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

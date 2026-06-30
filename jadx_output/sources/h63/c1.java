package h63;

/* loaded from: classes7.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f279218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h63.g1 f279220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Context context, h63.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279219e = context;
        this.f279220f = g1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h63.c1(this.f279219e, this.f279220f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h63.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context = this.f279219e;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f279218d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f279218d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainProcessService", "do stop service");
            context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.gamelive.service.GameLiveForegroundService.class));
            this.f279220f.f279235e = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameLiveMainProcessService", e17, "stop foreground service error", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}

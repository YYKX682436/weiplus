package pi0;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pi0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354571e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.g(this.f354571e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f354570d;
        pi0.q qVar = this.f354571e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = qVar.f354699c;
            if (r2Var != null) {
                this.f354570d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "init job done");
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "external init end");
        qVar.f354700d = new io.flutter.embedding.engine.MMFlutterEngineGroup(qVar.f354697a, qVar.f354698b);
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "group init end");
        this.f354570d = 2;
        qVar.getClass();
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "start create router");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pi0.m1 m1Var = new pi0.m1("root", "home", "root", new java.util.HashMap());
        pi0.r.f354717a.d(m1Var);
        io.flutter.Log.i("MicroMsg.FlutterRouteCreator", "setupRouteInfo, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        m1Var.f354672h = true;
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "create route finished");
        g17 = qVar.g(m1Var, (r16 & 2) != 0, (r16 & 4) != 0, (r16 & 8) != 0, (r16 & 16) != 0 ? null : null, this);
        if (g17 == aVar) {
            return aVar;
        }
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "init job done");
        return jz5.f0.f302826a;
    }
}

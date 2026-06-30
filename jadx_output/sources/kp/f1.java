package kp;

/* loaded from: classes13.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310736e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310737f;

    /* renamed from: g, reason: collision with root package name */
    public int f310738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager f310739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager.Channel f310740i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310741m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.net.wifi.p2p.WifiP2pManager wifiP2pManager, android.net.wifi.p2p.WifiP2pManager.Channel channel, kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310739h = wifiP2pManager;
        this.f310740i = channel;
        this.f310741m = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.f1(this.f310739h, this.f310740i, this.f310741m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310738g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.net.wifi.p2p.WifiP2pManager wifiP2pManager = this.f310739h;
            this.f310735d = wifiP2pManager;
            android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f310740i;
            this.f310736e = channel;
            kp.i1 i1Var = this.f310741m;
            this.f310737f = i1Var;
            this.f310738g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            try {
                wifiP2pManager.requestDeviceInfo(channel, new kp.e1(i1Var, rVar));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("WiFiDirectService", e17, "fetchLocalP2pDeviceNameWithRetry error", new java.lang.Object[0]);
                if (rVar.n()) {
                    rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
                }
            }
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

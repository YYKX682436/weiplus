package kp;

/* loaded from: classes13.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310778e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310779f;

    /* renamed from: g, reason: collision with root package name */
    public int f310780g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310781h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pConfig f310782i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kp.i1 i1Var, android.net.wifi.p2p.WifiP2pConfig wifiP2pConfig, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310781h = i1Var;
        this.f310782i = wifiP2pConfig;
        this.f310783m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.j0(this.f310781h, this.f310782i, this.f310783m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310780g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kp.i1 i1Var = this.f310781h;
            this.f310777d = i1Var;
            android.net.wifi.p2p.WifiP2pConfig wifiP2pConfig = this.f310782i;
            this.f310778e = wifiP2pConfig;
            java.lang.String str = this.f310783m;
            this.f310779f = str;
            this.f310780g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            android.net.wifi.p2p.WifiP2pManager.Channel channel = i1Var.f310765f;
            if (channel != null) {
                i1Var.f310764e.connect(channel, wifiP2pConfig, new kp.i0(str, rVar, i1Var));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(new gz.a(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR, "connectToGroup: Channel is null")));
            }
            obj = rVar.j();
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

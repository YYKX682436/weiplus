package kp;

/* loaded from: classes13.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310814d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310815e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310816f;

    /* renamed from: g, reason: collision with root package name */
    public int f310817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310819i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager.Channel f310820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str, kp.i1 i1Var, android.net.wifi.p2p.WifiP2pManager.Channel channel, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310818h = str;
        this.f310819i = i1Var;
        this.f310820m = channel;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.q0(this.f310818h, this.f310819i, this.f310820m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310817g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f310818h;
            this.f310814d = str;
            kp.i1 i1Var = this.f310819i;
            this.f310815e = i1Var;
            android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f310820m;
            this.f310816f = channel;
            this.f310817g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            kp.p0 p0Var = new kp.p0(i1Var, rVar);
            if (str != null) {
                android.net.wifi.p2p.WifiP2pConfig.Builder builder = new android.net.wifi.p2p.WifiP2pConfig.Builder();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DIRECT-WX-");
                i1Var.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                int length = str.length();
                int i18 = 0;
                for (int i19 = 0; i19 < length; i19++) {
                    char charAt = str.charAt(i19);
                    byte[] bytes = java.lang.String.valueOf(charAt).getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    i18 += bytes.length;
                    if (i18 > 18) {
                        break;
                    }
                    sb7.append(charAt);
                }
                java.lang.String sb8 = sb7.toString();
                kotlin.jvm.internal.o.f(sb8, "toString(...)");
                sb6.append(sb8);
                sb6.append('-');
                sb6.append(kp.i1.wi(i1Var, 3));
                android.net.wifi.p2p.WifiP2pConfig build = builder.setNetworkName(sb6.toString()).setPassphrase(kp.i1.wi(i1Var, 8)).build();
                kotlin.jvm.internal.o.f(build, "build(...)");
                com.tencent.mars.xlog.Log.i("WiFiDirectService", "createGroup deviceName=".concat(str));
                i1Var.f310764e.createGroup(channel, build, p0Var);
            } else {
                i1Var.f310764e.createGroup(channel, p0Var);
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

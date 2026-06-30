package kp;

/* loaded from: classes13.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310857d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310858e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310859f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310860g;

    /* renamed from: h, reason: collision with root package name */
    public int f310861h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310862i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.WifiManager f310863m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310864n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310865o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kp.i1 i1Var, android.net.wifi.WifiManager wifiManager, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310862i = i1Var;
        this.f310863m = wifiManager;
        this.f310864n = str;
        this.f310865o = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.y(this.f310862i, this.f310863m, this.f310864n, this.f310865o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310861h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kp.i1 i1Var = this.f310862i;
            this.f310857d = i1Var;
            android.net.wifi.WifiManager wifiManager = this.f310863m;
            this.f310858e = wifiManager;
            java.lang.String str = this.f310864n;
            this.f310859f = str;
            java.lang.String str2 = this.f310865o;
            this.f310860g = str2;
            this.f310861h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            i1Var.f310770n = new kp.w(wifiManager, str, i1Var, rVar);
            rVar.m(new kp.x(i1Var));
            if (!wifiManager.isWifiEnabled()) {
                wifiManager.setWifiEnabled(true);
            }
            android.net.wifi.WifiConfiguration wifiConfiguration = new android.net.wifi.WifiConfiguration();
            wifiConfiguration.SSID = str;
            wifiConfiguration.preSharedKey = "\"" + str2 + '\"';
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.allowedProtocols.set(1);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.priority = 100;
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "connecting to wifi:" + str);
            int addNetwork = wifiManager.addNetwork(wifiConfiguration);
            if (addNetwork == -1) {
                java.util.List list = (java.util.List) yj0.a.j(wifiManager, "com/tencent/mm/connection/near/WiFiDirectService$connectLegacyWifi$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;");
                android.net.wifi.WifiConfiguration wifiConfiguration2 = null;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.o.b(((android.net.wifi.WifiConfiguration) next).SSID, str)) {
                            wifiConfiguration2 = next;
                            break;
                        }
                    }
                    wifiConfiguration2 = wifiConfiguration2;
                }
                if (wifiConfiguration2 != null) {
                    addNetwork = wifiConfiguration2.networkId;
                }
            }
            if (addNetwork != -1) {
                wifiManager.disconnect();
                wifiManager.enableNetwork(addNetwork, true);
                wifiManager.reconnect();
            } else if (rVar.n()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(new gz.a(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR, "connectToGroup: netId not found")));
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

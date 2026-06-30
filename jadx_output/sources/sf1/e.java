package sf1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final rf1.f f406960a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f406961b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f406962c;

    /* renamed from: h, reason: collision with root package name */
    public final android.net.ConnectivityManager f406967h;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f406971l;

    /* renamed from: d, reason: collision with root package name */
    public sf1.d f406963d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.net.wifi.WifiConfiguration f406964e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f406965f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.content.BroadcastReceiver f406966g = null;

    /* renamed from: i, reason: collision with root package name */
    public int f406968i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f406969j = 13000;

    /* renamed from: k, reason: collision with root package name */
    public boolean f406970k = false;

    public e(rf1.f fVar, android.content.Context context, boolean z17) {
        this.f406962c = null;
        this.f406960a = fVar;
        this.f406961b = context;
        try {
            this.f406967h = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WiFiConnector", e17, "can not retrieve ConnectivityManager", new java.lang.Object[0]);
        }
        this.f406962c = new sf1.a(this, context.getMainLooper());
        if (!z17 || this.f406961b.getApplicationInfo().targetSdkVersion < 29 || android.os.Build.VERSION.SDK_INT < 29) {
            this.f406971l = false;
        } else {
            this.f406971l = true;
        }
    }

    public void a(java.lang.String str) {
        android.net.wifi.WifiConfiguration wifiConfiguration = this.f406964e;
        if (wifiConfiguration != null) {
            sf1.f.a(wifiConfiguration.networkId);
            b(false, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.wifi_event", "cancelConnect, " + sf1.t.b(this.f406964e.SSID) + " networkId:" + this.f406964e.networkId);
            com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "cancelConnect");
        }
    }

    public final void b(boolean z17, java.lang.String str) {
        android.net.wifi.WifiConfiguration wifiConfiguration;
        jc1.d dVar;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "finishConnectTask success:" + z17);
        int i17 = this.f406968i;
        if (i17 == 3 || i17 == 2) {
            return;
        }
        rf1.f fVar = this.f406960a;
        if (fVar != null) {
            java.lang.String str3 = z17 ? "ok" : str;
            qf1.a aVar = (qf1.a) fVar;
            rf1.l.f394632d = null;
            boolean equals = str3.equals("ok");
            android.content.Context context = aVar.f362258b;
            int i18 = aVar.f362260d;
            qf1.e eVar = aVar.f362261e;
            com.tencent.mm.plugin.appbrand.jsapi.l lVar = aVar.f362259c;
            if (equals) {
                if (this.f406971l) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiConnectWifi", "[IConnectWiFiCallback] connect success, refresh ConnectivityCompat cache");
                    com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
                    i0Var.b();
                    i0Var.g(true);
                }
                rf1.h a17 = rf1.e.f394621a.a(aVar.f362257a);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiConnectWifi", "[IConnectWiFiCallback]currentWifi:%s", a17);
                if (a17 == null || !a17.a()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConnectWifi", "[IConnectWiFiCallback]currentWIfi is null or invalid");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    android.util.Pair C = qf1.e.C(eVar, context, lVar, hashMap);
                    if (C == null) {
                        C = a17 == null ? new android.util.Pair("fail:can't gain current wifi", jc1.c.f298901y) : new android.util.Pair("fail:current connected wifi is invalid", jc1.c.f298902z);
                    }
                    lVar.a(i18, eVar.q((java.lang.String) C.first, (jc1.d) C.second, hashMap));
                } else {
                    try {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("wifi", a17.b());
                        hashMap2.put("errCode", 0);
                        eVar.getClass();
                        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        hashMap2.put("errno", 0);
                        lVar.a(i18, eVar.t("ok", hashMap2));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConnectWifi", "IConnectWiFiCallback is error");
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiConnectWifi", e17, "", new java.lang.Object[0]);
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        hashMap3.put("errCode", 12010);
                        eVar.getClass();
                        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        hashMap3.put("errno", 4);
                        lVar.a(i18, eVar.t("fail:parse json err", hashMap3));
                    }
                }
            } else {
                java.util.HashMap hashMap4 = new java.util.HashMap();
                if (str3.equals("duplicated request")) {
                    hashMap4.put("errCode", 12004);
                    dVar = jc1.c.B;
                    str2 = "fail:duplicated request";
                } else if (str3.equals("password error")) {
                    hashMap4.put("errCode", 12002);
                    dVar = jc1.c.C;
                    str2 = "fail:password error";
                } else if (str3.equals("wifi config may be expired")) {
                    hashMap4.put("errCode", 12013);
                    dVar = jc1.c.D;
                    str2 = "fail:wifi config may be expired";
                } else if (str3.equals("fail to connect wifi:time out")) {
                    hashMap4.put("errCode", 12003);
                    dVar = jc1.c.E;
                    str2 = "fail:fail to connect wifi:time out";
                } else if (str3.equals("user denied")) {
                    hashMap4.put("errCode", 12007);
                    dVar = jc1.c.F;
                    str2 = "fail:user denied";
                } else if (str3.equals("wifi config already exists")) {
                    hashMap4.put("errCode", 12015);
                    dVar = jc1.c.G;
                    str2 = "fail:wifi config already exist";
                } else {
                    android.util.Pair C2 = qf1.e.C(eVar, context, lVar, hashMap4);
                    if (C2 != null) {
                        jc1.d dVar2 = (jc1.d) C2.second;
                        str2 = (java.lang.String) C2.first;
                        dVar = dVar2;
                    } else {
                        dVar = jc1.c.A;
                        str2 = "fail:unknown error";
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConnectWifi", "[IConnectWiFiCallback]errCode:%d, errMsg:%s", hashMap4.get("errCode"), str2);
                lVar.a(i18, eVar.q(str2, dVar, hashMap4));
            }
        }
        this.f406962c.removeMessages(1);
        if (this.f406965f) {
            this.f406961b.unregisterReceiver(this.f406966g);
            this.f406965f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "stopMonitorWiFiEvent");
        }
        c(z17 ? 2 : 3);
        if (z17 || (wifiConfiguration = this.f406964e) == null) {
            return;
        }
        sf1.f.a(wifiConfiguration.networkId);
    }

    public final void c(int i17) {
        if (this.f406968i != i17) {
            this.f406968i = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "switchState:".concat(i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? "UnknowState" : "STATE_FAIL" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_NONE"));
        }
    }
}

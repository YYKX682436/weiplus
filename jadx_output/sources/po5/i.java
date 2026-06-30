package po5;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public android.net.Network f357354a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f357355b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f357356c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f357357d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_wifi_low_latency, false);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f357358e = jz5.h.b(po5.h.f357353d);

    /* renamed from: f, reason: collision with root package name */
    public final po5.f f357359f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.voipmp.v2.network.VoIPMPNetWorkController$connectivityReceiver$1 f357360g;

    /* renamed from: h, reason: collision with root package name */
    public final po5.e f357361h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f357362i;

    /* renamed from: j, reason: collision with root package name */
    public int f357363j;

    /* JADX WARN: Type inference failed for: r0v13, types: [com.tencent.mm.voipmp.v2.network.VoIPMPNetWorkController$connectivityReceiver$1] */
    public i() {
        ve0.e eVar = (ve0.e) i95.n0.c(ve0.e.class);
        po5.b bVar = new po5.b(this);
        ((o95.k) eVar).getClass();
        o95.k.f343752p = bVar;
        this.f357359f = new po5.f(this);
        this.f357360g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.voipmp.v2.network.VoIPMPNetWorkController$connectivityReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(intent, "intent");
                if (kotlin.jvm.internal.o.b(intent.getAction(), io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
                    po5.i.b(po5.i.this);
                }
            }
        };
        this.f357361h = new po5.e(this);
        this.f357363j = -1;
    }

    public static final void b(po5.i iVar) {
        boolean z17;
        java.lang.String sb6;
        iVar.getClass();
        int a17 = co5.i.f43839a.a();
        if (a17 == iVar.f357363j) {
            return;
        }
        iVar.f357363j = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "onNetworkChange: " + a17);
        com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        er4.y a18 = er4.y.a(a17);
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        try {
            java.lang.reflect.Method declaredMethod = android.net.ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(connectivityManager, new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        if (z17) {
            java.lang.Object systemService2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
            kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            java.lang.String simOperator = ((android.telephony.TelephonyManager) systemService2).getSimOperator();
            if (simOperator != null && simOperator.length() >= 3) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String substring = simOperator.substring(0, 3);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                sb7.append(substring);
                sb7.append(':');
                java.lang.String substring2 = simOperator.substring(3, simOperator.length());
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                sb7.append(substring2);
                sb6 = sb7.toString();
                v0Var.u(a18, r26.i0.m(sb6), po5.c.f357348a);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPHelper", "nic_op NULL");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPHelper", "mobile network not connectedorconnecting");
        }
        sb6 = "";
        v0Var.u(a18, r26.i0.m(sb6), po5.c.f357348a);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "try to UnregisterCellularNetwork");
        if (fp.h.c(21)) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            if (this.f357355b != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unregister networkcallback hashCode: ");
                android.net.ConnectivityManager.NetworkCallback networkCallback = this.f357355b;
                sb6.append(networkCallback != null ? networkCallback.hashCode() : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", sb6.toString());
                try {
                    android.net.ConnectivityManager.NetworkCallback networkCallback2 = this.f357355b;
                    kotlin.jvm.internal.o.d(networkCallback2);
                    connectivityManager.unregisterNetworkCallback(networkCallback2);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkCallback Error");
                }
                this.f357355b = null;
                this.f357354a = null;
            }
        }
    }

    public final void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "start bindSocket " + i17 + " ToNetwork " + this.f357354a + " rebind " + z17);
        if (i17 == -1) {
            a();
        }
        if (!z17) {
            this.f357356c.add(java.lang.Integer.valueOf(i17));
        }
        if (this.f357354a == null || !fp.h.c(23)) {
            return;
        }
        java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
        try {
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, i17);
            android.net.Network network = this.f357354a;
            if (network != null) {
                network.bindSocket(fileDescriptor);
            }
            java.util.Objects.toString(this.f357354a);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "bindSocketToNetwork Error");
        }
    }

    public final android.net.wifi.WifiManager.WifiLock d() {
        java.lang.Object value = ((jz5.n) this.f357358e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.net.wifi.WifiManager.WifiLock) value;
    }

    public final void e() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "registerNetworkReceiver");
            gm0.j1.n().a(this.f357359f);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            boolean a17 = fp.h.a(33);
            com.tencent.mm.voipmp.v2.network.VoIPMPNetWorkController$connectivityReceiver$1 voIPMPNetWorkController$connectivityReceiver$1 = this.f357360g;
            if (a17) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(voIPMPNetWorkController$connectivityReceiver$1, intentFilter);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(voIPMPNetWorkController$connectivityReceiver$1, intentFilter, 2);
            }
            f();
            this.f357362i = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPNetWorkController", "registerNetworkReceiver err: " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "In networkRequestViaCellular");
        if (fp.h.c(21)) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
            builder.addTransportType(0);
            builder.addCapability(12);
            android.net.NetworkRequest build = builder.build();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "NetworkRequest toString: " + build + " hashCode: " + build.hashCode());
            try {
                connectivityManager.requestNetwork(build, new po5.d(this));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "missing the appropriate permissions");
            }
        }
        this.f357363j = co5.i.f43839a.a();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPNetWorkController", "Wi-Fi low latency mode is not supported on this platform");
            return;
        }
        if (this.f357357d) {
            d();
            if (d().isHeld()) {
                return;
            }
            d().acquire();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "Acquired Wi-Fi low latency lock");
        }
    }

    public final void f() {
        if (fp.h.c(21)) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().build();
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "NetworkRequest toString: " + build + " hashCode: " + build.hashCode());
            try {
                connectivityManager.registerNetworkCallback(build, this.f357361h);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "missing the appropriate permissions");
            }
        }
    }

    public final void g() {
        try {
            if (this.f357362i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkReceiver");
                gm0.j1.n().d(this.f357359f);
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f357360g);
                if (fp.h.c(21)) {
                    java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
                    kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ((android.net.ConnectivityManager) systemService).unregisterNetworkCallback(this.f357361h);
                }
                this.f357362i = false;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkReceiver err: " + e17.getMessage());
        }
        a();
        this.f357363j = -1;
        if (this.f357357d) {
            d();
            if (d().isHeld()) {
                d().release();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "Released Wi-Fi low latency lock");
            }
        }
    }
}

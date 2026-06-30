package o95;

@j95.b
/* loaded from: classes13.dex */
public final class k extends i95.w implements ve0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final android.telephony.TelephonyManager f343744e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.media.AudioManager f343745f;

    /* renamed from: h, reason: collision with root package name */
    public static final int f343747h;

    /* renamed from: i, reason: collision with root package name */
    public static int f343748i;

    /* renamed from: n, reason: collision with root package name */
    public static int f343750n;

    /* renamed from: o, reason: collision with root package name */
    public static int f343751o;

    /* renamed from: p, reason: collision with root package name */
    public static ve0.f f343752p;

    /* renamed from: d, reason: collision with root package name */
    public static final o95.k f343743d = new o95.k();

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f343746g = new int[2];

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f343749m = new com.tencent.mm.sdk.platformtools.n3("getSignalStrength");

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f343753q = jz5.h.b(o95.h.f343741d);

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f343754r = jz5.h.b(o95.i.f343742d);

    static {
        int i17 = 2;
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.telephony.feature.TelephonyFeatureService$NetChangedBroadcastReceiver
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(intent, "intent");
                if (kotlin.jvm.internal.o.b(intent.getAction(), io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
                    o95.k.f343743d.getClass();
                    ve0.f fVar = o95.k.f343752p;
                    if (fVar != null) {
                        fVar.b(intent);
                    }
                }
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter);
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        f343744e = (android.telephony.TelephonyManager) systemService;
        java.lang.Object systemService2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        f343745f = (android.media.AudioManager) systemService2;
        java.lang.Object systemService3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService3, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService3).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.TelephonyFeatureService", "getNetType: %s %s", java.lang.Integer.valueOf(activeNetworkInfo.getType()), java.lang.Integer.valueOf(activeNetworkInfo.getSubtype()));
                int i18 = 4;
                if (activeNetworkInfo.getType() != 1) {
                    if (activeNetworkInfo.getType() == 9) {
                        i17 = 7;
                    } else if (activeNetworkInfo.getType() == 0) {
                        int subtype = activeNetworkInfo.getSubtype();
                        switch (subtype) {
                            case 0:
                                i18 = 2;
                                break;
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                i18 = 1;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i18 = 3;
                                break;
                            case 13:
                            case 18:
                            case 19:
                                i18 = 5;
                                break;
                            case 20:
                                i18 = 6;
                                break;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.TelephonyFeatureService", "steve: subType:%s, getMobileType(2G/3G/4G/...): %s ", java.lang.Integer.valueOf(subtype), java.lang.Integer.valueOf(i18));
                    }
                }
                i17 = i18;
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TelephonyFeatureService", e17, "", new java.lang.Object[0]);
            }
        }
        f343747h = i17;
        pm0.v.X(o95.e.f343740d);
    }

    public boolean Ai() {
        int i17;
        if (fp.h.a(31)) {
            android.telephony.TelephonyManager telephonyManager = f343744e;
            if (telephonyManager != null) {
                i17 = telephonyManager.getCallState();
            }
            i17 = 0;
        } else {
            android.media.AudioManager audioManager = f343745f;
            if (audioManager != null && audioManager.getMode() == 1) {
                i17 = 1;
            } else {
                if (audioManager != null && audioManager.getMode() == 2) {
                    i17 = 2;
                }
                i17 = 0;
            }
        }
        return i17 != 0;
    }

    public final void wi(int i17) {
        int[] iArr = f343746g;
        if (i17 != 4) {
            if (i17 != 5) {
                return;
            }
            f343750n += iArr[0];
            f343751o++;
            com.tencent.mars.xlog.Log.i("MicroMsg.TelephonyFeatureService", "mSignalStrength 4G" + iArr[0] + " and index is " + f343751o);
            return;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            try {
                iArr[1] = com.tencent.mm.sdk.platformtools.v0.f193027a.h();
            } catch (java.lang.Exception unused) {
                iArr[1] = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.TelephonyFeatureService", "error happened in get wifi info");
            }
            f343750n += iArr[1];
            f343751o++;
            com.tencent.mars.xlog.Log.i("MicroMsg.TelephonyFeatureService", "mSignalStrength WIFI " + iArr[1] + " and index is " + f343751o);
        }
    }
}

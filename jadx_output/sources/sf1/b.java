package sf1;

/* loaded from: classes13.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf1.e f406957a;

    public b(sf1.e eVar) {
        this.f406957a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "startMonitorWiFiEvent, action: " + action);
        boolean equals = io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(action);
        sf1.e eVar = this.f406957a;
        if (equals || "android.net.wifi.STATE_CHANGE".equals(action)) {
            android.net.NetworkInfo activeNetworkInfo = eVar.f406967h.getActiveNetworkInfo();
            android.net.wifi.WifiInfo a17 = sf1.s.a();
            if (activeNetworkInfo != null && a17 != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.getDetailedState() == android.net.NetworkInfo.DetailedState.CONNECTED && a17.getNetworkId() == eVar.f406964e.networkId) {
                eVar.b(true, "");
                com.tencent.mars.xlog.Log.i("MicroMsg.wifi_event", "CONNECTIVITY_ACTION CONNECTED.");
                return;
            }
            return;
        }
        if ("android.net.wifi.supplicant.STATE_CHANGE".equals(action)) {
            int i17 = -1;
            try {
                i17 = intent.getIntExtra("supplicantError", -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WiFiConnector", e17.getMessage());
            }
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WiFiConnector", "ERROR_AUTHENTICATING");
                com.tencent.mars.xlog.Log.i("MicroMsg.wifi_event", "ERROR_AUTHENTICATING FAIL.");
                eVar.b(false, eVar.f406970k ? "wifi config may be expired" : "password error");
            }
        }
    }
}

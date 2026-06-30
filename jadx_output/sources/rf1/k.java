package rf1;

/* loaded from: classes13.dex */
public class k extends android.content.BroadcastReceiver {
    public k(rf1.j jVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "onReceive");
        if (intent == null || !"android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WiFiManagerWrapper", "onReceive, action not match");
            return;
        }
        rf1.g gVar = rf1.l.f394635g;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "onReceive, getWiFiListCallback is null");
        } else {
            ((qf1.h) gVar).a(rf1.l.a(false));
        }
    }
}

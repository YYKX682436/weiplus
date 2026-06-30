package kp;

/* loaded from: classes13.dex */
public final class b1 implements android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310718a;

    public b1(kp.i1 i1Var) {
        this.f310718a = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener
    public final void onConnectionInfoAvailable(android.net.wifi.p2p.WifiP2pInfo wifiP2pInfo) {
        kp.i1 i1Var = this.f310718a;
        ((kotlinx.coroutines.flow.h3) i1Var.f310767h).k(wifiP2pInfo);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("connection info: groupFormed=");
        sb6.append(wifiP2pInfo.groupFormed);
        sb6.append(", isGroupOwner=");
        sb6.append(wifiP2pInfo.isGroupOwner);
        sb6.append(", hostAddress=");
        java.net.InetAddress inetAddress = wifiP2pInfo.groupOwnerAddress;
        sb6.append(inetAddress != null ? inetAddress.getHostAddress() : null);
        com.tencent.mars.xlog.Log.i("WiFiDirectService", sb6.toString());
        if (!wifiP2pInfo.groupFormed) {
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "group not formed");
            ((kotlinx.coroutines.flow.h3) i1Var.f310768i).k(java.lang.Boolean.FALSE);
            return;
        }
        ((kotlinx.coroutines.flow.h3) i1Var.f310768i).k(java.lang.Boolean.FALSE);
        if (wifiP2pInfo.isGroupOwner) {
            android.net.wifi.p2p.WifiP2pManager wifiP2pManager = i1Var.f310764e;
            if (wifiP2pManager == null) {
                com.tencent.mars.xlog.Log.e("WiFiDirectService", "WiFiP2pManager is null, cannot request group info");
                return;
            } else {
                wifiP2pManager.requestGroupInfo(i1Var.f310765f, new kp.c1(i1Var));
                return;
            }
        }
        java.net.InetAddress inetAddress2 = wifiP2pInfo.groupOwnerAddress;
        java.lang.String hostAddress = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
        if (hostAddress != null) {
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "connect success, it's client，GO IP: ".concat(hostAddress));
        } else {
            com.tencent.mars.xlog.Log.e("WiFiDirectService", "Group Owner IP is null");
        }
        i1Var.f310764e.requestGroupInfo(i1Var.f310765f, new kp.a1(i1Var));
    }
}

package kp;

/* loaded from: classes7.dex */
public final class v0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {
    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.tencent.mars.xlog.Log.e("WiFiDirectService", "removeGroupAsync onFailure: " + i17);
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "removeGroupAsync onSuccess");
    }
}

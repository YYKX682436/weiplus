package kp;

/* loaded from: classes13.dex */
public final class a1 implements android.net.wifi.p2p.WifiP2pManager.GroupInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310715a;

    public a1(kp.i1 i1Var) {
        this.f310715a = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
    public final void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup == null) {
            com.tencent.mars.xlog.Log.e("WiFiDirectService", "Group info is null");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new kp.z0(this.f310715a, wifiP2pGroup, null), 3, null);
        }
    }
}

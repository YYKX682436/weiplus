package kp;

/* loaded from: classes13.dex */
public final class c1 implements android.net.wifi.p2p.WifiP2pManager.GroupInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310720a;

    public c1(kp.i1 i1Var) {
        this.f310720a = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
    public final void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
        kp.i1 i1Var = this.f310720a;
        if (wifiP2pGroup == null || !wifiP2pGroup.isGroupOwner()) {
            yz5.l lVar = i1Var.f310769m;
            if (lVar != null) {
                lVar.invoke(new gz.b(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_ERROR, "createGroup: Group info is null", null, null, 24, null));
            }
            i1Var.f310769m = null;
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "group frequency: " + wifiP2pGroup.getFrequency());
        }
        java.lang.String networkName = wifiP2pGroup.getNetworkName();
        java.lang.String passphrase = wifiP2pGroup.getPassphrase();
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "GO Group Name: " + networkName + ", Passphrase: " + passphrase);
        boolean isEmpty = wifiP2pGroup.getClientList().isEmpty();
        bw5.xf0 xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_SUCCESS;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "createGroup success");
            yz5.l lVar2 = i1Var.f310769m;
            if (lVar2 != null) {
                lVar2.invoke(new gz.b(true, xf0Var, null, networkName, passphrase, 4, null));
            }
            i1Var.f310769m = null;
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Client connected：");
        java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> clientList = wifiP2pGroup.getClientList();
        kotlin.jvm.internal.o.f(clientList, "getClientList(...)");
        java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> collection = clientList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice : collection) {
            arrayList.add("{" + wifiP2pDevice.deviceName + ' ' + wifiP2pDevice.deviceAddress + '}');
        }
        sb6.append(kz5.n0.S0(arrayList));
        com.tencent.mars.xlog.Log.i("WiFiDirectService", sb6.toString());
        yz5.l lVar3 = i1Var.f310769m;
        if (lVar3 != null) {
            lVar3.invoke(new gz.b(true, xf0Var, null, networkName, passphrase, 4, null));
        }
        i1Var.f310769m = null;
    }
}

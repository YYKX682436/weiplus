package xp5;

/* loaded from: classes13.dex */
public final class c extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xp5.a f455965a;

    public c(xp5.a aVar) {
        this.f455965a = aVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        java.util.ArrayList<xp5.b> arrayList;
        kotlin.jvm.internal.o.g(network, "network");
        super.onAvailable(network);
        xp5.a aVar = this.f455965a;
        synchronized (aVar.f455963d) {
            arrayList = new java.util.ArrayList(aVar.f455961b);
        }
        for (xp5.b bVar : arrayList) {
            long networkHandle = network.getNetworkHandle();
            ((wp5.d) bVar).getClass();
            com.tencent.mm.weapp_core.CellularNetworkHandler cellularNetworkHandler = wp5.e.f448467e;
            if (cellularNetworkHandler == null) {
                kotlin.jvm.internal.o.o("cellularNetworkHandler");
                throw null;
            }
            cellularNetworkHandler.onNetworkAvailable(networkHandle);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        java.util.ArrayList<xp5.b> arrayList;
        kotlin.jvm.internal.o.g(network, "network");
        super.onLost(network);
        xp5.a aVar = this.f455965a;
        synchronized (aVar.f455963d) {
            arrayList = new java.util.ArrayList(aVar.f455961b);
        }
        for (xp5.b bVar : arrayList) {
            long networkHandle = network.getNetworkHandle();
            ((wp5.d) bVar).getClass();
            com.tencent.mm.weapp_core.CellularNetworkHandler cellularNetworkHandler = wp5.e.f448467e;
            if (cellularNetworkHandler == null) {
                kotlin.jvm.internal.o.o("cellularNetworkHandler");
                throw null;
            }
            cellularNetworkHandler.onNetworkLost(networkHandle);
        }
    }
}

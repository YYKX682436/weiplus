package wp5;

/* loaded from: classes13.dex */
public final class c extends com.tencent.mm.weapp_core.CellularNetworkHandler {
    @Override // com.tencent.mm.weapp_core.CellularNetworkHandler
    public long getActiveCellularNetworkHandle() {
        android.net.NetworkCapabilities networkCapabilities;
        xp5.a aVar = wp5.e.f448466d;
        aVar.getClass();
        jz5.g gVar = aVar.f455960a;
        try {
            android.net.Network activeNetwork = ((android.net.ConnectivityManager) ((jz5.n) gVar).getValue()).getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = ((android.net.ConnectivityManager) ((jz5.n) gVar).getValue()).getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
                return activeNetwork.getNetworkHandle();
            }
        } catch (java.lang.SecurityException unused) {
        }
        return -1L;
    }

    @Override // com.tencent.mm.weapp_core.CellularNetworkHandler
    public boolean startMonitoring() {
        xp5.a aVar = wp5.e.f448466d;
        synchronized (aVar.f455963d) {
            if (aVar.f455962c) {
                return true;
            }
            try {
                ((android.net.ConnectivityManager) ((jz5.n) aVar.f455960a).getValue()).requestNetwork(new android.net.NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), aVar.f455964e);
                aVar.f455962c = true;
                return true;
            } catch (java.lang.SecurityException unused) {
                return false;
            } catch (java.lang.RuntimeException unused2) {
                return false;
            }
        }
    }

    @Override // com.tencent.mm.weapp_core.CellularNetworkHandler
    public void stopMonitoring() {
        xp5.a aVar = wp5.e.f448466d;
        synchronized (aVar.f455963d) {
            if (aVar.f455962c) {
                ((android.net.ConnectivityManager) ((jz5.n) aVar.f455960a).getValue()).unregisterNetworkCallback(aVar.f455964e);
                aVar.f455962c = false;
            }
        }
    }
}

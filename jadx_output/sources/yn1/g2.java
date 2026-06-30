package yn1;

/* loaded from: classes11.dex */
public final class g2 extends android.net.ConnectivityManager.NetworkCallback {
    public g2(yz5.l lVar) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        super.onAvailable(network);
        yn1.h2.f463688d.invoke("onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.o.g(network, "network");
        kotlin.jvm.internal.o.g(networkCapabilities, "networkCapabilities");
        yn1.z0 z0Var = yn1.z0.f463933a;
        if (yn1.z0.f463951s) {
            bw5.he0 f17 = z0Var.f();
            com.tencent.wechat.aff.migration.f fVar = com.tencent.wechat.aff.migration.f.f217390b;
            if (!fVar.f()) {
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "updateMigrateNetworkStatus, manager not init, return");
                return;
            }
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "updateMigrateNetworkStatus, migrateNetworkStatusNow = " + yn1.z0.f463945m + ", status = " + f17);
            if (yn1.z0.f463945m != f17) {
                yn1.z0.f463945m = f17;
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "updateMigrateNetworkStatus, status = " + f17);
                fVar.n(f17);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        super.onLost(network);
        yn1.h2.f463688d.invoke("onLost");
    }
}

package rf1;

/* loaded from: classes13.dex */
public class a extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf1.b f394616a;

    public a(rf1.b bVar) {
        this.f394616a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, network: " + network);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        if (connectivityManager == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, connectivityManager is null");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        rf1.b bVar = this.f394616a;
        if (i17 >= 29) {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, networkCapabilities is null");
                return;
            } else {
                bVar.a(true, networkCapabilities.hasTransport(1));
                return;
            }
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, networkInfo is null");
        } else {
            bVar.a(true, activeNetworkInfo.getType() == 1);
        }
    }
}

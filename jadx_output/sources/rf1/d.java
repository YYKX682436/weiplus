package rf1;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f394619a;

    /* renamed from: b, reason: collision with root package name */
    public static rf1.b f394620b;

    public static void a(rf1.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "addListener");
        rf1.b bVar = f394620b;
        if (bVar != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) bVar.f394618b).add(cVar);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "addListener, receiver is null");
        }
    }

    public static void b(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "disable");
        if (!f394619a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "disable, not enable");
            return;
        }
        android.content.Context a17 = com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context);
        f394619a = false;
        rf1.b bVar = f394620b;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, receiver is null");
            return;
        }
        bVar.getClass();
        try {
            a17.unregisterReceiver(bVar);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a17.getSystemService("connectivity");
        if (connectivityManager == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "disable, connectivityManager is null");
        } else {
            try {
                connectivityManager.unregisterNetworkCallback(bVar.f394617a);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ConnectWifiEvents", e17, "unregisterNetworkCallback failure", new java.lang.Object[0]);
            }
        }
        f394620b = null;
    }

    public static void c(rf1.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "removeListener");
        rf1.b bVar = f394620b;
        if (bVar != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) bVar.f394618b).remove(cVar);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "removeListener, receiver is null");
        }
    }
}

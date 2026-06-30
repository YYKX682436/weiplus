package sf1;

/* loaded from: classes13.dex */
public class d implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.wifi.WifiConfiguration f406959a;

    public d(sf1.e eVar, android.net.wifi.WifiConfiguration wifiConfiguration) {
        this.f406959a = wifiConfiguration;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (method.getName().compareTo("onSuccess") == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WiFiConnector", "connectWifi use ActionListener success");
            return null;
        }
        if (method.getName().compareTo("onFailure") == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WiFiConnector", "connectWifi use ActionListener fail, fallback to enableNetwork");
            try {
                sf1.s.f407019a.enableNetwork(this.f406959a.networkId, true);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th6, "enableNetwork", new java.lang.Object[0]);
            }
        }
        return null;
    }
}

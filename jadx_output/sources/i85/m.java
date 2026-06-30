package i85;

/* loaded from: classes12.dex */
public final class m implements d85.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d85.m1 f289664a;

    public m(d85.m1 m1Var) {
        this.f289664a = m1Var;
    }

    @Override // d85.m1
    public jz5.l a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        android.net.Network activeNetwork;
        jz5.l value;
        java.lang.String name;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            if (((method == null || (name = method.getName()) == null || !name.equals("getConnectionInfo")) ? false : true) && kotlin.jvm.internal.o.b(method.getReturnType(), android.net.wifi.WifiInfo.class)) {
                com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner appExplicitBackgroundOwner = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE;
                if (appExplicitBackgroundOwner.isBackground() && mm.l.a() && mm.o.h(false, 1, null)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("appExpFg", java.lang.Boolean.FALSE);
                    com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
                    hashMap.put("hasOverlayWindow", java.lang.Boolean.valueOf(overlayWindowLifecycleOwner.hasOverlayWindow()));
                    hashMap.put("hasVisibleWindow", java.lang.Boolean.valueOf(overlayWindowLifecycleOwner.hasVisibleWindow()));
                    java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                    hashMap.put("recentScene", com.tencent.matrix.lifecycle.owners.f0.f52735q);
                    hashMap.put("visibleScene", com.tencent.matrix.lifecycle.owners.f0.f52740v);
                    ap.a.a(1, "errLocationAlert", new java.lang.Throwable(), hashMap, "getConnectionInfo");
                }
                if (i17 >= 31 && appExplicitBackgroundOwner.isBackground()) {
                    java.util.HashMap hashMap2 = g85.d.f269555a;
                    g85.c cVar = (g85.c) g85.d.f269555a.get(method.getName());
                    if (cVar != null && (value = cVar.value()) != null && !((java.lang.Boolean) value.f302833d).booleanValue()) {
                        java.lang.Object obj2 = value.f302834e;
                        if (obj2 != null ? obj2 instanceof android.net.wifi.WifiInfo : true) {
                            return value;
                        }
                    }
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        try {
                            java.lang.Object systemService = context.getSystemService("connectivity");
                            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
                            if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                                if ((networkCapabilities != null ? networkCapabilities.getTransportInfo() : null) instanceof android.net.wifi.WifiInfo) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.HookWifiManagerProcessor", "[onServiceMethodIntercept] mapping method: WifiManager#getConnectionInfo >> NetworkCapabilities#getTransportInfo");
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    android.net.TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                                    kotlin.jvm.internal.o.e(transportInfo, "null cannot be cast to non-null type android.net.wifi.WifiInfo");
                                    return new jz5.l(bool, (android.net.wifi.WifiInfo) transportInfo);
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.HookWifiManagerProcessor", "getNetworkCapabilities failed: " + th6.getMessage());
                        }
                    }
                }
            }
        }
        return this.f289664a.a(obj, method, objArr);
    }

    @Override // d85.m1
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        this.f289664a.b(method, objArr);
    }

    @Override // d85.m1
    public void c(java.lang.reflect.Method method, java.lang.Object obj) {
        this.f289664a.c(method, obj);
    }
}

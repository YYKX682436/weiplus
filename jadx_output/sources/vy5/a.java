package vy5;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.ConnectivityManager f441515a;

    public a(android.net.ConnectivityManager connectivityManager) {
        this.f441515a = connectivityManager;
    }

    public java.util.List a(android.net.NetworkCapabilities networkCapabilities) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        }
        return arrayList;
    }

    public java.util.List b() {
        android.net.ConnectivityManager connectivityManager = this.f441515a;
        return a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
    }
}

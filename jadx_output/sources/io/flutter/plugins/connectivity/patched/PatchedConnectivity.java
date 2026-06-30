package io.flutter.plugins.connectivity.patched;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "networkType", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTypeLegacy", "flutter-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PatchedConnectivity {
    private final android.net.ConnectivityManager connectivityManager;

    public PatchedConnectivity(android.net.ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.o.g(connectivityManager, "connectivityManager");
        this.connectivityManager = connectivityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String networkTypeLegacy() {
        android.net.NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 4 && type != 5) {
                    if (type != 6 && type != 9) {
                        return com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
                    }
                }
            }
            return "wifi";
        }
        return "mobile";
    }

    public final android.net.ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public final java.lang.Object networkType(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2(this, null), continuation);
    }
}

package vy5;

/* loaded from: classes11.dex */
public final class b extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver f441516a;

    public b(dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver) {
        this.f441516a = connectivityBroadcastReceiver;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f441516a;
        vy5.a aVar = connectivityBroadcastReceiver.f229416d;
        connectivityBroadcastReceiver.a(aVar.a(aVar.f441515a.getNetworkCapabilities(network)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.o.g(network, "network");
        kotlin.jvm.internal.o.g(networkCapabilities, "networkCapabilities");
        dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f441516a;
        connectivityBroadcastReceiver.a(connectivityBroadcastReceiver.f229416d.a(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f441516a;
        kotlinx.coroutines.l.d(connectivityBroadcastReceiver.f229417e, null, null, new vy5.c(connectivityBroadcastReceiver, null), 3, null);
    }
}

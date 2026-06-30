package sy5;

/* loaded from: classes13.dex */
public class c extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver f413900a;

    public c(dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver) {
        this.f413900a = connectivityBroadcastReceiver;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f413900a;
        sy5.a aVar = connectivityBroadcastReceiver.f229411d;
        connectivityBroadcastReceiver.f229413f.post(new sy5.b$$b(connectivityBroadcastReceiver, aVar.a(aVar.f413896a.getNetworkCapabilities(network))));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f413900a;
        connectivityBroadcastReceiver.f229413f.post(new sy5.b$$b(connectivityBroadcastReceiver, connectivityBroadcastReceiver.f229411d.a(networkCapabilities)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        int i17 = dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver.f229410h;
        final dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver = this.f413900a;
        connectivityBroadcastReceiver.getClass();
        connectivityBroadcastReceiver.f229413f.postDelayed(new java.lang.Runnable() { // from class: sy5.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver2 = dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver.this;
                io.flutter.plugin.common.EventChannel.EventSink eventSink = connectivityBroadcastReceiver2.f229412e;
                sy5.a aVar = connectivityBroadcastReceiver2.f229411d;
                android.net.ConnectivityManager connectivityManager = aVar.f413896a;
                eventSink.success(aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
            }
        }, 500L);
    }
}

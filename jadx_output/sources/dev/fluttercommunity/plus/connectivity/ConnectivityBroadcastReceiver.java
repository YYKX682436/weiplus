package dev.fluttercommunity.plus.connectivity;

/* loaded from: classes13.dex */
public class ConnectivityBroadcastReceiver extends android.content.BroadcastReceiver implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f229410h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final sy5.a f229411d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f229412e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f229413f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f229414g;

    public ConnectivityBroadcastReceiver(android.content.Context context, sy5.a aVar) {
        this.f229411d = aVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f229414g;
        if (networkCallback != null) {
            this.f229411d.f413896a.unregisterNetworkCallback(networkCallback);
            this.f229414g = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        this.f229412e = eventSink;
        sy5.c cVar = new sy5.c(this);
        this.f229414g = cVar;
        sy5.a aVar = this.f229411d;
        aVar.f413896a.registerDefaultNetworkCallback(cVar);
        android.net.ConnectivityManager connectivityManager = aVar.f413896a;
        this.f229413f.post(new sy5.b$$b(this, aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f229412e;
        if (eventSink != null) {
            sy5.a aVar = this.f229411d;
            android.net.ConnectivityManager connectivityManager = aVar.f413896a;
            eventSink.success(aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}

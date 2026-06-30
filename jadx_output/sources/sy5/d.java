package sy5;

/* loaded from: classes13.dex */
public class d implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final sy5.a f413901d;

    public d(sy5.a aVar) {
        this.f413901d = aVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (!"check".equals(methodCall.method)) {
            result.notImplemented();
            return;
        }
        sy5.a aVar = this.f413901d;
        android.net.ConnectivityManager connectivityManager = aVar.f413896a;
        result.success(aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
    }
}

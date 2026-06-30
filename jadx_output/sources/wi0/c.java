package wi0;

/* loaded from: classes11.dex */
public final class c implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.flutter_voip_status.FinderDataSource {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f446138d = kotlinx.coroutines.z0.b();

    @Override // com.tencent.pigeon.flutter_voip_status.FinderDataSource
    public void getImageFile(com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f446138d, null, null, new wi0.a(request, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.flutter_voip_status.FinderDataSource
    public void getLatestFinders(com.tencent.pigeon.flutter_voip_status.GetFindersRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String username = request.getUsername();
        long timeLimit = request.getTimeLimit();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPluginFinderDataSource", "getLatestFinders(" + username + ", " + timeLimit + ')');
        kotlinx.coroutines.l.d(this.f446138d, null, null, new wi0.b(username, timeLimit, callback, null), 3, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPluginFinderDataSource", "onAttachedToEngine");
        com.tencent.pigeon.flutter_voip_status.FinderDataSource.Companion companion = com.tencent.pigeon.flutter_voip_status.FinderDataSource.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_voip_status.FinderDataSource.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPluginFinderDataSource", "onDetachedFromEngine");
        kotlinx.coroutines.z0.e(this.f446138d, null, 1, null);
    }
}

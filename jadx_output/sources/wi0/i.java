package wi0;

/* loaded from: classes10.dex */
public final class i implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.flutter_voip_status.TextStatusDataSource {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f446150d = kotlinx.coroutines.z0.b();

    @Override // com.tencent.pigeon.flutter_voip_status.TextStatusDataSource
    public void getImageFile(com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f446150d, null, null, new wi0.g(request, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.flutter_voip_status.TextStatusDataSource
    public void getTextStatus(com.tencent.pigeon.flutter_voip_status.GetTextStatusRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String username = request.getUsername();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPluginTextStatusDataSource", "getTextStatus(" + username + ')');
        kotlinx.coroutines.l.d(this.f446150d, null, null, new wi0.h(username, callback, null), 3, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.flutter_voip_status.TextStatusDataSource.Companion companion = com.tencent.pigeon.flutter_voip_status.TextStatusDataSource.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_voip_status.TextStatusDataSource.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlinx.coroutines.z0.e(this.f446150d, null, 1, null);
    }
}

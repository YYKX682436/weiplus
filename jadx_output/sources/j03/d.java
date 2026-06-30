package j03;

/* loaded from: classes11.dex */
public final class d implements com.tencent.pigeon.mm_foundation.FlutterUploadHost, io.flutter.embedding.engine.plugins.FlutterPlugin {
    public static final /* synthetic */ java.lang.String a(j03.d dVar) {
        dVar.getClass();
        return "MicroMsg.FlutterUploadPlugin";
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterUploadHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterUploadHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterUploadHost.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterUploadHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterUploadHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterUploadHost.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterUploadHost
    public void uploadFile(java.lang.String path, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new j03.c(path, callback, this, j17));
    }
}

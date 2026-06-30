package si0;

/* loaded from: classes11.dex */
public final class x0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformGetConfigApi {
    @Override // com.tencent.pigeon.sns.PlatformGetConfigApi
    public boolean getConfig(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return false;
    }

    @Override // com.tencent.pigeon.sns.PlatformGetConfigApi
    public java.lang.String getDynamicConfig(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return "";
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformGetConfigApi.Companion companion = com.tencent.pigeon.sns.PlatformGetConfigApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformGetConfigApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformGetConfigApi.Companion companion = com.tencent.pigeon.sns.PlatformGetConfigApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformGetConfigApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}

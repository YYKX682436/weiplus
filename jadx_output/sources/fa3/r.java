package fa3;

/* loaded from: classes5.dex */
public final class r implements io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        io.flutter.view.TextureRegistry textureRegistry = binding.getTextureRegistry();
        kotlin.jvm.internal.o.f(textureRegistry, "getTextureRegistry(...)");
        platformViewRegistry.registerViewFactory("wxa_hybrid-camera-view-type", new fa3.q(binaryMessenger, textureRegistry));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }
}

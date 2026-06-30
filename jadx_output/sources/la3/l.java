package la3;

/* loaded from: classes5.dex */
public final class l implements io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory("wxa_hybrid-webview-view-type", new la3.k(binaryMessenger));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }
}

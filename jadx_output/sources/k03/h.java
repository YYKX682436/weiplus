package k03;

/* loaded from: classes5.dex */
public final class h implements io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory("wxa_hybrid-pagview-type", new k03.f(binaryMessenger));
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry2 = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        platformViewRegistry2.registerViewFactory("wxa_hybrid-ad-form-webview-type", new m03.b(binaryMessenger2));
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry3 = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        platformViewRegistry3.registerViewFactory("wxa_hybrid-ad-common-webview-type", new o03.b(binaryMessenger3));
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry4 = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        platformViewRegistry4.registerViewFactory("wxa_hybrid-ad-panorama-image-view-type", new n03.b(binaryMessenger4));
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry5 = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger5 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger5, "getBinaryMessenger(...)");
        platformViewRegistry5.registerViewFactory("com.tencent.websearch/sug_platform_view", new k03.g(binaryMessenger5));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }
}

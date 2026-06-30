package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes5.dex */
public final class b2 implements io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = binding.getPlatformViewRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory("WxaLiteAppPlatformView", new com.tencent.mm.plugin.lite.ui.a2(binaryMessenger));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppPlatformViewPlugin", "onDetachedFromEngine");
    }
}

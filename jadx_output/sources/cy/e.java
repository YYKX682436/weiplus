package cy;

/* loaded from: classes5.dex */
public final class e implements io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        binding.getPlatformViewRegistry().registerViewFactory("com.tencent.xin.flutter.platformViewType.chatbotCard", new cy.d(binaryMessenger));
        cy.h.f224666a.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardPlatformViewPlugin", "attached: viewType=com.tencent.xin.flutter.platformViewType.chatbotCard scenes=" + kz5.n0.S0(((java.util.LinkedHashMap) cy.h.f224667b).keySet()));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardPlatformViewPlugin", "detached");
    }
}

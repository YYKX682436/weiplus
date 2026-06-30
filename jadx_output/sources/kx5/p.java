package kx5;

/* loaded from: classes15.dex */
public class p implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public lx5.b f313325d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f313326e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler f313327f = new kx5.o(this);

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        nx5.c.c("WxaRouter.WxaRouterPlugin", "onAttachedToEngine", new java.lang.Object[0]);
        lx5.b bVar = new lx5.b(flutterPluginBinding.getBinaryMessenger(), "com.tencent.wxa/wxa_router");
        this.f313325d = bVar;
        bVar.f322160c = this.f313327f;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        nx5.c.c("WxaRouter.WxaRouterPlugin", "onDetachedFromEngine", new java.lang.Object[0]);
        lx5.b bVar = this.f313325d;
        if (bVar != null) {
            bVar.f322160c = null;
        }
    }
}

package pi0;

/* loaded from: classes11.dex */
public final class w implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.BasicMessageChannel f354738d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f354738d = new io.flutter.plugin.common.BasicMessageChannel(binding.getBinaryMessenger(), "mmflutter/host_event", io.flutter.plugin.common.StringCodec.INSTANCE);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f354738d = null;
    }
}

package d20;

/* loaded from: classes11.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f225780d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f225781e;

    public a(android.content.Context context, yz5.l invokeCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(invokeCallback, "invokeCallback");
        this.f225780d = invokeCallback;
        this.f225781e = "EcsLivePendingProductFlutterPlugin";
    }

    @Override // com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi
    public void handleSelectPendingProductResult(com.tencent.pigeon.live_multiplatform.SelectPendingProductResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f225780d.invoke(result);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f225781e, "onAttachedToEngine");
        com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f225781e, "onAttachedToEngine");
        com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.EcsLivePendingProductNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.getActivity();
    }
}

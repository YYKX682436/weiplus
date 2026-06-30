package no5;

/* loaded from: classes10.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public oo5.a f338778d;

    @Override // com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi
    public void launchSelectFilePage(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            oVar.Ad(null, callback);
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("IVoipmpService not available")))));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.PreviewFlutterPlugin", "onAttachedToActivity: " + binding.getActivity());
        oo5.a aVar = this.f338778d;
        if (aVar != null) {
            aVar.f347201b = new java.lang.ref.WeakReference(binding);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.PreviewFlutterPlugin", "onAttachedToEngine ");
        com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi.Companion companion = com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f338778d = new oo5.a(binaryMessenger2);
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = binding.getPlatformViewRegistry();
        oo5.a aVar = this.f338778d;
        kotlin.jvm.internal.o.d(aVar);
        platformViewRegistry.registerViewFactory("VoIPMPPreviewFileView", aVar);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        oo5.a aVar = this.f338778d;
        if (aVar != null) {
            aVar.f347201b = new java.lang.ref.WeakReference(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        oo5.a aVar = this.f338778d;
        if (aVar != null) {
            aVar.f347201b = new java.lang.ref.WeakReference(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.PreviewFlutterPlugin", "onDetachedFromEngine ");
        com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi.Companion companion = com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f338778d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        oo5.a aVar = this.f338778d;
        if (aVar != null) {
            aVar.f347201b = new java.lang.ref.WeakReference(binding);
        }
    }

    @Override // com.tencent.pigeon.voipmp.VoIPMPPreviewNativeApi
    public void sendScreenProjectShot(byte[] imageData, long j17, long j18) {
        kotlin.jvm.internal.o.g(imageData, "imageData");
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            oVar.S5(imageData, (int) j17, (int) j18);
        }
    }
}

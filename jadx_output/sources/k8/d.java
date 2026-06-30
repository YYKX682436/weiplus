package k8;

/* loaded from: classes15.dex */
public class d implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding f304858d;

    /* renamed from: e, reason: collision with root package name */
    public k8.c f304859e;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        k8.c cVar = new k8.c();
        this.f304859e = cVar;
        android.app.Activity activity = activityPluginBinding.getActivity();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = this.f304858d.getBinaryMessenger();
        cVar.f304853d = activity;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "sososdk.github.com/orientation");
        cVar.f304854e = methodChannel;
        methodChannel.setMethodCallHandler(cVar);
        io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(binaryMessenger, "sososdk.github.com/orientationEvent");
        cVar.f304855f = eventChannel;
        eventChannel.setStreamHandler(new k8.b(cVar, activity));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f304858d = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        k8.c cVar = this.f304859e;
        if (cVar == null) {
            return;
        }
        cVar.f304853d = null;
        io.flutter.plugin.common.MethodChannel methodChannel = cVar.f304854e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            cVar.f304854e = null;
        }
        io.flutter.plugin.common.EventChannel eventChannel = cVar.f304855f;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
            cVar.f304855f = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f304858d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}

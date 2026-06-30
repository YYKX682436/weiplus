package nd2;

/* loaded from: classes10.dex */
public final class r implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public nd2.q f336471d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.getActivity();
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "onAttachedToActivity: " + binding.getActivity());
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.d(activity);
        ms5.f.d(activity, bm5.a1.a(activity));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "onAttachedToEngine");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        nd2.q qVar = new nd2.q(binaryMessenger, binding.getApplicationContext());
        this.f336471d = qVar;
        binding.getPlatformViewRegistry().registerViewFactory("com.tencent.xin.flutter.platformViewType.cdnliveplayer", qVar);
        com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi.Companion companion = com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi.Companion.setUp$default(companion, binaryMessenger2, qVar.f336470e, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "onDetachedFromActivity");
        ms5.f.f331158a.a("onDetach_LiveCDNPlayerPlugin");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "onDetachedFromActivityForConfigChanges");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "onDetachedFromEngine");
        com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi.Companion companion = com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        nd2.q qVar = this.f336471d;
        if (qVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = qVar.f336468c;
            java.util.Collection values = concurrentHashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((nd2.o) it.next()).dispose();
            }
            concurrentHashMap.clear();
            qVar.f336469d.clear();
        }
        this.f336471d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.getActivity();
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "onReattachedToActivityForConfigChanges: " + binding.getActivity());
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.d(activity);
        ms5.f.d(activity, bm5.a1.a(activity));
    }
}

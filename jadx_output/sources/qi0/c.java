package qi0;

/* loaded from: classes11.dex */
public final class c implements com.tencent.pigeon.mm_foundation.FlutterNavigatorHost, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f363466d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.mm_foundation.FlutterNavigatorCallback f363467e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f363468f = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));

    /* renamed from: g, reason: collision with root package name */
    public qi0.h f363469g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f363470h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f363471i;

    /* renamed from: m, reason: collision with root package name */
    public pi0.q f363472m;

    @Override // com.tencent.pigeon.mm_foundation.FlutterNavigatorHost
    public void disableSwipeBack() {
        io.flutter.Log.i("MicroMsg.FlutterNavigatorPlugin", "disableSwipeBack");
        this.f363470h = java.lang.Boolean.FALSE;
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f363466d;
        pi0.o0 o0Var = componentCallbacks2 instanceof pi0.o0 ? (pi0.o0) componentCallbacks2 : null;
        if (o0Var != null) {
            o0Var.S5(false);
        }
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterNavigatorHost
    public void enableSwipeBack() {
        io.flutter.Log.i("MicroMsg.FlutterNavigatorPlugin", "enableSwipeBack");
        this.f363470h = java.lang.Boolean.TRUE;
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f363466d;
        pi0.o0 o0Var = componentCallbacks2 instanceof pi0.o0 ? (pi0.o0) componentCallbacks2 : null;
        if (o0Var != null) {
            o0Var.S5(true);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        this.f363466d = activity;
        java.lang.Boolean bool = this.f363470h;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            android.content.ComponentCallbacks2 componentCallbacks2 = this.f363466d;
            pi0.o0 o0Var = componentCallbacks2 instanceof pi0.o0 ? (pi0.o0) componentCallbacks2 : null;
            if (o0Var != null) {
                o0Var.S5(booleanValue);
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.Log.i("MicroMsg.FlutterNavigatorPlugin", "onAttachedToEngine");
        com.tencent.pigeon.mm_foundation.FlutterNavigatorHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterNavigatorHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterNavigatorHost.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f363467e = new com.tencent.pigeon.mm_foundation.FlutterNavigatorCallback(binaryMessenger2, null, 2, null);
        new io.flutter.plugin.common.BasicMessageChannel(binding.getBinaryMessenger(), "dev.flutter.pigeon.mm_auto_gen.FlutterNavigatorCallback.onNewRoute", io.flutter.plugin.common.StandardMessageCodec.INSTANCE).resizeChannelBuffer(5);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f363466d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f363466d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterNavigatorHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterNavigatorHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterNavigatorHost.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f363467e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        this.f363466d = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.pigeon.mm_foundation.FlutterNavigatorHost
    public void pop(java.lang.String plugin, java.lang.String route) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(route, "route");
        android.app.Activity activity = this.f363466d;
        if (activity != null) {
            activity.setResult(-1);
        }
        android.app.Activity activity2 = this.f363466d;
        if (activity2 instanceof pi0.o0) {
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.flutter.base.IFlutterPageContainer");
            ((pi0.o0) activity2).pop();
        } else if (activity2 != 0) {
            activity2.finish();
        }
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterNavigatorHost
    public void push(java.lang.String plugin, java.lang.String route, java.util.Map arguments, yz5.l callback) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(route, "route");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f363468f, null, null, new qi0.b(arguments, this, plugin, route, callback, null), 3, null);
    }
}

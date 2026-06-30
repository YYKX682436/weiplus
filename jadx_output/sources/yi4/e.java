package yi4;

/* loaded from: classes11.dex */
public final class e implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding f462603d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f462604e = jz5.h.b(yi4.b.f462600d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f462605f = jz5.h.b(yi4.d.f462602d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f462606g = jz5.h.b(yi4.c.f462601d);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.flutter.FLTStatusPlugin$commonApiEventListener$1 f462607h;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.textstatus.flutter.FLTStatusPlugin$commonApiEventListener$1] */
    public e() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f462607h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FLTStatusCommonApiEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.flutter.FLTStatusPlugin$commonApiEventListener$1
            {
                this.__eventId = -739648101;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FLTStatusCommonApiEvent fLTStatusCommonApiEvent) {
                com.tencent.mm.autogen.events.FLTStatusCommonApiEvent event = fLTStatusCommonApiEvent;
                kotlin.jvm.internal.o.g(event, "event");
                yi4.e.this.a().getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusActionHost", "doCommonCallback: request is null");
                return false;
            }
        };
    }

    public final zi4.g0 a() {
        return (zi4.g0) ((jz5.n) this.f462604e).getValue();
    }

    public final yi4.l b() {
        return (yi4.l) ((jz5.n) this.f462606g).getValue();
    }

    public final yi4.h c() {
        return (yi4.h) ((jz5.n) this.f462605f).getValue();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        a().getClass();
        synchronized (aj4.w.f5378a) {
            yz5.p pVar = (yz5.p) aj4.w.f5380c.remove(java.lang.Integer.valueOf(i17));
            if (pVar == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusFlutterMediaResultRouter", "dispatch: requestCode=" + i17 + ", resultCode=" + i18);
            try {
                pVar.invoke(java.lang.Integer.valueOf(i18), intent);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatusFlutterMediaResultRouter", th6, "dispatch failed", new java.lang.Object[0]);
            }
            return true;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        java.lang.ref.WeakReference weakReference;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusPlugin", "onAttachedToActivity: ".concat(binding.getActivity().getClass().getSimpleName()));
        this.f462603d = binding;
        binding.addActivityResultListener(this);
        a().b(binding.getActivity());
        yi4.h c17 = c();
        android.app.Activity activity = binding.getActivity();
        if (activity != null) {
            c17.getClass();
            weakReference = new java.lang.ref.WeakReference(activity);
        } else {
            weakReference = null;
        }
        c17.f462613d = weakReference;
        b().a(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusPlugin", "onAttachedToEngine");
        zi4.g0 a17 = a();
        a17.getClass();
        a17.f473218d = new com.tencent.mm.sdk.coroutines.LifecycleScope("StatusActionHost", null, 0, 6, null);
        zi4.g0 a18 = a();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        a18.f473216b = new com.tencent.pigeon.status.FLTStatusCommonApi(binaryMessenger, null, 2, null);
        com.tencent.pigeon.status.FLTStatusActionPlatformApi.Companion companion = com.tencent.pigeon.status.FLTStatusActionPlatformApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.status.FLTStatusActionPlatformApi.Companion.setUp$default(companion, binaryMessenger2, a(), null, 4, null);
        alive();
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion companion2 = com.tencent.pigeon.status.StatusPublishPlatformApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion.setUp$default(companion2, binaryMessenger3, c(), null, 4, null);
        com.tencent.pigeon.sns.PlatformPoiApi.Companion companion3 = com.tencent.pigeon.sns.PlatformPoiApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformPoiApi.Companion.setUp$default(companion3, binaryMessenger4, b(), null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusPlugin", "onDetachedFromActivity");
        a().c(null);
        c().f462613d = null;
        b().a(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusPlugin", "onDetachedFromActivityForConfigChanges");
        a().c(null);
        c().f462613d = null;
        b().a(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusPlugin", "onDetachedFromEngine");
        dead();
        com.tencent.pigeon.status.FLTStatusActionPlatformApi.Companion companion = com.tencent.pigeon.status.FLTStatusActionPlatformApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.status.FLTStatusActionPlatformApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion companion2 = com.tencent.pigeon.status.StatusPublishPlatformApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion.setUp$default(companion2, binaryMessenger2, null, null, 4, null);
        com.tencent.pigeon.sns.PlatformPoiApi.Companion companion3 = com.tencent.pigeon.sns.PlatformPoiApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformPoiApi.Companion.setUp$default(companion3, binaryMessenger3, null, null, 4, null);
        a().f473216b = null;
        zi4.g0 a17 = a();
        a17.getClass();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = a17.f473218d;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        java.lang.ref.WeakReference weakReference;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusPlugin", "onReattachedToActivityForConfigChanges");
        this.f462603d = binding;
        a().b(binding.getActivity());
        yi4.h c17 = c();
        android.app.Activity activity = binding.getActivity();
        if (activity != null) {
            c17.getClass();
            weakReference = new java.lang.ref.WeakReference(activity);
        } else {
            weakReference = null;
        }
        c17.f462613d = weakReference;
        b().a(binding.getActivity());
    }
}

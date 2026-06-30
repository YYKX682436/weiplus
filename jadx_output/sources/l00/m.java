package l00;

/* loaded from: classes7.dex */
public final class m implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.ecs.EcsMagicBizHostApi, l00.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f314730d;

    /* renamed from: e, reason: collision with root package name */
    public final dq0.q f314731e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f314732f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.pigeon.ecs.EcsMagicBizFlutterApi f314733g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f314734h;

    public m(java.lang.String viewGroupId, dq0.q mbPlugin) {
        kotlin.jvm.internal.o.g(viewGroupId, "viewGroupId");
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
        this.f314730d = viewGroupId;
        this.f314731e = mbPlugin;
        this.f314732f = "";
        this.f314734h = jz5.h.b(new l00.k(this));
    }

    @Override // com.tencent.pigeon.ecs.EcsMagicBizHostApi
    public void invoke(java.lang.String bizName, java.lang.String apiName, byte[] bArr, yz5.l callback) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(apiName, "apiName");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "apiName: ".concat(apiName));
        if (bArr == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "Data is nil");
            return;
        }
        try {
            ((l00.h) ((jz5.n) this.f314734h).getValue()).l(new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase(apiName, new java.lang.String(bArr, r26.c.f368865a)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "json decode failed " + e17);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onAttachedToEngine");
        com.tencent.pigeon.ecs.EcsMagicBizHostApi.Companion companion = com.tencent.pigeon.ecs.EcsMagicBizHostApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ecs.EcsMagicBizHostApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f314733g = new com.tencent.pigeon.ecs.EcsMagicBizFlutterApi(binaryMessenger2, null, 2, null);
        jc3.i0.p0((l00.h) ((jz5.n) this.f314734h).getValue(), null, 1, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onDetachedFromEngine");
        com.tencent.pigeon.ecs.EcsMagicBizHostApi.Companion companion = com.tencent.pigeon.ecs.EcsMagicBizHostApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ecs.EcsMagicBizHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f314733g = null;
        this.f314731e.c(this.f314732f);
        ((l00.h) ((jz5.n) this.f314734h).getValue()).deactivate();
    }
}

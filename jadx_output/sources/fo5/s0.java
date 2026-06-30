package fo5;

/* loaded from: classes11.dex */
public final class s0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public final fo5.t0 f265112d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.voipmp.VoIPMPV2DeviceFlutterApi f265113e;

    public s0(fo5.t0 t0Var) {
        this.f265112d = t0Var;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.FlutterPlugin", "onAttachedToActivity: " + binding.getActivity());
        ((jp5.o) i95.n0.c(jp5.o.class)).Z4(binding);
        binding.getActivity().getWindow().addFlags(6815872);
        binding.getActivity().setRequestedOrientation(7);
        n3.h2.a(binding.getActivity().getWindow(), false);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.FlutterPlugin", "onAttachedToEngine ");
        fo5.t0 t0Var = this.f265112d;
        if (t0Var != null) {
            io.flutter.view.TextureRegistry textureRegistry = binding.getTextureRegistry();
            kotlin.jvm.internal.o.f(textureRegistry, "getTextureRegistry(...)");
            long engineId = binding.getFlutterEngine().getEngineId();
            fo5.x0 x0Var = (fo5.x0) t0Var;
            java.util.Map map = x0Var.f265149f;
            fo5.u0 u0Var = (fo5.u0) kotlin.jvm.internal.m0.c(map).remove(x0Var.f265147d);
            if (u0Var != null) {
                ((fo5.z0) u0Var).a();
            }
            x0Var.f265147d = textureRegistry;
            fo5.u0 u0Var2 = x0Var.f265148e;
            if (u0Var2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "registerFlutterTextureRegister");
                fo5.q2 q2Var = fo5.q2.f265071d;
                ro5.b bVar = q2Var.f().f265097p;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("renderController");
                    throw null;
                }
                bVar.l();
                fo5.r0 f17 = q2Var.f();
                f17.getClass();
                f17.f265100s = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "attach engine");
                ro5.b bVar2 = f17.f265097p;
                if (bVar2 == null) {
                    kotlin.jvm.internal.o.o("renderController");
                    throw null;
                }
                bVar2.u(textureRegistry);
                map.put(textureRegistry, u0Var2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPFlutterSessionManager", "textureRegistry registered, engineId=" + engineId);
        }
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        this.f265113e = new com.tencent.pigeon.voipmp.VoIPMPV2DeviceFlutterApi(binaryMessenger, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ((jp5.o) i95.n0.c(jp5.o.class)).v1();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        ((jp5.o) i95.n0.c(jp5.o.class)).v1();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.FlutterPlugin", "onDetachedFromEngine ");
        fo5.t0 t0Var = this.f265112d;
        if (t0Var != null) {
            io.flutter.view.TextureRegistry textureRegistry = binding.getTextureRegistry();
            kotlin.jvm.internal.o.f(textureRegistry, "getTextureRegistry(...)");
            long engineId = binding.getFlutterEngine().getEngineId();
            fo5.u0 u0Var = (fo5.u0) ((fo5.x0) t0Var).f265149f.remove(textureRegistry);
            if (u0Var != null) {
                ((fo5.z0) u0Var).a();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPFlutterSessionManager", "textureRegistry released, engineId=" + engineId);
        }
        this.f265113e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        ((jp5.o) i95.n0.c(jp5.o.class)).Z4(binding);
    }
}

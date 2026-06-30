package md2;

/* loaded from: classes10.dex */
public final class f implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f325841d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f325842e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f325843f;

    public f(android.content.Context context, gk2.e buContext) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f325841d = buContext;
        this.f325843f = "LiveCreateNoticeFlutterPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi
    public void createNotice(com.tencent.pigeon.live_multiplatform.LiveMultiplatformTaskID taskID, yz5.l callback) {
        kotlin.jvm.internal.o.g(taskID, "taskID");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f325842e;
        if (activity == 0) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
            return;
        }
        java.lang.String e17 = xy2.c.e(activity);
        im5.b bVar = activity instanceof im5.b ? (im5.b) activity : null;
        if (bVar == null) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
            return;
        }
        ek2.c2 c2Var = new ek2.c2(db2.t4.f228171a.a(5874), e17, null, 0L, 0L, 0, 0L, 0, null, 248, null);
        az2.j.u(c2Var, activity, null, 0L, 6, null);
        c2Var.l().f(bVar).h(new md2.e(activity, callback, e17, this));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f325842e = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f325843f, "onAttachedToEngine");
        com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f325842e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f325842e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f325843f, "onAttachedToEngine");
        com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveCreateNoticeNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f325842e = binding.getActivity();
    }
}

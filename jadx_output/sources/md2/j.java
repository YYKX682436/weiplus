package md2;

/* loaded from: classes11.dex */
public final class j implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f325850d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f325851e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f325852f;

    public j(android.content.Context context, gk2.e buContext, yz5.q completion) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(completion, "completion");
        this.f325850d = completion;
        this.f325852f = "LiveSelectNoticeFlutterPlugin";
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi
    public void handleSelectNoticeResult(com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction action, byte[] bArr) {
        r45.h32 h32Var;
        kotlin.jvm.internal.o.g(action, "action");
        if (bArr != null) {
            r0 = !(bArr.length == 0);
        }
        if (r0) {
            h32Var = new r45.h32();
            h32Var.fromProtobuf(bArr);
        } else {
            h32Var = null;
        }
        android.app.Activity activity = this.f325851e;
        kotlin.jvm.internal.o.d(activity);
        this.f325850d.invoke(activity, action, h32Var);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f325851e = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f325852f, "onAttachedToEngine");
        com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f325851e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f325851e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f325852f, "onDetachedFromEngine");
        com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveSelectNoticeNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f325851e = binding.getActivity();
    }
}

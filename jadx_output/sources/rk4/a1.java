package rk4;

/* loaded from: classes10.dex */
public final class a1 implements com.tencent.pigeon.ting.TingCommentApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingMusicCommentCallBack f396529d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f396530e = jz5.h.b(rk4.z0.f397112d);

    public final wk4.f a() {
        return (wk4.f) ((jz5.n) this.f396530e).getValue();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        wk4.f a17 = a();
        android.app.Activity activity = binding.getActivity();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "attachActivity " + activity);
        a17.f446971a = activity;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingCommentApi.Companion companion = com.tencent.pigeon.ting.TingCommentApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingCommentApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f396529d = new com.tencent.pigeon.ting.TingMusicCommentCallBack(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        wk4.f a17 = a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "release");
        a17.f446971a = null;
        a17.f446981k = null;
        a17.e();
        com.tencent.mm.ui.tools.f5 f5Var = a17.f446972b;
        if (f5Var != null) {
            f5Var.d();
        }
        a17.f446972b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        wk4.f a17 = a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "release");
        a17.f446971a = null;
        a17.f446981k = null;
        a17.e();
        com.tencent.mm.ui.tools.f5 f5Var = a17.f446972b;
        if (f5Var != null) {
            f5Var.d();
        }
        a17.f446972b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f396529d = null;
        com.tencent.pigeon.ting.TingCommentApi.Companion companion = com.tencent.pigeon.ting.TingCommentApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingCommentApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        wk4.f a17 = a();
        android.app.Activity activity = binding.getActivity();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "attachActivity " + activity);
        a17.f446971a = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    @Override // com.tencent.pigeon.ting.TingCommentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showCommentInputView(com.tencent.pigeon.ting.CommentInputRequest r13, yz5.l r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.a1.showCommentInputView(com.tencent.pigeon.ting.CommentInputRequest, yz5.l):void");
    }
}

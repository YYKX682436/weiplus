package vm1;

/* loaded from: classes10.dex */
public final class i implements com.tencent.pigeon.ting.TingCommentApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingMusicCommentCallBack f438014d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f438015e = jz5.h.b(vm1.a.f437979d);

    public final qm1.f a() {
        return (qm1.f) ((jz5.n) this.f438015e).getValue();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        qm1.f a17 = a();
        android.app.Activity activity = binding.getActivity();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "attachActivity " + activity);
        a17.f364693a = activity;
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
        this.f438014d = new com.tencent.pigeon.ting.TingMusicCommentCallBack(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        qm1.f a17 = a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "release");
        a17.f364693a = null;
        a17.f364703k = null;
        a17.e();
        com.tencent.mm.ui.tools.f5 f5Var = a17.f364694b;
        if (f5Var != null) {
            f5Var.d();
        }
        a17.f364694b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        qm1.f a17 = a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "release");
        a17.f364693a = null;
        a17.f364703k = null;
        a17.e();
        com.tencent.mm.ui.tools.f5 f5Var = a17.f364694b;
        if (f5Var != null) {
            f5Var.d();
        }
        a17.f364694b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f438014d = null;
        com.tencent.pigeon.ting.TingCommentApi.Companion companion = com.tencent.pigeon.ting.TingCommentApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingCommentApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        qm1.f a17 = a();
        android.app.Activity activity = binding.getActivity();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "attachActivity " + activity);
        a17.f364693a = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    @Override // com.tencent.pigeon.ting.TingCommentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showCommentInputView(com.tencent.pigeon.ting.CommentInputRequest r13, yz5.l r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vm1.i.showCommentInputView(com.tencent.pigeon.ting.CommentInputRequest, yz5.l):void");
    }
}

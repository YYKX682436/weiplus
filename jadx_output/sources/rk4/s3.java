package rk4;

/* loaded from: classes11.dex */
public final class s3 implements com.tencent.pigeon.ting.TingWecoinApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f396964d;

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f396964d = (com.tencent.mm.ui.MMActivity) activity;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingWecoinApi.Companion companion = com.tencent.pigeon.ting.TingWecoinApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingWecoinApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f396964d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingWecoinApi.Companion companion = com.tencent.pigeon.ting.TingWecoinApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingWecoinApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f396964d = (com.tencent.mm.ui.MMActivity) activity;
    }

    @Override // com.tencent.pigeon.ting.TingWecoinApi
    public void showWecoinSubscribeView(com.tencent.pigeon.ting.TingWecoinSubscribeRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f396964d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterTingWecoinPlugin", "showWecoinSubscribeView activity null");
            return;
        }
        try {
            bw5.w80 parseFrom = new bw5.w80().parseFrom(request.getJoinInfo());
            com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest = new com.tencent.mm.api.TingMemberShipSubscribeRequest();
            tingMemberShipSubscribeRequest.f53212e = parseFrom;
            java.lang.String sessionId = request.getSessionId();
            if (sessionId == null) {
                sessionId = "";
            }
            tingMemberShipSubscribeRequest.f53214g = sessionId;
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterTingWecoinPlugin", "showWecoinSubscribeView joinInfo.jumpType: " + parseFrom.f34606e);
            com.tencent.mm.ui.MMActivity mMActivity = this.f396964d;
            kotlin.jvm.internal.o.d(mMActivity);
            com.tencent.mm.plugin.ting.uic.j0 j0Var = (com.tencent.mm.plugin.ting.uic.j0) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.ting.uic.j0.class);
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f396964d;
            kotlin.jvm.internal.o.d(mMActivity2);
            rk4.r3 r3Var = new rk4.r3(callback);
            j0Var.getClass();
            j0Var.Q6();
            ((gl4.z) ((jz5.n) j0Var.f174762d).getValue()).d(mMActivity2, tingMemberShipSubscribeRequest, parseFrom, new com.tencent.mm.plugin.ting.uic.g0(j0Var, tingMemberShipSubscribeRequest, r3Var));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterTingWecoinPlugin", th6, "showWecoinSubscribeView exception", new java.lang.Object[0]);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6))));
        }
    }
}

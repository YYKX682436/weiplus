package lx;

/* loaded from: classes7.dex */
public final class b5 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.biz_base.BizPublishGuideApi {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321702d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321702d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_base.BizPublishGuideApi.Companion companion = com.tencent.pigeon.biz_base.BizPublishGuideApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizPublishGuideApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321702d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321702d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_base.BizPublishGuideApi.Companion companion = com.tencent.pigeon.biz_base.BizPublishGuideApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizPublishGuideApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321702d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz_base.BizPublishGuideApi
    public void openRegisterPage() {
        android.content.Context context = this.f321702d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("from", "comment_client_notice_guide");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1422);
        jSONObject2.put("nativeExtraData", jSONObject.toString());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        tk.t tVar = tk.u.f419871e;
        jSONObject3.put("mpPublishAction", 4);
        jSONObject3.put("publishScene", "photoAccountGuideCardByNotification");
        tk.s[] sVarArr = tk.s.f419870d;
        jSONObject3.put("bizType", 2);
        jSONObject3.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Ai(context, jSONObject3, new lx.a5());
    }
}

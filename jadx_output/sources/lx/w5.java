package lx;

/* loaded from: classes11.dex */
public final class w5 implements com.tencent.pigeon.biz.BizWebviewApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321999d;

    @Override // com.tencent.pigeon.biz.BizWebviewApi
    public void addToPreload(java.lang.String url, long j17, long j18, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321999d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizWebviewApi.Companion companion = com.tencent.pigeon.biz.BizWebviewApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizWebviewApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321999d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321999d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizWebviewApi.Companion companion = com.tencent.pigeon.biz.BizWebviewApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizWebviewApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321999d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.BizWebviewApi
    public void openUrl(com.tencent.pigeon.biz.BizWebViewArticleInfo articleInfo) {
        kotlin.jvm.internal.o.g(articleInfo, "articleInfo");
        lx.a aVar = new lx.a(articleInfo.getMsgId(), articleInfo.getSvrId(), articleInfo.getPos(), articleInfo.getPosInCard(), articleInfo.getOpenScene(), articleInfo.getSubScene(), articleInfo.getUrl(), articleInfo.getItemShowType(), articleInfo.getUserName(), articleInfo.getNickName(), articleInfo.getTitle(), articleInfo.getCoverUrl(), articleInfo.getBizFinderEnterId(), articleInfo.getRankSessionId(), articleInfo.getMsgLocalId(), articleInfo.getBizSessionId(), articleInfo.getJumpPaths(), articleInfo.getHideShareMenu());
        yw.h1 h1Var = yw.h1.f466332a;
        android.content.Context context = this.f321999d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        h1Var.t(aVar, context);
    }
}

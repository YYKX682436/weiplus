package lx;

/* loaded from: classes11.dex */
public final class w implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.biz.BizFansListApi {

    /* renamed from: d, reason: collision with root package name */
    public final int f321988d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f321989e;

    public w(int i17) {
        this.f321988d = i17;
    }

    @Override // com.tencent.pigeon.biz.BizFansListApi
    public void addContact(java.lang.String username, long j17) {
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("InteractiveIdentity", "BizFansListApi.addContact, username=" + username + ", scene=" + j17);
        if ((username.length() == 0) || (activity = this.f321989e) == null) {
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f342469g = false;
        aVar.f342470h = false;
        ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(activity, username, (int) j17, lx.v.f321974a, aVar)).f();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321989e = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizFansListApi.Companion companion = com.tencent.pigeon.biz.BizFansListApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFansListApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321989e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321989e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizFansListApi.Companion companion = com.tencent.pigeon.biz.BizFansListApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFansListApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321989e = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.BizFansListApi
    public void openBizFansBlackListUI(java.lang.String biz) {
        kotlin.jvm.internal.o.g(biz, "biz");
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f321988d;
        intent.putExtra("serviceType", i17);
        com.tencent.mars.xlog.Log.i("FlutterBizFansPlugin", "openBizFansBlackListUI serviceType: " + i17);
        android.content.Context context = this.f321989e;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "brandservice", ".conversation.ui.BizFansBlackListUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz.BizFansListApi
    public void openBizFansHalfScreenProfile(com.tencent.pigeon.biz.BizInteractiveUserInfo userInfo) {
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        ir1.m0 m0Var = ir1.i1.R;
        android.content.Context context = this.f321989e;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        m0Var.a(context, userInfo, "", this.f321988d);
    }

    public /* synthetic */ w(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}

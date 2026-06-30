package lx;

/* loaded from: classes9.dex */
public final class p5 implements com.tencent.pigeon.biz.BizShareApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321907d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f321908e = jz5.h.b(new lx.n5(this));

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321907d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizShareApi.Companion companion = com.tencent.pigeon.biz.BizShareApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizShareApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321907d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321907d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizShareApi.Companion companion = com.tencent.pigeon.biz.BizShareApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizShareApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321907d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.BizShareApi
    public void showShareMenu(com.tencent.pigeon.biz.BizShareInfo info, yz5.l callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        yw.q2 q2Var = yw.q2.f466434a;
        java.lang.String str = (java.lang.String) ((jz5.n) this.f321908e).getValue();
        kotlin.jvm.internal.o.f(str, "<get-imgCacheDirectory>(...)");
        yw.q2.f466436c = str;
        android.app.Activity activity = this.f321907d;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        lx.o5 o5Var = new lx.o5(callback);
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
        boolean z17 = false;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 0, false);
        k0Var.f211876p = new yw.h2(mVar, mMActivity, k0Var);
        k0Var.f211886x = new yw.i2(mVar, k0Var);
        k0Var.f211885w = new yw.k2(mVar, o5Var, info, mMActivity);
        k0Var.f211872n = new yw.l2(info);
        java.lang.Long shareType = info.getShareType();
        if (shareType != null && ((int) shareType.longValue()) == com.tencent.pigeon.biz.BizShareInfoType.TYPE_IMAGE.ordinal()) {
            z17 = true;
        }
        if (z17) {
            k0Var.f211874o = new yw.m2(info);
        }
        k0Var.f211881s = new yw.n2(o5Var, info, mMActivity);
        k0Var.f211884v = new yw.o2(o5Var, mMActivity, info);
        k0Var.v();
    }
}

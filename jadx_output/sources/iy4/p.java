package iy4;

/* loaded from: classes11.dex */
public final class p implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.ext_device.ExtDeviceNativeAPI, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.pigeon.ext_device.ExtDeviceLoginFlutterAPI f295981d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.ext_device.ExtDeviceManageFlutterAPI f295982e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f295983f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f295984g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f295985h = new iy4.o(this);

    @Override // com.tencent.pigeon.ext_device.ExtDeviceNativeAPI
    public void goFileTransfer() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "filehelper");
        intent.putExtra("key_show_bottom_app_panel", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, this.f295983f);
    }

    @Override // com.tencent.pigeon.ext_device.ExtDeviceNativeAPI
    public void goHelpWebview(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url + "&lang=" + com.tencent.mm.sdk.platformtools.m2.d());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(this.f295983f, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.ext_device.ExtDeviceNativeAPI
    public void goSecondVerify(java.lang.String authURL) {
        kotlin.jvm.internal.o.g(authURL, "authURL");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", authURL);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        this.f295984g = true;
        android.app.Activity activity = this.f295983f;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.tencent.mm.ui.MMActivity) activity, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 101, new iy4.m(this));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f295983f = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.ext_device.ExtDeviceNativeAPI.Companion companion = com.tencent.pigeon.ext_device.ExtDeviceNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ext_device.ExtDeviceNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        gm0.j1.d().a(uc1.x1.CTRL_INDEX, this.f295985h);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f295981d = new com.tencent.pigeon.ext_device.ExtDeviceLoginFlutterAPI(binaryMessenger2, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        this.f295982e = new com.tencent.pigeon.ext_device.ExtDeviceManageFlutterAPI(binaryMessenger3, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f295983f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f295983f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.ext_device.ExtDeviceNativeAPI.Companion companion = com.tencent.pigeon.ext_device.ExtDeviceNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ext_device.ExtDeviceNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        gm0.j1.d().q(uc1.x1.CTRL_INDEX, this.f295985h);
        this.f295981d = null;
        this.f295982e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f295983f = binding.getActivity();
    }
}

package lx;

/* loaded from: classes11.dex */
public final class y5 implements com.tencent.pigeon.common.LinkHandlerApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f322019d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f322019d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.common.LinkHandlerApi.Companion companion = com.tencent.pigeon.common.LinkHandlerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.common.LinkHandlerApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f322019d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f322019d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.common.LinkHandlerApi.Companion companion = com.tencent.pigeon.common.LinkHandlerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.common.LinkHandlerApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f322019d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.common.LinkHandlerApi
    public void openLink(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterLinkPlugin", "openLink url:%s", url);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("geta8key_scene", 56);
        j45.l.j(this.f322019d, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.common.LinkHandlerApi
    public void openLocation(com.tencent.pigeon.common.LinkLocationJumpInfo linkWrap) {
        kotlin.jvm.internal.o.g(linkWrap, "linkWrap");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterLinkPlugin", "openLocation address:%s, name:%s", linkWrap.getAddress(), linkWrap.getName());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 10);
        java.lang.String latitude = linkWrap.getLatitude();
        intent.putExtra("kwebmap_slat", latitude != null ? java.lang.Double.valueOf(java.lang.Double.parseDouble(latitude)) : null);
        java.lang.String longitude = linkWrap.getLongitude();
        intent.putExtra("kwebmap_lng", longitude != null ? java.lang.Double.valueOf(java.lang.Double.parseDouble(longitude)) : null);
        intent.putExtra("kPoiName", linkWrap.getName());
        intent.putExtra("Kwebmap_locaion", linkWrap.getAddress());
        intent.putExtra("kPoiid", linkWrap.getPoiId());
        intent.putExtra("kimg_path", linkWrap.getImg());
        j45.l.j(this.f322019d, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }

    @Override // com.tencent.pigeon.common.LinkHandlerApi
    public void openWeAppLink(com.tencent.pigeon.common.LinkWeAppJumpInfo linkWrap) {
        kotlin.jvm.internal.o.g(linkWrap, "linkWrap");
        java.lang.String appId = linkWrap.getAppId();
        java.lang.String pagePath = linkWrap.getPagePath();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterLinkPlugin", "openWeAppLink appId:%s, path:%s", appId, pagePath);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        java.lang.Long scene = linkWrap.getScene();
        appBrandStatObject.f87790f = scene != null ? (int) scene.longValue() : 0;
        appBrandStatObject.f87791g = linkWrap.getSceneNote();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(this.f322019d, null, appId, 0, 0, pagePath, appBrandStatObject);
    }
}

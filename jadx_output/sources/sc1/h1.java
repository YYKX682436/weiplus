package sc1;

/* loaded from: classes7.dex */
public class h1 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405680b;

    public h1(sc1.j1 j1Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView, java.lang.String str) {
        this.f405679a = appBrandLivePusherView;
        this.f405680b = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405679a;
        if (K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, load background image fail");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", this.f405680b);
            appBrandLivePusherView.d(jc1.g.f298941m, 10005, "load filter image fail", hashMap);
            return;
        }
        java.lang.String a17 = kk.w.a(str, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, targetPath:%s", a17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, a17);
        appBrandLivePusherView.g(bundle);
    }
}

package sc1;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405642b;

    public a0(sc1.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView, java.lang.String str) {
        this.f405641a = appBrandLivePusherView;
        this.f405642b = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405641a;
        if (K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, load background image fail");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", this.f405642b);
            appBrandLivePusherView.d(jc1.g.f298941m, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "load background image fail", hashMap);
            return;
        }
        java.lang.String a17 = kk.w.a(str, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, targetPath:%s", a17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, a17);
        appBrandLivePusherView.g(bundle);
    }
}

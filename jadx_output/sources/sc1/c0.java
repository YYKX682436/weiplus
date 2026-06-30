package sc1;

/* loaded from: classes7.dex */
public class c0 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405652a;

    public c0(sc1.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView) {
        this.f405652a = appBrandLivePusherView;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String a17 = kk.w.a(str, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePusher", "convertWatermarkImageToLocalPath, localPath:%s", a17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_IMAGE, a17);
        this.f405652a.g(bundle);
    }
}

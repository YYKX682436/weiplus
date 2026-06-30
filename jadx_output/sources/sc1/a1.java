package sc1;

/* loaded from: classes7.dex */
public class a1 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f405643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView f405644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405645c;

    public a1(sc1.c1 c1Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView, java.lang.String str) {
        this.f405643a = jSONObject;
        this.f405644b = appBrandLivePusherView;
        this.f405645c = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        jc1.d dVar = jc1.g.f298941m;
        com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView appBrandLivePusherView = this.f405644b;
        java.lang.String str2 = this.f405645c;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, download file fail, url:%s", str2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str2);
            appBrandLivePusherView.d(dVar, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "download file fail", hashMap);
            return;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, local file path:%s, realLocalPath: %s", str, i17);
        org.json.JSONObject jSONObject = this.f405643a;
        try {
            jSONObject.put("BGMFilePath", i17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, set param fail", e17);
        }
        if (appBrandLivePusherView.f("playBGM", jSONObject)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, play bgm fail, url:%s", str2);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("url", str2);
        appBrandLivePusherView.d(dVar, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "download file fail", hashMap2);
    }
}

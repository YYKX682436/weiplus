package oe1;

/* loaded from: classes15.dex */
public class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f344727d;

    public n(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        this.f344727d = appBrandVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f344727d;
        int cacheTimeSec = appBrandVideoView.getCacheTimeSec();
        int duration = appBrandVideoView.getDuration();
        if (duration != 0 && (i17 = (int) ((cacheTimeSec * 100.0f) / duration)) != appBrandVideoView.f83554z1) {
            appBrandVideoView.f83554z1 = i17;
            xe1.p pVar = appBrandVideoView.C;
            if (pVar != null) {
                pVar.getClass();
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoCacheUpdate, percent:%d, duration:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(duration));
                    org.json.JSONObject b17 = pVar.b();
                    b17.put("buffered", i17);
                    b17.put("duration", duration);
                    pVar.a(new xe1.k(null), b17);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoCacheUpdate e=%s", e17);
                }
            }
        }
        return true;
    }
}

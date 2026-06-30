package df1;

/* loaded from: classes15.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe1.l1 f229641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar f229642e;

    public d(com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar appBrandVideoViewControlBar, oe1.l1 l1Var) {
        this.f229642e = appBrandVideoViewControlBar;
        this.f229641d = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AppBrandVideoViewControlBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar appBrandVideoViewControlBar = this.f229642e;
        boolean z17 = !appBrandVideoViewControlBar.S;
        appBrandVideoViewControlBar.S = z17;
        if (z17) {
            appBrandVideoViewControlBar.D.setImageResource(com.tencent.mm.R.raw.app_brand_video_danmu_on);
        } else {
            appBrandVideoViewControlBar.D.setImageResource(com.tencent.mm.R.raw.app_brand_video_danmu_off);
        }
        oe1.l1 l1Var = this.f229641d;
        if (l1Var != null) {
            boolean z18 = appBrandVideoViewControlBar.S;
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = ((oe1.r) l1Var).f344736a;
            if (!z18) {
                com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = appBrandVideoView.f83531h;
                danmuView.f83588t = 4;
                danmuView.invalidate();
            } else if (appBrandVideoView.f83529f.isPlaying()) {
                com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView2 = appBrandVideoView.f83531h;
                danmuView2.f83588t = 1;
                danmuView2.invalidate();
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView3 = appBrandVideoView.f83531h;
                danmuView3.f83588t = 2;
                danmuView3.invalidate();
            }
            xe1.p pVar = appBrandVideoView.C;
            if (pVar != null) {
                int i17 = appBrandVideoView.f83550y;
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoClickDanmuBtn showDanmu=%b", java.lang.Boolean.valueOf(z18));
                    org.json.JSONObject b17 = pVar.b();
                    b17.put("showDanmu", z18);
                    b17.put("videoPlayerId", i17);
                    pVar.a(new xe1.c(null), b17);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoClickDanmuBtn e=%s", e17);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AppBrandVideoViewControlBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

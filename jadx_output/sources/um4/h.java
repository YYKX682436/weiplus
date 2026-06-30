package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/h;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiHideNavBarShadow", jSONObject != null ? jSONObject.toString() : null);
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a);
        if (uICallback == null || !(uICallback instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) || ((com.tencent.liteapp.ui.WxaLiteAppBaseView) uICallback).getRootView() == null) {
            this.f143443f.a("cannot find view");
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new um4.g(uICallback));
        }
    }
}

package zb1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "onUpdateWXConfig";

    public final void u(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str, java.lang.String str2) {
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                s("opConfig", new org.json.JSONObject(str));
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                s("globalExpt", new org.json.JSONObject(str2));
            }
            p(appBrandRuntime.C0());
            m();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsEventOnUpdateWXConfig", "dispatchOpConfig(rt:%s), exception=%s", appBrandRuntime.f74803n, e17);
        }
    }
}

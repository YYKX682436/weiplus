package le1;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 581;
    private static final java.lang.String NAME = "hideVirtualBottomNavigationBar";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        C(lVar, i17);
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new le1.d(this, lVar, i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("JsApiHideVirtualBottomNavigationBar", "hide");
        android.app.Activity a17 = q75.a.a(lVar.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("JsApiHideVirtualBottomNavigationBar", "null == activity");
        } else {
            android.view.Window window = a17.getWindow();
            if (window == null) {
                com.tencent.mars.xlog.Log.i("JsApiHideVirtualBottomNavigationBar", "null == window");
            } else {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility() | 512 | 2 | 4096 | 256;
                window.getDecorView().setSystemUiVisibility(systemUiVisibility);
                window.getDecorView().setOnSystemUiVisibilityChangeListener(new le1.e(this, window, systemUiVisibility));
            }
        }
        lVar.a(i17, o("ok"));
    }
}

package wx4;

/* loaded from: classes.dex */
public final class a extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f450588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f450588d = "MicroMsg.OpenHalfFinderProfileUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        jz5.f0 f0Var = null;
        if (P6 != null) {
            P6.setTheme(com.tencent.mm.R.style.f494405m6);
            o25.n1.e(getActivity());
            P6.setActionbarColor(0);
            P6.setMMTitle("");
            P6.hideActionbarLine();
            P6.hideActionBarOperationArea();
            androidx.appcompat.app.b supportActionBar = P6.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
            P6.overridePendingTransition(0, 0);
            db5.f.c(P6, null);
            f0Var = jz5.f0.f302826a;
        }
        java.lang.String str = this.f450588d;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(str, "getMvvmActivity is null");
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_EXT_INFO");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_WEB_URL");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = getIntent().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_LAST_GMSG_ID");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        java.lang.String stringExtra4 = getIntent().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_KEEP_ALIVE_TOKEN");
        java.lang.String str2 = stringExtra4 != null ? stringExtra4 : "";
        com.tencent.mars.xlog.Log.i(str, "openFinderView in halfPage mode, extInfo: " + stringExtra + ", webUrl: " + stringExtra2 + ", lastGMsgId: " + stringExtra3 + ", keepAliveToken: " + str2);
        try {
            jSONObject = stringExtra.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(stringExtra);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(str, "parse extInfo failed: " + e17.getMessage());
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("keepSrcAliveToken", str2);
        jSONObject.put("KEY_JSAPI_SOURCE_TYPE", 2);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("extInfo", jSONObject);
        jSONObject2.put("webUrl", stringExtra2);
        jSONObject2.put("KShareTraceLastGMsgId", stringExtra3);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.d(ya2.e1.f460472a, getActivity(), jSONObject2.toString(), null, null, 12, null);
        com.tencent.mars.xlog.Log.i(str, "enterFinderUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.overridePendingTransition(0, 0);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.overridePendingTransition(0, 0);
        }
    }
}

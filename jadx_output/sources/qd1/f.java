package qd1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361630g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f361631h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f361632i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f361633m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qd1.h f361634n;

    public f(qd1.h hVar, com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, int i18, java.lang.String str, org.json.JSONObject jSONObject, java.util.ArrayList arrayList) {
        this.f361634n = hVar;
        this.f361627d = e9Var;
        this.f361628e = v5Var;
        this.f361633m = i17;
        this.f361629f = i18;
        this.f361630g = str;
        this.f361631h = jSONObject;
        this.f361632i = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361627d;
        if (e9Var.isRunning()) {
            this.f361628e.I1().a(com.tencent.mm.plugin.appbrand.page.bb.ACTION_SHEET);
            android.app.Activity Z0 = e9Var.Z0();
            if (Z0 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowActionSheet", "run: page context is null, activity may have been destroyed");
                e9Var.a(this.f361633m, this.f361634n.o("fail:internal error invalid android context"));
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.k0 w07 = e9Var.t3().w0();
            w07.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createBottomSheet id:");
            int i17 = this.f361629f;
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("Luggage.ActionSheetManager", sb6.toString());
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) Z0, 1, false);
            w07.f91747a.put(i17, k0Var);
            java.lang.String str = this.f361630g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                qd1.h.C(Z0, k0Var, str);
            }
            org.json.JSONObject jSONObject = this.f361631h;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("newTipsList");
            java.util.HashMap hashMap = new java.util.HashMap();
            if (optJSONArray != null) {
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    if (optJSONObject != null) {
                        hashMap.put(java.lang.Integer.valueOf(optJSONObject.optInt(ya.b.INDEX, -1)), java.lang.Integer.valueOf(optJSONObject.optInt("type", -1)));
                    }
                }
            }
            java.lang.String appId = e9Var.getAppId();
            nf.y yVar = nf.x.f336616b;
            boolean i19 = yVar != null ? yVar.i(appId) : false;
            int i27 = com.tencent.mm.R.color.a0c;
            try {
                if (i19) {
                    java.lang.String optString = jSONObject.optString("itemColorDark", "");
                    Z0.getResources().getColor(com.tencent.mm.R.color.a0c);
                    i27 = ik1.w.l(optString);
                } else {
                    java.lang.String optString2 = jSONObject.optString("itemColor", "");
                    Z0.getResources().getColor(com.tencent.mm.R.color.a0c);
                    i27 = ik1.w.l(optString2);
                }
            } catch (java.lang.Exception unused) {
            }
            k0Var.f211872n = new qd1.c(this, k0Var, hashMap, i27);
            k0Var.f211881s = new qd1.d(this, hashMap);
            k0Var.f211854d = new qd1.e(this, w07);
            k0Var.v();
        }
    }
}

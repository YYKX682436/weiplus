package qd1;

/* loaded from: classes.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.a0 f361695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f361697i;

    public z(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18, qd1.a0 a0Var, java.lang.String str, java.util.ArrayList arrayList) {
        this.f361692d = e9Var;
        this.f361693e = i17;
        this.f361694f = i18;
        this.f361695g = a0Var;
        this.f361696h = str;
        this.f361697i = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361692d;
        com.tencent.mm.plugin.appbrand.widget.k0 w07 = e9Var.t3().w0();
        kotlin.jvm.internal.o.f(w07, "getNativeWidgetManager(...)");
        android.util.SparseArray sparseArray = w07.f91747a;
        int i17 = this.f361693e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) sparseArray.get(i17);
        qd1.a0 a0Var = this.f361695g;
        int i18 = this.f361694f;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateActionSheet", "bottomSheet is null, id:" + i17 + " return");
            a0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i18, a0Var.u(str2, jSONObject));
            return;
        }
        java.lang.String str4 = this.f361696h;
        if (str4 != null) {
            if (str4.length() > 0) {
                qd1.h.C(e9Var.getF147807d(), k0Var, str4);
            }
        }
        k0Var.f211872n = new qd1.y(this.f361697i);
        k0Var.v();
        a0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i18, a0Var.u(str2, jSONObject2));
    }
}

package qd1;

/* loaded from: classes7.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.c0 f361607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361608h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361609i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361610m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361611n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361612o;

    public b0(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18, qd1.c0 c0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f361604d = e9Var;
        this.f361605e = i17;
        this.f361606f = i18;
        this.f361607g = c0Var;
        this.f361608h = str;
        this.f361609i = str2;
        this.f361610m = str3;
        this.f361611n = str4;
        this.f361612o = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361604d;
        com.tencent.mm.plugin.appbrand.widget.k0 w07 = e9Var.t3().w0();
        kotlin.jvm.internal.o.f(w07, "getNativeWidgetManager(...)");
        fl1.b2 b2Var = (fl1.b2) w07.f91748b.get(this.f361605e);
        qd1.c0 c0Var = this.f361607g;
        int i17 = this.f361606f;
        if (b2Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateModal", "dialog is not exist, return");
            c0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, c0Var.u(str2, jSONObject));
            return;
        }
        fl1.b bVar = b2Var instanceof fl1.b ? (fl1.b) b2Var : null;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateModal", "appbrandDialog is not AppBrandAlertDialog, return");
            c0Var.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str4 != null ? str4 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, c0Var.u(str2, jSONObject2));
            return;
        }
        boolean z17 = bVar.f211837r.getVisibility() == 0;
        java.lang.String str6 = this.f361608h;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str6);
        java.lang.String str7 = this.f361609i;
        if (!K0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str7) || z17) {
                bVar.setTitle(str6);
            } else {
                bVar.t(str6);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7) && !z17) {
            bVar.t(str7);
        }
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                java.lang.String str8 = this.f361610m;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                    bVar.f211837r.setVisibility(0);
                    bVar.f211837r.setHint(str8);
                }
            } else {
                bVar.f211837r.setVisibility(0);
                bVar.f211837r.setText(str7);
            }
        }
        android.widget.Button button = bVar.f211829g;
        if (button != null) {
            button.setText(this.f361611n);
        }
        android.widget.Button button2 = bVar.f211830h;
        if (button2 != null) {
            button2.setText(this.f361612o);
        }
        c0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        e9Var.a(i17, c0Var.u(str2, jSONObject3));
    }
}

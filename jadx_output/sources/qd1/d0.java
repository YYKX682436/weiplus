package qd1;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.e0 f361622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f361623h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361624i;

    public d0(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, qd1.e0 e0Var, int i18, java.lang.String str) {
        this.f361619d = v5Var;
        this.f361620e = e9Var;
        this.f361621f = i17;
        this.f361622g = e0Var;
        this.f361623h = i18;
        this.f361624i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        android.view.View view = this.f361619d.P1().f428575f;
        qd1.e0 e0Var = this.f361622g;
        int i17 = this.f361621f;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361620e;
        if (view == null || view.getTag() == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateToast", "toastView or tag is null, error");
            e0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, e0Var.u(str2, jSONObject));
            return;
        }
        try {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            if (((java.lang.Integer) tag).intValue() != this.f361623h) {
                com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateToast", "toastView is null, error");
                e0Var.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var.a(i17, e0Var.u(str2, jSONObject2));
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
            if (textView != null) {
                textView.setText(this.f361624i);
                return;
            }
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateToast", "textView is null, error");
            e0Var.getClass();
            java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str5 != null ? str5 : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, e0Var.u(str2, jSONObject3));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateToast", "toastView tag is " + view.getTag() + ", error");
            e0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            e9Var.a(i17, e0Var.u(str2, jSONObject4));
        }
    }
}

package fg;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f261765a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f261766b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f261767c;

    /* renamed from: d, reason: collision with root package name */
    public final pl1.f f261768d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f261769e;

    public i(java.lang.String json) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(json, "json");
        this.f261765a = "";
        this.f261768d = new pl1.f();
        com.tencent.mars.xlog.Log.i("TextAreaInfo", "totalInfo:".concat(json));
        try {
            jSONObject = new org.json.JSONObject(json);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo convert to json error");
            jSONObject = new org.json.JSONObject();
        }
        try {
            if (jSONObject.has("element-tag")) {
                jSONObject.getString("element-tag");
            }
        } catch (org.json.JSONException unused2) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo add elementTag error");
        }
        try {
            if (jSONObject.has("keyboard-type")) {
                java.lang.String string = jSONObject.getString("keyboard-type");
                kotlin.jvm.internal.o.f(string, "getString(...)");
                this.f261765a = string;
                this.f261768d.R = string;
            }
        } catch (org.json.JSONException unused3) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
        }
        try {
            if (jSONObject.has("cursor-spacing")) {
                this.f261768d.f356611y = java.lang.Integer.valueOf(ik1.w.k(jSONObject, "cursor-spacing"));
            }
        } catch (java.lang.NumberFormatException unused4) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
        } catch (org.json.JSONException unused5) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
        } catch (java.lang.Exception unused6) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
        }
        try {
            if (jSONObject.has("adjust-position")) {
                this.f261768d.B = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("adjust-position"), true));
            }
        } catch (org.json.JSONException unused7) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
        } catch (java.lang.Exception unused8) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
        }
        try {
            if (jSONObject.has("show-confirm-bar")) {
                this.f261766b = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("show-confirm-bar"), false);
            }
        } catch (org.json.JSONException unused9) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        } catch (java.lang.Exception unused10) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        }
        try {
            if (jSONObject.has("password")) {
                com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("password"), false);
            }
        } catch (org.json.JSONException unused11) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        } catch (java.lang.Exception unused12) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        }
        try {
            if (jSONObject.has("show-cover-view")) {
                this.f261767c = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("show-cover-view"), false);
            }
        } catch (org.json.JSONException unused13) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        } catch (java.lang.Exception unused14) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        }
        try {
            if (jSONObject.has("confirm-hold")) {
                this.f261769e = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("confirm-hold"), false);
            }
        } catch (org.json.JSONException unused15) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        } catch (java.lang.Exception unused16) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        }
        com.tencent.mm.plugin.appbrand.widget.input.h6.d(jSONObject, this.f261768d);
        com.tencent.mm.plugin.appbrand.widget.input.l4.d(jSONObject, this.f261768d);
    }
}

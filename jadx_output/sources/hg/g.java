package hg;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281291a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f281292b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281293c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f281294d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f281295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f281296f;

    public g(hg.h hVar, java.lang.String str) {
        org.json.JSONObject jSONObject;
        this.f281291a = "";
        this.f281292b = false;
        this.f281293c = false;
        this.f281294d = false;
        this.f281295e = false;
        this.f281296f = 0;
        com.tencent.mars.xlog.Log.i("TextAreaInfo", "totalInfo:" + str);
        try {
            jSONObject = new org.json.JSONObject(str);
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
                this.f281291a = jSONObject.getString("keyboard-type");
            }
        } catch (org.json.JSONException unused3) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
        }
        try {
            if (jSONObject.has("show-confirm-bar")) {
                this.f281292b = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("show-confirm-bar"), false);
            }
        } catch (org.json.JSONException unused4) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        } catch (java.lang.Exception unused5) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        }
        try {
            if (jSONObject.has("password")) {
                this.f281293c = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("password"), false);
            }
        } catch (org.json.JSONException unused6) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        } catch (java.lang.Exception unused7) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        }
        try {
            if (jSONObject.has("show-cover-view")) {
                this.f281294d = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("show-cover-view"), false);
            }
        } catch (org.json.JSONException unused8) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        } catch (java.lang.Exception unused9) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        }
        try {
            if (jSONObject.has("confirm-hold")) {
                this.f281295e = com.tencent.mm.sdk.platformtools.t8.y(jSONObject.getString("confirm-hold"), false);
            }
        } catch (org.json.JSONException unused10) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        } catch (java.lang.Exception unused11) {
            com.tencent.mars.xlog.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        }
        if (jSONObject.has("view-id")) {
            this.f281296f = jSONObject.optInt("view-id");
        }
    }
}

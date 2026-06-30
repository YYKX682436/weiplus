package jd;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f299024a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f299025b;

    /* renamed from: c, reason: collision with root package name */
    public final long f299026c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f299027d;

    /* renamed from: e, reason: collision with root package name */
    public final long f299028e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f299029f;

    /* renamed from: g, reason: collision with root package name */
    public final int f299030g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo f299031h;

    public c(long j17, java.lang.String str, long j18, java.lang.String str2, long j19, int i17, boolean z17) {
        this.f299024a = j17;
        this.f299025b = str;
        this.f299026c = j18;
        this.f299027d = str2;
        this.f299028e = j19;
        this.f299030g = i17;
        this.f299029f = z17;
    }

    public void a() {
        if (this.f299028e < 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", false);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject());
            jSONObject.put("errMsg", "");
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(this.f299025b, this.f299024a, this.f299026c, this.f299027d, this.f299028e, jSONObject.toString(), false, this.f299029f);
        com.tencent.mm.plugin.lite.LiteAppCenter.executingJsapiMap.remove(java.lang.Integer.valueOf(this.f299030g));
    }

    public void b(java.lang.String str) {
        c(str, null, false);
    }

    public void c(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (this.f299028e < 0) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("result", false);
            if (jSONObject != null) {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
            } else {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject());
            }
            if (str != null) {
                jSONObject2.put("errMsg", str);
            } else {
                jSONObject2.put("errMsg", "");
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(this.f299025b, this.f299024a, this.f299026c, this.f299027d, this.f299028e, jSONObject2.toString(), z17, this.f299029f);
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.executingJsapiMap.remove(java.lang.Integer.valueOf(this.f299030g));
    }

    public void d() {
        if (this.f299028e < 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", true);
            jSONObject.put("errMsg", "");
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject());
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(this.f299025b, this.f299024a, this.f299026c, this.f299027d, this.f299028e, jSONObject.toString(), false, this.f299029f);
        com.tencent.mm.plugin.lite.LiteAppCenter.executingJsapiMap.remove(java.lang.Integer.valueOf(this.f299030g));
    }

    public void e(java.util.Map map) {
        if (this.f299028e < 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("result", true);
            jSONObject.put("errMsg", "");
            if (map != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
            } else {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject());
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(this.f299025b, this.f299024a, this.f299026c, this.f299027d, this.f299028e, jSONObject.toString(), false, this.f299029f);
        com.tencent.mm.plugin.lite.LiteAppCenter.executingJsapiMap.remove(java.lang.Integer.valueOf(this.f299030g));
    }

    public void f(org.json.JSONObject jSONObject, boolean z17) {
        if (this.f299028e < 0) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("result", true);
            jSONObject2.put("errMsg", "");
            if (jSONObject != null) {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
            } else {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject());
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.LiteAppJsApiCallback", e17.toString(), new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(this.f299025b, this.f299024a, this.f299026c, this.f299027d, this.f299028e, jSONObject2.toString(), z17, this.f299029f);
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.executingJsapiMap.remove(java.lang.Integer.valueOf(this.f299030g));
    }
}

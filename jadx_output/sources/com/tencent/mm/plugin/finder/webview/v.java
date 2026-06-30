package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f136929a;

    /* renamed from: b, reason: collision with root package name */
    public float f136930b;

    /* renamed from: c, reason: collision with root package name */
    public float f136931c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136932d = "";

    @android.webkit.JavascriptInterface
    public final java.lang.String getEnv() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("peekHeight", java.lang.Float.valueOf(this.f136929a));
        jSONObject.put("maxHeight", java.lang.Float.valueOf(this.f136930b));
        jSONObject.put("currHeight", java.lang.Float.valueOf(this.f136931c));
        java.lang.String str = this.f136932d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("jumperExtInfo", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("Finder.WebViewEnv", "getEnv ");
        return jSONObject2;
    }
}

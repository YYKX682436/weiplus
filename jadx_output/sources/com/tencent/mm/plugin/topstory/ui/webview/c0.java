package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f175180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f175181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175183g;

    public c0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, boolean z17, boolean z18, java.lang.String str) {
        this.f175183g = lVar;
        this.f175180d = z17;
        this.f175181e = z18;
        this.f175182f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("granted", this.f175180d);
            jSONObject.put("retCode", 0);
            jSONObject.put("dialogShowed", this.f175181e);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175183g, this.f175182f, jSONObject.toString());
    }
}

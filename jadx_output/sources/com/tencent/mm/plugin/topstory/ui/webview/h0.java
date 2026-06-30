package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f175197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175198e;

    public h0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, org.json.JSONObject jSONObject) {
        this.f175198e = lVar;
        this.f175197d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175198e, "notifyNumReddotChange", this.f175197d.toString());
    }
}

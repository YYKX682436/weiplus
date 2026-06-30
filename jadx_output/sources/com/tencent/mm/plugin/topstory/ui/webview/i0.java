package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f175202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175203e;

    public i0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, org.json.JSONObject jSONObject) {
        this.f175203e = lVar;
        this.f175202d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this.f175203e, "notifyReddot", this.f175202d.toString());
    }
}

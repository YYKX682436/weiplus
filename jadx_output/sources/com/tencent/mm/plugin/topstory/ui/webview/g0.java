package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f175194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175195e;

    public g0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, org.json.JSONObject jSONObject) {
        this.f175195e = lVar;
        this.f175194d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String jSONObject = this.f175194d.toString();
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f175195e;
        com.tencent.mm.plugin.topstory.ui.webview.b.a(lVar, "onSearchDataReady", jSONObject);
        wm4.u.b(lVar.f175220g, "dataReady", c01.id.c());
    }
}
